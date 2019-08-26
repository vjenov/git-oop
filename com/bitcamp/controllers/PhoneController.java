package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.services.PhoneService;

public class PhoneController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBean phone = new PhoneBean();
		PhoneService service = new PhoneService();
		String company = JOptionPane.showInputDialog("제조사를 입력하세요");
		switch() {
		
		}
		
		String call = JOptionPane.showInputDialog("통화내용을 입력하세요"); 
		String receiver = JOptionPane.showInputDialog("통화대상을 입력하세요");

	}
}
