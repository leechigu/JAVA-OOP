import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;

public class CommandInvoker {
	
	
	private JButton button[];
	private Command[] command;
	private Calculator calc;
	private JLabel display;
	CommandInvoker(Calculator calc,JButton button[],JLabel display){
		this.calc = calc;
		this.button = button;
		this.command = new Command[15];
		this.display = display;
		
	}
	
	
	public void setCommand(){
		for(int i = 0;i<command.length;i++) {
			if(i<11)
				command[i] = new CalcNumberCommand(calc,button[i],display);
			else if (i>=11&&i<14) 
				command[i] = new CalcSignCommand(calc,button[i],display);
			else 
				command[i] = new CalcSumSignCommand(calc,button[i],display);
		}
	}
	
	public void buttonPushed(int slot) {
		command[slot].execute();
	}
	
}
