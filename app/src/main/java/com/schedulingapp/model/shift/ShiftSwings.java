package schedulingapp.model.shift;
import schedulingapp.misc.Date;
import schedulingapp.misc.Time;
import schedulingapp.misc.ShiftTime;


/**
 * Class ShiftSwings
 */
public class ShiftSwings extends Shift {

  //
  // Fields
  //

  static private schedulingapp.misc.ShiftTime shiftTime = SWINGS;
  
  //
  // Constructors
  //
  public ShiftSwings () { };
  
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
  public void ShiftSwings(schedulingapp.misc.Date date)
  {
  }


  /**
   * @param        date
   * @param        startTime
   * @param        endTime
   */
  public void ShiftSwings(schedulingapp.misc.Date date, schedulingapp.misc.Time startTime, schedulingapp.misc.Time endTime)
  {
  }


  /**
   * @param        rhs
   */
  public void ShiftSwings(schedulingapp.model.shift.ShiftSwings rhs)
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
  public void validateShift()
  {
  }


}
