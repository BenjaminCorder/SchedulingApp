package schedulingapp.model.employee;
import schedulingapp.misc.Gender;
import schedulingapp.model.payperiod.PayPeriod;


/**
 * Class Employee
 */
abstract public class Employee {

  //
  // Fields
  //

  protected String name;
  protected schedulingapp.misc.Gender gender;
  protected schedulingapp.model.employee.Availability availability;
  protected schedulingapp.model.payperiod.PayPeriod workSchedule;
  
  //
  // Constructors
  //
  public Employee () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of gender
   * @param newVar the new value of gender
   */
  public void setGender (schedulingapp.misc.Gender newVar) {
    gender = newVar;
  }

  /**
   * Get the value of gender
   * @return the value of gender
   */
  public schedulingapp.misc.Gender getGender () {
    return gender;
  }

  /**
   * Set the value of availability
   * @param newVar the new value of availability
   */
  public void setAvailability (schedulingapp.model.employee.Availability newVar) {
    availability = newVar;
  }

  /**
   * Get the value of availability
   * @return the value of availability
   */
  public schedulingapp.model.employee.Availability getAvailability () {
    return availability;
  }

  /**
   * Set the value of workSchedule
   * @param newVar the new value of workSchedule
   */
  public void setWorkSchedule (schedulingapp.model.payperiod.PayPeriod newVar) {
    workSchedule = newVar;
  }

  /**
   * Get the value of workSchedule
   * @return the value of workSchedule
   */
  public schedulingapp.model.payperiod.PayPeriod getWorkSchedule () {
    return workSchedule;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String getName()
  {
  }


  /**
   * @return       schedulingapp.misc.Gender
   */
  public schedulingapp.misc.Gender getGender()
  {
  }


  /**
   * @return       schedulingapp.model.employee.Availability
   */
  public schedulingapp.model.employee.Availability getAvailability()
  {
  }


  /**
   * @return       schedulingapp.model.payperiod.PayPeriod
   */
  public schedulingapp.model.payperiod.PayPeriod getWorkSchedule()
  {
  }


  /**
   * @param        availability
   */
  public void setAvailability(schedulingapp.model.employee.Availability availability)
  {
  }


  /**
   * @param        new_parameter
   */
  public void setWorkSchedule(schedulingapp.model.payperiod.PayPeriod new_parameter)
  {
  }


  /**
   */
  abstract protected void validate();


}
