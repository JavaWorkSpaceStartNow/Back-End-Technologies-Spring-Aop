package SpringAop.G_Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringAop.B_Configuration.ConfigurationConfig;
import SpringAop.D_DAO.A_BeforeAdviceDAO;
import SpringAop.F_Pojo.A_User;

public class B_BeforeAdviceMainClass {

	public static void main(String[] args) {
		// Read Spring Config Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationConfig.class);

		// Get The Bean For Spring Container
		A_BeforeAdviceDAO accountDAO = context.getBean("beforeAdviceDAO", A_BeforeAdviceDAO.class);

		// Call The Business Method
		accountDAO.addAccountWithOutPointCutExpression();

		// Call The Business Method
		accountDAO.addAccountWithPointCutExpression();

		// Call The Business Method
		accountDAO.addAccountWithPointCutExpressionBasedOnClass();

		A_User user = new A_User();
		user.setId(0);
		user.setEmail("jaypansuriya1117@gmail.com");
		user.setPassword("jay@1117@Mansi");

		accountDAO.addAccountWithPointCutExpression(user);
		accountDAO.setId(1);
		accountDAO.setEmail("jayPansuriya1117@gmail.com");
		accountDAO.setPassword("Jay@456@Jay");

		// Close The Context
		context.close();
	}

}
