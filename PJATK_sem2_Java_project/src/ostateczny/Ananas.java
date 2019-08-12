package ostateczny;


public class Ananas extends Dekorator {
	Pizza pizza;

	public Ananas(Pizza pizza) {
		this.pizza = pizza;
	}

	public String pobierzOpis() {
		return pizza.pobierzOpis() + ", Ananas";
	}

	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}

	public double cena() {
		return 3 + pizza.cena();
	}
}