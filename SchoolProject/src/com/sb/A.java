package com.sb;

import com.sa.Student;
import com.sa.Student2;

/**
 * @version 1.0
 * @author teacher
 * <h3>學員管理系統</h3>
 */

public class A extends Student implements Student2{
	
	private int chi;
	
	/**
	 * 
	 * @param name 輸入姓名
	 * @param chi 輸入國文分數
	 * <br>
	 * A a=new A("teacher",100)
	 * 
	 */
	
	public A(String name,int chi) {
		super(name);
		this.chi=chi;
	}

	/**
	 * 
	 * @return 國文分數
	 */
	
	public int getChi() {
		return chi;
	}
	
	/**
	 * 
	 * @param chi 輸入修改的分數
	 */

	public void setChi(int chi) {
		this.chi = chi;
	}
	
	/**
	 * @return 輸出A skill
	 */

	@Override
	public String skill() {
		return "A skill";
	}
	
	/**
	 * @return hgfhgfh
	 */

	@Override
	public String show() {
		return super.show()+"\t國文:"+chi;
	}


	
}
