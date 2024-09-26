package aula1;

import javax.swing.JOptionPane;

public class exs_aula_1 {

	public static void main(String[] args) {
		//System.out.println("Hello world");
		String nome, sobrenome;
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
		JOptionPane.showMessageDialog(null, "Seu nome completo é: "+nome+ " "+sobrenome);
		
		int numero, r;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		r = numero * 2;
		JOptionPane.showMessageDialog(null, "O dobro do seu número é: "+r);

	}

}
