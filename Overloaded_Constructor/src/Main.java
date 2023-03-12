
public class Main {

	public static void main(String[] args) {
		Burger burger = new Burger("white bread","chicken","mozarella");
		Burger burger1 = new Burger("white bread","meat");
		System.out.println(burger.bread);
		System.out.println(burger.cheese);
		System.out.println(burger.meat);
		
		System.out.println(burger1.meat);
		System.out.println(burger1.cheese);


	}

}
