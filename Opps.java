public class Opps {
    public static void main (String args[]){
        Pen p1= new Pen();
        p1.setcolor("red");
        System.out.println(p1.getcolor());
        Student s1= new Student();
        

    }

    
}
class Student{
    int age;
    String name;
    Student(){
        System.out.println("constructor is called......");
    }

}
class Pen{
   private String color ;
    private int tip;
    String getcolor (){
        return this.color;
    }
    // void setcolor(String color){
        
    // }

    
    void setcolor(String newColor){
        this.color = newColor;
    }
    void settip(int n){
        tip=n;
    }

}
// class Student{
//     String name;
//     int age;
//     float percentage;
//     void clapercentage(int phy, int che ,int mat){
//         percentage=(phy+che+mat)/3;
//     }


// }