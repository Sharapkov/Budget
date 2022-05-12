package budget;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float sum = 0;                                  //float to sums up the totals
        ArrayList<String> all = new ArrayList<>();      //Arraylist to print the product list

        while(scanner.hasNextLine()){                   //If string is empty then stop
            String s = scanner.nextLine();
            all.add(s);
            if(s.equals("")){
                break;
            }
            String[] s1 = s.split("\\$");
            sum += Double.parseDouble(s1[1]);
        }

        for(String sall : all) {
            System.out.println(sall);
        }
        System.out.println(("Total: $" + sum));
    }
}
