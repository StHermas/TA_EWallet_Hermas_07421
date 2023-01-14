package gui.menu;
import javax.swing.*;
import java.awt.Font;
import controller.AuthController;
import gui.MainFrame;
import gui.auth.LoginGui;
import gui.menu.*;
import gui.profil.SettingProfilGui;


public class DashboardGui extends MainFrame {
    private JLabel titleLabel, iconlLabel, iconrLabel;
    private JButton orderBtn, historyBtn, profilBtn, logOutBtn;

    public DashboardGui(){
        super("Menu E-Wallet Kizuna", 400, 600);
    }

    @Override
    protected void component() {
        titleLabel = new JLabel("Selamat Datang");
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel,Font.BOLD);
        setFontFamily(titleLabel, "Finger Paint");
        boundedAdd(titleLabel, 38, 30, 351, 92);

        ImageIcon imglLoad = loadImage("src/assets/gigachadl.jpg", 180, 180);
        iconlLabel = new JLabel(imglLoad);
        boundedAdd(iconlLabel, 10, 312, 90, 90);


        ImageIcon imgrLoad = loadImage("src/assets/gigachad2.jpg", 180, 180);
        iconrLabel = new JLabel(imgrLoad);
        boundedAdd(iconrLabel, 301, 312, 90, 90);

        orderBtn = new JButton("Pesanan");
        orderBtn.setBackground(color("#808080"));
        orderBtn.setForeground(color("#FFFFFF"));
        setFontFamily(orderBtn, "Iceberg");
        orderBtn.setFocusPainted(false);
        boundedAdd(orderBtn, 108, 172, 185, 50);

        historyBtn = new JButton("Riwayat");
        historyBtn.setBackground(color("#808080"));
        historyBtn.setForeground(color("#FFFFFF"));
        setFontFamily(historyBtn, "Iceberg");
        historyBtn.setFocusPainted(false);
        boundedAdd(historyBtn, 108, 282, 185, 50);

        profilBtn = new JButton("Pesanan");
        profilBtn.setBackground(color("#808080"));
        profilBtn.setForeground(color("#FFFFFF"));
        setFontFamily(profilBtn, "Iceberg");
        profilBtn.setFocusPainted(false);
        boundedAdd(profilBtn, 108, 392, 185, 50);

        logOutBtn = new JButton("Keluar");
        logOutBtn.setBackground(color("#808080"));
        logOutBtn.setForeground(color("#FFFFFF"));
        setFontFamily(logOutBtn, "Iceberg");
        logOutBtn.setFocusPainted(false);
        boundedAdd(logOutBtn, 108, 502, 185, 50);

    }

    @Override
    protected void event() {
        orderBtn.addActionListener((event)->{
            //new NewOrderGui().setVisible(true);
            dispose();
        });
        historyBtn.addActionListener((event)->{
            //new HistoryGui().setVisible(true);
            dispose();
        });
        profilBtn.addActionListener((event)->{
            //new SettingProfilGui().setVisible(true);
            dispose();
        });
        logOutBtn.addActionListener((event)->{
            new LoginGui().setVisible(true);
            dispose();
        });


    }
}
