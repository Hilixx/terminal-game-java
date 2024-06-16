package application;

import java.util.Scanner;

import classes.Assassin;
import classes.Classes;
import classes.Mage;
import classes.Warrior;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Classes player1 = new Mage("");
		Classes player2 = new Mage("");
		
		System.out.println("Digite o nome do Player 1");
		String name1 = sc.next();
		System.out.println("Player 1 Escolha sua Classe");
		
		System.out.println("Warrior, vida: 500, dano: 60, velocidade 50 - w \n\nMage, vida: 400, dano: 100, speed: 100  - m \n\nAssassin Vida: 300, Dano: 140, Speed: 200- a");
		char classe1 = sc.next().charAt(0);
		
		if(classe1 == 'w') {
			 player1 = new Warrior(name1);
			System.out.println("Player 1: " + name1 + ", Classe: Warrior" );
		}
		else if(classe1 == 'm') {
			 player1 = new Mage(name1);
			System.out.println("Player 1: " + name1 + ", Classe: Mage" );

		}
		else if(classe1 == 'a') {
			 player1 = new Assassin(name1);
			System.out.println("Player 1: " + name1 + ", Classe: Assassin" );

		}
		System.out.println("Digite o nome do Player 2");
		String name2 = sc.next();
		System.out.println("Player 2 Escolha sua Classe");
		
		System.out.println("Warrior, vida: 500, dano: 60, velocidade 50 - w \n\nMage, vida: 400, dano: 100, speed: 100  - m \n\nAssassin Vida: 300, Dano: 140, Speed: 200- a");
		char classe2 = sc.next().charAt(0);
		if(classe2 == 'w') {
			 player2 = new Warrior(name2);
			System.out.println("Player 2: " + name2 + ", Classe: Warrior" );
		}
		else if(classe2 == 'm') {
			 player2 = new Mage(name2);
			System.out.println("Player 2: " + name2 + ", Classe: Mage" );

		}
		else if(classe2 == 'a') {
			 player2 = new Assassin(name2);
			System.out.println("Player 2: " + name2 + ", Classe: Assassin" );
			
		}
		
		
		
		while (true) {
			if (player1.getSpeed() > player2.getSpeed()) {
				System.out.println("Turno de " + player1.getName()+", Atacar ou usar habilidade a - h");
				char chose = sc.next().charAt(0);
				if (chose == 'a') {
					player1.attack(player2);
					System.out.println("Você causou " + player1.getDamage() + " de dano, player 2 agora esta com " + player2.getHp()+ " de vida");
					if (player2.getHp() <= 0) {
						System.out.println(player1.getName() + " ganhou");
						break;
					}
				}
				if (chose == 'h') {
					player1.hability(player2);
					
					if (player2.getHp() <= 0) {
						System.out.println(player1.getName() + " ganhou");
						break;
					}
				}
				System.out.println("Turno de " + player2.getName()+", Atacar ou usar habilidade a - h");
				chose = sc.next().charAt(0);
				if (chose == 'a' ) {
					player2.attack(player1);
					System.out.println("Você causou " + player2.getDamage() + " de dano, player 1 agora esta com " + player1.getHp()+ " de vida");
					if (player1.getHp() <= 0) {
						System.out.println(player2.getName() + " ganhou");
						break;
					}
					
				}
				if (chose == 'h') {
					player2.hability(player1);
					
					if (player2.getHp() <= 0) {
						System.out.println(player1.getName() + " ganhou");
						break;
					}
				}

			}
			System.out.println("Turno de " + player2.getName()+", Atacar ou usar habilidade a - h");
			char chose = sc.next().charAt(0);
			if (chose == 'a') {
				player2.attack(player1);
				System.out.println("Você causou " + player2.getDamage() + " de dano, player 1 agora esta com " + player1.getHp() + " de vida");
				if (player1.getHp() <= 0) {
					System.out.println(player2.getName() + " ganhou");
					break;
				}
			}
			if (chose == 'h') {
				player2.hability(player1);
				
				if (player2.getHp() <= 0) {
					System.out.println(player1.getName() + " ganhou");
					break;
				}
			}

			System.out.println("Turno de " + player1.getName()+", Atacar ou usar habilidade a - h");
			chose = sc.next().charAt(0);
			if (chose == 'a') {
				player1.attack(player2);
				System.out.println("Você causou " + player1.getDamage() +  " de dano, player 2 agora esta com " + player2.getHp()+ " de vida");
				if (player2.getHp() <= 0) {
					System.out.println(player1.getName() + " ganhou");
					break;
				}
			}
			if (chose == 'h') {
				player1.hability(player2);
				
				if (player2.getHp() <= 0) {
					System.out.println(player1.getName() + " ganhou");
					break;
				}
			}

		}
		
		
		

		
		sc.close();

	}

}
