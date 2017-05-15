package com.testthread.personnage;

public class BatailleAttaque implements Runnable {
	
	private Personnage perso;
	private Personnage viktim;
	private int cooldown;
	
	public BatailleAttaque(Personnage perso, Personnage viktim, int cooldown){
		this.perso = perso;
		this.viktim=viktim;
		this.cooldown = cooldown;
	}
	

	public void run() {
		
		for(int i = 0;i<100;i++){
					
		this.perso.attaquer(viktim);		
		
		
		try {
			Thread.sleep(this.cooldown);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	
	public Personnage getPerso() {
		return perso;
	}

	public void setPerso(Personnage perso) {
		this.perso = perso;
	}
	
	public Personnage getViktim() {
		return viktim;
	}

	public void setViktim(Personnage viktim) {
		this.viktim = viktim;
	}
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

}
