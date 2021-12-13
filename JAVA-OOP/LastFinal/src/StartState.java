
public class StartState implements State{
	LicenseNumber linum;

	public StartState(LicenseNumber linum){
		this.linum = linum;
	}
	
	@Override
	public boolean inputNumber(char num) {
		linum.countDigitInNum1++;
		linum.licenseNumber +=num;
		linum.getNum1State();
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
		System.out.println("error.");
		return false;
	}

}
