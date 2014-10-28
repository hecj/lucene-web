package com.hecj.web.action;

import com.hecj.dao.dao.StudentDao;
import com.hecj.dao.dao.imp.StudentDaoImp;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public String test() {
		
		System.out.println("进来了...");
		
		System.out.println(studentDao);
		
		return "success" ;
	}

}
