package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class Imput {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(" Qual é seu nome ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é sua Idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso"));
		
		System.out.println("o nome é " + nome);
		System.out.println("A idade é" + idade);
		System.out.println("o peso é" + peso);
		
	}
}
