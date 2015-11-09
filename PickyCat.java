class PickyCat extends Cat {

	private Food favoriteFood;

	// Constructor
	public PickyCat(String name, Food food) {
		super(name);
		favoriteFood = food;
	}

	public boolean likes(Food food) {
		if (super.likes(food)) {
			if (favoriteFood.equals(food)) {
				return true;
			} else {
				does("is a picky cat and does not like " + food);
				return false;
			}
		} else {
			return false;
		}
	}

}
