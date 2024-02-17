package SpringAop.C_Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class A_BeforeAdviceAspect {
	// This Is Where We Add All Of Our Related Advice For Logging

	// Let's Start With An @Before Advice With Out PointCut Expression(This Are
	// Working For All Class Method When We Call)(Check Like This In Main
	// Class(==>1))
	// @Before("execution(public void addAccountWithOutPointCutExpression())")
	public void beforeAddAccountAdviceWithOutPointCutExpression() {
		System.out.println("\n=====>> Executing @Before Advice On All addAccountWithOutPointCutExpression() \n");
	}

	// Let's Start With An @Before Advice With PointCut Expression(This Are
	// Working For All Class Method When We Call(==>2))
	// @Before("execution(public void addAccountWithPointCutExpression())")
	public void beforeAddAccountAdviceWithPointCutExpression() {
		System.out.println("\n=====>> Executing @Before Advice On All addAccountWithPointCutExpression() \n");
	}

	// Let's Start With An @Before Advice With PointCut Expression(This Are
	// Working For Only One Class Which We Define In execution Method When We
	// Call(==>3))
	// @Before("execution(public void
	// SpringAop.D_DAO.A_BeforeAdviceDAO.addAccountWithPointCutExpressionBasedOnClass())")
	public void beforeAddAccountAdviceWithPointCutExpressionBasedOnClass() {
		System.out.println(
				"\n=====>> Executing @Before Advice On addAccountWithPointCutExpression() which implemented in SpringAop.D_DAO.A_BeforeAdviceDAO");
	}

	// 👉 1.Let's Start With An @Before Advice With PointCut Expression(This Are
	// Working For All Class Which Method Name Start With add And It's Return Type
	// Is Void)(==>4)
	// @Before("execution(public void add*())")

	// 👉 2.Let's Start With An @Before Advice With PointCut Expression(This Are
	// Working For All Class Which Method Name Start With add And It's Return Type
	// Is Void)(==>5)
	// There Are Not Need To Define Access Modifier
	// @Before("execution(void add*())")

	// 👉 3.Let's Start With An @Before Advice With PointCut Expression(This Are
	// Working For All Class Which Method Name Start With add And It's Working For
	// All ReturnType)(==>6)
	// There Are Not Need To Define Access Modifier
	// @Before("execution(* add*())")

	// 👉 4.Let's Start With An @Before Advice With PointCut Expression(This Are
	// Working For All Class Which Method Name Start With add And It's Working For
	// All ReturnType And Also Not Have Arguments)
	// There Are Not Need To Define Access Modifier(==>7)
	// @Before("execution(* add*(SpringAop.F_Pojo.A_User))")

	// 👉 5.Let's Start With An @Before Advice With PointCut Expression(This Are
	// Working For All Class Which Method Name Start With add And It's Working For
	// All ReturnType And Also Not Have Multiple Arguments)
	// There Are Not Need To Define Access Modifier(==>8)
	// @Before("execution(* add*(SpringAop.F_Pojo.A_User,..))")
	// @Before("execution(* add*(..))")
	public void beforeAddAccountAdviceWithPointCutExpressionForAllClassWhichMethodNameStartWithadd() {
		System.out.println("\n=====>> Executing @Before Advice On ForAllClassWhichMethodNameStartWithadd ");
	}

}
