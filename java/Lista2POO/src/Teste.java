
public class Teste {

	public static void main(String[] args) {
		
		//TESTE DA CLASSE FUNCIONARIO HERDADA DE PESSOA
		Fornecedor fornecedor = new Fornecedor("André","R.Teste" ,"983106118", 50, 20);
		System.out.println(fornecedor.toString());
		System.out.println(fornecedor.obterSaldo(fornecedor.getValorCredito(), fornecedor.getValorDivida()));
		System.out.println();
		
		//TESTE DA CLASSE EMPREGADO HERDADA DE PESSOA
		Empregado empregado =  new Empregado("André","983106118","R.Teste", 1002, 2000);
		System.out.println(empregado.toString());
		System.out.println(empregado.calcularSalario());
		
		
		
		

	}

}
