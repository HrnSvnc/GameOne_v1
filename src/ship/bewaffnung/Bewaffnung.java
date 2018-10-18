package ship.bewaffnung;

public class Bewaffnung {

	private int schaden;
	private int schussrate;
	
	public Bewaffnung(int schaden, int schussrate) {
		super();
		this.schaden = schaden;
		this.schussrate = schussrate;
	}
	public int getSchaden() {
		return schaden;
	}
	public void setSchaden(int schaden) {
		this.schaden = schaden;
	}
	public int getSchussrate() {
		return schussrate;
	}
	public void setSchussrate(int schussrate) {
		this.schussrate = schussrate;
	}
	
	
}
