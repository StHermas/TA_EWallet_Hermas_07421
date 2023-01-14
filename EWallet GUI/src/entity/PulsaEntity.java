package entity;

public class PulsaEntity {
    private String noTelp;
    private String naProvider;
    private int nominal;

    public PulsaEntity(String noTelp, String naProvider, int nominal){
        this.naProvider=naProvider;
        this.nominal=nominal;
        this.noTelp=noTelp;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getNaProvider() {
        return naProvider;
    }

    public int getNominal() {
        return nominal;
    }

}
