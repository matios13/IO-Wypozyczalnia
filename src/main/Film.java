package main;
import java.util.ArrayList;
import java.util.Date;

public class Film {
	private String nazwa;
	private String rezyser;
	private String gatunek;
	private String krajProdukcji;
	private Klasa klasa;
	
	private int rokProdukcji;
	private int czasTrwania;
	ArrayList<Pozycja> pozycje = new ArrayList<Pozycja>();
	
	public Pozycja znajdzDostepnaPozycje(Date data){
		Date dataKonca = new Date();
		dataKonca.setTime(data.getTime()+(klasa.getLiczbaDni()*86400000));
		for(Pozycja pozycja : pozycje){			
			pozycja.czyDostepna(data, dataKonca);
		}
		return null;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getRezyser() {
		return rezyser;
	}

	public void setRezyser(String rezyser) {
		this.rezyser = rezyser;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public String getKrajProdukcji() {
		return krajProdukcji;
	}

	public void setKrajProdukcji(String krajProdukcji) {
		this.krajProdukcji = krajProdukcji;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public int getCzasTrwania() {
		return czasTrwania;
	}

	public void setCzasTrwania(int czasTrwania) {
		this.czasTrwania = czasTrwania;
	}
	
	public Klasa getKlasa() {
		return klasa;
	}

	public void setKlasa(Klasa klasa) {
		this.klasa = klasa;
	}

	public ArrayList<Pozycja> getPozycje() {
		return pozycje;
	}

	public void setPozycje(ArrayList<Pozycja> pozycje) {
		this.pozycje = pozycje;
	}


	@Override
	public boolean equals(Object o) {
		if (((Film) o).getNazwa().equals(nazwa)&&((Film) o).getRokProdukcji()==rokProdukcji)
			return true;

		return false;

	}
}
