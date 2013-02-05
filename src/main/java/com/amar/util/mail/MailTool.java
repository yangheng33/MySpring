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

		SimpleMailSender sms = new SimpleMailSender();

		if ( "html".equals( mailtype ) )
		{
			sms.sendHtmlMail( mailInfo );
		}
		else
		{
			sms.sendTextMail( mailInfo );
		}

	}

	public static void main( String [] args )
	{
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost( "mail.metarnet.com" );
		mailInfo.setMailServerPort( "25" );
		mailInfo.setValidate( true );
		mailInfo.setUserName( "hsyang@metarnet.com" );
		mailInfo.setPassword( "123456" );// 您的邮箱密码
		mailInfo.setFromAddress( "hsyang@metarnet.com" );
		mailInfo.setToAddresses( new String [] { "hsyang@metarnet.com" } );
		mailInfo.setSubject( "测试发个邮件" );
		mailInfo.setContent( "测试发个邮件的内容<b>内容</b>\n123\n456" );
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		// sms.sendTextMail( mailInfo );// 发送文体格式
		sms.sendHtmlMail( mailInfo );// 发送html格式

	}

}
