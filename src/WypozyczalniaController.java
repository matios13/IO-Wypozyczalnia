import java.util.ArrayList;
import java.util.Date;

public class WypozyczalniaController {
	private ZarzadzanieFasada zarzadzanieFasada = new ZarzadzanieFasada();
	private FilmyFasada filmyFasada = new FilmyFasada();
	
	public String rezerwuj(ArrayList<String> informacjeFilmu, ArrayList<String> informacjeUzytkownika,Date data) {
		Uzytkownik uzytkownik = zarzadzanieFasada.znajdzUzytkownika(informacjeUzytkownika);
		if(uzytkownik==null)
			return "nie znaleziono u�ytkownika";
		Rezerwacja rezerwacja = filmyFasada.dodajRezerwacjeFilmu(uzytkownik, informacjeFilmu, data);
		if(rezerwacja==null)
			return "nie ma wolnych film�w, nie mo�esz wypozycza� lub poda�es b��dny film";
		return rezerwacja.toString();
	}
}
