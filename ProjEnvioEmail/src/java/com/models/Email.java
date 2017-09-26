
package com.models;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
    private String nome;
    private String email;
    private String celular;
    private String assunto;
    private String mensagem;

    public Email(String nome, String email, String celular, String assunto, String mensagem) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public boolean getEnviar(Email email){
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "587");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.starttls.enable", "true"); 
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication("guilhermecossouza@gmail.com", "costa123gui");
            }
        });
        
        session.setDebug(true);      
        
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("guilhermecossouza@gmail.com"));
            Address[] emailEnviar = InternetAddress.parse("guilhermecossouza@gmail.com");
            message.setRecipients(Message.RecipientType.TO, emailEnviar);
            message.setSubject(this.assunto);
            message.setContent("Nome: "+this.nome+"<br/>E-mail:"+this.email+"<br>Telefone :"+this.celular+"<br>"+this.mensagem,"\"text/html; charset=utf-8\"");            
            Transport.send(message);
            return true;
        }catch(Exception e){
            return false;
        }       
    }   
}
