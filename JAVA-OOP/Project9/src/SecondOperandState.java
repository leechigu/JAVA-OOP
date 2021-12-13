
public class SecondOperandState implements State{

	CalcV1 calc;
	
	public SecondOperandState(CalcV1 calc) {
		this.calc=calc;
	}
	
	
	
	@Override
	public void inputNumber(int input) {
		System.out.println("�ٽ� �Է��� �ּ���.");
		
	}

	@Override
	public void inputOperator(char Sign) {
		System.out.println("�ٽ� �Է��� �ּ���.");
		
	}

	@Override
	public void inputQuitSign() {
		System.out.println("����.");
		
	}

	@Override
	public void inputFinishOperator(char finishSign) {
		calc.printOutResult();
		calc.setState(calc.getStartState());
	}
	

}
