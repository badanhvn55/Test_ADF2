/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testadf2;

import java.util.Scanner;

/**
 *
 * @author ueda
 */
public class TestADF2 {
    ReservationManager rem=new ReservationManager();
    
    public void menu() {
        while (true) {
            System.out.println("========= MENU ===========");
            System.out.println("1. Add reservation");
            System.out.println("2. Modify passenger records");
            System.out.println("3. Display passenger records");
            System.out.println("4. Exit");
            System.out.println("---------------------------");
            System.out.println("Please enter a request: ");
            Scanner scan = new Scanner(System.in);
            String strChoose = scan.nextLine();
            int choose = 0;
            try {
                choose = Integer.parseInt(strChoose);
            } catch (NumberFormatException e) {
                System.err.println(e);
            }

            if (choose == 4) {
                break;
            } else {
                switch (choose) {
                    case 1:
                        rem.addPassenger();
                        break;
                    case 2:
                        rem.modifyPassenger();
                        break;
                    case 3:
                        rem.displayPassenger();
                        break;

                    default:
                        System.out.println("Plese enter number from 1 to 4!");
                }
            }
        }
    }

    public static void main(String[] args) {
        TestADF2 test=new TestADF2();
        test.menu();
    }

}
