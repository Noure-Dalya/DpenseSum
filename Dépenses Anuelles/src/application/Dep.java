package application;

public class Dep

{

// En Double pour manipuler les donner en statistique

private Double NC;
private Double VC;
private Double SC;
private Double SupC;

//Constructeur Vide:

public Dep()
{
	this(null,null);
}

// Constructeur avec 2 parametre
public Dep(Double NC,Double SupC) 
{
	this.NC=0.0;
	this.VC=0.0;
	this.SC=0.0;
	this.SupC=0.0;
}
//Getters et Setters

public Double getNC() {
	return NC;
}
public void setNC(Double nC) {
	NC = nC;
}
public Double getVC() {
	return VC;
}
public void setVC(Double vC) {
	VC = vC;
}
public Double getSC() {
	return SC;
}
public void setSC(Double sC) {
	SC = sC;
}
public Double getSupC() {
	return SupC;
}
public void setSupC(Double supC) {
	SupC = supC;
}

}
