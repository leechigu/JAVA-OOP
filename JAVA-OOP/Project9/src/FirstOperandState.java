
public class FirstOperandState implements State {
	
	
	CalcV1 calc;
	
	public FirstOperandState(CalcV1 calc) {
		this.calc = calc;
	}
	
	@Override
	public void inputNumber(int input) {
		System.out.println("다시 입력해 주세요.");
		
	}

	@Override
	public void inputOperator(char operator) {
		calc.operator = operator;
		calc.setState(calc.getOperatorState());
	}

	@Override
	public void inputQuitSign() {
		System.out.println("종료.");
		
	}

	@Override
	public void inputFinishOperator(char finish) {
		System.out.println("다시 입력해 주세요.");
	}



}
