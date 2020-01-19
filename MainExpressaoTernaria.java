package expressaoernaria;

import java.util.Scanner;

public class MainExpressaoTernaria {

	public static void main(String[] args) {
	/*Expressão Condicional ternaria.Estrutura opcional if-else
	Quando se deseja decidir um valor com base em uma condição.
	(Condicao) ? valor-se-verdadeiro : valor-se-falso
		
	Exemplo :  (2 > 4) ? 50:80 = 80 →No caso essa condição vai dar 80
	Porque é falsa
	Exemplo 2: (10!=3)? "Maria" : " Alex → "Maria"  →→Condiçao verdadeira
	
	     Exemplo Exercicio com if e else
		 
		 double preco= 80;
		 double desconto;
		
		if(preco<20.0){
		desconto=preco *0.1;
		}else{
		desconto = preco * 0.05;
		}
		*/
		
		//_____________________Usando Condicão Ternaria _____________________
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto =(preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		
		sc.close();
		
		
		
		
		
		
	}

}
