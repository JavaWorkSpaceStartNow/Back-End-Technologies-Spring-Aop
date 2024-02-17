package SpringAop.C_Aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import SpringAop.F_Pojo.A_User;

@Aspect
@Component
@Order(1)
public class F_AfterReturningAdvice {
	// This Is Where We Add All Of Our Related Advice For Logging

	// 👉 1.Let's Start With An @AfterReturning Advice With PointCut Expression
	// Define With
	// Declaration
	// 👉Note :- Here We Define usersList Same As Method Parameter
	// @AfterReturning(pointcut = "execution(*
	// SpringAop.D_DAO.*.findAllUserList())", returning = "usersList")
	public void afterReturningFindAllUserList(JoinPoint theJoinPoint, List<A_User> usersList) {
		// Print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("--->method :-" + method);

		// print out the result of the method call
		System.out.println("--->Users List Is :- " + usersList);

		// convert the account names in upperCase
		convertNameInUpperCase(usersList);

		// print out the result of the method call
		System.out.println("--->Users List Is :- " + usersList);

	}

	private static void convertNameInUpperCase(List<A_User> usersList) {
		for (A_User user : usersList) {
			String uppercaseName = user.getEmail().toUpperCase();
			user.setEmail(uppercaseName);
		}
	}
}
