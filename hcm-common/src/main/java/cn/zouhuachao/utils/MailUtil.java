package cn.zouhuachao.utils;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * Javamail邮件工具类
 * 
 * @author Chao
 * @date 2018.4.25
 */
public class MailUtil {

	public static void sendEmail(String toAddr, String subject,String content) throws MessagingException {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.163.com");//指定邮件的发送服务器地址
		props.put("mail.smtp.auth", "true");//服务器是否要验证用户的身份信息
		
		Session session = Session.getInstance(props);//得到Session
		session.setDebug(true);//代表启动Debug模式。可以在控制台输出SMTP协议的应答的过程
		
		//创建一个格式的邮件
		MimeMessage message = new MimeMessage(session);
		//设置发送者
		Address fromAddress = new InternetAddress("zouhuachaode@163.com");//邮件地址
		message.setFrom(fromAddress);//设置发送地址
		
		//设置接受者
		Address toAddress = new InternetAddress(toAddr);//邮件地址
		message.setRecipient(RecipientType.TO, toAddress);//设置接受地址
		
		//设置邮件的主题
		message.setSubject(subject);
		//设置邮件的内容
		message.setText(content);
		
		//保存邮件
		message.saveChanges();
		
		//得到发送邮件的火箭
		Transport transport = session.getTransport("smtp");
		
		//火箭连接到服务器上
		transport.connect("smtp.163.com","zouhuachaode@163.com","maidanlao1");
		
		//火箭点火，发送
		transport.sendMessage(message, message.getAllRecipients());
		
		//关闭通道
		transport.close();
	}
}
