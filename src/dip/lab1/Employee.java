package dip.lab1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author Yasir cheema
 */
public interface Employee {
    // You gotta question if these are appropriate for ALL employees?
    

    /**
     * Returns annual wages for hourly workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual wages for hourly workers using the formula
     * annualWages = hourlyRate * totalHrsForYear
     */
  //Not this is a interface class so only abstract method can used here.
    

    /**
     * Returns annual bonus for salaried workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual bonus or zero if none.
     */
     /* Employee is a high level class so as per the rule of the dependency
      * employee class not need to depend horly employeed or salaried employeed
        
    */

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualBonus -- think carefully about this
     */
    /* Every employee have anual bonus different so no need to keep this method
    here.
    */ 

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    
    /*In interface only abstract method can used. And this is high levl class
    because horly employee and salaried employee "is a" Employee relationshipt.
    we need to use yearly wages method here because every employees have yearly wages.
    */
    public abstract double getAnnualWages();
}
