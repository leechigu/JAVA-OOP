
public class Num2State implements State{

	LicenseNumber linum;

	public Num2State(LicenseNumber linum){
		this.linum = linum;
	}
	
	@Override
	public boolean inputNumber(char input) {
		if(linum.countDigitInNum2<4) {
			linum.licenseNumber +=input;
			linum.countDigitInNum2++;
			if(linum.countDigitInNum2==4) {
				linum.getEndState();
			}
			
		}
		return true;
	}

	@Override
	public boolean inputHangul(char hangul) {
		return inputError(hangul);
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
