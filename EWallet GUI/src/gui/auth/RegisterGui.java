package gui.auth;
import javax.swing.*;
import java.awt.Font;
import controller.AuthController;
import gui.MainFrame;

public class RegisterGui extends MainFrame{
    private JLabel iconLabel, titleLabel, namaLabel, usernameLabel, passwdLabel, passwdrLabel;
    private JButton daftarBtn;
    private JTextField namaField, usernameField;
    private JPasswordField passwdField, passwdrField;
    private AuthController _authC = new AuthController();


    public RegisterGui() {
        super("Register EWallet", 400, 600);
    }

    @Override
    protected void component() {
        //Icon
        ImageIcon imgLoad = loadImage("src/assets/imagesregister.png", 180, 180);
        iconLabel = new JLabel(imgLoad);
        boundedAdd(iconLabel, 292, 464, 100, 106);
        //Icon
        titleLabel = new JLabel("Register");
        //Title
        setFontSize(titleLabel, 30);
        setFontStyle(titleLabel,Font.BOLD);
        setFontFamily(titleLabel, "Finger Paint");
        boundedAdd(titleLabel, 45, 30, 310, 40);
        //Label Nama
        namaLabel = new JLabel("Nama");
        setFontSize(namaLabel, 15);
        setFontStyle(namaLabel, Font.BOLD);
        setFontFamily(namaLabel, "Iceberg");
        boundedAdd(namaLabel, 56, 180, 172, 25);
        //Nama Field
        namaField = new JTextField();
        boundedAdd(namaField, 56, 205, 230, 40);
        //Username Label
        usernameLabel = new JLabel("Nama Pengguna");
        setFontSize(usernameLabel, 15);
        setFontStyle(usernameLabel, Font.BOLD);
        setFontFamily(usernameLabel, "Iceberg");
        boundedAdd(usernameLabel, 56, 250, 172, 25);
        //Username Field
        usernameField = new JTextField();
        boundedAdd(usernameField, 56, 276, 230, 40);
        //Password Label
        passwdLabel = new JLabel("Kata Sandi");
        setFontSize(passwdLabel, 15);
        setFontStyle(passwdLabel, Font.BOLD);
        setFontFamily(passwdLabel, "Iceberg");
        boundedAdd(passwdLabel, 56, 320, 172, 25);
        //Password Field
        passwdField = new JPasswordField();
        boundedAdd(passwdField, 56, 346, 230, 40);
        //Password Again Label
        passwdrLabel = new JLabel("Ulangi Kata Sandi");
        setFontSize(passwdrLabel, 15);
        setFontStyle(passwdrLabel, Font.BOLD);
        setFontFamily(passwdrLabel, "Iceberg");
        boundedAdd(passwdrLabel, 56, 390, 172, 25);
        //Password Again Field
        passwdrField= new JPasswordField();
        boundedAdd(passwdrField, 56, 416, 230, 40);
        //Button daftar
        daftarBtn = new JButton("Daftar");
        daftarBtn.setBackground(color("#808080"));
        daftarBtn.setForeground(color("#FFFFFF"));
        setFontFamily(daftarBtn, "Iceberg");
        daftarBtn.setFocusPainted(false);
        boundedAdd(daftarBtn, 157, 454, 95, 30);

    }

    @Override
    protected void event() {
        daftarBtn.addActionListener((event) -> {
            String username = usernameField.getText();
            String nama = namaField.getText();
            String password = String.valueOf(passwdField.getPassword());
            String passwordr = String.valueOf(passwdrField.getPassword());

                boolean statusRegister = _authC.registerUser(nama, username, password);
                if (statusRegister == true) {
                    // View Dashboard / View Home
                    new LoginGui().setVisible(true);
                    dispose();

                } else {
                    JOptionPane.showMessageDialog(null,
                            "Nama Pengguna Telah digunakan",
                            "Register Gagal",
                            JOptionPane.ERROR_MESSAGE);
                }


        });

    }
}
