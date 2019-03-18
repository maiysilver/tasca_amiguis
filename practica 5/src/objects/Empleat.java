package objects;

import java.util.Scanner;
import menu.Menu;


public class Empleat {
	protected String nom = " ";
	protected String cognom1 = " ";
	protected String cognom2 = " ";
	protected String NIF;
	protected Integer edat;
	protected Integer salari;
	
	public Empleat() {
	}
	
	public Empleat(String enom, String ecognom1, String ecognom2, String eNIF, Integer eedat, Integer esalari) {
		this.nom = enom;
		this.cognom1 = ecognom1;
		this.cognom2 = ecognom2;
		this.NIF = eNIF;
		this.edat = eedat;
		this.salari = esalari;
	}
	
	public Empleat(Empleat Empleat) {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom1() {
		return cognom1;
	}

	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public Integer getEdat() {
		return edat;
	}

	public void setEdat(Integer edat) {
		this.edat = edat;
	}

	public Integer getSalari() {
		return salari;
	}

	public void setSalari(Integer salari) {
		this.salari = salari;
	}
	
	public void mostrarAtributs() { 
		System.out.println("Nom: " + this.nom + " " + this.cognom1 + " " + this.cognom2 + " | " + this.NIF + " | " + this.edat + " | " + this.salari);
    }
	
	private int seleccionaInt() {
		Scanner sc = new Scanner(System.in);
		int selecc = sc.nextInt();
		return selecc;
	}
	
	@SuppressWarnings({ "finally" })
	public Empleat demanarAlta() { 
		boolean ret = false;
		Empleat Emp = new Empleat();
		try {
			boolean error = false;
			Scanner sn=new Scanner(System.in);
			System.out.println("Introdueix el teu nom:");
			nom = sn.nextLine();
			System.out.println("El primer cognom:");
			cognom1 = sn.nextLine();
			System.out.println("El segon cognom:");
			cognom2 = sn.nextLine();
			System.out.println("El NIF:");
			NIF = sn.nextLine();
			NIF = NIF.toUpperCase();
			do {
				System.out.println("Edat:");
				edat = seleccionaInt();
				if (edat > 16) {
					error = true;
				}else{
					System.out.println("La edat ha de ser mayor de 16!");
					System.out.println("····································");
				}
			}while (error==false);
			System.out.println("El salari:");
			salari = seleccionaInt();
			nom = Character.toUpperCase(nom.charAt(0)) + nom.substring(1,nom.length());
			cognom1 = Character.toUpperCase(cognom1.charAt(0)) + cognom1.substring(1,cognom1.length());
			cognom2 = Character.toUpperCase(cognom2.charAt(0)) + cognom2.substring(1,cognom2.length());
			Emp = new Empleat(nom,cognom1,cognom2,NIF,edat,salari);
			ret = true;
		}catch(Exception e){
			System.out.println("Error a demanarAlta: "+ e.getMessage());
		}finally{
			if (ret){
				return Emp;
			}else{
				return null;
			}	
		}
    }

	
}
