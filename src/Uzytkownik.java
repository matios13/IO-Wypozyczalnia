
public class Uzytkownik {
	private String imiê;
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
	public String getImiê() {
		return imiê;
	}
	public void setImiê(String imiê) {
		this.imiê = imiê;
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
		if(uzytkownik.getImiê().equals(imiê)&&uzytkownik.getNazwisko().equals(nazwisko)&&uzytkownik.getMiasto().equals(miasto)&&uzytkownik.getAdres().equals(adres))
			return true;
		return false;
		
	}
}
