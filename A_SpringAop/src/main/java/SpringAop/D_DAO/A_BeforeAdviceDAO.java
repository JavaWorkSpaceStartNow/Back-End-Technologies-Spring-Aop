package SpringAop.D_DAO;

import java.util.Date;

import org.springframework.stereotype.Component;

import SpringAop.F_Pojo.A_User;

@Component("beforeAdviceDAO")
public class A_BeforeAdviceDAO {
	public void addAccountWithOutPointCutExpression() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT (addAccountWithOutPointCutExpression)");
	}

	public void addAccountWithPointCutExpression() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT (addAccountWithPointCutExpression)");
	}

	public void addAccountWithPointCutExpressionBasedOnClass() {
		System.out.println(
				getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT (addAccountWithPointCutExpressionBasedOnClass)");
	}

	public void addAccountWithPointCutExpression(A_User user) {
		System.out
				.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT (addAccountWithPointCutExpression(User))");
	}

	public void addAccountWithPointCutExpression(A_User user, Date dob) {
		System.out.println(
				getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT (addAccountWithPointCutExpression(User,Date))");
	}

	public long id;

	public String email;

	public String password;

	public long getId() {
		System.out.println(getClass() + ":- from getId");
		return id;
	}

	public void setId(long id) {
		System.out.println(getClass() + ":- from setId");
		this.id = id;
	}

	public String getEmail() {
		System.out.println(getClass() + ":- from getEmail");
		return email;
	}

	public void setEmail(String email) {
		System.out.println(getClass() + ":- from setEmail");
		this.email = email;
	}

	public String getPassword() {
		System.out.println(getClass() + ":- from getPassword");
		return password;
	}

	public void setPassword(String password) {
		System.out.println(getClass() + ":- from setPassword");
		this.password = password;
	}

}
