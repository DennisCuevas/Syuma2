package dennisg;
import java.util.Scanner;
public class Suma2 {
public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
    float n1, n2, r;
System.out.print("Ingresa primer numero a sumar: ");
n1= leer.nextFloat ();
System.out.print("Ingresa segundo numero a sumar: ");
n2= leer.nextFloat ();
     r=(n1+n2);
       System.out.println("El resultado es: "+r);
    }
    
}
