
public class StartState implements State{

	
	CalcV1 calc;
	
	public StartState(CalcV1 calc) {
		this.calc = calc;	
	}
	
	@Override
	public void inputNumber(int input) {
		calc.operand1 = input;
		calc.setState(calc.getFirstOperandState());
	}

	@Override
	public void inputOperator(char operator) {
		System.out.println("�ٽ� �Է��� �ּ���.");
	}

	@Override
	public void inputQuitSign() {
		System.out.println("����.");
	}

	@Override
	public void inputFinishOperator(char finish) {
		System.out.println("�ٽ� �Է��� �ּ���.");
	}
	
	

}
