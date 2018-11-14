package command;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginCommand implements Serializable {
	private String userId;
	private String userPass;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
}
