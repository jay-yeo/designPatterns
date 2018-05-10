package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("========= Car Shop ============ \n");
            System.out.print("            1. Honda.              \n");
            System.out.print("            2. Toyota.              \n");
            System.out.print("            3. Ford.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper sk = new ShopKeeper();

            switch (choice) {
                case 1: {
                    sk.hondaSale();
                }
                break;
                case 2: {
                    sk.toyotaSale();
                }
                break;
                case 3: {
                    sk.fordSale();
                }
                break;
                case 4: {
                    System.out.println("Bye bye!");
                     }
                break;
                default: {
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        } while (choice != 4);
    }
}  