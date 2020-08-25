package lanche;

import java.util.Scanner;

public class Menu {
	Scanner scan = new Scanner(System.in);
	
	public void fazerPedido() {
		System.out.println("Selecione uma op��o:\n1 - Sandu�ches\n2 - Massas\n3 - Bolos");
		subMenu(scan.nextInt());
	}
	
	private void subMenu(int opcao) {
		int distancia;
		switch (opcao) {
			case 1:
				Sanduiche sanduiche = new Sanduiche();
				String ingredientes[] = new String[10];
				String ingrediente = "";
				int i = 0;
				System.out.println("\nVoc� escolheu **Sandu�che**\n");
				
				System.out.println("Digite os ingredientes do seu sandu�che:\nSe desejar finalizar, digite 0.");
				ingrediente = scan.nextLine();
				
				while ((!ingrediente.equals("0")) && i < 10) {
					ingrediente = scan.nextLine();
					ingredientes[i] = ingrediente;
					i++;
				}
				sanduiche.setIngredientes(ingredientes);
				
				System.out.println("Informe sua dist�ncia em km para calcularmos o tempo de entrega e o valor do seu pedido:");
				distancia = scan.nextInt();
				System.out.println("O valor do seu pedido �: R$ " + sanduiche.valorPedido(distancia, i - 1));
				System.out.println("Seu pedido chegar� em " + sanduiche.tempoDeEntrega(distancia) + " min.");	
				break;
			case 2:
				Massa massa = new Massa();
				int tipoDeMassa;
				String molho;
				
				System.out.println("\nVoc� escolheu **Massa**\n");
				
				System.out.println("Selecione a op��o de massa que voc� deseja:\n1 - Macarr�o\n2 - Pizza\n3 - Lasanha");
				tipoDeMassa = scan.nextInt();
				massa.setTipoDeMassa(massa.getTiposDeMassa()[tipoDeMassa - 1]);
				
				System.out.println("Informe o molho que voc� deseja:");
				molho = scan.next();
				massa.setMolho(molho);
				
				System.out.println("Informe sua dist�ncia em km para calcularmos o tempo de entrega e o valor do seu pedido:");
				distancia = scan.nextInt();
				System.out.println("O valor do seu pedido �: R$ " + massa.valorPedido(distancia, massa.getTipoDeMassa()));
				System.out.println("Seu pedido chegar� em " + massa.tempoDeEntrega(distancia) + " min.");			
				break;
			case 3:
				Bolo bolo = new Bolo();
				String massaBolo, cobertura, recheio;
				
				System.out.println("\nVoc� escolheu **Bolo**\n");
				
				System.out.println("Insira a massa que voc� deseja: ");
				massaBolo = scan.next();
				System.out.println("Insira a cobertura que voc� deseja: ");
				cobertura = scan.next();
				System.out.println("Insira o recheio que voc� deseja: ");
				recheio = scan.next();
				
				System.out.println("Informe sua dist�ncia em km para calcularmos o tempo de entrega e o valor do seu pedido:");
				distancia = scan.nextInt();
				System.out.println("O valor do seu pedido �: R$ " + bolo.valorPedido(distancia));
				System.out.println("Seu pedido chegar� em " + bolo.tempoDeEntrega(distancia) + " min.");			
				break;
			default:
				System.out.println("Op��o indispon�vel");
				break;
		}
	}
}
