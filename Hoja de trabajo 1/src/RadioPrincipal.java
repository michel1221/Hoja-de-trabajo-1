/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author michel
 */
public class RadioPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner teclado=new Scanner(System.in);
    radio cont;
    cont = new Driver2();
    boolean esta=cont.getEstado();
    while (esta){
	System.out.println("Bienvenido");
	System.out.println("Estado de la radio: encendida");
	System.out.print("Se esta sintonizando:");
	int val=cont.getAMFM();
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

    System.out.println("Seleccione lo que desea hacer");
    System.out.println("1. Encender/apagar la radio");
    System.out.println("2. Sintonizar AM o FM");
    System.out.println("3. Cambiar de estacion");
    System.out.println("4. Guardar actual estacion");
    System.out.println("5. Elegir una estacion guardada");
    int pos = teclado.nextInt();
    if (pos == 1){
	boolean estado=cont.getEstado();
	if (estado==true){
            cont.setESTADO(false);
	    }
        else{
	    cont.setESTADO(true);
	    }
	}
    else if (pos == 2){
	val=cont.getAMFM();
	if (val==0){
            cont.setAMFM(1);
	     }
        else{
	    cont.setAMFM(0);
	    }
       }











// TODO code application logic here
    }
    
}
}
