package entity;

public class MerchantEntity {
    private String noTelp;
    private String naMerchant;
    private int nominal;


    public MerchantEntity(String noTelp, String naMerchant, int nominal) {
        this.noTelp=noTelp;
        this.naMerchant = naMerchant;
        this.nominal = nominal;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getNaMerchant() {
        return naMerchant;
    }

    public int getNominal() {
        return nominal;
    }


}
