package ObjectOrientedProgramming;

class FundamentalForce2 {
    void Force() {
        System.out.println("Apples fall on newtons head");
    }
}
class Gravities extends FundamentalForce2 {
    void Gravity() {
        System.out.println("Fruits fall to the ground due to gravitational Force.");
    }
}
class ElectromagneticForce extends FundamentalForce2 {
        void Electromagnetic() {
            System.out.println("The electromagnetic force acts between charged particles");
        }
    }



class Hierarchical_Inheritance{
    public static void main(String[] args) {
        ElectromagneticForce e = new ElectromagneticForce();
        e.Electromagnetic();
        Gravities g = new Gravities();
        g.Gravity();
    }
}
