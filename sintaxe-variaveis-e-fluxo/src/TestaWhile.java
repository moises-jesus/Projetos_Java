
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
// No while é necessário abrir parentes, e colocar alguma coisa la dentro
// é necessári haver um booleano.
// Outro sim, é necessário dentro do while dar uma valor inicial EX, linha 4,valor 0
		while(contador <= 10) { 
			System.out.println(contador);
		//	contador = contador + 1; Isso é o mesmo resultado da linha abaixo
		//	contador += 1; Na linha abaixo é uma forma mais sucinta de escrever.
			contador ++;
		}
		System.out.println(contador);
	}
	
}
