package schedulingapp.model.payperiod;
import schedulingapp.model.shift.Shift;
import schedulingapp.misc.DayOfWeek;
import schedulingapp.misc.ShiftTime;
import schedulingapp.misc.Date;
import schedulingapp.model.shift.ShiftDays;
import schedulingapp.model.shift.ShiftSwings;
import schedulingapp.model.shift.ShiftMids;


/**
 * Class WorkWeek
 */
public class WorkWeek {

  //
  // Fields
  //

  private schedulingapp.misc.Date startDate;
  private schedulingapp.model.shift.ShiftDays sunDays;
  private schedulingapp.model.shift.ShiftSwings sunSwings;
  private schedulingapp.model.shift.ShiftMids sunMids;
  private schedulingapp.model.shift.ShiftDays monDays;
  private schedulingapp.model.shift.ShiftSwings monSwings;
  private schedulingapp.model.shift.ShiftMids monMids;
  private schedulingapp.model.shift.ShiftDays tueDays;
  private schedulingapp.model.shift.ShiftSwings tueSwings;
  private schedulingapp.model.shift.ShiftMids tueMids;
  private schedulingapp.model.shift.ShiftDays wedDays;
  private schedulingapp.model.shift.ShiftSwings wedSwings;
  private schedulingapp.model.shift.ShiftMids wedMids;
  private schedulingapp.model.shift.ShiftDays thuDays;
  private schedulingapp.model.shift.ShiftSwings thuSwings;
  private schedulingapp.model.shift.ShiftMids thuMids;
  private schedulingapp.model.shift.ShiftDays friDays;
  private schedulingapp.model.shift.ShiftSwings friSwings;
  private schedulingapp.model.shift.ShiftMids friMids;
  private schedulingapp.model.shift.ShiftDays satDays;
  private schedulingapp.model.shift.ShiftSwings satSwings;
  private schedulingapp.model.shift.ShiftMids satMids;
  
  //
  // Constructors
  //
  public WorkWeek () { };
  
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
   * Set the value of sunDays
   * @param newVar the new value of sunDays
   */
  public void setSunDays (schedulingapp.model.shift.ShiftDays newVar) {
    sunDays = newVar;
  }

  /**
   * Get the value of sunDays
   * @return the value of sunDays
   */
  public schedulingapp.model.shift.ShiftDays getSunDays () {
    return sunDays;
  }

  /**
   * Set the value of sunSwings
   * @param newVar the new value of sunSwings
   */
  public void setSunSwings (schedulingapp.model.shift.ShiftSwings newVar) {
    sunSwings = newVar;
  }

  /**
   * Get the value of sunSwings
   * @return the value of sunSwings
   */
  public schedulingapp.model.shift.ShiftSwings getSunSwings () {
    return sunSwings;
  }

  /**
   * Set the value of sunMids
   * @param newVar the new value of sunMids
   */
  public void setSunMids (schedulingapp.model.shift.ShiftMids newVar) {
    sunMids = newVar;
  }

  /**
   * Get the value of sunMids
   * @return the value of sunMids
   */
  public schedulingapp.model.shift.ShiftMids getSunMids () {
    return sunMids;
  }

  /**
   * Set the value of monDays
   * @param newVar the new value of monDays
   */
  public void setMonDays (schedulingapp.model.shift.ShiftDays newVar) {
    monDays = newVar;
  }

  /**
   * Get the value of monDays
   * @return the value of monDays
   */
  public schedulingapp.model.shift.ShiftDays getMonDays () {
    return monDays;
  }

  /**
   * Set the value of monSwings
   * @param newVar the new value of monSwings
   */
  public void setMonSwings (schedulingapp.model.shift.ShiftSwings newVar) {
    monSwings = newVar;
  }

  /**
   * Get the value of monSwings
   * @return the value of monSwings
   */
  public schedulingapp.model.shift.ShiftSwings getMonSwings () {
    return monSwings;
  }

  /**
   * Set the value of monMids
   * @param newVar the new value of monMids
   */
  public void setMonMids (schedulingapp.model.shift.ShiftMids newVar) {
    monMids = newVar;
  }

  /**
   * Get the value of monMids
   * @return the value of monMids
   */
  public schedulingapp.model.shift.ShiftMids getMonMids () {
    return monMids;
  }

  /**
   * Set the value of tueDays
   * @param newVar the new value of tueDays
   */
  public void setTueDays (schedulingapp.model.shift.ShiftDays newVar) {
    tueDays = newVar;
  }

  /**
   * Get the value of tueDays
   * @return the value of tueDays
   */
  public schedulingapp.model.shift.ShiftDays getTueDays () {
    return tueDays;
  }

  /**
   * Set the value of tueSwings
   * @param newVar the new value of tueSwings
   */
  public void setTueSwings (schedulingapp.model.shift.ShiftSwings newVar) {
    tueSwings = newVar;
  }

  /**
   * Get the value of tueSwings
   * @return the value of tueSwings
   */
  public schedulingapp.model.shift.ShiftSwings getTueSwings () {
    return tueSwings;
  }

  /**
   * Set the value of tueMids
   * @param newVar the new value of tueMids
   */
  public void setTueMids (schedulingapp.model.shift.ShiftMids newVar) {
    tueMids = newVar;
  }

  /**
   * Get the value of tueMids
   * @return the value of tueMids
   */
  public schedulingapp.model.shift.ShiftMids getTueMids () {
    return tueMids;
  }

  /**
   * Set the value of wedDays
   * @param newVar the new value of wedDays
   */
  public void setWedDays (schedulingapp.model.shift.ShiftDays newVar) {
    wedDays = newVar;
  }

  /**
   * Get the value of wedDays
   * @return the value of wedDays
   */
  public schedulingapp.model.shift.ShiftDays getWedDays () {
    return wedDays;
  }

  /**
   * Set the value of wedSwings
   * @param newVar the new value of wedSwings
   */
  public void setWedSwings (schedulingapp.model.shift.ShiftSwings newVar) {
    wedSwings = newVar;
  }

  /**
   * Get the value of wedSwings
   * @return the value of wedSwings
   */
  public schedulingapp.model.shift.ShiftSwings getWedSwings () {
    return wedSwings;
  }

  /**
   * Set the value of wedMids
   * @param newVar the new value of wedMids
   */
  public void setWedMids (schedulingapp.model.shift.ShiftMids newVar) {
    wedMids = newVar;
  }

  /**
   * Get the value of wedMids
   * @return the value of wedMids
   */
  public schedulingapp.model.shift.ShiftMids getWedMids () {
    return wedMids;
  }

  /**
   * Set the value of thuDays
   * @param newVar the new value of thuDays
   */
  public void setThuDays (schedulingapp.model.shift.ShiftDays newVar) {
    thuDays = newVar;
  }

  /**
   * Get the value of thuDays
   * @return the value of thuDays
   */
  public schedulingapp.model.shift.ShiftDays getThuDays () {
    return thuDays;
  }

  /**
   * Set the value of thuSwings
   * @param newVar the new value of thuSwings
   */
  public void setThuSwings (schedulingapp.model.shift.ShiftSwings newVar) {
    thuSwings = newVar;
  }

  /**
   * Get the value of thuSwings
   * @return the value of thuSwings
   */
  public schedulingapp.model.shift.ShiftSwings getThuSwings () {
    return thuSwings;
  }

  /**
   * Set the value of thuMids
   * @param newVar the new value of thuMids
   */
  public void setThuMids (schedulingapp.model.shift.ShiftMids newVar) {
    thuMids = newVar;
  }

  /**
   * Get the value of thuMids
   * @return the value of thuMids
   */
  public schedulingapp.model.shift.ShiftMids getThuMids () {
    return thuMids;
  }

  /**
   * Set the value of friDays
   * @param newVar the new value of friDays
   */
  public void setFriDays (schedulingapp.model.shift.ShiftDays newVar) {
    friDays = newVar;
  }

  /**
   * Get the value of friDays
   * @return the value of friDays
   */
  public schedulingapp.model.shift.ShiftDays getFriDays () {
    return friDays;
  }

  /**
   * Set the value of friSwings
   * @param newVar the new value of friSwings
   */
  public void setFriSwings (schedulingapp.model.shift.ShiftSwings newVar) {
    friSwings = newVar;
  }

  /**
   * Get the value of friSwings
   * @return the value of friSwings
   */
  public schedulingapp.model.shift.ShiftSwings getFriSwings () {
    return friSwings;
  }

  /**
   * Set the value of friMids
   * @param newVar the new value of friMids
   */
  public void setFriMids (schedulingapp.model.shift.ShiftMids newVar) {
    friMids = newVar;
  }

  /**
   * Get the value of friMids
   * @return the value of friMids
   */
  public schedulingapp.model.shift.ShiftMids getFriMids () {
    return friMids;
  }

  /**
   * Set the value of satDays
   * @param newVar the new value of satDays
   */
  public void setSatDays (schedulingapp.model.shift.ShiftDays newVar) {
    satDays = newVar;
  }

  /**
   * Get the value of satDays
   * @return the value of satDays
   */
  public schedulingapp.model.shift.ShiftDays getSatDays () {
    return satDays;
  }

  /**
   * Set the value of satSwings
   * @param newVar the new value of satSwings
   */
  public void setSatSwings (schedulingapp.model.shift.ShiftSwings newVar) {
    satSwings = newVar;
  }

  /**
   * Get the value of satSwings
   * @return the value of satSwings
   */
  public schedulingapp.model.shift.ShiftSwings getSatSwings () {
    return satSwings;
  }

  /**
   * Set the value of satMids
   * @param newVar the new value of satMids
   */
  public void setSatMids (schedulingapp.model.shift.ShiftMids newVar) {
    satMids = newVar;
  }

  /**
   * Get the value of satMids
   * @return the value of satMids
   */
  public schedulingapp.model.shift.ShiftMids getSatMids () {
    return satMids;
  }

  //
  // Other methods
  //

  /**
   * @param        weekNumber
   */
  public void WorkWeek(int weekNumber)
  {
  }


  /**
   * @param        rhs
   */
  public void WorkWeek(schedulingapp.model.payperiod.WorkWeek rhs)
  {
  }


  /**
   * @return       schedulingapp.model.shift.Shift
   * @param        dayOfWeek
   * @param        shiftTime
   */
  public schedulingapp.model.shift.Shift getShift(schedulingapp.misc.DayOfWeek dayOfWeek, schedulingapp.misc.ShiftTime shiftTime)
  {
  }


  /**
   * @param        new_parameter
   */
  public void setShift(schedulingapp.model.shift.Shift new_parameter)
  {
  }


  /**
   * @return       int
   */
  public int calcWeekNumber()
  {
  }


  /**
   * @return       double
   */
  public double calcTotalHours()
  {
  }


}
