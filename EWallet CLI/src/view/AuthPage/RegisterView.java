package view.AuthPage;
import java.util.Scanner;
import controller.AuthController;

public class RegisterView {
    private Scanner sc=new Scanner(System.in);
    private AuthController authC=new AuthController();
    public void formRegister(){
        String nama, username, password;
        System.out.println("++Register++");
        System.out.println("Masukkan Nama: ");
        nama= sc.nextLine();
        System.out.println("Masukkan Username: ");
        username= sc.nextLine();
        System.out.println("Masukkan Password: ");
        password= sc.nextLine();
        boolean status=authC.registerUser(nama,username,password);
        if (status==true){
            System.out.println("Register Berhasil!");
            authC.toViewL();
        }
        else {
            System.out.println("Username Telah di gunakan");
            authC.toViewR();
        }
    }
}
