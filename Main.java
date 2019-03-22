
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Banco b1 = new Banco();
		
		int fechar = 0,x,y = 0;
		// troquei por do-while
		//while(fechar == 0) {
		do {
			
			System.out.println("Escolha uma opcao: digite o numero ");
			System.out.println("1: Criar uma conta");
			System.out.println("2: saque");
			System.out.println("3: deposito");			
			System.out.println("4: saldo");			
			System.out.println("5: extrato");
			System.out.println("6: transferencia");
			System.out.println("7: remover conta");
			System.out.println("8: finalizar o programa");

				
			x = Integer.parseInt(s.nextLine());
		
			if(x == 1) { // criar conta
				System.out.println("Digite o tipo da conta: corrente(1) ou poupança(2)? ");
				int tipo = s.nextInt();
				s.nextLine();
				boolean temCheq = false;
				if (tipo == 1) {
					System.out.println("A conta tem cheque especial? \n1: sim\nqualquer numero: nao");
					int resposta = s.nextInt();
					s.nextLine();
					if (resposta == 1)
						temCheq = true;
					else 
						temCheq = false;		
				}
				int criou = b1.addConta(tipo, temCheq);
				if (criou != -1) {
					System.out.println("O numero da sua conta e: "+criou+"\n");
					//System.out.println("O numero da sua conta e: "+y+"\n");
					//y++;
				}
			}
			if(x == 2) { // saque
				int a;
				double b;
				System.out.println("Digite o numero da conta : ");
				//a = Integer.parseInt(s.nextLine());
				a = s.nextInt();
				s.nextLine();
				if (b1.contaExiste(a) != -1) {
					System.out.println("Digite o valor do saque");
					//b = Double.parseDouble(s.nextLine());
					b = s.nextDouble();
					s.nextLine();
					if (b > 0)
						b1.saques(a, b);
					else
						System.out.println("Valor invalido. Operacao cancelada\n");
				}
				else
					System.out.println("Conta inexistente. Operacao cancelada\n");
			}
			if(x == 3) { // deposito
				int a;
				double b;				
				System.out.println("Digite o numero da conta : ");
				//a = Integer.parseInt(s.nextLine());
				a = s.nextInt();
				s.nextLine();
				if (b1.contaExiste(a) != -1) {
					System.out.println("Digite o valor do deposito");
					//b = Double.parseDouble(s.nextLine());
					b = s.nextDouble();
					s.nextLine();
					if (b > 0)
						b1.deposito(a, b);
					else
						System.out.println("Valor invalido. Operacao cancelada\n");
				}
				else
					System.out.println("Conta inexistente. Operacao cancelada\n");
			}
			if(x == 4) { // saldo
				int a;
				System.out.println("Digite o numero da conta : ");
				//a = Integer.parseInt(s.nextLine());
				a = s.nextInt();
				s.nextLine();
				if (b1.contaExiste(a) != -1)
					b1.emissaoSaldo(b1.contaExiste(a)); // aqui
				else
					System.out.println("Conta inexistente. Operacao cancelada\n");
			}
			if(x == 5) { // extrato
				int a;
				System.out.println("Digite o numero da conta : ");
				//a = Integer.parseInt(s.nextLine());
				a = s.nextInt();
				s.nextLine();
				if (b1.contaExiste(a) != -1)
					b1.extratoBancario(b1.contaExiste(a));
				else
					System.out.println("Conta inexistente. Operacao cancelada\n");
			}
			if(x == 6) { // transferencia
				int origem, receptora;
				double valor;
				System.out.println("Digite o numero da conta origem: ");
				//a = Integer.parseInt(s.nextLine());
				origem = s.nextInt();
				s.nextLine();
				if (b1.contaExiste(origem) != -1) {
					origem = b1.contaExiste(origem);
					System.out.println("Digite o numero da conta receptora: ");
					//a = Integer.parseInt(s.nextLine());
					receptora = s.nextInt();
					s.nextLine();
					if (b1.contaExiste(receptora) != -1 && receptora != origem) {
						receptora = b1.contaExiste(receptora);
						System.out.println("Digite o valor da transferencia: ");
						//b = Double.parseDouble(s.nextLine());
						valor = s.nextDouble();
						s.nextLine();
						if (valor > 0)
							b1.transferir(origem, receptora, valor);
						else
							System.out.println("Valor invalido. Operacao cancelada\n");
					}
					else
						System.out.println("Conta inexistente/invalida. Operacao cancelada\n");
				}
				else
					System.out.println("Conta inexistente/invalida. Operacao cancelada\n");
				
			}
			if(x == 7) { // remover conta
				int a;
				System.out.println("Digite o numero da conta que deseja remover : ");
				//a = Integer.parseInt(s.nextLine());
				a = s.nextInt();
				s.nextLine();
				if (b1.contaExiste(a) != -1) {
					b1.removeConta(b1.contaExiste(a));
					System.out.println("Conta n°"+a+" foi removida");
				}
				else
					System.out.println("Conta inexistente. Operacao cancelada\n");
			}
			if(x == 8) {
				System.out.println("Programa encerrado!");
			}
			/*else
				System.out.println("Opcao invalida");*/
		} 
		while(x != 8);		
		s.close();
	}

}
