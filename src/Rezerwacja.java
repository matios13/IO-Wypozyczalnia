import java.util.Date;


public class Rezerwacja {
private Uzytkownik uzytkownik;
private Pozycja pozycja;
private Date dataPoczatku;
private Date dataKonca;
public Uzytkownik getUzytkownik() {
	return uzytkownik;
}
public void setUzytkownik(Uzytkownik uzytkownik) {
	this.uzytkownik = uzytkownik;
}
public Pozycja getPozycja() {
	return pozycja;
}
public void setPozycja(Pozycja pozycja) {
	this.pozycja = pozycja;
}
public Date getDataPoczatku() {
	return dataPoczatku;
}
public void setDataPoczatku(Date dataPoczatku) {
	this.dataPoczatku = dataPoczatku;
}
public Date getDataKonca() {
	return dataKonca;
}
public void setDataKonca(Date dataKonca) {
	this.dataKonca = dataKonca;
}
@Override
public String toString(){
	return "Zarezerwowano film : "+ pozycja.getFilm().getNazwa()+" o id : "+pozycja.getId()+
			"\n dla uzytkownika "+uzytkownik.getImiê()+" "+uzytkownik.getNazwisko()+
			"\n od : "+dataPoczatku.toString()+" do : "+dataKonca.toString();
}
}
