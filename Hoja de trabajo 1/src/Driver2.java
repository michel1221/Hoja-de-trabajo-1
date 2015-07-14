/*
 * Hoja de trabajo 1
 * Clase Driver2
 * Para poder realizar un tipo de Radio
 */

/**
 * Este programa sirve para poder realizar el almacenamiento de los datos del 
 * radio aqui se contruye el radio como tal y se realizan las operaciones
 * @author Michel Ramirez carne 14069
 * @author Luis Eduardo Ruano carne 14187
 * @author Luis Pedro Velasquez carne 14537
 */
public class Driver2 implements Radio{
// estos son los atributos de la clase
private int modeEmisora; // indica si es AM o FM
private int numAM;  // indica si se inica en AM
private double numFM; // indica si se inicia en FM
private boolean estadoRadio; // Si se enciende o se apaga el radio
private int[] arregloBotAM; // para guardar en los botones AM
private double[] arregloBotFM; // para guardar en los botones FM

    /**
     *
     */
    public Driver2 (){

	modeEmisora = 1; // 0 de AM y 1 de FM
	numAM = 530;//Se inicia AM en la emisora 530
	numFM = 87.9;//Se inicia FM en la emisora 87.9
	estadoRadio= true;	 //False de apagado y True de encendido
	arregloBotAM= new int[12];//Para el arreglo de botones de AM
	arregloBotFM= new double[12];//Arreglo de botones de FM
	for(int i=0;i<12;i++){
		arregloBotAM[i]=530;
		arregloBotFM[i]= 87.9;
	}
}

    /**
     * Este metodo sirve para poder cambiar el estado de apagado o encendido
     * @param ESTADO
     */
    public void setESTADO(boolean ESTADO) {
        estadoRadio = ESTADO;
    }

    /**
     * Este metodo sirve para poder conseguir el estado del radio
     * @return estadoRadio
     */
    public boolean getEstado() {
        return estadoRadio;
    }

    /**
     * Este metodo sirve para poder conseguir en que emisora esta el radio
     * @return modeEmisora
     */
    public int getAMFM() {
        return modeEmisora;
    }

    /**
     * Este metodo sirve para poder cambiar de AM a FM 
     * @param Band
     */
    public void setAMFM(int Band) {
       modeEmisora = Band;
    }

    /**
     * Este metodo sirve para poder cambiar de emisora dependiendo se es AM o FM
     * sintoniza si es AM de 10 en 10 y FM de 0.2 en 0.2
     * @param uD
     */
    public void Sintonizar(boolean uD) {
        if (uD == true){
			if (modeEmisora == 0){
				numAM = numAM + 10;
				if (numAM > 1610){
					numAM = 530;
				}
			}
			else{
				numFM = numFM + 0.2;
				if (numFM > 107.9){
					numFM = 87.9;
				}
			}
		}
		else{
			if (modeEmisora == 0){
				numAM = numAM - 10;
				if (numAM < 530){
					numAM = 1610;
				}
			}
			else{
				numFM = numFM - 0.2;
				if (numFM < 87.9){
					numFM = 107.9;
				}
			}
		}
	}
    
    /**
     *Este metodo sirve para poder guardar la emisora en el respectivo boton del
     * radio
     * @param Pos
     */
    public void Guardar(int Pos) {
        if (modeEmisora == 0){
			arregloBotAM[Pos] = numAM;
		}
	else{
			arregloBotFM[Pos] = numFM;
	}
    }

    /**
     * Este metodo sirve para poder sacar de la emisora guardaa en la memoria
     * @param Pos
     */
    public void Memoria(int Pos) {
       if (modeEmisora == 0){
		numAM = arregloBotAM[Pos];
	}
	else{
		numFM = arregloBotFM[Pos];
	}
    }

    /**
     *Este metodo agarra la emisora que se desee
     * @return numAM o numFM
     */
  
    public double getEmisora() {
       if (modeEmisora == 0){
			return numAM;
		}
		else{
			return numFM;
		}
	}
   }

