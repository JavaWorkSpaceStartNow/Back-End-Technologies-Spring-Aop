package SpringAop.C_Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class B_AdviceAspect {
	// This Is Where We Add All Of Our Related Advice For Logging

	// 👉 1.Let's Start With An @Before Advice With PointCut Expression Define With
	// Declaration
	@Pointcut("execution(* SpringAop.D_DAO.*.*(..))")
	public void forDaoPackage() {
	}

	@Pointcut("execution(* SpringAop.D_DAO.*.get*(..))")
	public void forGetterMethodOfPojoPackage() {
	}

	@Pointcut("execution(* SpringAop.D_DAO.*.set*(..))")
	public void forSetterMethodOfPojoPackage() {
	}

}
