import java.util.ArrayList;

public class ListaNumeros {


public static class Main {
    public static void main(String[] args) {
        int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74,
                32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
                25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
                33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
                66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
                49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
                77, 32, 41, 66, 33, 70, 84, 125, 600,
                38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
                1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
                86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
                77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
                97, 36, 34, 16, 1, 98, 78, 92, 100, 35 };

        int indice77 = buscaSequencial(listaNumeros, 77);
        System.out.println("O índice do número 77 é: " + indice77);

        int indice600 = buscaSequencial(listaNumeros, 600);
        System.out.println("O índice do número 600 é: " + indice600);

        int indice56 = buscaSequencial(listaNumeros, 56);
        System.out.println("O índice do número 56 é: " + indice56);
        
        ArrayList<Integer> indices65 = buscaIndices(listaNumeros, 65);
        System.out.println("Os índices onde o número 65 se encontra são: " + indices65);
    }

    public static int buscaSequencial(int[] arr, int chave) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == chave) {
                return i; 
            }
        }
        return -1; 
    }

    public static ArrayList<Integer> buscaIndices(int[] arr, int chave) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == chave) {
                indices.add(i);
            }
        }
        return indices;
    }
}
}