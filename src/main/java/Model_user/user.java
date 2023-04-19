package Model_user;

public class user {

	private String name ;
	private String email ;
	private String pass ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	@Override
	public String toString() {
		return "user [name=" + name + ", email=" + email + ", pass=" + pass + "]";
	}
	
	
	
	
}
