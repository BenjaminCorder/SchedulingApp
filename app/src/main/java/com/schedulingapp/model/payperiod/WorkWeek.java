package com.schedulingapp.model.payperiod;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.DayOfWeek;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.model.shift.Shift;
import com.schedulingapp.model.shift.ShiftDays;
import com.schedulingapp.model.shift.ShiftMids;
import com.schedulingapp.model.shift.ShiftSwings;

/**
 * Class WorkWeek
 */
public class WorkWeek {

    //
    // Fields
    //

    private Date startDate;
    private ShiftDays sunDays;
    private ShiftSwings sunSwings;
    private ShiftMids sunMids;
    private ShiftDays monDays;
    private ShiftSwings monSwings;
    private ShiftMids monMids;
    private ShiftDays tueDays;
    private ShiftSwings tueSwings;
    private ShiftMids tueMids;
    private ShiftDays wedDays;
    private ShiftSwings wedSwings;
    private ShiftMids wedMids;
    private ShiftDays thuDays;
    private ShiftSwings thuSwings;
    private ShiftMids thuMids;
    private ShiftDays friDays;
    private ShiftSwings friSwings;
    private ShiftMids friMids;
    private ShiftDays satDays;
    private ShiftSwings satSwings;
    private ShiftMids satMids;

    //
    // Constructors
    //
    public WorkWeek() {
    }

    //
    // Methods
    //

    /**
     * @param weekNumber
     */
    public WorkWeek(int weekNumber) {
    }


    /**
     * @param rhs
     */
    public WorkWeek(WorkWeek rhs) {
    }

    //
    // Accessor methods
    //

    /**
     * Get the value of startDate
     *
     * @return the value of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Set the value of startDate
     *
     * @param newVar the new value of startDate
     */
    public void setStartDate(Date newVar) {
        startDate = newVar;
    }

    /**
     * Get the value of sunDays
     *
     * @return the value of sunDays
     */
    public ShiftDays getSunDays() {
        return sunDays;
    }

    /**
     * Set the value of sunDays
     *
     * @param newVar the new value of sunDays
     */
    public void setSunDays(ShiftDays newVar) {
        sunDays = newVar;
    }

    /**
     * Get the value of sunSwings
     *
     * @return the value of sunSwings
     */
    public ShiftSwings getSunSwings() {
        return sunSwings;
    }

    /**
     * Set the value of sunSwings
     *
     * @param newVar the new value of sunSwings
     */
    public void setSunSwings(ShiftSwings newVar) {
        sunSwings = newVar;
    }

    /**
     * Get the value of sunMids
     *
     * @return the value of sunMids
     */
    public ShiftMids getSunMids() {
        return sunMids;
    }

    /**
     * Set the value of sunMids
     *
     * @param newVar the new value of sunMids
     */
    public void setSunMids(ShiftMids newVar) {
        sunMids = newVar;
    }

    /**
     * Get the value of monDays
     *
     * @return the value of monDays
     */
    public ShiftDays getMonDays() {
        return monDays;
    }

    /**
     * Set the value of monDays
     *
     * @param newVar the new value of monDays
     */
    public void setMonDays(ShiftDays newVar) {
        monDays = newVar;
    }

    /**
     * Get the value of monSwings
     *
     * @return the value of monSwings
     */
    public ShiftSwings getMonSwings() {
        return monSwings;
    }

    /**
     * Set the value of monSwings
     *
     * @param newVar the new value of monSwings
     */
    public void setMonSwings(ShiftSwings newVar) {
        monSwings = newVar;
    }

    /**
     * Get the value of monMids
     *
     * @return the value of monMids
     */
    public ShiftMids getMonMids() {
        return monMids;
    }

    /**
     * Set the value of monMids
     *
     * @param newVar the new value of monMids
     */
    public void setMonMids(ShiftMids newVar) {
        monMids = newVar;
    }

    /**
     * Get the value of tueDays
     *
     * @return the value of tueDays
     */
    public ShiftDays getTueDays() {
        return tueDays;
    }

    /**
     * Set the value of tueDays
     *
     * @param newVar the new value of tueDays
     */
    public void setTueDays(ShiftDays newVar) {
        tueDays = newVar;
    }

    /**
     * Get the value of tueSwings
     *
     * @return the value of tueSwings
     */
    public ShiftSwings getTueSwings() {
        return tueSwings;
    }

    /**
     * Set the value of tueSwings
     *
     * @param newVar the new value of tueSwings
     */
    public void setTueSwings(ShiftSwings newVar) {
        tueSwings = newVar;
    }

    /**
     * Get the value of tueMids
     *
     * @return the value of tueMids
     */
    public ShiftMids getTueMids() {
        return tueMids;
    }

    /**
     * Set the value of tueMids
     *
     * @param newVar the new value of tueMids
     */
    public void setTueMids(ShiftMids newVar) {
        tueMids = newVar;
    }

    /**
     * Get the value of wedDays
     *
     * @return the value of wedDays
     */
    public ShiftDays getWedDays() {
        return wedDays;
    }

    /**
     * Set the value of wedDays
     *
     * @param newVar the new value of wedDays
     */
    public void setWedDays(ShiftDays newVar) {
        wedDays = newVar;
    }

    /**
     * Get the value of wedSwings
     *
     * @return the value of wedSwings
     */
    public ShiftSwings getWedSwings() {
        return wedSwings;
    }

    /**
     * Set the value of wedSwings
     *
     * @param newVar the new value of wedSwings
     */
    public void setWedSwings(ShiftSwings newVar) {
        wedSwings = newVar;
    }

    /**
     * Get the value of wedMids
     *
     * @return the value of wedMids
     */
    public ShiftMids getWedMids() {
        return wedMids;
    }

    /**
     * Set the value of wedMids
     *
     * @param newVar the new value of wedMids
     */
    public void setWedMids(ShiftMids newVar) {
        wedMids = newVar;
    }

    /**
     * Get the value of thuDays
     *
     * @return the value of thuDays
     */
    public ShiftDays getThuDays() {
        return thuDays;
    }

    /**
     * Set the value of thuDays
     *
     * @param newVar the new value of thuDays
     */
    public void setThuDays(ShiftDays newVar) {
        thuDays = newVar;
    }

    /**
     * Get the value of thuSwings
     *
     * @return the value of thuSwings
     */
    public ShiftSwings getThuSwings() {
        return thuSwings;
    }

    /**
     * Set the value of thuSwings
     *
     * @param newVar the new value of thuSwings
     */
    public void setThuSwings(ShiftSwings newVar) {
        thuSwings = newVar;
    }

    /**
     * Get the value of thuMids
     *
     * @return the value of thuMids
     */
    public ShiftMids getThuMids() {
        return thuMids;
    }

    /**
     * Set the value of thuMids
     *
     * @param newVar the new value of thuMids
     */
    public void setThuMids(ShiftMids newVar) {
        thuMids = newVar;
    }

    /**
     * Get the value of friDays
     *
     * @return the value of friDays
     */
    public ShiftDays getFriDays() {
        return friDays;
    }

    /**
     * Set the value of friDays
     *
     * @param newVar the new value of friDays
     */
    public void setFriDays(ShiftDays newVar) {
        friDays = newVar;
    }

    /**
     * Get the value of friSwings
     *
     * @return the value of friSwings
     */
    public ShiftSwings getFriSwings() {
        return friSwings;
    }

    /**
     * Set the value of friSwings
     *
     * @param newVar the new value of friSwings
     */
    public void setFriSwings(ShiftSwings newVar) {
        friSwings = newVar;
    }

    /**
     * Get the value of friMids
     *
     * @return the value of friMids
     */
    public ShiftMids getFriMids() {
        return friMids;
    }

    /**
     * Set the value of friMids
     *
     * @param newVar the new value of friMids
     */
    public void setFriMids(ShiftMids newVar) {
        friMids = newVar;
    }

    /**
     * Get the value of satDays
     *
     * @return the value of satDays
     */
    public ShiftDays getSatDays() {
        return satDays;
    }

    /**
     * Set the value of satDays
     *
     * @param newVar the new value of satDays
     */
    public void setSatDays(ShiftDays newVar) {
        satDays = newVar;
    }

    /**
     * Get the value of satSwings
     *
     * @return the value of satSwings
     */
    public ShiftSwings getSatSwings() {
        return satSwings;
    }

    /**
     * Set the value of satSwings
     *
     * @param newVar the new value of satSwings
     */
    public void setSatSwings(ShiftSwings newVar) {
        satSwings = newVar;
    }

    /**
     * Get the value of satMids
     *
     * @return the value of satMids
     */
    public ShiftMids getSatMids() {
        return satMids;
    }

    /**
     * Set the value of satMids
     *
     * @param newVar the new value of satMids
     */
    public void setSatMids(ShiftMids newVar) {
        satMids = newVar;
    }

    //
    // Other methods
    //

    /**
     * @param dayOfWeek
     * @param shiftTime
     * @return Shift
     */
    public Shift getShift(DayOfWeek dayOfWeek, ShiftTime shiftTime) {
        return null;
    }

    /**
     * @param shift
     */
    public void setShift(Shift shift) {
    }

    /**
     * @return double
     */
    public double calcTotalHours() {
        return 0;
    }


}
