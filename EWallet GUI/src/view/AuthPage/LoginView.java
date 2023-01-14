package view.AuthPage;
import java.util.Scanner;
import controller.AuthController;
import controller.DashboardController;
import view.Menu.DashboardView;

public class LoginView {
    private Scanner sc=new Scanner(System.in);
    private AuthController authC=new AuthController();
    private String nama=null;
    public void formLogin(){
        while(true){
            String username, password;
            System.out.println("+++++++Login++++++++");
            System.out.println("Masukkan Username: ");
            username= sc.nextLine();
            System.out.println("Masukkan Password: ");
            password=sc.nextLine();
            nama= authC.loginProccess(username, password);
            if(nama!=null){
                System.out.println("Selamat datang "+nama);
                new DashboardController().toView();
            }
            else{
                System.out.println("Username/Password salah!");
                System.out.println("Ingin Daftar? Y/T");
                char daftar;
                daftar=sc.nextLine().charAt(0);
                if(daftar=='Y'){
                    authC.toViewR();
                }
                else{
                    authC.toViewL();
                }
            }
        }
    }
}
