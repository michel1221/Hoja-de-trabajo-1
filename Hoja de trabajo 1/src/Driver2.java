/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michel
 */
public class Driver2 implements radio{

private int modeEmisora;
private int numAM;
private double numFM;
private boolean estadoRadio;
private int[] arregloBotAM;
private double[] arregloBotFM;

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
    public void setESTADO(boolean ESTADO) {
        estadoRadio = ESTADO;
    }

    public boolean getEstado() {
        return estadoRadio;
    }

    public int getAMFM() {
        return modeEmisora;
    }

    public void setAMFM(int Band) {
       modeEmisora = Band;
    }

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
    

    public void Guardar(int Pos) {
        if (modeEmisora == 0){
			arregloBotAM[Pos] = numAM;
		}
	else{
			arregloBotFM[Pos] = numFM;
	}
    }

    public void Memoria(int Pos) {
       
    }

    public double getEmisora() {
       if (modeEmisora == 0){
			return numAM;
		}
		else{
			return numFM;
		}
	}
   }

