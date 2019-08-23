package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.services.MemberService;
import com.bitcamp.domains.MemberBean;
public class MemberController {

	public static void main(String[] args) {
		MemberService service = new MemberService();
		MemberBean member = null;
		String msg = "";
		String[] arr = {};
		String temp = "";
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료 \n"
					+ "1.회원가입\n"
					+ "2.마이페이지\n"
					+ "3.비번 수정\n"
					+ "4.회원탈퇴\n"
					+ "5.아이디 존재 체크\n"
					+ "6.로그인\n")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				
				return;
			case "1":
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
			case "2":
				JOptionPane.showMessageDialog(null, service.getMyPage(member));
				break;
			case "3":
				temp = JOptionPane.showInputDialog("아이디,현재비번입력,신규비번입력");
				arr = temp.split(",");
				member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]+","+arr[2]);
				msg = service.changePassword(member);
				JOptionPane.showMessageDialog(null, msg);
				break;
			case "4":
				String exit = JOptionPane.showInputDialog("아이디입력,비번입력");
				String[] exitValues = exit.split(",");
				String exitId = exitValues[0];
				String exitPw = exitValues[1];
				member = new MemberBean();
				member.setId(exitId);
				member.setPw(exitPw);
				msg = service.withdrawal(member);
				JOptionPane.showMessageDialog(null, msg);
				break;
			case "5":
				String existId = JOptionPane.showInputDialog("아이디입력");
				service.existId(existId);
				msg = service.existId(existId);
				JOptionPane.showMessageDialog(null, msg);
				break;
			case "6":
				String loginValue = JOptionPane.showInputDialog("아이디입력,비번입력");
				String[] loginValues = loginValue.split(",");
				String loginId = loginValues[0];
				String loginPw = loginValues[1];
				member = new MemberBean();
				member.setId(loginId);
				member.setPw(loginPw);
				msg = service.login(member);
				JOptionPane.showMessageDialog(null, msg);
			default:
				break;
			}
		}

	}

}