package ostateczny;


public class Main {
	public static void main(String[] args) {
		Pizza pizza = null;
		pizza = Menu.pobierzMenu(pizza);
		System.out.println(
				pizza.pobierzOpis() + ". Ostroœæ: " + pizza.pobierzOstrosc() + ". Cena: " + pizza.cena() + "z³.");

	}
}