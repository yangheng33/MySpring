package com.amar.app.rsa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;

public class Rsa
{

	private final static SecureRandom random = new SecureRandom();

	private BigInteger a;

	private BigInteger b;

	private BigInteger n;

	private BigInteger p;

	private BigInteger q;

	private Hashtable<String,BigInteger> publicKey;

	private Hashtable<String,BigInteger> privateKey;

	/**
	 * 设置密钥
	 * 
	 * @param privateKey 密钥
	 */
	public void setPrivateKey( Hashtable<String,BigInteger> privateKey )
	{
		this.privateKey = privateKey;
		p = privateKey.get( "p" );
		q = privateKey.get( "q" );
		a = privateKey.get( "a" );
		n = p.multiply( q );
	}

	/**
	 * 获取公钥
	 * 
	 * @return 公钥
	 */
	public Hashtable<String,BigInteger> getPublicKey()
	{
		return publicKey;
	}

	/**
	 * 设置公钥
	 * 
	 * @param publicKey 公钥
	 */
	public void setPublicKey( Hashtable<String,BigInteger> publicKey )
	{
		this.publicKey = publicKey;
		n = publicKey.get( "n" );
		b = publicKey.get( "b" );
	}

	/**
	 * 产生长度为N位的公钥和私钥
	 * 
	 * @param N
	 */
	public void genKey( int N )
	{
		// 产生两个N/2位的大素数p和q
		p = BigInteger.probablePrime( N / 2 , random );
		q = BigInteger.probablePrime( N / 2 , random );
		// 计算（p-1)*(q-1)
		BigInteger phi = ( p.subtract( BigInteger.ONE ) ).multiply( q.subtract( BigInteger.ONE ) );
		// 计算模数p*q
		n = p.multiply( q );
		// 随便找一个b，使得gcd(b, phi) =1;
		// 通用的公钥是2^16 + 1=65537
		b = new BigInteger( "65537" );
		// 计算出a，即b的模n逆
		a = b.modInverse( phi );
		publicKey = new Hashtable<String,BigInteger>();
		privateKey = new Hashtable<String,BigInteger>();
		publicKey.put( "n" , n );
		publicKey.put( "b" , b );
		privateKey.put( "p" , p );
		privateKey.put( "q" , q );
		privateKey.put( "a" , a );
	}

	/**
	 * 加密函数
	 * 
	 * @param plainText 明文
	 * @return 密文
	 */
	public byte [] encrypt( byte [] plainText )
	{
		return new BigInteger( plainText ).modPow( b , n ).toByteArray();
	}

	/**
	 * 解密函数
	 * 
	 * @param cipherText 密文
	 * @return 明文
	 */
	public byte [] decrypt( byte [] cipherText )
	{
		return new BigInteger( cipherText ).modPow( a , n ).toByteArray();
	}

	/**
	 * 获取密钥
	 * 
	 * @return 密钥
	 */
	public Hashtable<String,BigInteger> getPrivateKey()
	{
		return privateKey;
	}

	public static void main22( String [] args )
	{
		BigInteger a1 = new BigInteger( "180" );
		//BigInteger a2 = new BigInteger( "19" );

		System.out.println( a1.nextProbablePrime().toString() );
	}

	@SuppressWarnings( "unchecked" )
	public static void main( String [] args ) throws FileNotFoundException , IOException , ClassNotFoundException
	{
		Rsa rsa = new Rsa();
		rsa.genKey( 2048 ); // 产生密钥
		// 保存私钥到文件 key
		ObjectOutputStream keyout = new ObjectOutputStream( new FileOutputStream( "key" ) );
		keyout.writeObject( rsa.getPrivateKey() );
		keyout.flush();
		keyout.close();
		// 加密一句消息
		byte [] cipher = rsa.encrypt( "s你是最棒的".getBytes( "gbk" ) );
		// 将加密消息写入文件
		ObjectOutputStream fileout = new ObjectOutputStream( new FileOutputStream( "file" ) );
		fileout.writeObject( cipher );
		fileout.flush();
		// 读入密钥
		ObjectInputStream keyin = new ObjectInputStream( new FileInputStream( "key" ) );
		Rsa rsa1 = new Rsa();
		Hashtable<String,BigInteger> privateKey = ( Hashtable<String,BigInteger> ) keyin.readObject();
		rsa1.setPrivateKey( privateKey );
		keyin.close();
		ObjectInputStream filein = new ObjectInputStream( new FileInputStream( "file" ) );
		byte [] cp = ( byte [] ) filein.readObject();
		// 解密
		byte [] plain = rsa1.decrypt( cp );
		System.out.println( new String( plain , "gbk" ) );
	}
}
