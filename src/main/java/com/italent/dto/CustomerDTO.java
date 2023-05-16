package com.italent.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CustomerDTO {


	    private int id;
	    
		@NotNull(message="Please Enter Vaild FirstName")
		private String firstName;
		
		@NotNull(message="please Enter Vaild LastName")
		private String lastName;
		
		@Min(18)
		private int age;
		
		@Email
		private String email;
		
	    @Pattern(regexp="^\\d{10}$", message="invaild mobile number enterd")
		private String mobile;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public CustomerDTO(int id, @NotNull(message = "Please Enter Vaild FirstName") String firstName,
				@NotNull(message = "please Enter Vaild LastName") String lastName, @Min(18) int age,
				@Email String email,
				@Pattern(regexp = "^\\d{10}$", message = "invaild mobile number enterd") String mobile) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.email = email;
			this.mobile = mobile;
		}

		public CustomerDTO() {
			super();
		
		}

	
	    
	    
	    
	
}
