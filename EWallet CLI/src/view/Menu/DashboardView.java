package view.Menu;
import java.util.Scanner;

import controller.AuthController;
import entity.MerchantEntity;
import entity.PulsaEntity;
import model.OrderModel;
import view.Profil.SettingProfilView;

public class DashboardView{
    private Scanner sc=new Scanner(System.in);
    public void menu(){
        int pilMenu=0;
        do{
            System.out.println("Selamat datang di Kizuna E-Wallet");
            System.out.println("""
                    1. Top Up E-Wallet/Merchant
                    2. Top Up Pulsa
                    3. Lihat Riwayat
                    4. Pengaturan Profil
                    99. Log Out""");
            System.out.println("Masukkan Pilihan");
            pilMenu=sc.nextInt();
            switchMenu(pilMenu);

        }while(pilMenu!=99);


    }
    private void switchMenu(int pil){
        switch (pil){
            case 1:
                new NewOrderView().order(1);
                break;
            case 2:
                new NewOrderView().order(2);
                break;
            case 3:
                new HistoryView().viewHistori();
                new HistoryView().historiMenu();
                break;
            case 4:
                new SettingProfilView().menuProfil();
                break;
            case 99:
                new AuthController().toViewL();
                break;

        }
    }
}
