package schedulingapp.model.employee;
import schedulingapp.misc.Gender;
import schedulingapp.model.payperiod.PayPeriod;


/**
 * Class FullTimeEmployee
 */
public class FullTimeEmployee extends Employee {

  //
  // Fields
  //

  private schedulingapp.model.payperiod.PayPeriod schedule;
  
  //
  // Constructors
  //
  public FullTimeEmployee () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of schedule
   * @param newVar the new value of schedule
   */
  public void setSchedule (schedulingapp.model.payperiod.PayPeriod newVar) {
    schedule = newVar;
  }

  /**
   * Get the value of schedule
   * @return the value of schedule
   */
  public schedulingapp.model.payperiod.PayPeriod getSchedule () {
    return schedule;
  }

  //
  // Other methods
  //

  /**
   * @param        name
   * @param        gender
   */
  public void FullTimeEmployee(String name, schedulingapp.misc.Gender gender)
  {
  }


  /**
   * @param        rhs
   */
  public void FullTimeEmployee(schedulingapp.model.employee.FullTimeEmployee rhs)
  {
  }


  /**
   * @return       schedulingapp.model.payperiod.PayPeriod
   */
  public schedulingapp.model.payperiod.PayPeriod getSchedule()
  {
  }


  /**
   * @param        schedule
   */
  public void setSchedule(schedulingapp.model.payperiod.PayPeriod schedule)
  {
  }


  /**
   */
  private void validate()
  {
  }


}
