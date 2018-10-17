package galaxy.starSystem.planet;

import galaxy.starSystem.planet.field.Feld;

public class Planet {
	
	private Feld [][] felder;
	private int Metall;
	private int Gas;
	private int Stein;
	
	public Planet(int felderX, int felderY, int metall, int gas, int stein) {
		this.Metall = metall;
		this.Gas = gas;
		this.Stein = stein;
		this.felder= new Feld[felderX][felderY];
	}
	
	public Feld[][] getFelder() {
		return felder;
	}

	public void setFelder(Feld[][] felder) {
		this.felder = felder;
	}

	public int getMetall() {
		return Metall;
	}

	public void setMetall(int metall) {
		Metall = metall;
	}

	public int getGas() {
		return Gas;
	}

	public void setGas(int gas) {
		Gas = gas;
	}

	public int getStein() {
		return Stein;
	}

	public void setStein(int stein) {
		Stein = stein;
	}
	
	public void gasAbbauen(Planet planet) {
		if(planet.getGas()<5) {
			System.out.println("kein Gas mehr vorhanden!");
		}else {
			planet.setGas(planet.getGas()-5);
		}
	}
	
	public void steinAbbauen(Planet planet) {
		if(planet.getStein()<5) {
			System.out.println("kein Stein mehr vorhanden!");
		}else {
			planet.setGas(planet.getStein()-5);
		}
	}
	
	public void metallAbbauen(Planet planet) {
		if(planet.getMetall()<5) {
			System.out.println("Kein Metall mehr vorhanden!");
		}else {
			planet.setGas(planet.getMetall()-5);
		}
	}
	
	
}
