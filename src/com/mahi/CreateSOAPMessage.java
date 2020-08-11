package com.mahi;

import java.io.FileOutputStream;
import java.util.Base64;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;


public class CreateSOAPMessage {

	public static void main(String args[]) {
		try {
			MessageFactory factory = MessageFactory.newInstance();
			SOAPMessage soapMsg = factory.createMessage();
			SOAPPart part = soapMsg.getSOAPPart();
			
			SOAPEnvelope envelope = part.getEnvelope();
			SOAPHeader header = envelope.getHeader();
			SOAPBody body = envelope.getBody();

			header.addTextNode("Training Details");

			SOAPBodyElement element = body.addBodyElement(envelope.createName("JAVA", "training", "http://JitendraZaa.com/blog"));
			element.addChildElement("WS").addTextNode("Training on Web service");
			SOAPBodyElement element1 = body.addBodyElement(envelope.createName("JAVA", "training", "http://JitendraZaa.com/blog"));
			element1.addChildElement("Spring").addTextNode("Training on Spring 3.0");
			
			soapMsg.writeTo(System.out);
			FileOutputStream fOut = new FileOutputStream("SoapMessage.xml");
			soapMsg.writeTo(fOut);
			System.out.println();
			System.out.println("SOAP msg created");

			//For encoding data
			String str="mahesh";
			byte[] bytesencoded = Base64.getEncoder().encode(str.getBytes());
			System.out.println("ecncoded value is " + new String(bytesencoded ));
			
			byte[] valueDecoded= Base64.getDecoder().decode(bytesencoded);
			System.out.println("Decoded value is " + new String(valueDecoded));
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}
