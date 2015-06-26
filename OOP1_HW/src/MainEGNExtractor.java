
public  class MainEGNExtractor extends Human{

	

	public MainEGNExtractor(String yourName, int yourAge, long yourEGN) {
		super(yourName, yourAge, yourEGN);
		
	}
	
	public static class EGNExtractor extends Human{
		long egn;
		public EGNExtractor(String yourName, int yourAge, long yourEGN) {
			super(yourName, yourAge, yourEGN);
			this.egn = yourEGN;
		}

		public String yourSex() {
			
			String sex;
			if (((egn % 100) / 10) / 2 == 0){
				return sex = "Male";
			}
			return sex = "FeMale";
		}

	}
	

}
