package com.bitcamp.domains;
/*
 * 생산자명 company
 * 문자내용 text
 * 통화대상 receiver
 * 전화기형태 kind -> 상수 : 아이폰
 * 나는 {애플}에서 만든 {아이폰}를 사용해서 {구글}에서 {뉴스}를 검색후 {길동}에게 문자를 보냈다.  
 */
public class IPhoneBean extends CelPhoneBean{
	public final static String KIND = "아이폰";
	private String search;
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("나는 %s에서 만든 %s를 사용해서 구글에서 %s를 검색 후 %s에게 문자를 보냈다.", getCompany(), KIND, search, getReceiver());
	}
}
