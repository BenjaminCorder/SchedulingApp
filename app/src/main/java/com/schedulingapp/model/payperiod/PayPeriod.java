package schedulingapp.model.payperiod;
import schedulingapp.misc.Date;
import schedulingapp.model.shift.Shift;
import schedulingapp.misc.DayOfWeek;
import schedulingapp.misc.ShiftTime;


/**
 * Class PayPeriod
 */
public class PayPeriod {

  //
  // Fields
  //

  private schedulingapp.misc.Date startDate;
  private schedulingapp.misc.Date endDate;
  private schedulingapp.model.payperiod.WorkWeek weekFirst;
  private schedulingapp.model.payperiod.WorkWeek weekSecond;
  
  //
  // Constructors
  //
  public PayPeriod () { };
  
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
   * Set the value of endDate
   * @param newVar the new value of endDate
   */
  public void setEndDate (schedulingapp.misc.Date newVar) {
    endDate = newVar;
  }

  /**
   * Get the value of endDate
   * @return the value of endDate
   */
  public schedulingapp.misc.Date getEndDate () {
    return endDate;
  }

  /**
   * Set the value of weekFirst
   * @param newVar the new value of weekFirst
   */
  public void setWeekFirst (schedulingapp.model.payperiod.WorkWeek newVar) {
    weekFirst = newVar;
  }

  /**
   * Get the value of weekFirst
   * @return the value of weekFirst
   */
  public schedulingapp.model.payperiod.WorkWeek getWeekFirst () {
    return weekFirst;
  }

  /**
   * Set the value of weekSecond
   * @param newVar the new value of weekSecond
   */
  public void setWeekSecond (schedulingapp.model.payperiod.WorkWeek newVar) {
    weekSecond = newVar;
  }

  /**
   * Get the value of weekSecond
   * @return the value of weekSecond
   */
  public schedulingapp.model.payperiod.WorkWeek getWeekSecond () {
    return weekSecond;
  }

  //
  // Other methods
  //

  /**
   * @param        startDate
   */
  public void PayPeriod(schedulingapp.misc.Date startDate)
  {
  }


  /**
   * @param        rhs
   */
  public void PayPeriod(schedulingapp.model.payperiod.PayPeriod rhs)
  {
  }


  /**
   * @return       schedulingapp.misc.Date
   */
  public schedulingapp.misc.Date getStartDate()
  {
  }


  /**
   * @return       schedulingapp.misc.Date
   */
  public schedulingapp.misc.Date getEndDate()
  {
  }


  /**
   * @return       schedulingapp.model.shift.Shift
   * @param        dayOfWeek
   * @param        shiftTime
   * @param        weekNumber
   */
  public schedulingapp.model.shift.Shift getShift(schedulingapp.misc.DayOfWeek dayOfWeek, schedulingapp.misc.ShiftTime shiftTime, int weekNumber)
  {
  }


  /**
   * @param        shift
   * @param        weekNumber
   */
  public void setShift(schedulingapp.model.shift.Shift shift, int weekNumber)
  {
  }


  /**
   * @return       double
   */
  public double getTotalHours()
  {
  }


  /**
   */
  private void calcEndDate()
  {
  }


  /**
   */
  private void validatePayPeriod()
  {
  }


}
