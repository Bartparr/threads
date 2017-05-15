package com.testthread.start;

import com.testthread.personnage.Bataille;
import com.testthread.personnage.BatailleAttaque;
import com.testthread.personnage.Personnage;


public class Start {

	public static void main(String[] args) {

		
		Personnage perso1 = new Personnage("barth", 50);
		Personnage perso2 = new Personnage("fatou", 50);
		Personnage perso3 = new Personnage("mirela", 50);
		Personnage perso4 = new Personnage("fanta", 50);
		Personnage perso5 = new Personnage("freddy", 12);
		

		
		/*
		Thread t = new Thread(new Bataille(perso1,perso2,5000));
		Thread t2 = new Thread(new Bataille(perso4,perso3,5000));
		Thread t3 = new Thread(new Bataille(perso4,perso3,8000));
		Thread t4 = new Thread(new Bataille(perso2,perso5,10000));
		t.start();
		t2.start();
		t3.start();
		t4.start();
		*/
		
		Bataille soin1 = new Bataille(perso1,10000);
		Bataille soinFatou = new Bataille(perso2,8000);
		BatailleAttaque attaque1 = new BatailleAttaque(perso2,perso1,10000);
		BatailleAttaque attaque2 = new BatailleAttaque(perso3, perso5, 12000);
		
		Thread t = new Thread(soin1); //soin
		Thread t2 = new Thread(attaque1); //attaque
		Thread t3 = new Thread(soinFatou);
		Thread t4 = new Thread(attaque2);
		
		//t.start(); //on va se soigner toutes les 10 s
		t2.start(); //on va attaquer fatou toutes les 10 secondes
		//t3.start();
		t4.start();
	}

}
