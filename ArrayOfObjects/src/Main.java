
public class Main {

	public static void main(String[] args) {
		Food food1 = new Food("apple");
		Food food2 = new Food("banana");
		
		Food[] refrigrator = {food1,food2};
		System.out.println(refrigrator[0].name);
		System.out.println(refrigrator[1].name);

	}

}
