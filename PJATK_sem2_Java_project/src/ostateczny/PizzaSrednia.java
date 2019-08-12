package ostateczny;


public class PizzaSrednia extends Dekorator {
	Pizza pizza;

	public PizzaSrednia(Pizza pizza) {
		this.pizza = pizza;
	}

	public String pobierzOpis() {
		return pizza.pobierzOpis() + ", œrednia";
	}

	public double cena() {
		return pizza.cena() + 5;
	}

	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}
}