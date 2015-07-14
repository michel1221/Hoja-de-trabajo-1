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
    @Override
    public void setESTADO(boolean ESTADO) {
        estadoRadio = ESTADO;
    }

    @Override
    public boolean getEstado() {
        return estadoRadio;
    }

    @Override
    public int getAMFM() {
        return modeEmisora;
    }

    @Override
    public void setAMFM(int Band) {
       modeEmisora = Band;
    }

    @Override
    public void Sintonizar(boolean uD) {
        
    }

    @Override
    public void Guardar(int Pos) {
        
    }

    @Override
    public void Memoria(int Pos) {
       
    }

    @Override
    public double getEmisora() {
       if (modeEmisora == 0){
			return numAM;
		}
		else{
			return numFM;
		}
	}
    }

