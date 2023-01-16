package gui.profil;

import gui.MainFrame;
import gui.menu.DashboardGui;
import view.Profil.SettingProfilView;
import controller.AuthController;
import entity.UserEntity;

import javax.swing.*;

public class SettingProfilGui extends MainFrame {
    private AuthController authC=new AuthController();
    private JButton gantiPwdBtn, gantiNamaBtn, kembaliBtn;
    private String username, password;

    private UserEntity findUser;


    public SettingProfilGui(){
        super("Setting", 400,600);
    }

    @Override
    protected void component() {
        gantiPwdBtn = new JButton("Ganti Password");
        gantiPwdBtn.setBackground(color("#808080"));
        gantiPwdBtn.setForeground(color("#FFFFFF"));
        setFontFamily(gantiPwdBtn, "Iceberg");
        gantiPwdBtn.setFocusPainted(false);
        boundedAdd(gantiPwdBtn, 90, 81, 220, 70);

        kembaliBtn = new JButton("Kembali");
        kembaliBtn.setBackground(color("#808080"));
        kembaliBtn.setForeground(color("#FFFFFF"));
        setFontFamily(kembaliBtn, "Iceberg");
        kembaliBtn.setFocusPainted(false);
        boundedAdd(kembaliBtn, 140, 313, 120, 30);


    }

    @Override
    protected void event() {
        gantiPwdBtn.addActionListener((event)->{
            do{
            username = JOptionPane.showInputDialog("Masukkan Username");
            findUser=authC.findUser(username);
            if(findUser!=null){
                password = JOptionPane.showInputDialog("Masukkan Password baru");
                updatePassword(findUser, password);
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "Username Salah",
                        "Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        } while(findUser==null);});
        kembaliBtn.addActionListener((event)->{
            new DashboardGui().setVisible(true);
            dispose();
        });
    }

    private void updatePassword(UserEntity findUser, String updatePassword){
        boolean status = authC.updateProfil(findUser.getUsername(), findUser.getName(), updatePassword);
    }
}
