package com.lsy.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsy.myapp.dao.MainMapper;

@Service
public class MainService {
	
	private final MainMapper mainMapper;
	
	@Autowired
	public MainService(MainMapper mainMapper) {
		this.mainMapper = mainMapper;
	}
	
	public String sysDate() {
		
		String sysdate = mainMapper.sysDate();
		
		return sysdate;
	}

}
