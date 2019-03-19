package br.edu.logatti;

import java.util.Scanner;

import br.edu.logatti.chained_pile.Game;
import br.edu.logatti.chained_pile.GamePile;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		GamePile pile = new GamePile();
		boolean showMenu = true;
		int selected;
		
		do {
			System.out.println("\nInforme uma op��o.");
			System.out.println("[1] INSERIR.");
			System.out.println("[2] REMOVER.");
			System.out.println("[3] IMPRIMIR");
			System.out.println("[0] SAIR\n");
			selected = scanner.nextInt();
			switch(selected) {
				case 1:
					pile.push(createGame());
					break;
				case 2:
					pile.pop();
					break;
				case 3:
					pile.print();
					break;
				case 0:
					showMenu = false;
					break;
				default: System.out.println("Op��o inv�lida!\n");
			}
		} while (showMenu != false);
		
	}
	
	@SuppressWarnings("resource")
	public static Game createGame() {
		Game game = new Game();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome do Jogo! ");
		game.setName(scanner.nextLine());
		System.out.println("Informe o genero do Jogo! ");
		game.setGenre((scanner.nextLine()));
		game.setId((int)(Math.random() * 33) + 1);
		return game;
	}

}
