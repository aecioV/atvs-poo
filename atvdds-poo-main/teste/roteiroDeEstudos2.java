public class CalculadoraDeEstoque
{
	public static void main(String[] args){
		double livroJava = 79.90;
		double livroC = 200;
	
		double soma = livroJava + livroC;
	
		System.out.println("O total em estoque é:" + soma);
	
		if(soma < 150){
			System.out.println("Atenção - Estoque Baixo!");
		}
		else
			if(soma > 2000){
				System.out.println("Atenção - Estoque Quase Cheio!");
			}
			else{
				System.out.println("Estoque Bom!");
			}
	}
}

