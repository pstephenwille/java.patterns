package factory.pizzaaf;

/*
* Abstract Factory
*
* Creates objects through composition.
* Defines how to make a family of Pizza Ingredients.*/
public interface PizzaIngredientFactory {

	/* Factory Methods */
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
