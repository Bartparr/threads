package com.testthread.personnage;

import java.util.concurrent.ThreadLocalRandom;

public class Personnage {
	String nom;
	int healthPoints;
	int cooldown;
	



	//constructeurs
	public Personnage(String nom, int healthPoints){
		this.nom=nom;
		this.healthPoints=healthPoints;
	}
	//methodes

	
	public synchronized void attaquer(Personnage persoAttakai){
		
		int attaque = ThreadLocalRandom.current().nextInt(1, 5);
		System.out.println(persoAttakai.getNom() + " a " + persoAttakai.getHealthPoints() + " points de vie " );
		System.out.println(this.getNom() + " attaque " + persoAttakai.getNom() + " et lui retire " + attaque + " points de vie" );
		persoAttakai.setHealthPoints(persoAttakai.getHealthPoints()-attaque);		
		System.out.println("il lui reste  " + persoAttakai.getHealthPoints() + " points de vie ");
		System.out.println(" --------------------------------------  " );

	}
	
	public synchronized void soigner(int soin){
		System.out.println(this.getNom() + " a " + this.getHealthPoints() + " points de vie " );
		System.out.println(this.getNom() + " se soigne pour " + soin + " points de vie");
		this.setHealthPoints(this.getHealthPoints()+soin);		
		System.out.println("il lui reste  " + this.getHealthPoints() + " points de vie ");
		System.out.println(" ----------------------------------  " );
		

	}
	
	public synchronized void tuer(Personnage perso){
		
		System.out.println(this.getNom() +  " A ASSASSINE " + perso.getNom());
		System.out.println(" ---------------------------------  " );
		
		
	}
	
	
	
	//getters and setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
	
	
	public int getCooldown() {
		return cooldown;
	}


	public void setCooldown(int cooldown) {
		this.cooldown = cooldown;
	}

	
	
}
