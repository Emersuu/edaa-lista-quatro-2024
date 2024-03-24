import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] listaNumeros = { 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
                75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número que deseja pesquisar: ");
        int numeroProcurado = scanner.nextInt();
        
        int indice = buscaBinaria(listaNumeros, numeroProcurado);
        
        if (indice != -1) {
            System.out.println("O número " + numeroProcurado + " está no índice: " + indice);
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado na lista.");
        }
        
        scanner.close();
    }

    public static int buscaBinaria(int[] arr, int chave) {
        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (arr[meio] == chave) {
                return meio; // encontrado
            } else if (arr[meio] < chave) {
                inicio = meio + 1; // busca na metade direita
            } else {
                fim = meio - 1; // busca na metade esquerda
            }
        }
        
        return -1; // não encontrado
    }
}
