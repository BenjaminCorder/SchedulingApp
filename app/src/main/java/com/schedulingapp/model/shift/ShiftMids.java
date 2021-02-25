package schedulingapp.model.shift;
import schedulingapp.misc.Date;
import schedulingapp.misc.Time;
import schedulingapp.misc.ShiftTime;


/**
 * Class ShiftMids
 */
public class ShiftMids extends Shift {

  //
  // Fields
  //

  static private schedulingapp.misc.ShiftTime shiftTime = MIDS;
  
  //
  // Constructors
  //
  public ShiftMids () { };
  
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
  public void ShiftMids(schedulingapp.misc.Date date)
  {
  }


  /**
   * @param        date
   * @param        startTime
   * @param        endTime
   */
  public void ShiftMids(schedulingapp.misc.Date date, schedulingapp.misc.Time startTime, schedulingapp.misc.Time endTime)
  {
  }


  /**
   * @param        rhs
   */
  public void ShiftMids(schedulingapp.model.shift.ShiftMids rhs)
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
