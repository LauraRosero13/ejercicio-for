import java.util.Scanner;
public class ejerciciofor {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int edad, estadoCivil,sexo;
    double estatura=0,acumuladorEstatura=0, promedioEstatura=0,porcentajeCondicion=0,promedioEdad=0;
    int i=1,contadorPersonas=0, acumuladorEdad=0, cantidadPersonas=2;
    
        for (i= 1; i <= cantidadPersonas; i++) {
        System.out.println("Ingrese la edad de la persona número " + i);
       edad=teclado.nextInt();
        System.out.println("Ingrese el estado civil de la persona número"+i+"1. Soltero   2.Casado");
        estadoCivil=teclado.nextInt();
        System.out.println("Ingrese el sexo de la persona número " +i + " 1. Hombre   2.Mujer");
        sexo=teclado.nextInt();
        System.out.println("Ingrese la estatura de la persona número " +i+" en cm");
        estatura=teclado.nextDouble();
        
        if ((edad>=18)&&(estadoCivil==1)&&(estatura>170)&&(sexo==1)) {
            contadorPersonas=contadorPersonas+1;
            acumuladorEdad = acumuladorEdad + edad;
            acumuladorEstatura = acumuladorEstatura+ estatura;
        }
        }
        promedioEdad = acumuladorEdad/contadorPersonas;
        promedioEstatura =acumuladorEstatura/contadorPersonas;
        porcentajeCondicion = (contadorPersonas/ cantidadPersonas)*100;

        System.out.println("El  promedio de edades de las personas con condiciones dadas es de : "+promedioEdad);
        System.out.println("El  promedio de estaturas de las personas con condiciones dadas es de : "+promedioEstatura);
        System.out.println("El porcentaje de personas que cumplen con las condiciones dadas es: " +porcentajeCondicion);

       
        
    
    }
}