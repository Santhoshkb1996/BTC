package com.btc.app.model;

import java.util.Objects;

public class User {
	private int userid;
	private String username;
	private String password;
	private String favCategory;
	public User() {
		super();
	}
	public User(int userid, String username, String password, String favCategory) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.favCategory = favCategory;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getFavCategory() {
		return favCategory;
	}
	public void setFavCategory(String favCategory) {
		this.favCategory = favCategory;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", favCategory="
				+ favCategory + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(favCategory, password, userid, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(favCategory, other.favCategory) && Objects.equals(password, other.password)
				&& userid == other.userid && Objects.equals(username, other.username);
	}
	
}
