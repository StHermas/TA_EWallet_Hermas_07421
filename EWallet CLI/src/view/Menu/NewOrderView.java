package view.Menu;
import java.util.Scanner;
import controller.OrderController;

public class NewOrderView {
    private Scanner sc=new Scanner(System.in);
    private OrderController orderC=new OrderController();

    public void order(int pil){
        String noTelp, merek;
        int nominal;
        if(pil==1){
            System.out.println("++Top Up Merchant++");
            System.out.println("Masukkan No Telp: ");
            noTelp=sc.nextLine();

            System.out.println("Masukkan Nama Merchant: ");
            merek=sc.nextLine();

            System.out.println("Masukkan Nominal: ");
            nominal= sc.nextInt();
            boolean status = orderC.tambahorderM(merek,noTelp,nominal);
            if (status==true){
                System.out.println("TOP UP BERHASIL!");
            }
            else {
                System.out.println("TOP UP GAGAL!");
            }
        }
        if(pil==2){
                System.out.println("++Isi Ulang Pulsa++");
                System.out.println("Masukkan No Telp: ");
                noTelp=sc.nextLine();

                System.out.println("Masukkan Nama Merchant: ");
                merek=sc.nextLine();

                System.out.println("Masukkan Nominal: ");
                nominal= sc.nextInt();
                boolean status = orderC.tambahOrderP(merek, noTelp, nominal);
                if (status==true){
                    System.out.println("TOP UP BERHASIL!");
                }
                else {
                    System.out.println("TOP UP GAGAL!");
                }
        }

    }

}
