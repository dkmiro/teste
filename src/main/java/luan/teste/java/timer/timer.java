package luan.teste.java.timer;

import java.io.IOException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import luan.teste.java.controller.RestXmlHttpClient;

public class timer extends Thread{
	
	public timer () {	
	}
	
	@Override
	public void run() {
		int i = 0;
		
		
		while (true) {
			
			RestXmlHttpClient cliente = new RestXmlHttpClient();
			try {
				cliente.xml();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ParserConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SAXException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			try {
				//Delay em milisegundos
				Thread.sleep(300000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
