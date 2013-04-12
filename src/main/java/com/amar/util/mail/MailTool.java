package com.amar.util.mail;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.amar.constant.ProjectInfo;

@Service( "mailTool" )
public class MailTool
{
	public static final String name = "mailtool";

	@Resource( name = "projectInfo" )
	private ProjectInfo projectInfo;

	public static final String MAIL_TYPE_HTML = "html";

	public static final String MAIL_TYPE_TEXT = "text";

	public void sendEmail( String subject , String content , String fromAddress , String [] toAddresses , String password , String mailtype )
	{
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost( projectInfo.getSmtp() );
		mailInfo.setMailServerPort( "25" );
		mailInfo.setValidate( true );
		mailInfo.setUserName( fromAddress );
		mailInfo.setPassword( password );// 您的邮箱密码
		mailInfo.setFromAddress( fromAddress );
		mailInfo.setToAddresses( toAddresses );
		mailInfo.setSubject( subject );
		mailInfo.setContent( content );

		SimpleMailSender sms = new SimpleMailSender( mailtype , mailInfo );

		Thread mailThread = new Thread( sms , "mailThread" );

		mailThread.start();
	}

	public static void main( String [] args )
	{
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost( "smtp.sina.com" );
		mailInfo.setMailServerPort( "25" );
		mailInfo.setValidate( true );
		mailInfo.setUserName( "yangheng33@sina.com" );
		mailInfo.setPassword( "aries1986" );// 您的邮箱密码
		mailInfo.setFromAddress( "yangheng33@sina.com" );
		mailInfo.setToAddresses( new String [] { "yangheng33@sina.com", "yangheng33@yahoo.com.cn" } );
		mailInfo.setSubject( "测试发个邮件" );
		mailInfo.setContent( "测试发个邮件的内容<b>内容</b>\n123<br/>\n4567" );
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender( "html" , mailInfo );
		Thread mailThread = new Thread( sms , "mailThread" );
		mailThread.start();
		System.out.println( "over" );
		// sms.sendTextMail( mailInfo );// 发送文体格式
		// sms.sendHtmlMail( mailInfo );// 发送html格式

	}

}
