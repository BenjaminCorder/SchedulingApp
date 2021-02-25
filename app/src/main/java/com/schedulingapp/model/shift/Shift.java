package schedulingapp.model.shift;
import schedulingapp.misc.Date;
import schedulingapp.misc.Time;
import schedulingapp.misc.ShiftTime;


/**
 * Class Shift
 */
abstract public class Shift {

  //
  // Fields
  //

  protected schedulingapp.misc.Date date;
  protected schedulingapp.misc.Time startTime;
  protected schedulingapp.misc.Time endTime;
  
  //
  // Constructors
  //
  public Shift () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of date
   * @param newVar the new value of date
   */
  public void setDate (schedulingapp.misc.Date newVar) {
    date = newVar;
  }

  /**
   * Get the value of date
   * @return the value of date
   */
  public schedulingapp.misc.Date getDate () {
    return date;
  }

  /**
   * Set the value of startTime
   * @param newVar the new value of startTime
   */
  public void setStartTime (schedulingapp.misc.Time newVar) {
    startTime = newVar;
  }

  /**
   * Get the value of startTime
   * @return the value of startTime
   */
  public schedulingapp.misc.Time getStartTime () {
    return startTime;
  }

  /**
   * Set the value of endTime
   * @param newVar the new value of endTime
   */
  public void setEndTime (schedulingapp.misc.Time newVar) {
    endTime = newVar;
  }

  /**
   * Get the value of endTime
   * @return the value of endTime
   */
  public schedulingapp.misc.Time getEndTime () {
    return endTime;
  }

  //
  // Other methods
  //

  /**
   * @return       schedulingapp.misc.Date
   */
  public schedulingapp.misc.Date getDate()
  {
  }


  /**
   * @return       schedulingapp.misc.Time
   */
  public schedulingapp.misc.Time getStartTime()
  {
  }


  /**
   * @return       schedulingapp.misc.Time
   */
  public schedulingapp.misc.Time getEndTime()
  {
  }


  /**
   * @return       schedulingapp.misc.ShiftTime
   */
  abstract public static schedulingapp.misc.ShiftTime getShiftTime();


  /**
   * @param        startTime
   */
  public void setStartTime(schedulingapp.misc.Time startTime)
  {
  }


  /**
   * @param        endTime
   */
  public void setEndTime(schedulingapp.misc.Time endTime)
  {
  }


  /**
   * @return       double
   */
  public double getShiftDuration()
  {
  }


  /**
   */
  abstract protected void validateShift();


}
