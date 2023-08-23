package ObjectOrientedProgramming;

public class Example2 {
    // Methods--Are--
    // block-of-codes-that-accept-parameters-and-perform-actions-when-they-are-being-called
    public void fruit(){
        String fruit [] = {"Apple","Orange","Banana","Mango"};
        System.out.println("Fruits: ");
        for(int i=0; i < fruit.length;i++){
            System.out.println(fruit[i]);
        }
    }
    public void veges(){
        String veges [] = {"Potato","Tomato","Cucumber","Carrot"};
        System.out.println("Vegetables: ");
        for (int i=0; i< veges.length;i++){
            System.out.println(veges[i]);
        }
    }

    public static void main(String[] args) {
        Example2 e = new Example2();
        e.fruit();
        e.veges();
    }
}

