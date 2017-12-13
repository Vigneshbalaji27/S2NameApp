package com.vikki.s2;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport{

	String uname,msg;
	int age;
	
	public WelcomeAction() {
		System.out.println("Inside no-arg Constr of WA");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		System.out.println("Inside setUname "+uname);
		this.uname = uname;
	}
	public String getMsg() {
		System.out.println("Inside getMsg() "+msg);
		return msg;
	}
	public void setMsg(String msg) {
		System.out.println("Inside setMsg "+msg);
		this.msg = msg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Inside setAge "+age);
		this.age = age;
	}
	public String execute()
	{
		System.out.println("Inside execute() of WA");
		if(age<40)
			msg="Welcome Younger "+uname +" age "+age;
		else
			msg="Welcome Oldie "+uname +" age "+age;
		return "Success";
	}
	@Override
	public void validate() {
		System.out.println("Inside Validate() of WA");
		if(uname==null || uname.trim().equals(""))
			addFieldError("uname", getText("welcomeview.uname.empty"));
		else
			if(uname.length()>30)
				addFieldError("uname",getText("welcomeview.uname.length"));
		
		if(age<0 || age>150)
			addFieldError("age", getText("welcomeview.age.invalid"));
	}
}
