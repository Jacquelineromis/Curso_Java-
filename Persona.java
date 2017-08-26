public class Persona {
String name;
String sexo;
int edad;

public void caminar (){
	System.out.println(name + " Esta caminando");
}
public void estudiar (){
	System.out.println(name + " Esta estudiando");
}

public void comer(String comida){
	System.out.println(name + " Esta comiendo" + comida);
}
public void pediCerveza(){
	if(edad>=18){
	System.out.println("Dar Cerveza");
}else{
	System.out.println("No tiene edad para tomar");
}
}
}

class Curso {


public static void main(String args[]){
	Persona Diana = new Persona();
	Diana.name = "DIANA VILLANUEVA";
	Diana.sexo = "F";
	Diana.edad = 24;
	Diana.caminar();
	Diana.estudiar();
	Diana.comer ("Torta Guacamaya");
	Diana.pediCerveza();

    Persona Carlos = new Persona();       
	Carlos.name = "Carlos Rojas";
	Carlos.sexo = "M";
	Carlos.edad = 24;
	Carlos.caminar();
	Carlos.estudiar();
	Carlos.comer("Tacos al pastor");
	Carlos.pediCerveza();

}
}
