package main;
import java.util.Date;


public class RezerwacjaFabryka {
	public Rezerwacja stworzRezerwacje(Pozycja pozycja,Date dataPoczatku, Date dataKonca, Uzytkownik uzytkownik){
		Rezerwacja rezerwacja = new Rezerwacja();
		rezerwacja.setDataKonca(dataKonca);
		rezerwacja.setDataPoczatku(dataPoczatku);;
		uzytkownik.addRezerwacja(rezerwacja);
		pozycja.addRezerwacja(rezerwacja);
		return rezerwacja;
	}
}
