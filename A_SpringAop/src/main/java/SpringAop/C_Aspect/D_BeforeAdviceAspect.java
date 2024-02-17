package SpringAop.C_Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import SpringAop.F_Pojo.A_User;

@Aspect
@Component
@Order(2)
public class D_BeforeAdviceAspect {

	// 👉 3.Let's Start With An @Before Advice With PointCut Expression Using
	// Declaration
	// @Before("SpringAop.C_Aspect.B_AdviceAspect.forDaoPackage() &&
	// !(SpringAop.C_Aspect.B_AdviceAspect.forGetterMethodOfPojoPackage() ||
	// SpringAop.C_Aspect.B_AdviceAspect.forSetterMethodOfPojoPackage())")
	public void beforeAddAccountAdviceWithPointCutExpression(JoinPoint theJoinpoint) {

		MethodSignature methodSignature = (MethodSignature) theJoinpoint.getSignature();
		System.out.println("\n ===>" + methodSignature);

		Object[] args = theJoinpoint.getArgs();

		for (Object object : args) {
			if (object instanceof A_User) {
				A_User user = (A_User) object;
				System.err.println("----->" + user.getId());
				System.err.println("----->" + user.getEmail());
				System.err.println("----->" + user.getPassword());
			}

		}
		System.out.println("\n=====>> Executing @Before Advice On addAccountWithOutPointCutExpression2()");
	}
}
