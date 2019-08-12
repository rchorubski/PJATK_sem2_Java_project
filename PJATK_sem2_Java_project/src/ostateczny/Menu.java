package ostateczny;


import java.util.Scanner;

abstract class Menu implements ZamawianiePizzy {
	public static Pizza pobierzMenu(Pizza pizza) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int menu = 0;
		int wyb�r = 0;
		int dow�z = 0;
		int rozmiar = 0;
		int odbi�r = 0;
		int skladniki = 0;
		String adres;
		do {
			System.out.println("Pizze do wyboru:");
			System.out.println("[1] " + Capricciosa.opis());
			System.out.println("[2] " + Wegetarianska.opis());
			System.out.println("[3] " + Pepperoni.opis());
			wyb�r = sc.nextInt();
			menu = 1;
		} while (wyb�r > 3 || wyb�r < 1);

		if (wyb�r == 1) {
			pizza = new Capricciosa();
		} else if (wyb�r == 2) {
			pizza = new Wegetarianska();
		} else {
			pizza = new Pepperoni();
		}
		do {
			switch (menu) {
			case 1: {
				do {
					System.out.println("Czy chcesz doda� sk�adniki do pizzy?");
					System.out.println("1 - Tak");
					System.out.println("2 - Nie");
					skladniki = sc.nextInt();
				} while (skladniki > 2 || skladniki < 1);
				if (skladniki == 1) {
					do {
						System.out.println("Wybierz dodatkowy skladnik:");
						System.out.println("1 - Krewetki + 6z�");
						System.out.println("2 - Szynka + 2z�");
						System.out.println("3 - Ananas + 3z�");
						System.out.println("0 - Koniec");
						System.out.println("Cena: " + pizza.cena() + "z�.");
						skladniki = sc.nextInt();
						switch (skladniki) {
						case 1:
							pizza = new Krewetki(pizza);
							break;
						case 2:
							pizza = new Szynka(pizza);
							break;
						case 3:
							pizza = new Ananas(pizza);
							break;
						}
					} while (skladniki != 0);
				}
				menu = 2;
			}

			case 2: {
				do {
					System.out.println("Wybierz rozmiar pizzy:");
					System.out.println("1 - Ma�a");
					System.out.println("2 - �rednia + 5z�");
					System.out.println("3 - Du�a + 10z�");
					System.out.println("Cena: " + pizza.cena() + "z�.");
					rozmiar = sc.nextInt();
					menu = 3;
				} while (rozmiar < 1 || rozmiar > 3);
				if (rozmiar == 1) {
					pizza = new PizzaMala(pizza);
				} else if (rozmiar == 2) {
					pizza = new PizzaSrednia(pizza);
				} else if (rozmiar == 3) {
					pizza = new PizzaDuza(pizza);
				}
				break;
			}
			case 3: {
				System.out.println("Wybierz spos�b dostawy:");
				System.out.println("1 - Odbi�r osobisty");
				System.out.println("2 - Dow�z");
				System.out.println("Cena: " + pizza.cena() + "z�.");
				dow�z = sc.nextInt();
				if (dow�z == 1) {
					do {
						System.out.println("Wybierz miejsce odbioru zam�wienia:");
						System.out.println("1 - ul. Brzegi 55");
						System.out.println("2 - ul. D�uga 123");
						System.out.println("3 - ul. Kr�tka 123");
						odbi�r = sc.nextInt();
					} while (odbi�r < 1 || odbi�r > 3);
				} else {
					System.out.println("Podaj adres dostawy");
					adres = sc1.nextLine();
					System.out.println("Adres zam�wienia: " + adres);
				}
				menu = 4;
			}
			}
		} while (menu != 4);
		return pizza;
	}
}