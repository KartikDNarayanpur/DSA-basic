public class Abtraction {

    public static void main(String [] args){

 hourse h = new hourse();
 h.eats();
 h.walk();
 System.out.println(h.color);


//  chiken c = new chiken();
//  c.eats();
//  c.walk();

// Animal a = new Animal();
// a.eats();
// we cant create the object for abtraction class


    }

}
abstract class Animal{
    String color;
    Animal (){
     color="brown";
    }
    void eats(){
        System.out.print("eats");


    }
    abstract void walk();
   
}
class hourse extends Animal{
    void colorchang(){
        color="dark brown";
    }
    void walk(){
        System.out.print("4 legs");
    }
}
class chiken extends Animal{
    void colorchang(){
        color="Yellow";
    }
    void walk(){
        System.out.print("2 legs");
    }

}
    

