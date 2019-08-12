package ostateczny;


public abstract class Pizza {
	static String opis = "Pizza";
	int ostrosc = 0;
	String rozmiar = "mala";

	public String pobierzOpis() {
		return opis;
	}

	public int pobierzOstrosc() {
		return ostrosc;
	}

	public String pobierzWielkosc() {
		return rozmiar;
	}

	public abstract double cena();
}