
public class HangulState implements State{
	LicenseNumber linum;

	
	public HangulState(LicenseNumber linum){
		this.linum = linum;
	}

	@Override
	public boolean inputNumber(char input) {
		return inputError(input);
	}

	@Override
	public boolean inputHangul(char hangul) {
		return inputError(hangul);
	}

	@Override
	public boolean inputSpace(char space) {
		linum.licenseNumber +=space;
		linum.getSpaceState();
		return true;
		
	}

	@Override
	public boolean inputError(char quit) {
		System.out.println("Error.");
		return false;
	}

}
