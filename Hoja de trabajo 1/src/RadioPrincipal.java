/*
 * Hoja de trabajo 1
 * clase RadioPrincipal
 * para poder crear la interaccion con el usuario
 */
// se importa la biblioteca de scanner
import java.util.Scanner;
/**
 * Esta clase sirve para poder crear una interaccion con el usuario y conseguir
 * los datos que el usuario desea 
 * @author Michel Ramirez carne 14069
 * @author Luis Eduardo Ruano carne 14187
 * @author Luis Pedro Velasquez carne 14537
 */
public class RadioPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // srive para poder crear un objeto de cada tipo de clase
    Scanner teclado=new Scanner(System.in);
    radio cont;
    // se realiza polimorfismo para poder crear un objeto de tipo radio pero
    // de la clase Driver2
    cont = new Driver2();
    // se toma el estado del radio
    boolean esta=cont.getEstado();
    while (esta){
        // si esta encendido se enseña el menu de la radio
	System.out.println("Bienvenido");
	System.out.println("Estado de la radio: encendida");
	System.out.print("Se esta sintonizando:");
        // se agarra el valor de para saber si es AM o FM
	int val=cont.getAMFM();
        // dependiendo a ello se muestra la emisora al usuario 
	    if (val==0){
		System.out.println("AM");
		System.out.print("La actual estacion es: ");
		double est=cont.getEmisora();
		System.out.println(est);
		}
            else{
		System.out.println("FM");
		System.out.print("La actual estacion es: ");
		double est=cont.getEmisora();
		System.out.println(est);
		}    
    // se imprimen las otras opciones del sistema
    System.out.println("Seleccione lo que desea hacer");
    System.out.println("1. Encender/apagar la radio");
    System.out.println("2. Sintonizar AM o FM");
    System.out.println("3. Cambiar de estacion");
    System.out.println("4. Guardar actual estacion");
    System.out.println("5. Elegir una estacion guardada");
    int pos = teclado.nextInt();
    // se agarra el valor que ingresa el usuario
    // si es 1 se apaga el estado del radio
    if (pos == 1){
	boolean estado=cont.getEstado();
	if (estado==true){
            cont.setESTADO(false);
	    }
        else{
	    cont.setESTADO(true);
	    }
	}
    // se es 2 se cambia de AM a FM
    else if (pos == 2){
	val=cont.getAMFM();
	if (val==0){
            cont.setAMFM(1);
	     }
        else{
	    cont.setAMFM(0);
	    }
       }
    // si es 3 se le pide al usuario que se sintonice para la derecha o izquiera
    else if (pos == 3){
        System.out.println("Sintonizar estacion anterior o siguiente");
        System.out.println("1. Anterior");
        System.out.println("2. Siguiente");
        int next=teclado.nextInt();
        if (next==1)
            cont.Sintonizar(false);
        else
            cont.Sintonizar(true);	
    }	
    // si es 4 se guarda el la emisora en el boton
    else if (pos == 4){
        System.out.println("Ingrese el numero del boton en el cual quiere guardar");
        int next = teclado.nextInt();
        cont.Guardar(next);
    }
    // se selecciona la estacion si es 5
    else if (pos == 5){
	System.out.println("Seleccionar el boton de la estacion");
	int next = teclado.nextInt();
	cont.Memoria(next);
    }
	esta=cont.getEstado();
}
    // mensaje de salida
 System.out.println("Saliendo de la radio");   
// Se termina el programa
    
}
}
