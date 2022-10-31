package practice;

public class methodandfunction {

	//covered topics
	//create single method in java class
	//create multiple methods using methods concept in java class
	//creating methods with parameters 
	
	//step 1:  To create a single method for login and logout using the methods concept in java 
	/*
	public void login() {
		System.out.println("Login with usename anees");
		System.out.println("Login as paswd anees");
		System.out.println("Login as sign in");
	}
	public void logout() {
		System.out.println("Logout");
	}
	public static void main(String[] args) {
		
    methodandfunction x=new methodandfunction();
    x.login();
    x.logout();
    
    x.login();
    x.logout();
    
    x.login();
    x.logout();
	}
*/
	
	//step 2: create multiple login methods using methods concept in java 
	
	/*
	public void login_anees() {
		System.out.println("Login with usename anees");
		System.out.println("Login as paswd #%^&&^&");
		System.out.println("Login as sign in");
	}
	public void login_moosa() {
		System.out.println("Login with usename moosa");
		System.out.println("Login as paswd 1654$^&*&");
		System.out.println("Login as sign in");
	}
	public void login_shakeer() {
		System.out.println("Login with usename shakeer");
		System.out.println("Login as paswd 54654125^&^&^%$&^$");
		System.out.println("Login as sign in");
	}
	public void login_jaffer() {
		System.out.println("Login with usename jaffer");
		System.out.println("Login as paswd 123456");
		System.out.println("Login as sign in");
	}
	public void logout() {
		System.out.println("Logout");
	}
	public static void main(String[] args) {
		
    methodandfunction x=new methodandfunction();
    x.login_anees();
    x.logout();
    
    x.login_shakeer();
    x.logout();
    
    x.login_jaffer();
    x.logout();
    
    x.login_moosa();
    x.logout();
	}
	*/
 // next step passing parameters to the methods

	//step3: methods with parameters
	//first give two variable(string username, String password ) inside the login method and add the string value to the System.out.println("Login with usename"+ username);
	//System.out.println("Login as password"+ password);
	
	/*
	
	public void login(String username, String password )
	{
		System.out.println("Login with usename"+":"+" "+username);
		System.out.println("Login as password"+":"+" "+password);
		System.out.println("Login as sign in");
	}
	
	public void logout()
	{
		System.out.println("Logout");
	}
	
	public static void main(String[] args) {

		methodandfunction x= new methodandfunction();
		x.login("shakeer","12345^%&^%&^");
		x.logout();
		
		x.login("anees", "123456^&*");
		x.logout();
		
		x.login("sandhya", "bcbkcb&*^*&^");
		x.logout();
		
		x.login("moosa", "bdhdbbhdv8934");
		x.logout();
		
		*/
	
	}