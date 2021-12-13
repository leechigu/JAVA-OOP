import java.util.Scanner;

public class CalcV1 {
	
    Scanner scanner;
    State firstOperandState;
    State startState;
    State operatorState;
    State secondOperandState;
    String inputStr;
    int operand1; // 첫 번째 피 연산자값 저장
    int operand2; // 두 번째 피 연산자값 저장
    boolean run;
  //  STATES state;
    State state;
    char operator; // 사칙 연산자 저장

    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        firstOperandState = new FirstOperandState(this);
        startState = new StartState(this);
        operatorState = new OperatorState(this);
        secondOperandState = new SecondOperandState(this);
        state = startState;
        run = true;
        
    }
    
    public State getState() {
    	return state;
    }
    public State getFirstOperandState() {
    	state = firstOperandState;
    	return firstOperandState;
    }
    public State getStartState() {
    	state = startState;
    	return startState;
    }
    public State getOperatorState() {
    	state = operatorState;
    	return operatorState;
    }
    public State getSecondOperandState() {
    	state = secondOperandState;
    	return secondOperandState;
    }
    
    public void setState(State state) {
    	this.state = state;
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    void printOutResult() {
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
                break;
            case '-':
                System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
                break;
            case '*':
                System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
                break;
            case '/':
                System.out.printf("%d / %d = %d\n", operand1, operand2, operand1 / operand2);
                break;
        }
    }

 
  
    /* 프로그램의 주 로직을 담당하는 함수
       사용자 입력을 기다렸다가 q 또는 Q가 입력되면 종료
       그렇지 않으면 정수가 입력되었는지 혹은 연산자가 입력되었는지에 따라 processNumber 또는 processOperator 함수를 호출
     */
    boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
        if (ch == 'q' || ch == 'Q') { // q를 입력하면 프로그램 종료
            state.inputQuitSign();
        }
        else if (ch >= '0' && ch <= '9') { // 정수가 입력되면
        	int num = Character.getNumericValue(ch);
            state.inputNumber(num);
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') { // 연산자 처리
            state.inputOperator(ch);
        }
        else if( ch == '=') {
        	state.inputFinishOperator(ch);
        }
        return true;
    }
}
