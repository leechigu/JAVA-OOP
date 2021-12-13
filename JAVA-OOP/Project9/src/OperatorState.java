
public class OperatorState implements State{

	
	CalcV1 calc;
	
	public OperatorState(CalcV1 calc) {
		this.calc = calc;
	}
	
	
	@Override
	public void inputNumber(int input) {
		calc.operand2 = input;
		calc.setState(calc.getSecondOperandState());
	}

	@Override
	public void inputOperator(char Sign) {
		System.out.println("�ٽ� �Է��� �ּ���.");
		
	}

	@Override
	public void inputQuitSign() {
		System.out.println("����.");
		calc.run =false;
	}

	@Override
	public void inputFinishOperator(char finishSign) {
		System.out.println("�ٽ� �Է��� �ּ���.");
	}

}
