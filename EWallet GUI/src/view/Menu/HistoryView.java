package view.Menu;
import java.util.ArrayList;
import java.util.Scanner;
import controller.OrderController;
import entity.MerchantEntity;
import entity.PulsaEntity;
import model.OrderModel;


public class HistoryView {
    private OrderController orderC=new OrderController();
    private Scanner sc=new Scanner(System.in);
        public void viewHistori(){
            ArrayList<MerchantEntity> listMerchant=OrderModel.allm();
            ArrayList<PulsaEntity> listPulsa=OrderModel.allp();
            System.out.println("-------Histori--------");
            System.out.println("++++++Ewallet+++++++");
            for (MerchantEntity item :listMerchant){
                System.out.println("No Telp         : "+item.getNoTelp());
                System.out.println("Jenis MErchant   : "+item.getNaMerchant());
                System.out.println("Nominal         : "+item.getNominal());
            }
            System.out.println("++++++Pulsa+++++++");
            for (PulsaEntity item:listPulsa){
                System.out.println("No Telp         : "+item.getNoTelp());
                System.out.println("Jenis Pulsa     : "+item.getNaProvider());
                System.out.println("Nominal         : "+item.getNominal());
            }
        }
        public void historiMenu(){
            int pil;
            String notelp;
            System.out.println("""
                    1. Reset Histori
                    2. Hapus Pilihan Histori
                    3. Cari Histori
                    """);
            System.out.println("Pilihan: ");
            pil= sc.nextInt();
            switch(pil){
                case 1:
                    new OrderController().resetOrder();
                    System.out.println("Reset Berhasil!");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Masukkan No. Telp yang ingin di hapus: ");
                    notelp=sc.nextLine();
                    new OrderController().removeOrder(notelp);
                    System.out.println("Pengahpausan Berhasil!");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Masukkan no Telp Yang ingin dicari");
                    notelp=sc.nextLine();
                    PulsaEntity findP=orderC.findOrderP(notelp);
                    MerchantEntity findM=orderC.findOrderM(notelp);
                    if(findM!=null){
                        System.out.println("No Telp: "+findM.getNoTelp());
                        System.out.println("Nominal: "+findM.getNominal());
                        System.out.println("Nama Merchant: "+findM.getNaMerchant());
                    }
                    if(findP!=null){
                        System.out.println("No Telp: "+findP.getNoTelp());
                        System.out.println("Nominal: "+findP.getNominal());
                        System.out.println("Nama Provider: "+findP.getNaProvider());
                    }
                    if(findP==null&&findM==null){
                        System.out.println("Data Tidak Ditemukan!");
                    }

                    break;
                case 4:
                    new DashboardView().menu();
                    break;
            }

        }
}
