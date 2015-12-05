import java.util.Date;


public class Wypozyczenie {
private Date poczatek;
private Date koniec;
private Pozycja pozycja;

public Pozycja getPozycja() {
	return pozycja;
}
public void setPozycja(Pozycja pozycja) {
	this.pozycja = pozycja;
}
public Date getPoczatek() {
	return poczatek;
}
public void setPoczatek(Date poczatek) {
	this.poczatek = poczatek;
}
public Date getKoniec() {
	return koniec;
}
public void setKoniec(Date koniec) {
	this.koniec = koniec;
}
}
