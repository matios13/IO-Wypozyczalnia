package main;
import java.util.Date;


public class RezerwacjaFabryka {
	public Rezerwacja stworzRezerwacje(Pozycja pozycja,Date dataPoczatku, Date dataKonca, Uzytkownik uzytkownik){
		Rezerwacja rezerwacja = new Rezerwacja();
		rezerwacja.setPozycja(pozycja);
		rezerwacja.setDataKonca(dataKonca);
		rezerwacja.setDataPoczatku(dataPoczatku);
		rezerwacja.setUzytkownik(uzytkownik);
		uzytkownik.getRezerwacje().add(rezerwacja);
		pozycja.getRezerwacja().add(rezerwacja);
		return rezerwacja;
	}
}
