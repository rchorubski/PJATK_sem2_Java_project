package ostateczny;


public class Krewetki extends Dekorator {
	Pizza pizza;

	public Krewetki(Pizza pizza) {
		this.pizza = pizza;
	}

	public String pobierzOpis() {
		return pizza.pobierzOpis() + ", Krewetki";
	}

	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}

	public double cena() {
		return 6 + pizza.cena();
	}
}