package com.pro.bean;

import java.util.List;
import java.util.Map;

public class Student {  
  
//    @Tag(1)  
    private String name;  
//    @Tag(2)  
    private String studentNo;  
//    @Tag(3)  
    private int age;  
//    @Tag(4)  
    private String schoolName;  
//    @Tag(5)
    private List<Clazz> clazz;
//    @Tag(6)
    private Clazz cla;
    
    private Map<String, String> map;
  
   // 关于@Tag,要么所有属性都有@Tag注解,要么都没有,不能一个类中只有部分属性有@Tag注解  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public String getStudentNo() {  
        return studentNo;  
    }  
  
    public void setStudentNo(String studentNo) {  
        this.studentNo = studentNo;  
    }  
  
    public int getAge() {  
        return age;  
    }  
  
    public void setAge(int age) {  
        this.age = age;  
    }  
  
    public String getSchoolName() {  
        return schoolName;  
    }  
  
    public void setSchoolName(String schoolName) {  
        this.schoolName = schoolName;  
    }  
  
    public List<com.pro.bean.Clazz> getClazz() {
		return clazz;
	}

	public void setClazz(List<com.pro.bean.Clazz> clazz) {
		this.clazz = clazz;
	}

	public Clazz getCla() {
		return cla;
	}

	public void setCla(Clazz cla) {
		this.cla = cla;
	}
	
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNo=" + studentNo + ", age=" + age + ", schoolName=" + schoolName
				+ ", clazz=" + clazz + ", cla=" + cla + ", map=" + map + "]";
	}
	

}  