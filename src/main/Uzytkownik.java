package main;

import java.util.ArrayList;

public class Uzytkownik {
	private String imie;
	private String nazwisko;
	private String miasto;
	private String adres;
	private int pesel;
	private int numerTelefonu;
	private boolean mozeRezerwowac;
	private ArrayList<Wypozyczenie> wypozyczenia;
	private ArrayList<Rezerwacja> rezerwacje;
	
	public boolean czyMozeRezerwowac() {
		return mozeRezerwowac;
	}
	public void setMozeRezerwowac(boolean mozeRezerwowac) {
		this.mozeRezerwowac = mozeRezerwowac;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getPesel() {
		return pesel;
	}
	public void setPesel(int pesel) {
		this.pesel = pesel;
	}
	public int getNumerTelefonu() {
		return numerTelefonu;
	}
	public void setNumerTelefonu(int numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}


	public ArrayList<Wypozyczenie> getWypozyczenia() {
		return wypozyczenia;
	}

	public void setWypozyczenia(ArrayList<Wypozyczenie> wypozyczenia) {
		this.wypozyczenia = wypozyczenia;
	}

	public ArrayList<Rezerwacja> getRezerwacje() {
		return rezerwacje;
	}

	public void setRezerwacje(ArrayList<Rezerwacja> rezerwacje) {
		this.rezerwacje = rezerwacje;
	}
	public void addRezerwacja(Rezerwacja rezerwacja){
		rezerwacja.setUzytkownik(this);
		rezerwacje.add(rezerwacja);
	}

	@Override
	public boolean equals(Object o){
		Uzytkownik uzytkownik = (Uzytkownik)o;
		if(uzytkownik.getPesel()==pesel)
			return true;
		if(uzytkownik.getNumerTelefonu()==numerTelefonu)
			return true;
		if(uzytkownik.getImie().equals(imie)&&uzytkownik.getNazwisko().equals(nazwisko)&&uzytkownik.getMiasto().equals(miasto)&&uzytkownik.getAdres().equals(adres))
			return true;
		return false;

	}
}
