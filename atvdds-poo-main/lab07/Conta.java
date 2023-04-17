public class Conta
{
	
	private int numero;
	
	private Conta titular;
	private int senha;
	
	private double saldo;
	
	private Lancamento[] lancamentos;
	
	private int ultimoLancamento;
	
	
	public Conta(int numero, Conta titular, int senha, double saldo, Lancamento[] lancamentos) {
		
		this.numero = numero;
		
        this.titular = titular;
	
		this.senha = senha;
	
        this.saldo = saldo;
	
		this.lancamentos = new Lancamento[11];

		
	
	}
	
	
	
	public Conta(int numero, Conta titular, int senha) {
	
		
		this.numero = numero;
		
		this.titular = titular;
	
		this.senha = senha;

		
	}
	
	
	public double verificaSaldo(int senha) {
		
		if(this.senhaEhValida(senha)) {
		
			return saldo;
		
		
		}
			
			return -1;
	
		}
	
	
		
		public boolean creditaValor(double valor, String operacaoBancaria) {
		
			if(valor > 0) {
	
				this.saldo += valor;
	
				this.realizaLancamento(operacaoBancaria, valor);
			
				return true;
		
		   	}
		
				return false;

				

		}
	
	
		
		public boolean debitaValor(double valor, int senha, String operacaoBancaria) {
		
			if(this.senhaEhValida(senha) && valor > 0 && valor <= this.saldo) {
		
			 	this.saldo -= valor;
		
				this.realizaLancamento(operacaoBancaria, valor);
	
				return true;
	
			}
		
				return false;
				
	
	  
	}	
		
	  
	  
	private void realizaLancamento(String descrisao, double valor) {
	
	   		if(this.ultimoLancamento == 10) {
		
			   for(int i=1; i <= 10; i++) {
	
			       this.lancamentos[i - 1] = this.lancamentos[i];
			
			   }
		
			 }
		
			 else {
			
			 	this.ultimoLancamento++;
		
			 }
		
			 	this.lancamentos[this.ultimoLancamento] = new Lancamento(descrisao, valor);
		
	
			}
	
	
			
		private boolean senhaEhValida(int senha) {
		
			return this.senha == senha;
	
	
		}
	
}


