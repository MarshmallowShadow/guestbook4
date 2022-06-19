package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestBookDao;
import com.javaex.vo.GuestVo;

@Service
public class GuestBookService {
	
	@Autowired
	private GuestBookDao gDao;
	
	public List<GuestVo> getList(){
		//System.out.println("GuestBookService: getList");
		List<GuestVo> gList = gDao.getList();
		return gList;
	}
	public int insert(GuestVo gVo) {
		//System.out.println("GuestBookService: insert");
		int count = -1;
		count = gDao.insert(gVo);
		return count;
	}
	public int delete(int no, String password) {
		//System.out.println("GuestBookService: password");
		int count = -1;
		count = gDao.delete(no, password);
		return count;
	}
}
