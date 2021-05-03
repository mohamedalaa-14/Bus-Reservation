/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.reservation;
import java.util.Scanner;
/**
 *
 * @author MOHAM
 */
public class BusReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                String v;
        for(int u=1;u>0;u++){
        Scanner scan = new Scanner(System.in);
        Reservation r1 = new Reservation();
        String x;
        Buses r2 = new Buses();

            
r2.Calling();        
r1.Asking();
            
System.out.println("Enter (Exit) to close the program");
    v=scan.next();
        if("Exit".equals(v)){
            System.exit(0);
        }
        }

}}
    
