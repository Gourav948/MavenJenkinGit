package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_MASTER")
public class UserEntity {

	@GeneratedValue
	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	

	public UserEntity() {
		super();
	}

	public UserEntity(String userName, String firstName, String password, String email, String sessionId) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.password = password;
		this.email = email;
		this.sessionId = sessionId;
	}
	public UserEntity(String userName, String firstName, String password, String email) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.password = password;
		this.email = email;
		
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSessionId() {
		return sessionId;
	}



	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}



	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", password=" + password
				+ ", email=" + email + ", sessionId=" + sessionId + "]";
	}

	
}
