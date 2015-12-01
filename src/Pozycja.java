import java.util.ArrayList;


public class Pozycja {
	private String nosnik;
	private int id;
	private Wypozyczenie wypozyczenie;
	private Film film;
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	private ArrayList<Rezerwacja> rezerwacja = new ArrayList<Rezerwacja>();
	
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
