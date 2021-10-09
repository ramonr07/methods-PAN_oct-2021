package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class MaiorMenorIdade {
public static void main(String[] args) {
	//obtendo a idade do usuário
	
	int idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade"));
	
	if(idade < 18 ) {
		System.out.println("Menor de Idade");
		System.out.println("ano que vem será maior"); 
	}
	else {
		
		//System.out.println("Maior");
		JOptionPane.showMessageDialog(null, "Maior");
	}
}
}
