public class Test2 {

	public static void main(String[] args) {
		VideoLibrary library = new VideoLibrary("Arena");
		library.addVCassette("Divergent", 120);
		library.addVCassette("Insurgent", 121);
		library.addVCassette("Home", 122);
		library.addVCassette("Minions", 123);
		
		library.createUser("Pesho");
		
		System.out.println(library.getAllVHS());
		
		library.takeVHS("Insurgent", "pesho"); 
		
		library.printRents();
		
		library.returnVHS("Insurgent", "Pesho");
		
		library.printRents();
	}
}