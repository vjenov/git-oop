package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;

/**
 * 요구사항 (기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 마이페이지
 * 3. 비번 수정
 * 4. 회원탈퇴
 * **********
 * <관리자기능>
 * 5. 회원목록
 * 6. 아이디검색
 * 7. 이름검색
 * */
public interface MemberService {
	public String join(MemberBean param);
	public String getMyPage(MemberBean param);
	public String changePassword(MemberBean param);
	public String withdrawal(MemberBean param);
	public String existId(String id);
	public String login(MemberBean param);
}