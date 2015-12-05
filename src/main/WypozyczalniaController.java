package main;
import java.util.ArrayList;
import java.util.Date;

public class WypozyczalniaController {
	private ZarzadzanieFasada zarzadzanieFasada = new ZarzadzanieFasada();
	private FilmyFasada filmyFasada = new FilmyFasada();
	
	public String rezerwuj(ArrayList<String> informacjeFilmu, ArrayList<String> informacjeUzytkownika,Date data) {
		Uzytkownik uzytkownik = zarzadzanieFasada.znajdzUzytkownika(informacjeUzytkownika);
		if(uzytkownik==null)
			return "nie znaleziono uzytkownika";
		Rezerwacja rezerwacja = filmyFasada.dodajRezerwacjeFilmu(uzytkownik, informacjeFilmu, data);
		if(rezerwacja==null)
			return "nie ma wolnych filmow, nie mozesz wypozyczac lub podadles bledny film";
		return rezerwacja.toString();
	}
}
