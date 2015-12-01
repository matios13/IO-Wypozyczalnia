import java.util.ArrayList;
import java.util.Date;

public class FilmyFasada {
	private ArrayList<Film> filmy = new ArrayList<Film>();
	private ArrayList<Klasa> klasy = new ArrayList<Klasa>();
	private ArrayList<Pozycja> pozycje = new ArrayList<Pozycja>();
	private ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<Wypozyczenie>();
	private ArrayList<Rezerwacja> rezerwacje = new ArrayList<Rezerwacja>();
	
	private RezerwacjaFabryka rezerwacjaFabryka = new RezerwacjaFabryka();
	public Rezerwacja dodajRezerwacjeFilmu(Uzytkownik uzytkownik,
			ArrayList<String> informacjeFilmu, Date dataRezerwacji) {
		if(!uzytkownik.czyMozeRezerwowac())
			return null;
		Film film = new Film();
		film.setNazwa(informacjeFilmu.get(0));
		film.setRokProdukcji(new Integer(informacjeFilmu.get(1)).intValue());
		boolean znaleziono = false;
		for(Film f : filmy){
			if(f.equals(film)){
				film=f;
				znaleziono=true;
				break;
			}
		}
		if(!znaleziono)
			return null;
		Pozycja pozycja = film.znajdzDostepnaPozycje(dataRezerwacji);
		if(pozycja==null)
			return null;
		
		Date dataKonca = new Date();
		dataKonca.setTime(dataRezerwacji.getTime()+(film.getKlasa().getLiczbaDni()*86400000));
		Rezerwacja rezerwacja = rezerwacjaFabryka.stworzRezerwacje(pozycja, dataRezerwacji, dataKonca, uzytkownik);
		pozycja.getRezerwacja().add(rezerwacja);
		rezerwacje.add(rezerwacja);
		return rezerwacja;
		
	}
}
