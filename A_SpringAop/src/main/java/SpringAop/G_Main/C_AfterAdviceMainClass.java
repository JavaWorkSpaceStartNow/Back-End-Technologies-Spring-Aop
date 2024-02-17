package SpringAop.G_Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringAop.B_Configuration.ConfigurationConfig;
import SpringAop.D_DAO.B_AfterAdviceDao;
import SpringAop.F_Pojo.B_ArithmaticOperation;

public class C_AfterAdviceMainClass {

	public static void main(String[] args) {
		// Read Spring Config Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationConfig.class);

		// Get The Bean For Spring Container
		B_AfterAdviceDao afterAdviceDAO = context.getBean("afterAdviceDao", B_AfterAdviceDao.class);

		// Call The Business Method(==>1)
		// List<A_User> usersList = afterAdviceDAO.findAllUserList();

		// System.out.println("--");

		// Call The Business Method
		// System.out.println("===========>" + usersList);

		try {
			// Call The Business Method
			System.out.println("===========>" + afterAdviceDAO.findCalcutation(1, 0, B_ArithmaticOperation.DIVISION));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n");

		// Let's post-process the data ... Let's modify it....

		// Close The Context
		context.close();

	}

}
