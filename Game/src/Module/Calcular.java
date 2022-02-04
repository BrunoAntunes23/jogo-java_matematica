package Module;

import java.util.Random;

public class Calcular {
	private int dificuldade;
	private int valor;
	private int valor2;
	private int operacao;
	private int resultado;
	

	
	public Calcular(int dificuldade) {
		Random rand=new Random();
		this.operacao=rand.nextInt(3);
		
		this.dificuldade = dificuldade;
		if(dificuldade==1) {
			//facil
			this.valor=rand.nextInt(11);
			this.valor2=rand.nextInt(11);
		}else if(dificuldade==2) {
			this.valor=rand.nextInt(100);
			this.valor2=rand.nextInt(100);
			
		}else if(dificuldade==3) {
			this.valor=rand.nextInt(1000);
			this.valor2=rand.nextInt(1000);
		}else if(dificuldade==4) {
			//insano
			this.valor=rand.nextInt(10000);
			this.valor2=rand.nextInt(10000);
		}else {
		
				this.valor=rand.nextInt(100000);
				this.valor2=rand.nextInt(100000);
			
		}
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor() {
		return valor;
	}

	public int getValor2() {
		return valor2;
	}
	
	public int getOperacao() {
		return operacao;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	public String toString() {
		String op;
		if(this.getOperacao()==0) {
			op="Somar";
			
		}else if( this.getOperacao()==1){
			op="subtração";
		}else if( this.getOperacao()==2){
			op="multiplicação";
		}else {
			op="operação desconhecida";
		}
		return "Valor 1:"+this.getValor()+"\nValor2:"+this.getValor2()+"\nDificuldade :"+this.getDificuldade()+"\nOperação :"+op;
		
	}
	public boolean somar(int resposta) {
		this.resultado=this.getValor()+this.getValor2();
		boolean certo=false;
		if(resposta==this.getResultado()) {
			System.out.println("respsota correta");
			certo=true;
		}else {
			System.out.println("resposta errada");
		}System.out.println(this.getValor()+" + "+this.getValor2()+" = "+this.getResultado());
		return certo;
	}
	
	public boolean subtracao(int resposta) {
		this.resultado=this.getValor()-this.getValor2();
		boolean certo=false;
		if(resposta==this.getResultado()) {
			System.out.println("respsota correta");
			certo=true;
		}else {
			System.out.println("resposta errada");
		}System.out.println(this.getValor()+" - "+this.getValor2()+" = "+this.getResultado());
		return certo;
	}
	
	public boolean multiplicacao(int resposta) {
		this.resultado=this.getValor()*this.getValor2();
		boolean certo=false;
		if(resposta==this.getResultado()) {
			System.out.println("respsota correta");
			certo=true;
		}else {
			System.out.println("resposta errada");
		}System.out.println(this.getValor()+" * "+this.getValor2()+" = "+this.getResultado());
		return certo;
	}
	
	
	
	
	
	
	
	
	
		

}
