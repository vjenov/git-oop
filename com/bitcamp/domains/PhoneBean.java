package com.bitcamp.domains;
/*
 * 생산자명 company
 * 통화내용 call
 * 통화대상 receiver
 * 전화기형태 kind -> 상수 : 집전화기, 2G폰, 아이폰, 안드로이드폰
 * 나는 {금성}에서 만든 {집전화기}를 사용해서 {길동이}에게 {안녕}이라고 전화했다.  
 */
public class PhoneBean {
	public final static String KIND = "집전화기";
	private String company, call, receiver;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("나는 %s에서 만든 %s를 사용해서 %s에게 %s라고 통화했다.", company, KIND, receiver, call);
		}
}
