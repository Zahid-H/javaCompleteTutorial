package ObjectOrientedProgramming;

public class Polymerphism {
    public String Movie(){
        return "Movie selection";

    }
    public String Movie(String collection,String Genre){
        return collection +" "+ Genre;

    }
    public String Movie(int time,String date){
        return time +" "+date;
    }

    public static void main(String[] args) {
        Polymerphism p = new Polymerphism();
        System.out.println(p.Movie());
        System.out.println(p.Movie("Good colloection","Holloywood"));
        System.out.println(p.Movie(3,"super sunday"));





    }
}
