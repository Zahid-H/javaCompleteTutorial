package Basic;

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        System.out.println("<---Enter your necessary information--->");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Your Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Your Cgpa: ");
            double cgpa = sc.nextDouble();
            System.out.println("Enter Your Department: ");
            String dept = sc.nextLine();



        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Cgpa: "+cgpa);
        System.out.println("Department: "+dept);

        sc.close();


    }
}
