package View;

import java.util.Scanner;

import Module.Calcular;

public class Game {
	static Scanner teclado=new Scanner(System.in);
	static int pontos=0;
	static Calcular calc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game.jogar();
		
		
		
	}
	
	public static void jogar() {
		
		System.out.println("informe o nivel de difulculdade(1 a 4)");
		int dificuldade=Game.teclado.nextInt();
		Game.calc=new Calcular(dificuldade);
		System.out.println("informe o resultado para a seguinte opera��o: ");
		if(calc.getOperacao()==0) {
			System.out.println(calc.getValor()+" + "+calc.getValor2());
			int resposta=Game.teclado.nextInt();
			if(calc.somar(resposta)) {
				Game.pontos+=1;
				System.out.println("vo�� tem "+Game.pontos+" pontos");
			}
			
		}else if(calc.getOperacao()==1) {
			System.out.println(calc.getValor()+" - "+calc.getValor2());
			int resposta=Game.teclado.nextInt();
			if(calc.subtracao(resposta)) {
				Game.pontos+=1;
				System.out.println("vo�� tem "+Game.pontos+" pontos");
			}
			
		}else if(calc.getOperacao()==2) {
			System.out.println(calc.getValor()+" * "+calc.getValor2());
			int resposta=Game.teclado.nextInt();
			if(calc.multiplicacao(resposta)) {
				Game.pontos+=1;
				System.out.println("vo�� tem "+Game.pontos+" pontos");
			}
			
		}else {System.out.println(" a opera��o "+calc.getOperacao()+" n�o � reconhecida");
			
			}
		System.out.println("deseja continuar 1-sim/2-n�o");
		int continuar=teclado.nextInt();
		if(continuar==1) {
			Game.jogar();
		}else {
			System.out.println("at� a proxima"+"\nsua pontua��o foi :"+pontos+" pontos");
			System.exit(0);
			
		}
		
		
		
	}

}
