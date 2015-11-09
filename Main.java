import java.util.*;

class Main {

	public static void main(String argv[]) {

		Food tuna = new Food("tuna");
		Food chicken = new Food("chicken");

		Cat wifi = new PickyCat("Wifi", tuna);
		Cat ada  = new Cat("Ada");

		Set<Cat> herd = new HashSet<Cat>();

		herd.add(wifi);
		herd.add(ada);

		for (Cat cat : herd) {
			cat.feed(chicken);
			cat.play();
		}
		
		tuna.stale();

		for (Cat cat : herd) {
			cat.feed(tuna);
		}
		
	}

}
