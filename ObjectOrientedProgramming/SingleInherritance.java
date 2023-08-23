package ObjectOrientedProgramming;
//Inheritance

    class Fundamentalforce{
        void Force(){
            System.out.println("there are four fundamental force");
        }
    }
    class Gravitational extends Fundamentalforce{
        void Gravity(){
            System.out.println("Fruits fall from the tree to the ground due to gravitational force");
        }
    }
    class SingleInherritance{
        public static void main(String[] args) {
            Gravitational g = new Gravitational();
            g.Gravity();
            g.Force();


        }
    }




