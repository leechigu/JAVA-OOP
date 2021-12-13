import javax.swing.JButton;
import javax.swing.JLabel;

public class CalcNumberCommand implements Command{
	
	private Calculator calc;
	private JButton button;
	private JLabel display;
	
	
	
	CalcNumberCommand(Calculator calc,JButton button, JLabel display)
	{
		this.button = button;
		this.calc =  calc;
		this.display = display;
	}

	@Override
	public void execute() {
		
		 if (calc.isOperand1Set() && calc.isOperatorSet()) { 
             int num2 = Integer.parseInt(button.getText());
             calc.setOperand2(num2);
             display.setText("" + num2);
             calc.setOperand2Set(true);
         }
         else {
             int num1 = Integer.parseInt(button.getText());
             display.setText("" + num1);
             calc.setOperand1(num1);
             calc.setOperand1Set(true);
         }
		
	}

}
