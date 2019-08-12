package ostateczny;


public class PizzaDuza extends Dekorator {
	Pizza pizza;

	public PizzaDuza(Pizza pizza) {
		this.pizza = pizza;
	}

	public String pobierzOpis() {
		return pizza.pobierzOpis() + ", du¿a";
	}

	public double cena() {
		return pizza.cena() + 10;
	}

	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}
}