
public class Main {

	public static void main(String[] args) {
		Human human1 = new Human("bahaa",22);
		Human human2 = new Human("Adam",21);
		human1.eat();
		human2.eat();
		System.out.println(human1.name);
		System.out.println(human2.age);

	}

}
