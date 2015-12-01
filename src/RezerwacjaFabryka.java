import java.util.Date;


public class RezerwacjaFabryka {
	public Rezerwacja stworzRezerwacje(Pozycja pozycja,Date dataPoczatku, Date dataKonca, Uzytkownik uzytkownik){
		Rezerwacja rezerwacja = new Rezerwacja();
		rezerwacja.setPozycja(pozycja);
		rezerwacja.setDataKonca(dataKonca);
		rezerwacja.setDataPoczatku(dataPoczatku);
		rezerwacja.setUzytkownik(uzytkownik);
		return rezerwacja;
	}
}
