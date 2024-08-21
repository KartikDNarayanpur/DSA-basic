public class Interfaces {
    public static void main(String []args ){
        // Queen q1 = new Queen();
        // q1.movies();
        Beer b= new Beer();
        b.veg();
        
    }

    
}
/**
 * InnerInterfaces
 */
interface herbivore{
 void veg();
}
interface carnivore{
    void nonveg();


}
class Beer implements herbivore,carnivore{
     public void veg(){
        System.out.println("eats veg");
    }
    public void nonveg(){
        System.out.println("eates nonveg also");
    }

}
 interface Chessplayer{
    void movies();
    
}
class Queen implements Chessplayer{
     public void movies(){
        System.out.println("up,down,right,left,diagonal (all sides )");
    }
}
class Rook implements Chessplayer{
    public void movies(){
       System.out.println("up,down,right,left )");
   }
}
class king implements Chessplayer{
    public void movies(){
       System.out.println("up,down,right,left,diagonal (all sides by 1 step))");
   }
}