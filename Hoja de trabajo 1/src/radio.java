/*
 * Hoja de trabajo 1
 * interface radio
 * sirve para poder realizar el contrato que cualquier tipo de radio deberia tener
 */

/**
 *Esta es una interface que sirve para poder crear la plantilla que cualquier 
 * tipo de radio deberia tener 
 * @author Michel Ramirez carne 14069
 * @author Luis Eduardo Ruano carne 14187
 * @author Luis Pedro Velasquez carne 14537
 */
public interface  radio {
        // este metodo va a cambiar el estado de apagado o encendido
         public  void setESTADO(boolean ESTADO);
	// este metodo agarra el estado
	 public boolean getEstado();
	// este metodo indica si se esta en AM o FM
	 public int getAMFM();
	// este metodo cambia la variable que indica si esta en AM o FM
	 public void setAMFM(int Band);
	// este metodo sintoniza para Am o FM dependiendo su parametro
	 public void Sintonizar(boolean uD);
	// se guarda la estacion en los botones
	 public void Guardar(int Pos);
	// se oberva que estacion esta guarda en memoria
         public void Memoria(int Pos);
	// este sirve para poder agarra la estacion guardada en memoria
         public double getEmisora();
}
