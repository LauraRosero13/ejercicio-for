import java.util.Scanner;
public class ejecicioswich {
public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    String nombre="";
    int estadoCivil=0;
    System.out.println("Ingrese el nombre de la persona");
    nombre=teclado.nextLine();
    System.out.println("Ingrese el estado civil de la persona: 1.Soltero 2.Casado 3.Separado 4.Viudo 5.Unión libre");
    estadoCivil=teclado.nextInt();
        switch (estadoCivil) {
        case 1:
            System.out.println(nombre+" es solter@");
            break;
        case 2:
            System.out.println(nombre+" es casado@");
            break;
        case 3: 
            System.out.println(nombre+" es separad@");
            break;
        case 4:
            System.out.println(nombre+" es viud@");
            break;
        case 5:
            System.out.println(nombre+" esta en union libre");
        default:
            break;
        }
    }
    
}