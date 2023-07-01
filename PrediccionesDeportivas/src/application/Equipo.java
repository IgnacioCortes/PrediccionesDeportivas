package application;

import javafx.scene.image.Image;

public class Equipo {
    //Variables
    private int id;
    private String nombre;
	private int rendimiento;
    private int puntos;
    private int posesion;
    private int saqueDeEsquina;
    
    //OCASIONES
    private int ocasionClara;
    private int ocasionClaraFallada;
    private int ocasionContraAtaque;
    //TIROS
    private int tiroContrataque;
    private int tiroEnELArea;
    private int tiroFueraDelArea;
    private int atajadaRival;
    private int atajadaRivalEnElArea;
  
    //CONSTRUCTORES
    
    
	
	public Equipo(int id, String nombre, int rendimiento, int puntos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rendimiento = rendimiento;
		this.puntos = puntos;	
	}
    public Equipo(int id, String nombre, int rendimiento, int puntos, int posesion, int saqueDeEsquina,
			int ocasionClara, int ocasionClaraFallada, int ocasionContraAtaque, int tiroContrataque, int tiroEnELArea,
			int tiroFueraDelArea, int atajadaRival, int atajadaRivalEnElArea) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rendimiento = rendimiento;
		this.puntos = puntos;
		this.posesion = posesion;
		this.saqueDeEsquina = saqueDeEsquina;
		this.ocasionClara = ocasionClara;
		this.ocasionClaraFallada = ocasionClaraFallada;
		this.ocasionContraAtaque = ocasionContraAtaque;
		this.tiroContrataque = tiroContrataque;
		this.tiroEnELArea = tiroEnELArea;
		this.tiroFueraDelArea = tiroFueraDelArea;
		this.atajadaRival = atajadaRival;
		this.atajadaRivalEnElArea = atajadaRivalEnElArea;
	}
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
    
    //GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getRendimiento() {
		return rendimiento;
	}
	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getPosesion() {
		return posesion;
	}
	public void setPosesion(int posesion) {
		this.posesion = posesion;
	}
	public int getSaqueDeEsquina() {
		return saqueDeEsquina;
	}
	public void setSaqueDeEsquina(int saqueDeEsquina) {
		this.saqueDeEsquina = saqueDeEsquina;
	}
	public int getOcasionClara() {
		return ocasionClara;
	}
	public void setOcasionClara(int ocasionClara) {
		this.ocasionClara = ocasionClara;
	}
	public int getOcasionClaraFallada() {
		return ocasionClaraFallada;
	}
	public void setOcasionClaraFallada(int ocasionClaraFallada) {
		this.ocasionClaraFallada = ocasionClaraFallada;
	}
	public int getOcasionContraAtaque() {
		return ocasionContraAtaque;
	}
	public void setOcasionContraAtaque(int ocasionContraAtaque) {
		this.ocasionContraAtaque = ocasionContraAtaque;
	}
	public int getTiroContrataque() {
		return tiroContrataque;
	}
	public void setTiroContrataque(int tiroContrataque) {
		this.tiroContrataque = tiroContrataque;
	}
	public int getTiroEnELArea() {
		return tiroEnELArea;
	}
	public void setTiroEnELArea(int tiroEnELArea) {
		this.tiroEnELArea = tiroEnELArea;
	}
	public int getTiroFueraDelArea() {
		return tiroFueraDelArea;
	}
	public void setTiroFueraDelArea(int tiroFueraDelArea) {
		this.tiroFueraDelArea = tiroFueraDelArea;
	}
	public int getAtajadaRival() {
		return atajadaRival;
	}
	public void setAtajadaRival(int atajadaRival) {
		this.atajadaRival = atajadaRival;
	}
	public int getAtajadaRivalEnElArea() {
		return atajadaRivalEnElArea;
	}
	public void setAtajadaRivalEnElArea(int atajadaRivalEnElArea) {
		this.atajadaRivalEnElArea = atajadaRivalEnElArea;
	}


	
    
	
}
