class Food {

	public final String name;
	private boolean fresh;

	public Food(String name) {
		this.name = name;
		fresh = true;
	}

	public String toString() {
		if (fresh)
			return name;
		else
			return "rotten " + name;
	}

	public void stale() {
		fresh = false;
	}

	public boolean isFresh() {
		return fresh;
	}
}
