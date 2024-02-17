package SpringAop.F_Pojo;

public enum B_ArithmaticOperation {
	ADDTION("ADDTION"), SUBSTRACTION("SUBSTRACTION"), MULTIPLICATION("MULTIPLICATION"), DIVISION("DIVISION"),
	MODULO("MODULO");

	public String displayArithmaticOperation;

	private B_ArithmaticOperation(String displayArithmaticOperation) {
		this.displayArithmaticOperation = displayArithmaticOperation;
	}

}
