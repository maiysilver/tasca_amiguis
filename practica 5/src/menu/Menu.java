package menu;

import java.util.ArrayList;
import java.util.Scanner;
import objects.Empleat;
import objects.Comercial;
import objects.Repartidor;


public class Menu {
	
	public ArrayList<Empleat> Empleats = new ArrayList();
	public Empleat Emp = new Empleat();
	public Comercial Com = new Comercial();
	public Repartidor Rep = new Repartidor();
	
	public void mostrarAtributsEmpleat() {
		for (int i = 0; i < Empleats.size();i++){
			this.Empleats.get(i).mostrarAtributs();
			System.out.println("ииииииииииииииииииииииииииииииииииии");
		}
	}
	
	public void mostrarAtributsComercial() {
		for (int i = 0; i < Empleats.size();i++){
			if (this.Empleats.get(i) instanceof Comercial){
				this.Empleats.get(i).mostrarAtributs();
				System.out.println("ииииииииииииииииииииииииииииииииииии");
			}
		}
	}
	
	public void mostrarAtributsRepartidor() {
		for (int i = 0; i < Empleats.size();i++){
			if (this.Empleats.get(i) instanceof Repartidor){
				this.Empleats.get(i).mostrarAtributs();
				System.out.println("ииииииииииииииииииииииииииииииииииии");
			}
		}
	}
	
	public ArrayList<Empleat> getEmpleats() {
		return Empleats;
	}

	public void setEmpleats(ArrayList<Empleat> empleats) {
		Empleats = empleats;
	}
	
	public void afegirEmp(Empleat Emp) {
		this.Empleats.add(Emp);
	}
	
	public void afegirCom(Menu Menu) {
		this.Empleats.add(Com);
	}
	
	public void afegirRep(Menu Menu) {
		this.Empleats.add(Rep);
	}

	public void pintarMenuPrincipal(){
		System.out.println("===================================");
		System.out.println("=            Pechuga              =");
		System.out.println("===================================");
		System.out.println("= 1) Alta empleat                 =");
		System.out.println("= 2) Alta comercial               =");
		System.out.println("= 3) Alta repartidor              =");
		System.out.println("= 4) Mostrar atributs empleat     =");
		System.out.println("= 5) Mostrar atributs comercial   =");
		System.out.println("= 6) Mostrar atributs repartidor  =");
		System.out.println("= 7) Exit                         =");
		System.out.println("===================================");
		System.out.println("Selecciona l'opcio que desitge: ");
	}
	
	private int seleccionaInt() {
		Scanner sc = new Scanner(System.in);
		int selecc = sc.nextInt();
		return selecc;
	}
	
	public void iniciar() {
		int selec = 0;
		while(selec != 7){
			pintarMenuPrincipal();
			selec = seleccionaInt();
			switch (selec){
			case 1:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Accedint a Alta empleat...");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				Empleat e = Emp.demanarAlta();
				if(e != null){
					Empleats.add(e);
				}
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				break;
			case 2:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Accedint a Alta comercial...");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				Comercial c = Com.demanarAlta();
				if(c != null){
					Empleats.add(c);
				}
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				break;
			case 3:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Accedint a Alta repartidor...");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				Repartidor r = Rep.demanarAlta();
				if(r != null) {
					Empleats.add(r);
				}
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				break;
			case 4:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Accedint a atributs empleat...");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				mostrarAtributsEmpleat();
				
				break;	
			case 5:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Accedint a atributs comercial...");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				mostrarAtributsComercial();
				break;
			case 6:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Accedint a atributs repartidor...");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				mostrarAtributsRepartidor();
				break;	
			case 7:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Exit del programa...");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				break;
			default:
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				System.out.println("Opciз no valida, torna a probar.");
				System.out.println("ииииииииииииииииииииииииииииииииииии");
				break;	
			}
		}
	}
}
