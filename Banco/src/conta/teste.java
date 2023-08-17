package conta;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
		/*
		Cliente cli = new Cliente("abc", "12345");
		System.out.println(cli);


		ArrayList<String> bandas = new ArrayList<>();
		bandas.add("Legião Urbana");
		bandas.add("Twenty One Pilots");
		bandas.add("Artiv Monkey");
		bandas.add("Los Mariates");
		bandas.add("Elis");
		
		
		
		for (String lista: bandas) {
			System.out.println(lista);
		}
		*/
		
		ArrayList<String> produtos = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			String str = JOptionPane.showInputDialog("Insira o " + (i+1) + "° produto:");
			produtos.add(str);
		}
		
		/*
		for (String lista: produtos) {
			System.out.println(lista);
		}
		*/
		
		
		
		Collections.sort(produtos); 
		System.out.println("\nLista em ordem alfabética:");
		for (String lista: produtos) {
			System.out.println(lista);
		}
		
		Collections.reverse(produtos); 
		System.out.println("\nLista em ordem alfabética invertidasa");
		for (String lista: produtos) {
			System.out.println(lista);
		}
		
		
	}

}
