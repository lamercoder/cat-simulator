import java.util.*;

class Main {

	public static void main(String argv[]) {

		Food tuna = new Food("tuna");
		Food chicken = new Food("chicken");

		Cat ada  = new Cat("Ada");
		ada.feed(tuna);
		ada.feed(chicken);

		
	}

}
