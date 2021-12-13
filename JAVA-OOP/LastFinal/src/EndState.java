public class EndState implements State{
	LicenseNumber linum;
	
	
	public EndState(LicenseNumber linum){
		this.linum = linum;
	}
	
	
	@Override
	public boolean inputNumber(char input) {
		
		return false;
	}

	@Override
	public boolean inputHangul(char hangul) {
		
		return false;
	}

	@Override
	public boolean inputSpace(char space) {
		
		return false;
	}

	@Override
	public boolean inputError(char quit) {
		
		return false;
	}
	
	

}
