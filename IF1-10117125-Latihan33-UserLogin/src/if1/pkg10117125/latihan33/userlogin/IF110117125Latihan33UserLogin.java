/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan33.userlogin;
import java.util.Scanner;
/**
 *
 * @author
 * Nama : Zulfi Ihzam Rahmat
 * Kelas: IF-1
 * NIM  : 10117125
 * Deskripsi Program : Program ini berisi program yang untuk user login
 */
public class IF110117125Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         user login = new user();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        String user = scanner.next();
        System.out.println("Masukan Password: ");
        String password = scanner.next();
        System.out.println("");
        
        login.pengecekanLogin(user, password);
    }
    
}
