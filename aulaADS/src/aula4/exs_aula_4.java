package aula4;

import javax.swing.JOptionPane;

public class exs_aula_4 {

	public static void main(String[] args) {
//------------------------------- LAÇO FOR ----------------------------------------------------------
		/*int a, b, c, i=0;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o número pulos: "));
		
		for(i=a; i<b; i+=c) {
			System.out.println(i);
		}*/

//------------------------------- IMPRESSÃO ----------------------------------------------------------		 
		/*int e, q, i = 0;
		e = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo: \n1 - simples. \n2 - colorido. "));
		q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de copias: "));
		
		switch (e) {
			case 1 : 
				for(i=1; i<=q; i++) {
					System.out.println(i+". R$ "+i * 1.20);		
			}
			break;
			case 2 :
				for(i=1; i<=q; i++) {
					System.out.println(i+". R$ "+i * 2.50);	
				}
			break;
			default:
				System.out.println("Valores inválidos, tente novamente.");
				
		}*/
		
//------------------------------- PAR OU IMPAR ATÉ 1 ----------------------------------------------------------		
		/*int N, i=0;
		N = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número: "));
		
		if(N > 1 ) {
			if(N % 2 == 0) {
				for(i = 1; i <= N; i+=2) {
					System.out.println(i);
				}
			}else {
				for(i = 1; i <= N; i+=2) {
					System.out.println(i);
				}
			}
			
		}else {
			if(N % 2 != 0){
				for(i = N; i <= 1; i+=2) {
					System.out.println(i);
				}
			
			}else {
				N = N + 1;
				for(i=N; i <= 1; i+=2) {
					System.out.println(i);
				}
			}
		}*/
		
//------------------------------- DESCOBRIR OS NÚMEROS 1 E 0 ----------------------------------------------------------	
		/*int N;
		do {
			N = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número: "));
		}while(N != 1 && N != 0);
		System.out.println(N);*/
		
//------------------------------- 0 ATÉ N ----------------------------------------------------------		
		/*int N, i = 0;
		N = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número: "));
		if(N % 2 == 0) {
			for(i=0; i <= N; i+=2) {
				System.out.println(i);
			}
		}else {
			for(i=0; i <= N; i+=2) {
				System.out.println(i);
			}
		}*/
	}
}
