package ObjectOrientedProgramming;
//Run time polymorphism 
class Color{
    void paint(){
        System.out.println("I am painting...");
    }
}
class Redcolor extends Color{
    void paint(){
        System.out.println("I am painting with Red color!");
    }
}
class Greencolor extends Color{
    void paint(){
        System.out.println("I am painting with Green color!");
    }

}
public class Run_time_ploymerphism {
    public static void main(String[] args) {
        Color c = new Color();
        c.paint();
        Redcolor rc = new Redcolor();
        rc.paint();
        Greencolor gr = new Greencolor();
        gr.paint();

    }
}
