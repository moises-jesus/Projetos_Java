
public class Testacondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
//		int quantidadePessoas = 1;
		boolean  acompanhado = true;
// ou boolean acompanhado = quantidadePessoas >= 2;
// e imprimir System.out.println("valor de acompanhado = " + acompanhado);
//como agrupar o if da linha 10 com o if da 14?
//usando o operador ou || 
//Obs. para mostrar a diferença eu sinalizei como comentario no codigo.
//Existe o && EX. precisa ter mais de 18 anos e so entra casal, segue ex.
//O verificador do Java paar saber se é equivalente, compara é == 
// boolean só aceita true ou false

		// if (idade >= 18 && quantidadePessoas >= 2) {
//		if (idade >= 18 || quantidadePessoas >= 2) {
		if (idade >= 18 && acompanhado) {
//			System.out.println("Você tem mais de 18 anos");
			System.out.println("Sejam bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");

//		    if (quantidadePessoas >= 2) {
//				System.out.println("Você não tem 18, mas pode entrar, " 
//			            + "pois está acompanhado");
//			} else {
//				System.out.println("Infelizmente você não pode entrar");
		}
	

	}
}
