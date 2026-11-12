import java.util.Scanner;
public class aula3 {
    public class Main {

        static boolean Primo(int numero) {
            if (numero <= 1 ) {
                return false;
            }

            for(int i = 1; i < numero;i++)
            {
                if (numero / i == 0)
                {
                    return false;
                }
            }
            return true;
        }
        static void exibirPrimos(int[] numeros)
        {
            System.out.println("primos : ");

            for (int i = 0; i < numeros.length; i++)
            {
                if (Primo(numeros[i]))
                {
                    System.out.println(numeros[i] + " ");
                }
            }
            System.out.println();
        }

    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[]numeros = new int[8];

        for (int i = 0 ; i < numeros.length; i++)
        {
            System.out.println("digite seu numero");
            numeros[i] = scanner.nextInt();
        }

        Main.exibirPrimos(numeros);

        scanner.close();
    }
}