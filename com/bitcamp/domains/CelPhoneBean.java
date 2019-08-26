package com.bitcamp.domains;
/*
 * 생산자명 company
 * 문자내용 text
 * 통화대상 receiver
 * 전화기형태 kind -> 상수 : 셀룰러폰
 * 나는 {삼성}에서 만든 {셀룰러폰}를 사용해서 {길동이}에게 {안녕}이라고 문자했다.  
 */
public class CelPhoneBean extends PhoneBean{
	public final static String KIND = "셀룰러폰";
	private String text;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s라고 문자했다.", getCompany(), KIND, getReceiver(), text);
	}
}
