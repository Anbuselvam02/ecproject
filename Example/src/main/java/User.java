
public class User {


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	private String username,password;
}
