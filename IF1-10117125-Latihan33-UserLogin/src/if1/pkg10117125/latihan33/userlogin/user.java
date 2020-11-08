/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan33.userlogin;

/**
 *
 * @author zulfi
 */
public class user {
     private String username = "admin";
    private String password = "admin";
    private boolean statusAkun;
    
    private boolean cekAkun(String userName,String password){
        if (userName.equals(username)){
            statusAkun = true;           
        }
        else if ( password.equals(password)){
             statusAkun = false;  
        } 
        else{
            statusAkun = false;
        }
         return statusAkun;
       
}
    private void hasilLogin(boolean statusAkun, String userName){
        if(statusAkun){
            System.out.println("*****Hallo " + userName.toUpperCase() 
                                + "*****");
            System.out.println("Selamat Datang di Applikasi ini");
        }
        else {
            System.out.println("Oooppss,Username atau Password Anda salah");
        }
        }
    

    public void pengecekanLogin(String userName, String password){
        System.out.println(cekAkun(userName, password));
        hasilLogin(statusAkun, userName);
    }
}
