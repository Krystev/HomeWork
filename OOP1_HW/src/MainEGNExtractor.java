
public  class MainEGNExtractor extends Human{

	

	public MainEGNExtractor(long yourEGN) {
		super(yourEGN);
		
	}
	
	

public static class EGNExtractor extends Human{
		
		public EGNExtractor(long yourEGN) {
			super(yourEGN);
			
		}

		public boolean isMale(long eGN) {
			
			boolean isMale = false;
			if (((eGN % 100) / 10) % 2 == 0){
				isMale = true;
			}
			return isMale;
		}

	}
	
	

}
