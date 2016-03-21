package com.itrex.model;

import javax.persistence.*;

/**
 * Author: nikolai.pashkevich.
 */
@Entity
@Table(name = "event_by_day")
public class EventByDay {

    @Id
    @Column(name = "dy_id")
    private int id;

    @Column(name = "TimeBtwFstLstEventOfDay")
    private Double TimeBtwFstLstEventOfDay;

    @Column(name = "TSL_EventOfDay")
    private Double TSL_EventOfDay;

    @Column(name = "TSF_EventOfDay")
    private Double TSF_EventOfDay;

    @Column(name = "AvgDistBtwPlEventsInDay")
    private Double AvgDistBtwPlEventsInDay;

    @Column(name = "MaxDistBtwPlEventsInDay")
    private Double MaxDistBtwPlEventsInDay;

    @Column(name = "MinDistBtwPlEventsInDay")
    private Double MinDistBtwPlEventsInDay;

    @Column(name = "AvgDistBtwPl_X_EventsInDay")
    private Double AvgDistBtwPl_X_EventsInDay;

    @Column(name = "MaxDistBtwPl_X_EventsInDay")
    private Double MaxDistBtwPl_X_EventsInDay;

    @Column(name = "MinDistBtwPl_X_EventsInDay")
    private Double MinDistBtwPl_X_EventsInDay;

    @Column(name = "AvgDistBtwEventIncdntInDay")
    private Double AvgDistBtwEventIncdntInDay;

    @Column(name = "MaxDistBtwEventIncdntInDay")
    private Double MaxDistBtwEventIncdntInDay;

    @Column(name = "MinDistBtwEventIncdntInDay")
    private Double MinDistBtwEventIncdntInDay;

    @Column(name = "AvgTimeBtwEventIncdntInDay")
    private Double AvgTimeBtwEventIncdntInDay;

    @Column(name = "MaxTimeBtwEventIncdntInDay")
    private Double MaxTimeBtwEventIncdntInDay;

    @Column(name = "MinTimeBtwEventIncdntInDay")
    private Double MinTimeBtwEventIncdntInDay;

    @Column(name = "velocity_var")
    private Double velocity_var;

    @Column(name = "GMAX_VAR")
    private Double GMAX_VAR;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTimeBtwFstLstEventOfDay() {
        return TimeBtwFstLstEventOfDay;
    }

    public void setTimeBtwFstLstEventOfDay(double timeBtwFstLstEventOfDay) {
        TimeBtwFstLstEventOfDay = timeBtwFstLstEventOfDay;
    }

    public double getTSL_EventOfDay() {
        return TSL_EventOfDay;
    }

    public void setTSL_EventOfDay(double TSL_EventOfDay) {
        this.TSL_EventOfDay = TSL_EventOfDay;
    }

    public double getTSF_EventOfDay() {
        return TSF_EventOfDay;
    }

    public void setTSF_EventOfDay(double TSF_EventOfDay) {
        this.TSF_EventOfDay = TSF_EventOfDay;
    }

    public double getAvgDistBtwPlEventsInDay() {
        return AvgDistBtwPlEventsInDay;
    }

    public void setAvgDistBtwPlEventsInDay(double avgDistBtwPlEventsInDay) {
        AvgDistBtwPlEventsInDay = avgDistBtwPlEventsInDay;
    }

    public double getMaxDistBtwPlEventsInDay() {
        return MaxDistBtwPlEventsInDay;
    }

    public void setMaxDistBtwPlEventsInDay(double maxDistBtwPlEventsInDay) {
        MaxDistBtwPlEventsInDay = maxDistBtwPlEventsInDay;
    }

    public double getMinDistBtwPlEventsInDay() {
        return MinDistBtwPlEventsInDay;
    }

    public void setMinDistBtwPlEventsInDay(double minDistBtwPlEventsInDay) {
        MinDistBtwPlEventsInDay = minDistBtwPlEventsInDay;
    }

    public double getAvgDistBtwPl_X_EventsInDay() {
        return AvgDistBtwPl_X_EventsInDay;
    }

    public void setAvgDistBtwPl_X_EventsInDay(double avgDistBtwPl_X_EventsInDay) {
        AvgDistBtwPl_X_EventsInDay = avgDistBtwPl_X_EventsInDay;
    }

    public double getMaxDistBtwPl_X_EventsInDay() {
        return MaxDistBtwPl_X_EventsInDay;
    }

    public void setMaxDistBtwPl_X_EventsInDay(double maxDistBtwPl_X_EventsInDay) {
        MaxDistBtwPl_X_EventsInDay = maxDistBtwPl_X_EventsInDay;
    }

    public double getMinDistBtwPl_X_EventsInDay() {
        return MinDistBtwPl_X_EventsInDay;
    }

    public void setMinDistBtwPl_X_EventsInDay(double minDistBtwPl_X_EventsInDay) {
        MinDistBtwPl_X_EventsInDay = minDistBtwPl_X_EventsInDay;
    }

    public double getAvgDistBtwEventIncdntInDay() {
        return AvgDistBtwEventIncdntInDay;
    }

    public void setAvgDistBtwEventIncdntInDay(double avgDistBtwEventIncdntInDay) {
        AvgDistBtwEventIncdntInDay = avgDistBtwEventIncdntInDay;
    }

    public double getMaxDistBtwEventIncdntInDay() {
        return MaxDistBtwEventIncdntInDay;
    }

    public void setMaxDistBtwEventIncdntInDay(double maxDistBtwEventIncdntInDay) {
        MaxDistBtwEventIncdntInDay = maxDistBtwEventIncdntInDay;
    }

    public double getMinDistBtwEventIncdntInDay() {
        return MinDistBtwEventIncdntInDay;
    }

    public void setMinDistBtwEventIncdntInDay(double minDistBtwEventIncdntInDay) {
        MinDistBtwEventIncdntInDay = minDistBtwEventIncdntInDay;
    }

    public double getAvgTimeBtwEventIncdntInDay() {
        return AvgTimeBtwEventIncdntInDay;
    }

    public void setAvgTimeBtwEventIncdntInDay(double avgTimeBtwEventIncdntInDay) {
        AvgTimeBtwEventIncdntInDay = avgTimeBtwEventIncdntInDay;
    }

    public double getMaxTimeBtwEventIncdntInDay() {
        return MaxTimeBtwEventIncdntInDay;
    }

    public void setMaxTimeBtwEventIncdntInDay(double maxTimeBtwEventIncdntInDay) {
        MaxTimeBtwEventIncdntInDay = maxTimeBtwEventIncdntInDay;
    }

    public double getMinTimeBtwEventIncdntInDay() {
        return MinTimeBtwEventIncdntInDay;
    }

    public void setMinTimeBtwEventIncdntInDay(double minTimeBtwEventIncdntInDay) {
        MinTimeBtwEventIncdntInDay = minTimeBtwEventIncdntInDay;
    }

    public double getVelocity_var() {
        return velocity_var;
    }

    public void setVelocity_var(double velocity_var) {
        this.velocity_var = velocity_var;
    }

    public double getGMAX_VAR() {
        return GMAX_VAR;
    }

    public void setGMAX_VAR(double GMAX_VAR) {
        this.GMAX_VAR = GMAX_VAR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventByDay that = (EventByDay) o;

        if (id != that.id) return false;
        if (Double.compare(that.TimeBtwFstLstEventOfDay, TimeBtwFstLstEventOfDay) != 0) return false;
        if (Double.compare(that.TSL_EventOfDay, TSL_EventOfDay) != 0) return false;
        if (Double.compare(that.TSF_EventOfDay, TSF_EventOfDay) != 0) return false;
        if (Double.compare(that.AvgDistBtwPlEventsInDay, AvgDistBtwPlEventsInDay) != 0) return false;
        if (Double.compare(that.MaxDistBtwPlEventsInDay, MaxDistBtwPlEventsInDay) != 0) return false;
        if (Double.compare(that.MinDistBtwPlEventsInDay, MinDistBtwPlEventsInDay) != 0) return false;
        if (Double.compare(that.AvgDistBtwPl_X_EventsInDay, AvgDistBtwPl_X_EventsInDay) != 0) return false;
        if (Double.compare(that.MaxDistBtwPl_X_EventsInDay, MaxDistBtwPl_X_EventsInDay) != 0) return false;
        if (Double.compare(that.MinDistBtwPl_X_EventsInDay, MinDistBtwPl_X_EventsInDay) != 0) return false;
        if (Double.compare(that.AvgDistBtwEventIncdntInDay, AvgDistBtwEventIncdntInDay) != 0) return false;
        if (Double.compare(that.MaxDistBtwEventIncdntInDay, MaxDistBtwEventIncdntInDay) != 0) return false;
        if (Double.compare(that.MinDistBtwEventIncdntInDay, MinDistBtwEventIncdntInDay) != 0) return false;
        if (Double.compare(that.AvgTimeBtwEventIncdntInDay, AvgTimeBtwEventIncdntInDay) != 0) return false;
        if (Double.compare(that.MaxTimeBtwEventIncdntInDay, MaxTimeBtwEventIncdntInDay) != 0) return false;
        if (Double.compare(that.MinTimeBtwEventIncdntInDay, MinTimeBtwEventIncdntInDay) != 0) return false;
        if (Double.compare(that.velocity_var, velocity_var) != 0) return false;
        return Double.compare(that.GMAX_VAR, GMAX_VAR) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(TimeBtwFstLstEventOfDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(TSL_EventOfDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(TSF_EventOfDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(AvgDistBtwPlEventsInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MaxDistBtwPlEventsInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MinDistBtwPlEventsInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(AvgDistBtwPl_X_EventsInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MaxDistBtwPl_X_EventsInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MinDistBtwPl_X_EventsInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(AvgDistBtwEventIncdntInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MaxDistBtwEventIncdntInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MinDistBtwEventIncdntInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(AvgTimeBtwEventIncdntInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MaxTimeBtwEventIncdntInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(MinTimeBtwEventIncdntInDay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(velocity_var);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(GMAX_VAR);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "EventByDay{" +
                "dy_id=" + id +
                ", TimeBtwFstLstEventOfDay=" + TimeBtwFstLstEventOfDay +
                ", TSL_EventOfDay=" + TSL_EventOfDay +
                ", TSF_EventOfDay=" + TSF_EventOfDay +
                ", AvgDistBtwPlEventsInDay=" + AvgDistBtwPlEventsInDay +
                ", MaxDistBtwPlEventsInDay=" + MaxDistBtwPlEventsInDay +
                ", MinDistBtwPlEventsInDay=" + MinDistBtwPlEventsInDay +
                ", AvgDistBtwPl_X_EventsInDay=" + AvgDistBtwPl_X_EventsInDay +
                ", MaxDistBtwPl_X_EventsInDay=" + MaxDistBtwPl_X_EventsInDay +
                ", MinDistBtwPl_X_EventsInDay=" + MinDistBtwPl_X_EventsInDay +
                ", AvgDistBtwEventIncdntInDay=" + AvgDistBtwEventIncdntInDay +
                ", MaxDistBtwEventIncdntInDay=" + MaxDistBtwEventIncdntInDay +
                ", MinDistBtwEventIncdntInDay=" + MinDistBtwEventIncdntInDay +
                ", AvgTimeBtwEventIncdntInDay=" + AvgTimeBtwEventIncdntInDay +
                ", MaxTimeBtwEventIncdntInDay=" + MaxTimeBtwEventIncdntInDay +
                ", MinTimeBtwEventIncdntInDay=" + MinTimeBtwEventIncdntInDay +
                ", velocity_var=" + velocity_var +
                ", GMAX_VAR=" + GMAX_VAR +
                '}';
    }
}
