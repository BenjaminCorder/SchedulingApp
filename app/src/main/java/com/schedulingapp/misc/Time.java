package schedulingapp.misc;


/**
 * Class Time
 */
public class Time {

  //
  // Fields
  //

  private int hour;
  private int minute;
  
  //
  // Constructors
  //
  public Time () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of hour
   * @param newVar the new value of hour
   */
  public void setHour (int newVar) {
    hour = newVar;
  }

  /**
   * Get the value of hour
   * @return the value of hour
   */
  public int getHour () {
    return hour;
  }

  /**
   * Set the value of minute
   * @param newVar the new value of minute
   */
  public void setMinute (int newVar) {
    minute = newVar;
  }

  /**
   * Get the value of minute
   * @return the value of minute
   */
  public int getMinute () {
    return minute;
  }

  //
  // Other methods
  //

  /**
   * @param        hour
   * @param        minute
   */
  public void Time(int hour, int minute)
  {
  }


  /**
   * @param        rhs
   */
  public void Time(schedulingapp.misc.Time rhs)
  {
  }


  /**
   * @return       int
   */
  public int getHours()
  {
  }


  /**
   * @return       int
   */
  public int getMinutes()
  {
  }


  /**
   * @return       double
   * @param        time
   */
  public double calcDifference(schedulingapp.misc.Time time)
  {
  }


}
