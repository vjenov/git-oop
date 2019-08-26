package com.bitcamp.serviceimples;

import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.AdminService;

public class AdminServiceImpl implements AdminService{
	private MemberBean[] members;
	private int count;
	public AdminServiceImpl() {
		// TODO Auto-generated constructor stub
		members = new MemberBean[10];
	}
	public String join(MemberBean param) {
		// TODO Auto-generated method stub
		String msg = "회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	@Override
	public String list() {
		String msg = "";
		for(int i=0;i<count;i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i = 0; i < count; i++) {
			if(id.equals(this.members[i].getId())) {
				member = this.members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int j = 0;
		for(int i =0;i< count;i++) {
			if(name.equals(this.members[i].getName())) {
				j++;
			}
		}
		MemberBean[] members = new MemberBean[j];
		j = 0;
		for(int i=0; i< count;i ++) {
			if(name.equals(this.members[i].getName())) {
				members[j] = this.members[i];
				j++;
				if(members.length == j) {
					break;
				}
			}
			
			members[i] = this.members[i];
		}
		return members;
	}

	@Override
	public String countAll() {
		return "총회원수 : " + count;
	}
}