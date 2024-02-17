package SpringAop.G_Main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import SpringAop.B_Configuration.ConfigurationConfig;
import SpringAop.D_DAO.B_AfterAdviceDao;
import SpringAop.F_Pojo.A_User;

public class D_ArroundAdviceMain {
	public static void main(String[] args) throws Exception {

		// Read Spring Config Java Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationConfig.class);

		// Get The Bean For Spring Container
		B_AfterAdviceDao accountDAO = context.getBean("afterAdviceDao", B_AfterAdviceDao.class);

		List<A_User> usersList = accountDAO.findAllUserList();

		System.out.println("===>" + usersList);

		System.out.println("\n");

		// Let's post-process the data ... Let's modify it....

		// Close The Context
		context.close();
	}

}
