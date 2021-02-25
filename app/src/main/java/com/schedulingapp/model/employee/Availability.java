package schedulingapp.model.employee;
import schedulingapp.misc.Date;
import List<5cschedule.model.payperiod.Date>.List_5cschedule_model_payperiod_Date_;
import Map<5cschedule.model.payperiod.Date, Boolean>.Map_5cschedule_model_payperiod_Date_Boolean_;


/**
 * Class Availability
 */
public class Availability {

  //
  // Fields
  //

  private schedulingapp.misc.Date startDate;
  private List<Boolean> availabilities;
  
  //
  // Constructors
  //
  public Availability () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of startDate
   * @param newVar the new value of startDate
   */
  public void setStartDate (schedulingapp.misc.Date newVar) {
    startDate = newVar;
  }

  /**
   * Get the value of startDate
   * @return the value of startDate
   */
  public schedulingapp.misc.Date getStartDate () {
    return startDate;
  }

  /**
   * Set the value of availabilities
   * @param newVar the new value of availabilities
   */
  public void setAvailabilities (List<Boolean> newVar) {
    availabilities = newVar;
  }

  /**
   * Get the value of availabilities
   * @return the value of availabilities
   */
  public List<Boolean> getAvailabilities () {
    return availabilities;
  }

  //
  // Other methods
  //

  /**
   * @param        startDate
   */
  public void Availability(schedulingapp.misc.Date startDate)
  {
  }


  /**
   * @param        rhs
   */
  public void Availability(schedulingapp.model.employee.Availability rhs)
  {
  }


  /**
   * @return       schedulingapp.misc.Date
   */
  public schedulingapp.misc.Date getStartDate()
  {
  }


  /**
   * @return       List<Boolean>
   */
  public List<Boolean> getAvailabilities()
  {
  }


  /**
   * @param        availabilities
   */
  public void setAvailabilities(List<Boolean> availabilities)
  {
  }


  /**
   * @return       boolean
   * @param        date
   */
  public boolean checkAvailability(schedulingapp.misc.Date date)
  {
  }


  /**
   * @return       List<Boolean>
   * @param        dates
   */
  public List<Boolean> bulkCheckAvailability(List<5cschedule.model.payperiod.Date> dates)
  {
  }


  /**
   * @param        date
   * @param        isAvailable
   */
  public void updateAvailability(schedulingapp.misc.Date date, boolean isAvailable)
  {
  }


  /**
   * @param        dates
   */
  public void bulkUpdateAvailability(Map<5cschedule.model.payperiod.Date, Boolean> dates)
  {
  }


  /**
   * @return       int
   * @param        date
   */
  private int dateToIndex(schedulingapp.misc.Date date)
  {
  }


}
