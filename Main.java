package kmnbblj;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Banco b1 = new Banco();
		
		int fechar = 0,x,y = 0;
		
		while(fechar == 0) {
			
			System.out.println("Escolha uma opcao: digite o numero ");
			System.out.println("1: Criar uma conta");
			System.out.println("2: saque");
			System.out.println("3: deposito");			
			System.out.println("4: saldo");			
			System.out.println("5: extrato");
			System.out.println("6: remover conta");
			
			
			x = Integer.parseInt(s.nextLine());
			
			if(x == 1) {
				b1.addConta();
				System.out.println("O numero da sua conta e: "+y);
				y++;
			}
			if(x == 2) {
				int a;
				double b;
				System.out.println("Digite o numero da conta : ");
				a = Integer.parseInt(s.nextLine());
				System.out.println("Digite o valor do saque");
				b = Double.parseDouble(s.nextLine());
				b1.saques(a, b);
				
			}
			if(x == 3) {
				int a;
				double b;
				System.out.println("Digite o numero da conta : ");
				a = Integer.parseInt(s.nextLine());
				System.out.println("Digite o valor do deposito");
				b = Double.parseDouble(s.nextLine());
				b1.deposito(a, b);
				
			}
			if(x == 4) {
				int a;
				System.out.println("Digite o numero da conta : ");
				a = Integer.parseInt(s.nextLine());
				b1.emissaoSaldo(a);
			}
			if(x == 5) {
				int a;
				System.out.println("Digite o numero da conta : ");
				a = Integer.parseInt(s.nextLine());
				b1.extratoBancario(a);
			}
			if(x == 6) {
				int a;
				System.out.println("Digite o numero da conta que deseja remover : ");
				a = Integer.parseInt(s.nextLine());
				b1.removeConta(a);
				System.out.println("Conta removida");
			}
			if(x == 7) {
				b1.contas();
			}
		}
		
		

	}

}
