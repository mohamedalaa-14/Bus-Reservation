/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.reservation;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MOHAMq
 */
public class Reservation {

    Scanner scan = new Scanner(System.in);
    private String s = "";
    private int a = 0;
    private String customername;
    private int sn;

    public void setcustomername(String n1) {
        customername = n1;
    }

    public String getcustomername() {
        return customername;
    }

    public void Choosing(String BusLines1[][], String BusLines2[][], String BusLines3[][], String BusLines4[][], String BusLines5[][]) {
        String k;
        int x;
        Deletion D1 = new Deletion();
        System.out.println("Please enter Name of Customer");
        k = scan.next();
        setcustomername(k);
        Buses b1 = new Buses();
        System.out.println(" Choose which Line do you want to choose :- ");
        System.out.println(" Enter 1 to choose Cairo-Alex Line , Enter 2 to choose Cairo-Sharm-El-Shiekh Line , Enter 3 to choose Cairo-Hurghada Line , Enter 4 to choose Cairo-Dahab , Enter 5 to choose Cairo-Aswan ");
        x = scan.nextInt();
        int z;
        int u;
        switch (x) {
            case 1:
                a += 100;
                System.out.println("This is the Buses of Cairo-Alex Line :- ");
                for (int i = 0; i < 2; i++) {
                    System.out.println();
                    for (int j = 0; j < 6; j++) {
                        System.out.print(BusLines1[i][j]);
                    }
                }
                System.out.println("Enter location you want to travel from :- ");
                System.out.println("Enter 1 to choose Cairo , Enter 2 to choose Alexandria ");
                z = scan.nextInt();
                if (z == 1) {
                    s += "From Cairo to Alex";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine1Seats1());
                    u = scan.nextInt();
                    sn += u;
                    System.out.println(D1.Delete(b1.BusLine1Seats1(), u));
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                if (z == 2) {
                    s += "From Alex to Cairo";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine1Seats2());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine1Seats2(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }

                break;
            case 2:
                a += 150;
                System.out.println("This is the Buses of Cairo-Sharm-El-Shiekh Line :- ");
                for (int i = 0; i < 2; i++) {
                    System.out.println();
                    for (int j = 0; j < 6; j++) {
                        System.out.print(BusLines2[i][j]);
                    }
                }
                System.out.println("Enter location you want to travel from :- ");
                System.out.println("Enter 1 to choose Cairo , Enter 2 to choose Sharm-El-Shiekh ");
                z = scan.nextInt();
                if (z == 1) {
                    s += "From Cairo to Sharm-El-Shiekh";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine2Seats3());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine2Seats3(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                if (z == 2) {
                    s += "From Sharm-El-Shiekh to Cairo";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine2Seats4());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine2Seats4(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                break;

            case 3:
                a += 150;
                System.out.println("This is the Buses of Cairo-Hurghada Line :- ");
                for (int i = 0; i < 2; i++) {
                    System.out.println();
                    for (int j = 0; j < 6; j++) {
                        System.out.print(BusLines3[i][j]);
                    }
                }
                System.out.println("Enter location you want to travel from :- ");
                System.out.println("Enter 1 to choose Cairo , Enter 2 to choose Hurghada ");
                z = scan.nextInt();
                if (z == 1) {
                    s += "From Cairo to Hurghada";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine3Seats5());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine3Seats5(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                if (z == 2) {
                    s += "From Hurghada to Cairo";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine3Seats6());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine3Seats6(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                break;
            case 4:
                a += 180;
                System.out.println("This is the Buses of Cairo-Dahab Line :- ");
                for (int i = 0; i < 2; i++) {
                    System.out.println();
                    for (int j = 0; j < 6; j++) {
                        System.out.print(BusLines4[i][j]);
                    }
                }
                System.out.println("Enter location you want to travel from :- ");
                System.out.println("Enter 1 to choose Cairo , Enter 2 to choose Dahab ");
                z = scan.nextInt();
                if (z == 1) {
                    s += "From Cairo to Dahab";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine4Seats7());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine4Seats7(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                if (z == 2) {
                    s += "From Dahab to Cairo";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine4Seats8());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine4Seats8(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                break;
            case 5:
                a += 190;
                System.out.println("This is the Buses of Cairo-Aswan Line :- ");
                for (int i = 0; i < 2; i++) {
                    System.out.println();
                    for (int j = 0; j < 6; j++) {
                        System.out.print(BusLines5[i][j]);
                    }
                }
                System.out.println("Enter location you want to travel from :- ");
                System.out.println("Enter 1 to choose Cairo , Enter 2 to choose Aswan ");
                z = scan.nextInt();
                if (z == 1) {
                    s += "From Cairo to Aswan";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine5Seats9());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine5Seats9(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                if (z == 2) {
                    s += "From Aswan to Cairo";
                    System.out.println("Please choose your seat");
                    System.out.println(b1.BusLine5Seats10());
                    u = scan.nextInt();
                    sn += u;
                    D1.Delete(b1.BusLine5Seats10(), u);
                    System.out.println(getcustomername());
                    System.out.println(s);
                    System.out.println("You have to pay " + a);
                    System.out.println("Your seat number is " + sn);
                    Random r = new Random();
                    System.out.println("Your ticket number is" + r.nextInt((30 - 1) + 1) + 1);
                    break;
                }
                break;
            default:
                System.out.println("Please Enter correct choice :) ");
        }
    }

    public void Asking() {
        Buses b2 = new Buses();
        String q;
        System.out.println("Do you want to Book Another ticket? :) ");
        System.out.println("Enter (Yes) or (No) :) ");
        q = scan.next();
        for (int i = 1; i > 0; i++) {
            if ("No".equals(q)) {
                break;
            }
            if ("Yes".equals(q)) {
                b2.Calling();
            }
        }
    }

}
