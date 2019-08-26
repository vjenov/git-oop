package com.bitcamp.domains;

public class AndroidPhoneBean extends IPhoneBean{
	public final static String KIND = "갤럭시노트";
	
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s라고 문자했다.", getCompany(), KIND, getReceiver(), getCall());
	}
}
