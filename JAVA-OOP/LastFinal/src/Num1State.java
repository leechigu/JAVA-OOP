
public class Num1State implements State {

	LicenseNumber linum;

	
	public Num1State(LicenseNumber linum){
		this.linum = linum;
	}
	
	@Override
	public boolean inputNumber(char input) {
		if(linum.countDigitInNum1<=2) {
			linum.licenseNumber += input;
			linum.countDigitInNum1++;
			return true;
		}
		else {
			return inputError(input);
		}
	}

	@Override
	public boolean inputHangul(char hangul) {
		if(linum.countDigitInNum1>=2) {
			linum.getHangulState();
			return true;
		}
		else {
			return inputError(hangul);
		}
		
	}

	@Override
	public boolean inputSpace(char space) {
		return inputError(space);
		
	}

	@Override
	public boolean inputError(char quit) {
		System.out.println("Error.");
		return false;
	}
}
