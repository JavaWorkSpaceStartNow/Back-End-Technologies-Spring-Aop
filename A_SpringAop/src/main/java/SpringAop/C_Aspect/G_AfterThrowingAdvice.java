package SpringAop.C_Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class G_AfterThrowingAdvice {
	// This Is Where We Add All Of Our Related Advice For Logging

	// 👉 1.Let's Start With An @AfterThrowing Advice With PointCut Expression
	// Define With
	// Declaration
	// 👉Note :- Here We Define throwable Same As Method Parameter
	// @AfterThrowing(pointcut = "execution(*
	// SpringAop.D_DAO.B_AfterAdviceDao.findCalcutation(..))", throwing =
	// "throwable")
	public void afterThrowingFindCalcutation(JoinPoint theJoinPoint, Throwable throwable) {
		// Print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n\n--->method :-" + method);

		System.out.println("--->Exception :-" + throwable);

	}

	// 👉 2.Let's Start With An @After Advice(It is same work as finally block)
	// @After("execution(*
	// SpringAop.C_Aspect.G_AfterThrowingAdvice.findCalcutation(..))")
	public void finallyFindCalcutation(JoinPoint theJoinPoint) {
		// Print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n\n=====>>method :-" + method);

	}
}
