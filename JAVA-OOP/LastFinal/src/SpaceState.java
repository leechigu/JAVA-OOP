
public class SpaceState implements State {

	LicenseNumber linum;

	public SpaceState(LicenseNumber linum){
		this.linum = linum;
	}
	@Override
	public boolean inputNumber(char input) {
		linum.licenseNumber +=input;
		linum.countDigitInNum2++;
		linum.getNum2State();
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
