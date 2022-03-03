package com.syntax.class15;

public class Task1HW {

	public static void main(String[] args) {
		
		//Accept username, password and confirm password from a user and check following requirements:
		//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
		//Password should be minimum 8 characters, if less → message=”Password is too short”.
		//Password cannot contain username if so, → message=”Password cannot contain username”.
		//Password should match confirmed password, if not  → message=“Passwords do not match”.
		//Only after all requirements met → message “Your username and password has been created”
		
		String userName="coco";
		String password="chanel1234";
		String confirmedpassword="chanel12";

		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("User name cannot be empty");
		}else {
			if(password.length()<8) {
				System.out.println("Pasword is too short");
			}else {
				if(password.contains(userName)) {
					System.out.println("pasword cannnot contain user name");
				}else {
					if(password.equals(confirmedpassword)) {
						System.out.println("Your username and pasword has been created");
					}else {
						System.out.println("Password do not match");
					}
					
				}
			}
		}

	}

}
