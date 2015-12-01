import java.util.ArrayList;
import java.util.Date;

public class WypozyczalniaController {
	private ZarzadzanieFasada zarzadzanieFasada = new ZarzadzanieFasada();
	private FilmyFasada filmyFasada = new FilmyFasada();
	
	public String rezerwuj(ArrayList<String> informacjeFilmu, ArrayList<String> informacjeUzytkownika,Date data) {
		Uzytkownik uzytkownik = zarzadzanieFasada.znajdzUzytkownika(informacjeUzytkownika);
		if(uzytkownik==null)
			return "nie znaleziono u¿ytkownika";
		Rezerwacja rezerwacja = filmyFasada.dodajRezerwacjeFilmu(uzytkownik, informacjeFilmu, data);
		if(rezerwacja==null)
			return "nie ma wolnych filmów, nie mo¿esz wypozyczaæ lub poda³es b³êdny film";
		return rezerwacja.toString();
	}
}
