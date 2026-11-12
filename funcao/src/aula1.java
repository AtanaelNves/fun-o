import java.util.Scanner;
public class aula1 {
    public class Main {
        Scanner scanner = new Scanner(System.in);

        static int contarDigitos(int numero) {
            int contado = 0;

            while (numero > 0) {
                numero = numero / 10;
                contado++;
            }

            return contado;
        }

        static void exibirDigitos(int[] numeros)
        {
            for (int i = 1; i < numeros.length; i++)
            {
                System.out.println("esse" + numeros[i] + "tem" +  contarDigitos(numeros[i]) + " digito(s)");
            }
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[]numeros = new int[5];

        for(int i = 0; i  < numeros.length ; i++)
        {
            System.out.println("digite o seu numero :");
            numeros[i] = scanner.nextInt();
        }

        Main.exibirDigitos(numeros);

        scanner.close();
    }
}