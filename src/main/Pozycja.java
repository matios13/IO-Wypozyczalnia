package main;
import java.util.ArrayList;
import java.util.Date;


public class Pozycja {
	private String nosnik;
	private int id;
	private Wypozyczenie wypozyczenie;
	private Film film;
	private ArrayList<Rezerwacja> rezerwacja = new ArrayList<Rezerwacja>();

	public boolean czyDostepna(Date data, Date dataKonca){
		if (wypozyczenie!= null && wypozyczenie.getKoniec().compareTo(data)>0)
			return false;
		for(Rezerwacja r : rezerwacja){
			if(r.getDataKonca().compareTo(data)<0||r.getDataPoczatku().compareTo(dataKonca)>0){
				return true;
			}
		}
		return false;
	}

	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}

	
	public String getNosnik() {
		return nosnik;
	}
	public void setNosnik(String nosnik) {
		this.nosnik = nosnik;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Wypozyczenie getWypozyczenie() {
		return wypozyczenie;
	}
	public void setWypozyczenie(Wypozyczenie wypozyczenie) {
		this.wypozyczenie = wypozyczenie;
	}
	public ArrayList<Rezerwacja> getRezerwacja() {
		return rezerwacja;
	}
	public void setRezerwacja(ArrayList<Rezerwacja> rezerwacja) {
		this.rezerwacja = rezerwacja;
	}
	
}
