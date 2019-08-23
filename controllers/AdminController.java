package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;
public class AdminController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService service = new MemberService();
		MemberBean member = null;
		String msg = "";
		String[] arr = {};
		String temp = "";
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입\n"
					+ "2.회원목록\n"
					+ "3.아이디검색\n"
					+ "4.이름검색\n"
					+ "5.전체 회원수"))	{
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				temp = JOptionPane.showInputDialog("이름,아이디,비번,주민번호,혈액형,키,몸무게 ");
				System.out.println("****" + temp);
				arr = temp.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				member.setBlood(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				JOptionPane.showMessageDialog(null, service.join(member));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "3" :
				String findId = JOptionPane.showInputDialog("아이디입력");
				service.findById(findId);
				JOptionPane.showMessageDialog(null, member);
				break;
			case "4" :
				String searchName = JOptionPane.showInputDialog("이름입력");
				service.findByName(searchName);
				JOptionPane.showMessageDialog(null, member);
				break;
			case "5" :
				member = new MemberBean();
				JOptionPane.showMessageDialog(null, service.countAll());
				break;
			}
		}
	}

}
