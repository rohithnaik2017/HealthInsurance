package com.cg.onlineinsurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="users")
public class UserRegistration {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="auth_user_id")
		private int user_id;
		
		@NotNull(message="first name not be null")
		@Column(name="first_name")
		private String first_name;
		@Column(name="last_name")
		private String last_name; 
		@NotNull(message ="Email cannot be empty")
		@Column(name="Email")
		private String email;
		@Column(name="age")
		private int age; 
		@Column(name="gender")
		private String gender;
		@Column(name="password")
		private String password;
		public UserRegistration() {
			super();
		}
		public UserRegistration(int user_id, String first_name, String last_name, String email, int age, String gender,
				String password) {
			super();
			this.user_id = user_id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
			this.age = age;
			this.gender = gender;
			this.password = password;
		}
		@Override
		public String toString() {
			return "UserRegistration [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name
					+ ", email=" + email + ", age=" + age + ", gender=" + gender + ", password=" + password + "]";
		}
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		



}
