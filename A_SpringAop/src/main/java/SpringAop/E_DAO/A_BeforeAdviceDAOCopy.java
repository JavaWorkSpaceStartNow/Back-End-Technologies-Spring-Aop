package SpringAop.E_DAO;

import java.util.Date;

import org.springframework.stereotype.Component;

import SpringAop.F_Pojo.A_User;

@Component("beforeAdviceDAOCopy")
public class A_BeforeAdviceDAOCopy {
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
}
