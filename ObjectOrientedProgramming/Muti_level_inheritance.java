package ObjectOrientedProgramming;
//Multi-level-inheritance

class NuclearForce extends Fundamentalforce{
   void NuclearForce(){
       System.out.println("Nuclear force are two types:");
       System.out.println("Strong Nuclear force");
       System.out.println("Weak Nuclear force");
    }
}
class StrongNuclearForce extends NuclearForce{
    void StrongNuclearForce(){
        System.out.println("Strong Nuclear force is responsible for the under stability of matter ");
    }

}
class WeakNuclearForce extends NuclearForce{
    void WeakNuclearForce(){
        System.out.println("The force that allows protons to turn into neutrons and vice versa through beta decay.");
    }
}
public class Muti_level_inheritance {
    public static void main(String[] args) {
        NuclearForce n = new NuclearForce();
        n.NuclearForce();

        StrongNuclearForce sn = new StrongNuclearForce();
        sn.StrongNuclearForce();

        WeakNuclearForce wn = new WeakNuclearForce();

        wn.WeakNuclearForce();


    }
}
