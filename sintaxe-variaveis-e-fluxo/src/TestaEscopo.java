
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 3;

//		boolean  acompanhado = quantidadedePessoas >= 2; quebrou em duas linha com if e else
//		Qual o valor default de um booleano? não tem valor padrão.é variavel temporária
// 		Sempre inicializar uma variável, antes de utilizar.
		boolean acompanhado;
		if (quantidadePessoas >= 2) {
			acompanhado = true;
			// ainda não existe
			// também nãoexiste
		} else {
			acompanhado = false;
			
		}
		System.out.println("Valor de acompanhado = " + acompanhado);
// Quando você declara uma variável ela vale desde dos chaves de onde ela nasceu, 
//até onde fecha o bloco de onde ela nasceu.
		if (idade >= 18 && acompanhado) {
			System.out.println("Sejam bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
}

}
