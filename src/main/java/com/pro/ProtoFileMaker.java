package com.pro;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import com.pro.bean.Clazz;
import com.pro.bean.Student;

public class ProtoFileMaker {

	public static void test(Object obj) throws ClassNotFoundException{
		Class clazz = obj.getClass();
		Field[] fields = clazz.getFields();
		
		Class[] declaredClasses = clazz.getDeclaredClasses(); 
		
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		try {
			test(student);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//			student = new Student();
//			student.setName("lance");
//			student.setAge(28);
//			student.setStudentNo("2011070122");
//			student.setSchoolName("BJUT");
//			List<Clazz> cla = new ArrayList<Clazz>();
//			cla.add(new Clazz("1", "redis"));
////			cla.add(new Clazz("2", "mongodb"));
//			cla.add(new Clazz("3", "memcache"));
//			cla.add(new Clazz("5", "hbase"));
//			
//			System.out.println("cla " + cla);
//			
//			student.setClazz(cla);
//			student.setCla(new Clazz("4", "mybatis"));
			
	}
	
}
