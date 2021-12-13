public class LicenseNumber {

    String licenseNumber = ""; // empty string
    int countDigitInNum1 = 0;
    int countDigitInNum2 = 0;
    int errorPos = 0;
    State state;
    EndState endState;
    HangulState hangulState;
    Num1State num1State;
    Num2State num2State;
    SpaceState spaceState;
    StartState startState;
    
    
    public LicenseNumber() {
    	endState = new EndState(this);
    	hangulState = new HangulState(this);
    	num1State = new Num1State(this);
    	num2State = new Num2State(this);
    	spaceState = new SpaceState(this);
    	startState = new StartState(this);
    	state = startState;
    }

    public void setState(State state) {
    	this.state = state;
    }
    public State getEndState() {
    	setState(endState);
    	return endState;
    }
    public State getHangulState() {
    	setState(hangulState);
    	return hangulState;
    }
    public State getNum1State() {
    	setState(num1State);
    	return num1State;
    }
    public State getNum2State() {
    	setState(num2State);
    	return num2State;
    }
    public State getSpaceState() {
    	setState(spaceState);
    	return spaceState;
    }
    public State getStartState() {
    	setState(startState);
    	return startState;
    }
    
    public int getErrorPos() {
        return errorPos;
    }

    /* verify 함수의 로직 대부분은 수정하지 않아도 됨 */
    public boolean verify(String str) {
        boolean succeeded = true;
        initialize();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                succeeded = state.inputNumber(ch);
            }
            else if (ch == ' ') {
                succeeded = state.inputSpace(ch);
            }
            else if (ch >= '가' && ch <='힣')
            {
                succeeded = state.inputHangul(ch);
            }
            else { // 다른 글자가 입력되면 오류
                succeeded = state.inputError(ch);
            }
            if (succeeded == false) {
                errorPos = i;
                return false;
            }
        }
        if (state != endState) {  // FSM이 제대로 끝나지 않고 중간에 멈춤
            errorPos = str.length();
            return false;
        }
        return true;
    }

    private void initialize() {
        licenseNumber = ""; // empty string
        countDigitInNum1 = 0;
        countDigitInNum2 = 0;
        state = startState;
        errorPos = 0;
    }

}
