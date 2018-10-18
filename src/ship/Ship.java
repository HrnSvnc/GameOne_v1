package ship;

public class Ship {
	private int leben;
	private int schild;
	private int schaden;
	private int kapazitaet;
	private boolean inBewegung;
	private boolean gelandet;
	
	public Ship(int leben, int schild, int schaden, int kapazitaet, boolean inBewegung, boolean gelandet) {
		super();
		this.leben = leben;
		this.schild = schild;
		this.schaden = schaden;
		this.kapazitaet = kapazitaet;
		this.inBewegung = inBewegung;
		this.gelandet = gelandet;
	}
	
	public int getLeben() {
		return leben;
	}
	public void setLeben(int leben) {
		this.leben = leben;
	}
	public int getSchild() {
		return schild;
	}
	public void setSchild(int schild) {
		this.schild = schild;
	}
	public int getSchaden() {
		return schaden;
	}
	public void setSchaden(int schaden) {
		this.schaden = schaden;
	}
	public int getKapazitaet() {
		return kapazitaet;
	}
	public void setKapazitaet(int kapazitaet) {
		this.kapazitaet = kapazitaet;
	}
	public boolean isInBewegung() {
		return inBewegung;
	}
	public void setInBewegung(boolean inBewegung) {
		this.inBewegung = inBewegung;
	}
	public boolean isGelandet() {
		return gelandet;
	}
	public void setGelandet(boolean gelandet) {
		this.gelandet = gelandet;
	}
	
	
}
