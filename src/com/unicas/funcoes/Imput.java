package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class Imput {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(" Qual � seu nome ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � sua Idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual � o seu peso"));
		
		System.out.println("o nome � " + nome);
		System.out.println("A idade �" + idade);
		System.out.println("o peso �" + peso);
		
	}
}
