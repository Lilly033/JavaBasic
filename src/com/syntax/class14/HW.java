package com.syntax.class14;

public class HW {
	
//Accept username, password and confirm password from a user and check following requirements:
//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//Password should be minimum 8 characters, if less → message=”Password is too short”.
//Password cannot contain username if so, → message=”Password cannot contain username”.
//Password should match confirmed password, if not  → message=“Passwords do not match”.
//Only after all requirements met → message “Your username and password has been created”
	
	String email(String userName,String passWord,String comfirmPassWord) {
	if(userName.isEmpty()&& passWord.isEmpty())	{
		System.out.println("Usename and password cannot be empty");
	}
	else if(passWord.length()<=8) {
		System.out.println("Password is to short");
	}
	else if(userName.equals(passWord)) {
		System.out.println("Password cannot contain username");
	}
	else if(!passWord.equals(passWord)) {
		System.out.println("Pasword do not match");
	}
	else {
		System.out.println("Username and password has been created");
	}
	return userName +" "+ passWord+" " + " "+comfirmPassWord ;
	
	}
	
	
	public static void main(String[] args) {

           HW obj=new HW();
           
    System.out.println(obj.email("coco","chanelnu05","chanelnu05"));
 

	}






}
