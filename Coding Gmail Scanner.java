/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerjava;
import java.util.Scanner;
/**
 *
 * @author iqbal
 */
public class Scannerjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner GMAIL = new Scanner (System.in);
        
        //ISI DATA REGISTER GMAIL
        
        System.out.println("Isi Data Register Gmail");
        
        System.out.println("First Name : ");
        String FirstName = GMAIL.nextLine();
        System.out.println("Last Name :");
        String LastName = GMAIL.nextLine();
       // System.out.println("Gender : ");
        //String Gender = GMAIL.nextLine();
        System.out.println("Username : ");
        String Username = GMAIL.nextLine();
        System.out.println("Gender:");
        String Gender = GMAIL.nextLine();
        System.out.println("Month :");
        String Month = GMAIL.nextLine();
        
        System.out.println("Days = ");
        int Days = GMAIL.nextInt();
        System.out.println("Years = ");
        int Years = GMAIL.nextInt();
            
        System.out.println("Phone Number : ");
        long PhoneNumber = GMAIL.nextLong();
        
   //     System.out.println("Recorvery Gmail Addres :");
    //   String RGA = GMAIL.nextLine();       
    //    System.out.print("Gender : ");
      //  String Gender = GMAIL.nextLine();
        
        
        
        
        
             
        
                
    }
    
}
