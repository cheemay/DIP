/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

    public abstract class TipCalculator {

    private static final double MIN_BILL = 0.00;    
    private static final String BILL_ENTRY_ERR = "Error: ";           
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

    /**
     * @return the MIN_BILL
     */
    public static double getMIN_BILL() {
        return MIN_BILL;
    }

    /**
     * @return the BILL_ENTRY_ERR
     */
    public static String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    /**
     * @return the GOOD_RATE
     */
    public static double getGOOD_RATE() {
        return GOOD_RATE;
    }

    /**
     * @return the FAIR_RATE
     */
    public static double getFAIR_RATE() {
        return FAIR_RATE;
    }

    /**
     * @return the POOR_RATE
     */
    public static double getPOOR_RATE() {
        return POOR_RATE;
    }

    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
}
