import java.io.*;


class Cat {
	
	// Attributes
	private final String name;
	private boolean hungry;
	
	// Constructor
	public Cat(String name) {
		this.name = name;
		hungry = true;
	}


	// Methods
	protected void does(String message) {
		System.out.println(name + " " + message);
	}

	public void play() {
		if (hungry) {
			does("is too hungry to play");
		} else {
			does("is happy to play");
			hungry = true;
		}
	}

	protected void eat(Food food) {
		does("is happily eating " + food);
		hungry = false;
	}

	public void feed(Food food) {
		if (hungry) {
			if (likes(food)) {
				eat(food);
			} else {
				does("looks at " + food + " in disgust.");
			}
		} else {
			does("is not hungry");
		}
	}

	protected boolean likes(Food food) {
		// Cats like all foods
		return true;
	}

}
