package factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
	/*
	* CONCRETE CREATOR
	*
	* Define abstract 'createPizza'.
	* Returns a 'Pizza' of the specified type; cheese, veggie, etc
	* Example of programming to an interface, not each implementation. */
	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
