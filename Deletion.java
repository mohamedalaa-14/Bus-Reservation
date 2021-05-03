/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.reservation;
import java.util.LinkedList;

/**
 *
 * @author MOHAM
 */
public class Deletion {
    public LinkedList<String> Delete (LinkedList<String>List ,int x) {
        
        List.remove(x-1);  
        return List;
            }
           
}
