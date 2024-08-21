
public class Inheri {

    public static void main( String []args ){
        fish shark =new fish();
        shark.eat();

    }
    
}
// base class
class animal{
    string color;
void eat(){
    System.out.println("eats");

}
//derived class
void color(){
    System.out.println("color");
}
}
class fish extends animal{
    int fins;
    void swim(){
        System.out.println("swims");

    }
}
