import javax.swing.JButton;
import javax.swing.JLabel;

public class CalcSumSignCommand implements Command{

	private Calculator calc;
	private JButton button;
	private JLabel display;
	
	
	
	CalcSumSignCommand(Calculator calc,JButton button, JLabel display)
	{
		this.button = button;
		this.calc =  calc;
		this.display = display;
	}


	public void execute() {
		int result = 0;
        if (calc.isOperand1Set() && calc.isOperand2Set() && calc.isOperatorSet()) {
            if (calc.getOperator() == '+') {
                result = calc.getOperand1() + calc.getOperand2();
            }
            else if (calc.getOperator() == '-') {
                result = calc.getOperand1() - calc.getOperand2();
            }
            else if (calc.getOperator() == '*') {
                result = calc.getOperand1() * calc.getOperand2();
            }
            else if (calc.getOperator() == '/') {
                result = calc.getOperand1() / calc.getOperand2();
            }
        }
        display.setText("" + result);
        calc.clearFlags();
		
	}



}
