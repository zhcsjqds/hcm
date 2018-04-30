package cn.zouhuachao.test;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class TestJavamail2 {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-mail.xml");
		SimpleMailMessage message = (SimpleMailMessage) ac.getBean("mailMessage");
		JavaMailSender sender = (JavaMailSender) ac.getBean("mailSender");
	
		//设置简单邮件对象的属性
		message.setSubject("spring和javamail测试");
		message.setText("o(*￣︶￣*)o");
		message.setTo("752375776@qq.com");//收件箱
		
		sender.send(message);
	}
	
	@Test
	public void test1() throws MessagingException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-mail.xml");
		JavaMailSender sender = (JavaMailSender) ac.getBean("mailSender");
		
		MimeMessage message = sender.createMimeMessage();
		//为了更好的操作MimeMessage对象，借用一个工具类来操作它
		MimeMessageHelper helper = new MimeMessageHelper(message,true,"UTF-8");
		//通过工具类设置主题，内容，图片，附件
		helper.setFrom("zouhuachaode@163.com");
		helper.setTo("1625576712@qq.com");//收件箱
		helper.setSubject("spring和javamail测试");
		helper.setText("<html>\r\n" + 
				"<head><title>Hello</title></head>\r\n" + 
				"<body>\r\n" + 
				"<img src='cid:image'/>\r\n" + 
				"<table id=\"middle_column_inner_table\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">																<tbody><tr>\r\n" + 
				"	  <td>                                         \r\n" + 
				"		<table id=\"middle_column_content_table\" style=\"background:#ffffff; -webkit-border-radius:8px; -moz-border-radius:8px; border-radius:8px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"40\" border=\"0\"><tbody><tr><td id=\"middle_column_content_cell\" style=\"background-color:#ffffff;-webkit-border-radius:6px; -moz-border-radius:6px; border-radius:6px;-webkit-box-shadow:0 1px 3px rgba(0,0,0, 0.2);-moz-box-shadow:0 1px 3px rgba(0,0,0, 0.2);box-shadow:0 1px 3px rgba(0,0,0, 0.2);\">\r\n" + 
				"		<span style=\"font-family:'Helvetica Neue', Helvetica, Arial, sans-serif;font-size:16px; line-height:22px; color:#424242;\">                                         \r\n" + 
				"			<p style=\"margin:0 0 30px 0;\">你好 choppedcoffeelover！我们只需要你验证下这是你的电子邮件地址。这是你吗？</p>\r\n" + 
				"\r\n" + 
				"				<a style=\"display:inline-block; width:100%; background-color:#eaf3ff; text-decoration:none; color:#5486c6; font-size:18px; font-weight:bold; text-align:center;  padding:15px 0px 15px 0px; -webkit-border-radius:2px; -moz-border-radius:2px; border-radius:2px\" href=\"http://localhost:8080/Shop\" target=\"_blank\">这就是我！</a>\r\n" + 
				"\r\n" + 
				"			<p style=\"margin:30px 0 0 0;\">多谢！我们要保护互联网免遭僵尸的侵害嘛。</p>                                                        \r\n" + 
				"         </span>\r\n" + 
				"		</td></tr>\r\n" + 
				"</tbody></table>\r\n" + 
				"</body>\r\n" + 
				"</html>",true);
		
		//添加图片,指定image所在的位置（是指本地）
		FileSystemResource resource = new FileSystemResource(new File("C:\\Users\\Chao\\Desktop\\cart-empty.png"));//将本地的图片转化成一个图片资源
		helper.addInline("image", resource);//image的参数来自上面的cid
		
		//发送时代附件
		FileSystemResource resource1 = new FileSystemResource(new File("C:\\Users\\Chao\\Desktop\\cart-empty.png"));//将本地的图片转化成一个图片资源
		helper.addAttachment("cart-empty.png", resource1);
		
		sender.send(message);
	}
}
