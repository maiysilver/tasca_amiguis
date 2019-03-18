package objects;

import java.util.Scanner;

public final class Repartidor extends Empleat {
	private String zona;

	public Repartidor() {
		super();
	}

	public Repartidor(Empleat Empleat) {
		super(Empleat);
	}

	public Repartidor(String enom, String ecognom1, String ecognom2, String eNIF, Integer eedat, Integer esalari, String ezona) {
		super(enom, ecognom1, ecognom2, eNIF, eedat, esalari);
		this.zona = ezona;
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	public void mostrarAtributs() { 
		super.mostrarAtributs();
		System.out.println("zona: " + this.zona);
    }
	
	@SuppressWarnings("finally")
	public Repartidor demanarAlta() { 
		boolean ret = false;
		super.demanarAlta();
		Repartidor Rep = new Repartidor();
		try{
			Scanner sn=new Scanner(System.in);
			System.out.println("Introdueix la zona:");
			zona = sn.nextLine();
			Rep = new Repartidor(getNom(),getCognom1(),getCognom2(),getNIF(),getEdat(),getSalari(),zona);
			ret = true;
		}catch(Exception e){
			System.out.println("Error a demanarAlta: "+ e.getMessage());
		}finally{
			if (ret) {
				return Rep;
			}else{
				return null;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


