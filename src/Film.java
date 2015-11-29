public class Film {
	private String nazwa;
	private String rezyser;
	private String gatunek;
	private String krajProdukcji;
	private int rokProdukcji;
	private int czasTrwania;

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

	@Override
	public boolean equals(Object o) {
		if (((Film) o).getNazwa().equals(nazwa))
			return true;

		return false;

	}
}
