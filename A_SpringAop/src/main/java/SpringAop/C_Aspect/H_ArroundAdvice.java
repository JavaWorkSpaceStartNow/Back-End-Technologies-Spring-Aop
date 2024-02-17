package SpringAop.C_Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class H_ArroundAdvice {

	// 👉 1.Let's Start With An @AfterReturning Advice With PointCut Expression
	// Define With
	// Declaration
	// 👉Note :- Here We Define usersList Same As Method Parameter
	// @Around("execution(* SpringAop.D_DAO.*.findAllUserList())")
	public Object afterReturningFindAllUserList(ProceedingJoinPoint theJoinPoint) throws Throwable {
		// Print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("--->method :-" + method);

		double beagin = System.currentTimeMillis();

		Object object = theJoinPoint.proceed();

		double end = System.currentTimeMillis();

		// print out the result of the method call
		System.out.println("--->Executation Time:- " + (end - beagin) / 1000);

		return object;

	}
}
