package SpringAop.F_Pojo;

public class A_User {

	public long id;

	public String email;

	public String password;

	public A_User() {

	}

	public A_User(long id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "A_User [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

}
