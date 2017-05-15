package com.testthread.personnage;



public class Bataille implements Runnable  {
	
	private Personnage perso;
	
	private int cooldown;


	public Bataille(Personnage perso,int cooldown){
		this.perso = perso;
		this.cooldown = cooldown;
	}
	
	
	public void run() {
		
		for(int i = 0;i<100;i++){
		this.perso.soigner(3);		
		
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
	
	public int getCooldown() {
		return cooldown;
	}
	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}
	
}
