package SpringAop.C_Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class E_BeforeAdviceAspect {

	// 👉 4.Let's Start With An @Before Advice With PointCut Expression Using
	// Declaration
	// @Before("SpringAop.C_Aspect.B_AdviceAspect.forDaoPackage() &&
	// !(SpringAop.C_Aspect.B_AdviceAspect.forGetterMethodOfPojoPackage() ||
	// SpringAop.C_Aspect.B_AdviceAspect.forSetterMethodOfPojoPackage())")
	public void beforeAddAccountAdviceWithPointCutExpression() {
		System.out.println("\n=====>> Executing @Before Advice On addAccountWithOutPointCutExpression3()");
	}
}
