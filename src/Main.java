import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Es tu número capicúa");

        Scanner sc = new Scanner (System.in);

        String numero = sc.nextLine();

        while(numero.length() > 4) {
            numero = sc.next();
        }

        sc.close();

        if(numero.length() < 2){
            System.out.println("es capicuo");
        } else if (numero.length() < 3) {
            if (numero.charAt(0) == numero.charAt(1)){
                System.out.println("es capicuo");
            }else{
                System.out.println("no es capicuo");
            }
        } else if (numero.length() <4) {
                if (numero.charAt(0) == numero.charAt(2) || numero.charAt(1) == numero.charAt(3)){
                    System.out.println("es capicuo");
                }else{
                    System.out.println("no es capicuo");
                }
        }else{
                System.out.println("No es un numero entre 0 y 9999");
        }
    }
}