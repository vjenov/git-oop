package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.CelPhoneBean;
import com.bitcamp.domains.IPhoneBean;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.serviceimples.PhoneServiceImpl;
import com.bitcamp.services.PhoneService;

public class PhoneController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBean p = null;
		PhoneService s = new PhoneServiceImpl();
		String[] arr = new String[3];
		while(true) {
		switch(JOptionPane.showInputDialog("0. 종료, 1.집전화기, 2. 2G폰, 3. 아이폰")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				arr = JOptionPane
						.showInputDialog("제조사, 통화내용, 통화대상")
						.split(",");
				p = new PhoneBean();
				p.setCompany(arr[0]);
				p.setCall(arr[1]);
				p.setReceiver(arr[2]);
				JOptionPane.showMessageDialog(null, s.callWithPhone(p));
				break;
			case "2" :
				CelPhoneBean cel = new CelPhoneBean();
				arr = JOptionPane
						.showInputDialog("제조사, 문자내용, 통화대상")
						.split(",");
				cel.setCompany(arr[0]);
				cel.setText(arr[1]);
				cel.setReceiver(arr[2]);
				JOptionPane.showMessageDialog(null, s.callWithPhone(cel));
				break;
			case "3" :
				IPhoneBean i = new IPhoneBean();
				arr = JOptionPane
						.showInputDialog("제조사, 검색내용, 통화대상")
						.split(",");
				i.setCompany(arr[0]);
				i.setSearch(arr[1]);
				i.setReceiver(arr[2]);
				JOptionPane.showMessageDialog(null, s.callWithPhone(i));
				break;
			}
		}
	}
}