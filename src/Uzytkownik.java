
public class Uzytkownik {
	private String imi�;
	private String nazwisko;
	private String miasto;
	private String adres;
	private int pesel;
	private int numerTelefonu;
	private boolean mozeRezerwowac;
	
	public boolean czyMozeRezerwowac() {
		return mozeRezerwowac;
	}
	public void setMozeRezerwowac(boolean mozeRezerwowac) {
		this.mozeRezerwowac = mozeRezerwowac;
	}
	public String getImi�() {
		return imi�;
	}
	public void setImi�(String imi�) {
		this.imi� = imi�;
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
	@Override
	public boolean equals(Object o){
		Uzytkownik uzytkownik = (Uzytkownik)o;
		if(uzytkownik.getPesel()==pesel)
			return true;
		if(uzytkownik.getNumerTelefonu()==numerTelefonu)
			return true;
		if(uzytkownik.getImi�().equals(imi�)&&uzytkownik.getNazwisko().equals(nazwisko)&&uzytkownik.getMiasto().equals(miasto)&&uzytkownik.getAdres().equals(adres))
			return true;
		return false;
		
	}
}
