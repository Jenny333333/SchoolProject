package com.sc;

import com.sa.Student;
import com.sa.Student2;
import com.sb.A;
import com.sb.B;

public class Test {
	public static void main(String[] args) {
		Student s=new Student("aa");
		System.out.println(s.show());
		Student2 s2;
		
		A a=new A("abc",74);
		System.out.println(a.skill());
		System.out.println(a.show());
		
		B b=new B("rr",85);
		System.out.println(b.skill());
		System.out.println(b.show());
	}

}
