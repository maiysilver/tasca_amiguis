package objects;

import java.util.Scanner;
import objects.Empleat;
import objects.Comercial;
import objects.Repartidor;
import menu.Menu;
import main.Main;

public final class Comercial extends Empleat{
	private Integer comissio;

	public Comercial() {
		super();
	}

	public Comercial(Empleat Empleat) {
		super(Empleat);
	}

	public Comercial(String enom, String ecognom1, String ecognom2, String eNIF, Integer eedat, Integer esalari,Integer ecomissio) {
		super(enom, ecognom1, ecognom2, eNIF, eedat, esalari);
		this.comissio = ecomissio;
	}

	public Integer getComissio() {
		return comissio;
	}

	public void setComissio(Integer comissio) {
		this.comissio = comissio;
	}
	
	public void mostrarAtributs() { 
		super.mostrarAtributs();
		System.out.println("comissio: " + this.comissio );
    }
	
	@SuppressWarnings("finally")
	public Comercial demanarAlta() { 
		boolean ret = false;
		super.demanarAlta();
		Comercial Com = new Comercial();
		try {
			Scanner sn=new Scanner(System.in);
			System.out.println("Introdueix la comissio:");
			comissio = sn.nextInt();
			Com = new Comercial(getNom(),getCognom1(),getCognom2(),getNIF(),getEdat(),getSalari(),comissio);
			ret = true;
		}catch(Exception e){
			System.out.println("Error a demanarAlta: "+ e.getMessage());
		}finally{
			if (ret) {
				return Com;
			}else{
				return null;
			}
		}
	}
}










