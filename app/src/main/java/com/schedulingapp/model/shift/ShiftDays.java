package schedulingapp.model.shift;
import schedulingapp.misc.Date;
import schedulingapp.misc.Time;
import schedulingapp.misc.ShiftTime;


/**
 * Class ShiftDays
 */
public class ShiftDays extends Shift {

  //
  // Fields
  //

  static private schedulingapp.misc.ShiftTime shiftTime = DAYS;
  
  //
  // Constructors
  //
  public ShiftDays () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Get the value of shiftTime
   * @return the value of shiftTime
   */
  public schedulingapp.misc.ShiftTime getShiftTime () {
    return shiftTime;
  }

  //
  // Other methods
  //

  /**
   * @param        date
   */
  public void ShiftDays(schedulingapp.misc.Date date)
  {
  }


  /**
   * @param        date
   * @param        startTime
   * @param        endTime
   */
  public void ShiftDays(schedulingapp.misc.Date date, schedulingapp.misc.Time startTime, schedulingapp.misc.Time endTime)
  {
  }


  /**
   * @param        rhs
   */
  public void ShiftDays(schedulingapp.model.shift.ShiftDays rhs)
  {
  }


  /**
   * @return       schedulingapp.misc.ShiftTime
   */
  public static schedulingapp.misc.ShiftTime getShiftTime()
  {
  }


  /**
   */
  private void validateShift()
  {
  }


}
