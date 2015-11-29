import java.util.ArrayList;
import java.util.Date;

public class WypozyczalniaController {
	private ZarzadzanieFasada zarzadzanieFasada = new ZarzadzanieFasada();
	private FilmyFasada filmyFasada = new FilmyFasada();
	
	public String rezerwuj(ArrayList<String> InformacjeFilmu, ArrayList<String> informacjeUzytkownika,Date data) {
		Uzytkownik uzytkownik = zarzadzanieFasada.znajdzUzytkownika(informacjeUzytkownika);
		if(uzytkownik==null)
			return "nie znaleziono u¿ytkownika";
		return "nie ma wolnych filmów";
	}
}
