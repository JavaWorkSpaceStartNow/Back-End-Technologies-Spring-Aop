package SpringAop.D_DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import SpringAop.F_Pojo.A_User;
import SpringAop.F_Pojo.B_ArithmaticOperation;

@Component("afterAdviceDao")
public class B_AfterAdviceDao {

	public List<A_User> findAllUserList() {
		// Sleep Method For 5 Second
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<A_User> userList = new ArrayList<A_User>();
		A_User user1 = new A_User(1, "jay.rocky2000@gmail.com", "jay@123@jay");
		userList.add(user1);
		A_User user2 = new A_User(1, "jay.rocky2000@gmail.com", "jay@123@jay");
		userList.add(user2);
		A_User user3 = new A_User(1, "jay.rocky2000@gmail.com", "jay@123@jay");
		userList.add(user3);
		return userList;

	}

	public Double findCalcutation(double number1, double number2, B_ArithmaticOperation arithmaticOperation)
			throws Exception {
		Double result = null;
		if (arithmaticOperation == B_ArithmaticOperation.ADDTION) {
			result = number1 + number2;
		} else if (arithmaticOperation == B_ArithmaticOperation.SUBSTRACTION) {
			result = number1 - number2;
		} else if (arithmaticOperation == B_ArithmaticOperation.MULTIPLICATION) {
			result = number1 * number2;
		} else if (arithmaticOperation == B_ArithmaticOperation.DIVISION) {
			if (number2 == 0) {
				throw new RuntimeException("Please Enter Valid Number");
			}
			result = number1 / number2;
		} else if (arithmaticOperation == B_ArithmaticOperation.MODULO) {
			result = number1 % number2;
		}
		return result;
	}

}
