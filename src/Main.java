public class Main{
	public static void main(String[] args) {
		
		//Here we create objects (users in that case) that will use our ATM system
		
		Account george = new Account("George Andreadis", "A23456");
		
		
		Account helen = new Account("Helen Vlachou", "E98765");
		
		Account konstantinos = new Account("Konstantinos Papadoudis", "X54659");
		
		//Using an object(user) we can call the initialization function showing the ATM main menu
		
		konstantinos.showMenu();
		
		
	}

}
