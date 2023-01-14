package controller;
import model.UserModel;
import entity.UserEntity;
import view.AuthPage.LoginView;
import view.AuthPage.RegisterView;

public class AuthController {
    public void toViewL(){
        LoginView login=new LoginView();
        login.formLogin();
    }
    public void toViewR(){
        RegisterView regis=new RegisterView();
        regis.formRegister();
    }
    public boolean registerUser(String nama, String username, String password){
        if (UserModel.findUsername(username)==null){
            UserEntity userBaru = new UserEntity(nama, username, password);
            UserModel.registerUser(userBaru);
            return true;
        }
        return true;
    }
    public String loginProccess(String username, String password){
        UserEntity userEntity = UserModel.findUsername(username);
        if(userEntity!=null){
            if(userEntity.getPassword().equals(password)){
                return userEntity.getName();
            }
        }
        return null;
    }
    public boolean updateProfil(String username, String nama, String password){
        UserEntity profilBaru=new UserEntity(nama, username, password);
        UserModel.updateProfil(profilBaru);
        return true;
    }
    public UserEntity findUser(String username){
        return UserModel.findUsername(username);
    }
}
