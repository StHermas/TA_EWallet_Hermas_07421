package controller;
import entity.MerchantEntity;
import entity.PulsaEntity;
import model.OrderModel;

public class OrderController {
    public boolean tambahOrderP(String naProvide, String noTelp, int nominal){
        PulsaEntity pulsa=new PulsaEntity(noTelp, naProvide, nominal);
        OrderModel.orderPulsa(pulsa);
        return true;
    }
    public boolean tambahorderM(String naMerchant, String noTelp, int nominal){
        MerchantEntity merchant=new MerchantEntity(noTelp, naMerchant, nominal);
        OrderModel.orderMerchant(merchant);
        return true;
    }
    public void removeOrder(String noTelp){
        OrderModel.removeOrder(noTelp);
    }
    public void resetOrder(){
        OrderModel.resetOrder();
    }
    public PulsaEntity findOrderP(String noTelp){
        return OrderModel.findNoTelp(noTelp);
    }
    public MerchantEntity findOrderM(String noTelp){
        return OrderModel.findnoTelp(noTelp);
    }


}
