package model;
import entity.MerchantEntity;
import entity.PulsaEntity;

import java.util.ArrayList;

public class OrderModel {
    private static ArrayList<MerchantEntity> merchant=new ArrayList<>();
    private static ArrayList<PulsaEntity> pulsa =new ArrayList<>();

    public static void orderPulsa(PulsaEntity data){
        pulsa.add(data);
    }
    public static void orderMerchant(MerchantEntity data){
        merchant.add(data);
    }
    public static ArrayList<MerchantEntity> allm(){
        return merchant;
    }
    public static ArrayList<PulsaEntity> allp(){
        return pulsa;
    }
    public static void resetOrder(){
        merchant.clear();
        pulsa.clear();
    }
    public static PulsaEntity findNoTelp(String notelp){
        for(PulsaEntity data:pulsa){
            if(data.getNoTelp().equals(notelp)){
                return data;
            }
        }
        return null;
    }
    public static MerchantEntity findnoTelp(String notelp){
        for(MerchantEntity data:merchant){
            if(data.getNoTelp().equals(notelp)){
                return data;
            }
        }
        return null;
    }

    public static void removeOrder(String noTelp){
        int index1=indexDataPulsa(noTelp);
        int index2=indexDataMerchant(noTelp);
        if (index1 != -1){
            pulsa.remove(index1);
        }
        if(index2!=-1){
            merchant.remove(index2);
        }
    }
    public static int indexDataPulsa(String noTelp){
       PulsaEntity data=findNoTelp(noTelp);
       return pulsa.indexOf(data);
    }
    public static int indexDataMerchant(String noTelp){
        MerchantEntity data=findnoTelp(noTelp);
        return merchant.indexOf(data);
    }

}
