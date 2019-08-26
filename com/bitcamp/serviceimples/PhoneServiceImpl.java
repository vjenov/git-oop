package com.bitcamp.serviceimples;
import com.bitcamp.domains.PhoneBean;
import com.bitcamp.services.PhoneService;
public class PhoneServiceImpl implements PhoneService {
	private PhoneBean phoneBean;
	public String callWithPhone(PhoneBean param) {
		return param.toString();
	}
}
