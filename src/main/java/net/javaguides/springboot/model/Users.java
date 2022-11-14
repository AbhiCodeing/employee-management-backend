package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Users {
	
	private String name;
	private String username;
	private String password;
	
	
	
	
	@Override
	public String toString() {
		return "Users [name=" + name + ", username=" + username + ", password=" + password + "]";
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
