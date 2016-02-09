package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator extends TipCalculator{


    private double bill;
   

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(getServiceQuality()) {
            case GOOD:
                tip = bill * getGOOD_RATE();
                break;
            case FAIR:
                tip = bill * getFAIR_RATE();
                break;
            case POOR:
                tip = bill * getPOOR_RATE();
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < getMIN_BILL()) {
            throw new IllegalArgumentException(getBILL_ENTRY_ERR());
        }
        bill = billAmt;
    }


}
