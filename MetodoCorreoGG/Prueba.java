package pruebaCorreo;

import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Prueba {

	public static void main(String[] args)  
	{
		System.out.println("HOla");
		String destinatario =  "estebanguzra@gmail.com";
	    String asunto = "Correo de prueba enviado desde Java";
	    String cuerpo = "Esta es una prueba de correo...";

	    enviarConGMail(destinatario, asunto, cuerpo);
	}
	private static void enviarConGMail(String destinatario, String asunto, String cuerpo) {
	   
	    String remitente = "TEColones";

	    Properties props = System.getProperties();
	    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
	    props.put("mail.smtp.user", remitente);
	    props.put("mail.smtp.clave", "6018abcd");
	    props.put("mail.smtp.auth", "true");  //Usar autenticación mediante usuario y clave
	    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
	    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
	    props.put("mail.smtp.host", "true");

	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);

	    try {
	        message.setFrom(new InternetAddress(remitente));
	        message.addRecipients(Message.RecipientType.TO, destinatario);
	        message.setSubject(asunto);
	        message.setText(cuerpo);
	        Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", remitente, "6018abcd");
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (MessagingException me) {
	        me.printStackTrace();   //Si se produce un error
	    }
	}
}
 

