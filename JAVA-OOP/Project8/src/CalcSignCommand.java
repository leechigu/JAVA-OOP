import javax.swing.JButton;
import javax.swing.JLabel;

public class CalcSignCommand implements Command{
	private Calculator calc;
	private JButton button;
	private JLabel display;
	
	
	
	CalcSignCommand(Calculator calc,JButton button, JLabel display)
	{
		this.button = button;
		this.calc =  calc;
		this.display = display;
	}



	public void execute() {
		if (calc.isOperand1Set()) {
            calc.setOperatorSet(true);
            calc.setOperator(button.getText().charAt(0));
        }
		
	}
	
	

}
