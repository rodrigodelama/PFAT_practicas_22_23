import Ejem1.EjemPack1;
import Ejem1.Ejem2.EjemPack2;

public class Ejemplo {

    public static void main(String args[]) {
	EjemPack1 obj1= new EjemPack1();	
	EjemPack2 obj2= new EjemPack2();

	obj1.setVar1(2);
	obj2.setVar2(3);

	System.out.println(obj1.getVar1() + " + " + obj2.getVar2() + " = " + (obj1.getVar1() + obj2.getVar2()));
    }
}


