import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Divisions program:");

        int tal1 = 4;
        int tal2 = 5;
        System.out.println("Ange tal 1: "+tal1);
        System.out.println("Ange tal 2: "+tal2);
        System.out.println("Kvoten är: "+((double)tal1/tal2));
        System.out.println("Kvoten är: "+(tal1/tal2));

        Scanner tangentbord = new Scanner(System.in);
        System.out.println();

        System.out.println("Ange ett substantiv: ");
        String substantiv = tangentbord.nextLine();   
        System.out.println("Ange substantivets pluraländelse: ");
        String pluraländelse = tangentbord.nextLine();
        System.out.println("En "+substantiv+", flera "+substantiv+pluraländelse);
    }
}
