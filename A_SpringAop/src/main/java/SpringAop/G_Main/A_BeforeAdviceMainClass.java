package SpringAop.G_Main;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringAop.B_Configuration.ConfigurationConfig;
import SpringAop.D_DAO.A_BeforeAdviceDAO;
import SpringAop.E_DAO.A_BeforeAdviceDAOCopy;
import SpringAop.F_Pojo.A_User;

public class A_BeforeAdviceMainClass {

	public static void main(String[] args) {
		// Read Spring Config Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationConfig.class);

		// Get The Bean For Spring Container
		A_BeforeAdviceDAO beforeAdviceDAO = context.getBean("beforeAdviceDAO", A_BeforeAdviceDAO.class);

		// Get The Bean For Spring Container
		A_BeforeAdviceDAOCopy beforeAdviceDAOCopy = context.getBean("beforeAdviceDAOCopy", A_BeforeAdviceDAOCopy.class);

		// Call The Business Method(==>1)
		// beforeAdviceDAO.addAccountWithOutPointCutExpression();

		// Call The Business Method(==>1)
		// beforeAdviceDAOCopy.addAccountWithOutPointCutExpression();

		// Call The Business Method(==>2)
		// beforeAdviceDAO.addAccountWithPointCutExpression();

		// Call The Business Method(==>2)
		// beforeAdviceDAOCopy.addAccountWithPointCutExpression();

		// Call The Business Method(==>3)
		// beforeAdviceDAO.addAccountWithPointCutExpressionBasedOnClass();

		// Call The Business Method(==>3)
		// beforeAdviceDAOCopy.addAccountWithPointCutExpressionBasedOnClass();

		// Call The Business Method(==>4 And ==>5)
		// beforeAdviceDAO.addAccountWithPointCutExpression();

		// Call The Business Method(==>4 And ==>5)
		// beforeAdviceDAOCopy.addAccountWithPointCutExpression();

		// Call The Business Method(==>6)
		// beforeAdviceDAO.addAccountWithPointCutExpression();

		// Call The Business Method(==>6)
		// beforeAdviceDAOCopy.addAccountWithPointCutExpression();

		// Call The Business Method(==>7)
		// beforeAdviceDAO.addAccountWithPointCutExpression(new A_User());

		// Call The Business Method(==>7)
		// beforeAdviceDAOCopy.addAccountWithPointCutExpression(new A_User());

		// Call The Business Method(==>8)
		beforeAdviceDAO.addAccountWithPointCutExpression(new A_User(), new Date());

		// Call The Business Method(==>8)
		beforeAdviceDAOCopy.addAccountWithPointCutExpression(new A_User(), new Date());

		// Close The Context
		context.close();
	}

}
