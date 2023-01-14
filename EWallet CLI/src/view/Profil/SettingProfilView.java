package view.Profil;
import java.util.Scanner;
import controller.AuthController;
import entity.UserEntity;

public class SettingProfilView {
    private Scanner sc=new Scanner(System.in);
    private AuthController authC=new AuthController();
    public void menuProfil(){
        System.out.println("""
                1. Ganti Password
                2. Ganti Nama""");
        System.out.println("Masukkan Pilihan: ");
        int pil=sc.nextInt();
        if(pil==1){
            sc.nextLine();
            System.out.println("Masukkan Username anda: ");
            String username=sc.nextLine();
            UserEntity findUser=authC.findUser(username);
            if(findUser!=null){
                updatePassword(findUser);
                new AuthController().toViewL();
            }
            else{
                System.out.println("Username Salah!");
            }
        }
        if(pil==2){
            sc.nextLine();
            System.out.println("Masukkan Username anda: ");
            String username=sc.nextLine();
            UserEntity findUser=authC.findUser(username);
            if(findUser!=null){
                updateName(findUser);
            }
            else{
                System.out.println("Username Salah!");
            }

        }
    }
    private void updateName(UserEntity findUser){
        String nama;
        System.out.println("Masukkan Nama Baru: ");
        nama=sc.nextLine();
        boolean status = authC.updateProfil(findUser.getUsername(), nama, findUser.getPassword());
    }
    private void updatePassword(UserEntity findUser){
        String password;
        System.out.println("Masukkan Password baru: ");
        password=sc.nextLine();
        boolean status = authC.updateProfil(findUser.getUsername(), findUser.getName(), password);
    }

}
