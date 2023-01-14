package model;
import entity.UserEntity;
import java.util.ArrayList;

public class UserModel {
    private static ArrayList<UserEntity> user = new ArrayList<>();

    public static void registerUser(UserEntity data){
        user.add(data);
    }
    public static ArrayList<UserEntity> all(){
        return user;
    }

    public static UserEntity findUsername(String username){
        for (UserEntity userEntity : user){
            if(userEntity.getUsername().equals(username)){
                return userEntity;
            }
        }
        return null;
    }
    public static void updateProfil(UserEntity passUpdate){
        int index=indexData(passUpdate.getUsername());
        if(index!=-1){
            user.set(index, passUpdate);
        }
    }
    public static int indexData(String username){
        UserEntity userFind=findUsername(username);
        return user.indexOf(userFind);
    }



}
