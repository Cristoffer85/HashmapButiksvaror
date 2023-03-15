
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //initiera listor och variabler
        double cost = 0;
        ArrayList<String> inkopsLista = new ArrayList<>();
        HashMap<String, Double> varorPris = new HashMap<>();

        //lägg till varor
        varorPris.put("mjölk", 12.45);
        varorPris.put("kaffe", 99.0);
        varorPris.put("dill", 14.45);
        varorPris.put("bröd", 30.0);
        varorPris.put("ost", 45.00);
        varorPris.put("köttfärs", 55.00);
        varorPris.put("läsk", 20.00);
        varorPris.put("toapapper", 90.00);

        //loop och skriva ut handlarlista
        while (true){
            System.out.println("Välkommen att handla");
            System.out.println("Välj vilka varor du vill köpa");
            System.out.println("Vara -------Pris");

            for (String vara : varorPris.keySet()) {
                System.out.println(vara + " : " + varorPris.get(vara));
            }

            //hämta input
            String choice = input.nextLine();
            //till små bokstäver
            choice = choice.toLowerCase();


            if (choice.equalsIgnoreCase("n")) { // för att avsluta
                break;
            } else if (varorPris.containsKey(choice)){ //för att lägga till varans namn i ny array
                inkopsLista.add(choice);
                cost +=  varorPris.get(choice); // hämta pris ur listan och plusa på
            } else {
                System.out.println("den varan finns inte"); // om varan inte finns.
                System.out.println();
            }
        }

        //skriv ut totala inköpslistan och priset.
        System.out.println("Den totala kostnaden är : " + cost + "\nDin inköpslista är: ");
        for (String vara : inkopsLista) {
            System.out.print(vara + ", ");
        }
    }
}
