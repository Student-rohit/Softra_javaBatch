package interface_static;

public class FundCollected {

    String donor_name;
    int donor_contri;
    static int totFundColl;   

    public FundCollected() {
        super();
    }

    public FundCollected(String name, int contri) {
        this.donor_name = name;          
        this.donor_contri = contri;      
        totFundColl += contri;           
    }

    static int getFundCollected() {
        return totFundColl;
    }
}
