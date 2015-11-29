import java.util.ArrayList;

public class ZarzadzanieFasada {
	ArrayList<Uzytkownik> uzytkownicy = new ArrayList<Uzytkownik>();

	Uzytkownik znajdzUzytkownika(ArrayList<String> daneUzytkownika) {
		Uzytkownik uzytkownik = new Uzytkownik();
		uzytkownik.setImiê(daneUzytkownika.get(0));
		uzytkownik.setNazwisko(daneUzytkownika.get(1));
		uzytkownik.setMiasto(daneUzytkownika.get(2));
		uzytkownik.setAdres(daneUzytkownika.get(3));
		uzytkownik.setNumerTelefonu((new Integer(daneUzytkownika.get(4)).intValue()));
		uzytkownik.setPesel((new Integer(daneUzytkownika.get(5)).intValue()));
		for(Uzytkownik u : uzytkownicy){
			if(u.equals(uzytkownik)){
				return u;
			}
		}
		return null;
	}
}
