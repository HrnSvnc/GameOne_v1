package galaxy.starSystem.planet.field;

public class Feld {
	private boolean besetzt;
	private int id;
	public Feld(boolean besetzt, int id) {
		this.besetzt = besetzt;
		this.id = id;
	}
	public boolean isBesetzt() {
		return besetzt;
	}
	public void setBesetzt(boolean besetzt) {
		this.besetzt = besetzt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}