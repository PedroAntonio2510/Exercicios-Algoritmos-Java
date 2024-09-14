//Observe o trecho de código abaixo: int INDICE = 12,
// SOMA = 0, K = 1; enquanto K < INDICE faça
// { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

public class Soma {
    public static void main(String[] args) {

        int indice = 12, soma = 0, K = 1;

        while(K < indice) {
            K++;
            soma += K;
        }
        System.out.println("O resulta da soma é: " + soma);

    }
}
