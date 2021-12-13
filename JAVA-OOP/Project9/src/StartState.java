
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
		System.out.println("다시 입력해 주세요.");
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
