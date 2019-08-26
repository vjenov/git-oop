package com.bitcamp.serviceimples;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;
	private int count;
	
	public MemberServiceImpl() {
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String join(MemberBean param) {
		// TODO Auto-generated method stub
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}

	@Override
	public String getMyPage(MemberBean param) {
		// TODO Auto-generated method stub
		return param.toString();
	}

	@Override
	public String changePassword(MemberBean param) {
		String msg = "비번변경완료";
		String id = param.getId();
		String[] passWord = param.getPw().split(",");
		String oldPw = passWord[0];
		String newPw = passWord[1];
		for(int i = 0; i < count; i++) {
			if(param.getId().equals(members[i].getId())
					&& oldPw.equals(members[i].getPw())) {
					members[i].setPw(newPw);
			}
		}
			return msg;
	}

	@Override
	public String withdrawal(MemberBean param) {
		String msg = "잘못입력하셨습니다.";
		String id = param.getId();
		String pw = param.getPw();
		for(int i = 0; i < count; i++) {
			if(id.equals(members[i].getId())
					&& pw.equals(members[i].getPw())) {
				System.out.println(members[i]);
				System.out.println(i);
					for(int j = 0; j < count-1; j++) {
						System.out.println(j);
						System.out.println(members[j]);
						if (j >= i) {
							members[j] = members[i+1];
							System.out.println(j);
							System.out.println(members[j]);
					}
				}
			}
			msg = "탈퇴완료";
		}
		return msg;
	}

	@Override
	public String existId(String id) {
		String msg = "가입가능한 아이디입니다.";
		for(int i =0; i < count; i++) {
			if(id.equals(members[i].getId())) {
				msg = "이미 존재하는 아이디";
				break;
			}
	}
		return msg;
	}

	@Override
	public String login(MemberBean param) {
		String msg = "로그인 실패";
		String id = param.getId();
		String pw = param.getPw();
		for(int i = 0; i < count; i++) {
			if(param.getId().equals(members[i].getId())
					&& param.getPw().equals(members[i].getPw())) {
				msg = "로그인 성공";
				break;
			}
		}
		return msg;
	}
}