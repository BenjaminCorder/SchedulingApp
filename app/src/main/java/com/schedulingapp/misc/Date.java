package schedulingapp.misc;


/**
 * Class Date
 */
public class Date {

  //
  // Fields
  //

  private int day;
  private int month;
  private int year;
  private schedulingapp.misc.DayOfWeek dayOfWeek;
  
  //
  // Constructors
  //
  public Date () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of day
   * @param newVar the new value of day
   */
  public void setDay (int newVar) {
    day = newVar;
  }

  /**
   * Get the value of day
   * @return the value of day
   */
  public int getDay () {
    return day;
  }

  /**
   * Set the value of month
   * @param newVar the new value of month
   */
  public void setMonth (int newVar) {
    month = newVar;
  }

  /**
   * Get the value of month
   * @return the value of month
   */
  public int getMonth () {
    return month;
  }

  /**
   * Set the value of year
   * @param newVar the new value of year
   */
  public void setYear (int newVar) {
    year = newVar;
  }

  /**
   * Get the value of year
   * @return the value of year
   */
  public int getYear () {
    return year;
  }

  /**
   * Set the value of dayOfWeek
   * @param newVar the new value of dayOfWeek
   */
  public void setDayOfWeek (schedulingapp.misc.DayOfWeek newVar) {
    dayOfWeek = newVar;
  }

  /**
   * Get the value of dayOfWeek
   * @return the value of dayOfWeek
   */
  public schedulingapp.misc.DayOfWeek getDayOfWeek () {
    return dayOfWeek;
  }

  //
  // Other methods
  //

  /**
   * @param        day
   * @param        month
   * @param        year
   */
  public void Date(int day, int month, int year)
  {
  }


  /**
   * @param        rhs
   */
  public void Date(schedulingapp.misc.Date rhs)
  {
  }


  /**
   * @return       int
   */
  public int getDay()
  {
  }


  /**
   * @return       int
   */
  public int getMonth()
  {
  }


  /**
   * @return       int
   */
  public int getYear()
  {
  }


  /**
   * @return       schedulingapp.misc.DayOfWeek
   */
  public schedulingapp.misc.DayOfWeek getDayOfWeek()
  {
  }


  /**
   * @return       schedulingapp.misc.DayOfWeek
   */
  private schedulingapp.misc.DayOfWeek calcDayOfWeek()
  {
  }


  /**
   */
  private void validateDate()
  {
  }


}
