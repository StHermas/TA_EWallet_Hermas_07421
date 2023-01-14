package gui.auth;
import javax.swing.*;
import java.awt.Font;
import controller.AuthController;
import gui.MainFrame;
import gui.menu.DashboardGui;


public class LoginGui extends MainFrame {
    private JLabel iconLabel;
    private JLabel titleLabel;

    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton masukBtn, daftarBtn;
    private AuthController _authC = new AuthController();

    public LoginGui() {
        super("Login EWallet", 400, 600);
    }

    @Override
    protected void component() {
        ImageIcon imgLoad = loadImage("src/assets/images.png", 180, 180);
        iconLabel = new JLabel(imgLoad);
        boundedAdd(iconLabel, 110, 130, 195, 195);

        titleLabel = new JLabel("Selamat Datang" +
                "Di Ewallet Kizuna");

        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel,Font.BOLD);
        setFontFamily(titleLabel, "Finger Paint");
        boundedAdd(titleLabel, 45, 30, 310, 40);

        usernameLabel = new JLabel("Nama User");
        setFontSize(usernameLabel, 12);
        setFontStyle(usernameLabel, Font.BOLD);
        setFontFamily(usernameLabel, "Iceberg");
        boundedAdd(usernameLabel, 124, 313, 100, 21);

        usernameField = new JTextField();
        boundedAdd(usernameField, 124, 334, 150, 40);

        passwordLabel = new JLabel("Kata Sandi");
        setFontSize(passwordLabel, 12);
        setFontStyle(passwordLabel, Font.BOLD);
        setFontFamily(passwordLabel, "Iceberg");
        boundedAdd(passwordLabel, 124, 375, 100, 21);

        passwordField = new JPasswordField();
        boundedAdd(passwordField, 124, 398, 150, 40);

        masukBtn = new JButton("Masuk");
        masukBtn.setBackground(color("#808080"));
        masukBtn.setForeground(color("#FFFFFF"));
        setFontFamily(masukBtn, "Iceberg");
        masukBtn.setFocusPainted(false);
        boundedAdd(masukBtn, 157, 454, 95, 30);

        daftarBtn = new JButton("Daftar Disini");
        masukBtn.setBackground(color("#808080"));
        masukBtn.setForeground(color("#FFFFFF"));
        setFontFamily(daftarBtn, "Iceberg");
        masukBtn.setFocusPainted(false);
        boundedAdd(daftarBtn, 158, 505, 85, 32);
    }


    @Override
    protected void event() {
        masukBtn.addActionListener((event) -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            String statusLogin = _authC.loginProccess(username, password);

            if (statusLogin !=null) {
                new DashboardGui().setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Username atau Password Salah",
                        "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }

        });
        daftarBtn.addActionListener((event)->{
            new RegisterGui().setVisible(true);
            dispose();
        });
    }

}
