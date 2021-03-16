package com.schedulingapp.model.payperiod;

import com.schedulingapp.misc.Date;
import com.schedulingapp.misc.ShiftTime;
import com.schedulingapp.model.shift.Shift;
import com.schedulingapp.model.shift.ShiftDays;
import com.schedulingapp.model.shift.ShiftMids;
import com.schedulingapp.model.shift.ShiftSwings;

/**
 * A class representing a work week.
 *
 * @author Ben Corder, Kylan Rice
 * @version 1.0
 * @since 1.0
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

    /**
     * Non-Default Constructor.
     *
     * @param startDate date the work week begins on.
     */
    public WorkWeek() {

    }


    /**
     * Copy Constructor.
     *
     * @param rhs object to make a copy of.
     */
    public WorkWeek(Date a, ShiftDays b, ShiftSwings c, ShiftMids d, ShiftDays e, ShiftSwings f, ShiftMids g, ShiftDays h, ShiftMids i, ShiftSwings j, ShiftDays k, ShiftMids l,
    ShiftSwings m, ShiftDays n, ShiftMids o, ShiftSwings p, ShiftDays q, ShiftMids r, ShiftSwings s){
        startDate = a;
        sunDays = b;
        sunSwings = c;
        sunMids = d;
        monDays = e;
        monSwings = f;
        monMids = d;
        tueDays = e;
        tueSwings = f;
        tueMids = g;
        wedDays = h;
        wedSwings = j;
        wedMids = i;
        thuDays = k;
        thuSwings = m;
        thuMids = l;
        friDays = n;
        friSwings = p;
        friMids = o;
        satDays = q;
        satSwings = s;
        satMids = r;
    }

    //
    // Methods
    //

    /**
     * Returns the shift that corresponds to the input date and time.
     *
     * @param date date of the shift to return.
     * @param shiftTime time of the shift to return.
     * @return Shift that corresponds to the input date and time.
     */
    public Shift getShift(Date date, ShiftTime shiftTime) {
        Shift x = null;
        return x;
    }

    /**
     * General setter for all shifts.
     *
     * @param shift new shift to replace the shift it corresponds to.
     */
    public void setShift(Shift shift) {

    }

    /**
     * Calculate the total hours worked over the work week.
     *
     * @return double number of hours worked over the work week.
     */
    public double calcTotalHours() {
        return 0;
    }

    //
    // Accessor methods
    //

    /**
     * Get the value of startDate.
     *
     * @return the value of startDate.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Get the value of sunDays.
     *
     * @return the value of sunDays.
     */
    public ShiftDays getSunDays() {
        return sunDays;
    }

    /**
     * Set the value of sunDays.
     *
     * @param sunDays the new value of sunDays.
     */
    public void setSunDays(ShiftDays sunDays) {
        this.sunDays = sunDays;
    }

    /**
     * Get the value of sunSwings.
     *
     * @return the value of sunSwings.
     */
    public ShiftSwings getSunSwings() {
        return sunSwings;
    }

    /**
     * Set the value of sunSwings.
     *
     * @param sunSwings the new value of sunSwings.
     */
    public void setSunSwings(ShiftSwings sunSwings) {
        this.sunSwings = sunSwings;
    }

    /**
     * Get the value of sunMids.
     *
     * @return the value of sunMids.
     */
    public ShiftMids getSunMids() {
        return sunMids;
    }

    /**
     * Set the value of sunMids.
     *
     * @param sunMids the new value of sunMids.
     */
    public void setSunMids(ShiftMids sunMids) {
        this.sunMids = sunMids;
    }

    /**
     * Get the value of monDays.
     *
     * @return the value of monDays.
     */
    public ShiftDays getMonDays() {
        return monDays;
    }

    /**
     * Set the value of monDays.
     *
     * @param monDays the new value of monDays.
     */
    public void setMonDays(ShiftDays monDays) {
        this.monDays = monDays;
    }

    /**
     * Get the value of monSwings.
     *
     * @return the value of monSwings.
     */
    public ShiftSwings getMonSwings() {
        return monSwings;
    }

    /**
     * Set the value of monSwings.
     *
     * @param monSwings the new value of monSwings.
     */
    public void setMonSwings(ShiftSwings monSwings) {
        this.monSwings = monSwings;
    }

    /**
     * Get the value of monMids.
     *
     * @return the value of monMids.
     */
    public ShiftMids getMonMids() {
        return monMids;
    }

    /**
     * Set the value of monMids.
     *
     * @param monMids the new value of monMids.
     */
    public void setMonMids(ShiftMids monMids) {
        this.monMids = monMids;
    }

    /**
     * Get the value of tueDays.
     *
     * @return the value of tueDays.
     */
    public ShiftDays getTueDays() {
        return tueDays;
    }

    /**
     * Set the value of tueDays.
     *
     * @param tueDays the new value of tueDays.
     */
    public void setTueDays(ShiftDays tueDays) {
        this.tueDays = tueDays;
    }

    /**
     * Get the value of tueSwings.
     *
     * @return the value of tueSwings.
     */
    public ShiftSwings getTueSwings() {
        return tueSwings;
    }

    /**
     * Set the value of tueSwings.
     *
     * @param tueSwings the new value of tueSwings.
     */
    public void setTueSwings(ShiftSwings tueSwings) {
        this.tueSwings = tueSwings;
    }

    /**
     * Get the value of tueMids.
     *
     * @return the value of tueMids.
     */
    public ShiftMids getTueMids() {
        return tueMids;
    }

    /**
     * Set the value of tueMids.
     *
     * @param tueMids the new value of tueMids.
     */
    public void setTueMids(ShiftMids tueMids) {
        this.tueMids = tueMids;
    }

    /**
     * Get the value of wedDays.
     *
     * @return the value of wedDays.
     */
    public ShiftDays getWedDays() {
        return wedDays;
    }

    /**
     * Set the value of wedDays.
     *
     * @param wedDays the new value of wedDays.
     */
    public void setWedDays(ShiftDays wedDays) {
        this.wedDays = wedDays;
    }

    /**
     * Get the value of wedSwings.
     *
     * @return the value of wedSwings.
     */
    public ShiftSwings getWedSwings() {
        return wedSwings;
    }

    /**
     * Set the value of wedSwings.
     *
     * @param wedSwings the new value of wedSwings.
     */
    public void setWedSwings(ShiftSwings wedSwings) {
        this.wedSwings = wedSwings;
    }

    /**
     * Get the value of wedMids.
     *
     * @return the value of wedMids.
     */
    public ShiftMids getWedMids() {
        return wedMids;
    }

    /**
     * Set the value of wedMids.
     *
     * @param wedMids the new value of wedMids.
     */
    public void setWedMids(ShiftMids wedMids) {
        this.wedMids = wedMids;
    }

    /**
     * Get the value of thuDays.
     *
     * @return the value of thuDays.
     */
    public ShiftDays getThuDays() {
        return thuDays;
    }

    /**
     * Set the value of thuDays.
     *
     * @param thuDays the new value of thuDays.
     */
    public void setThuDays(ShiftDays thuDays) {
        this.thuDays = thuDays;
    }

    /**
     * Get the value of thuSwings.
     *
     * @return the value of thuSwings.
     */
    public ShiftSwings getThuSwings() {
        return thuSwings;
    }

    /**
     * Set the value of thuSwings.
     *
     * @param thuSwings the new value of thuSwings.
     */
    public void setThuSwings(ShiftSwings thuSwings) {
        this.thuSwings = thuSwings;
    }

    /**
     * Get the value of thuMids.
     *
     * @return the value of thuMids.
     */
    public ShiftMids getThuMids() {
        return thuMids;
    }

    /**
     * Set the value of thuMids.
     *
     * @param thuMids the new value of thuMids.
     */
    public void setThuMids(ShiftMids thuMids) {
        this.thuMids = thuMids;
    }

    /**
     * Get the value of friDays.
     *
     * @return the value of friDays.
     */
    public ShiftDays getFriDays() {
        return friDays;
    }

    /**
     * Set the value of friDays.
     *
     * @param friDays the new value of friDays.
     */
    public void setFriDays(ShiftDays friDays) {
        this.friDays = friDays;
    }

    /**
     * Get the value of friSwings.
     *
     * @return the value of friSwings.
     */
    public ShiftSwings getFriSwings() {
        return friSwings;
    }

    /**
     * Set the value of friSwings.
     *
     * @param friSwings the new value of friSwings.
     */
    public void setFriSwings(ShiftSwings friSwings) {
        this.friSwings = friSwings;
    }

    /**
     * Get the value of friMids.
     *
     * @return the value of friMids.
     */
    public ShiftMids getFriMids() {
        return friMids;
    }

    /**
     * Set the value of friMids.
     *
     * @param friMids the new value of friMids.
     */
    public void setFriMids(ShiftMids friMids) {
        this.friMids = friMids;
    }

    /**
     * Get the value of satDays.
     *
     * @return the value of satDays.
     */
    public ShiftDays getSatDays() {
        return satDays;
    }

    /**
     * Set the value of satDays.
     *
     * @param satDays the new value of satDays.
     */
    public void setSatDays(ShiftDays satDays) {
        this.satDays = satDays;
    }

    /**
     * Get the value of satSwings.
     *
     * @return the value of satSwings.
     */
    public ShiftSwings getSatSwings() {
        return satSwings;
    }

    /**
     * Set the value of satSwings.
     *
     * @param satSwings the new value of satSwings.
     */
    public void setSatSwings(ShiftSwings satSwings) {
        this.satSwings = satSwings;
    }

    /**
     * Get the value of satMids.
     *
     * @return the value of satMids.
     */
    public ShiftMids getSatMids() {
        return satMids;
    }

    /**
     * Set the value of satMids.
     *
     * @param satMids the new value of satMids.
     */
    public void setSatMids(ShiftMids satMids) {
        this.satMids = satMids;
    }

    //
    // Other methods
    //

}
