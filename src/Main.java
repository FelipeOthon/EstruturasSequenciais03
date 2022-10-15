import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1,numero2;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o  primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("digite o segundo numero: ");
        numero2 = sc.nextInt();

        int resultado = (numero1 + numero2);

        System.out.println("a soma dos numeros foi:"+ resultado);
    }
}

