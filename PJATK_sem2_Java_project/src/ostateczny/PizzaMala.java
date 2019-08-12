package ostateczny;


public class PizzaMala extends Dekorator {
	Pizza pizza;

	public PizzaMala(Pizza pizza) {
		this.pizza = pizza;
	}

	public String pobierzOpis() {
		return pizza.pobierzOpis() + ", ma³a";
	}

	public double cena() {
		return pizza.cena();
	}

	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}
}