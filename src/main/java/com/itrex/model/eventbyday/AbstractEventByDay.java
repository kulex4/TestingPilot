package com.itrex.model.eventbyday;

import com.itrex.model.eventinfo.AbstractEventInfo;
import com.itrex.model.NotEqualsString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Author: nikolai.pashkevich.
 */
@MappedSuperclass
public class AbstractEventByDay implements NotEqualsString<AbstractEventByDay> {

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

        AbstractEventByDay that = (AbstractEventByDay) o;

        if (id != that.id) return false;
        if (TimeBtwFstLstEventOfDay != null ? !TimeBtwFstLstEventOfDay.equals(that.TimeBtwFstLstEventOfDay) : that.TimeBtwFstLstEventOfDay != null)
            return false;
        if (TSL_EventOfDay != null ? !TSL_EventOfDay.equals(that.TSL_EventOfDay) : that.TSL_EventOfDay != null)
            return false;
        if (TSF_EventOfDay != null ? !TSF_EventOfDay.equals(that.TSF_EventOfDay) : that.TSF_EventOfDay != null)
            return false;
        if (AvgDistBtwPlEventsInDay != null ? !AvgDistBtwPlEventsInDay.equals(that.AvgDistBtwPlEventsInDay) : that.AvgDistBtwPlEventsInDay != null)
            return false;
        if (MaxDistBtwPlEventsInDay != null ? !MaxDistBtwPlEventsInDay.equals(that.MaxDistBtwPlEventsInDay) : that.MaxDistBtwPlEventsInDay != null)
            return false;
        if (MinDistBtwPlEventsInDay != null ? !MinDistBtwPlEventsInDay.equals(that.MinDistBtwPlEventsInDay) : that.MinDistBtwPlEventsInDay != null)
            return false;
        if (AvgDistBtwPl_X_EventsInDay != null ? !AvgDistBtwPl_X_EventsInDay.equals(that.AvgDistBtwPl_X_EventsInDay) : that.AvgDistBtwPl_X_EventsInDay != null)
            return false;
        if (MaxDistBtwPl_X_EventsInDay != null ? !MaxDistBtwPl_X_EventsInDay.equals(that.MaxDistBtwPl_X_EventsInDay) : that.MaxDistBtwPl_X_EventsInDay != null)
            return false;
        if (MinDistBtwPl_X_EventsInDay != null ? !MinDistBtwPl_X_EventsInDay.equals(that.MinDistBtwPl_X_EventsInDay) : that.MinDistBtwPl_X_EventsInDay != null)
            return false;
        if (AvgDistBtwEventIncdntInDay != null ? !AvgDistBtwEventIncdntInDay.equals(that.AvgDistBtwEventIncdntInDay) : that.AvgDistBtwEventIncdntInDay != null)
            return false;
        if (MaxDistBtwEventIncdntInDay != null ? !MaxDistBtwEventIncdntInDay.equals(that.MaxDistBtwEventIncdntInDay) : that.MaxDistBtwEventIncdntInDay != null)
            return false;
        if (MinDistBtwEventIncdntInDay != null ? !MinDistBtwEventIncdntInDay.equals(that.MinDistBtwEventIncdntInDay) : that.MinDistBtwEventIncdntInDay != null)
            return false;
        if (AvgTimeBtwEventIncdntInDay != null ? !AvgTimeBtwEventIncdntInDay.equals(that.AvgTimeBtwEventIncdntInDay) : that.AvgTimeBtwEventIncdntInDay != null)
            return false;
        if (MaxTimeBtwEventIncdntInDay != null ? !MaxTimeBtwEventIncdntInDay.equals(that.MaxTimeBtwEventIncdntInDay) : that.MaxTimeBtwEventIncdntInDay != null)
            return false;
        if (MinTimeBtwEventIncdntInDay != null ? !MinTimeBtwEventIncdntInDay.equals(that.MinTimeBtwEventIncdntInDay) : that.MinTimeBtwEventIncdntInDay != null)
            return false;
        if (velocity_var != null ? !velocity_var.equals(that.velocity_var) : that.velocity_var != null) return false;
        return GMAX_VAR != null ? GMAX_VAR.equals(that.GMAX_VAR) : that.GMAX_VAR == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (TimeBtwFstLstEventOfDay != null ? TimeBtwFstLstEventOfDay.hashCode() : 0);
        result = 31 * result + (TSL_EventOfDay != null ? TSL_EventOfDay.hashCode() : 0);
        result = 31 * result + (TSF_EventOfDay != null ? TSF_EventOfDay.hashCode() : 0);
        result = 31 * result + (AvgDistBtwPlEventsInDay != null ? AvgDistBtwPlEventsInDay.hashCode() : 0);
        result = 31 * result + (MaxDistBtwPlEventsInDay != null ? MaxDistBtwPlEventsInDay.hashCode() : 0);
        result = 31 * result + (MinDistBtwPlEventsInDay != null ? MinDistBtwPlEventsInDay.hashCode() : 0);
        result = 31 * result + (AvgDistBtwPl_X_EventsInDay != null ? AvgDistBtwPl_X_EventsInDay.hashCode() : 0);
        result = 31 * result + (MaxDistBtwPl_X_EventsInDay != null ? MaxDistBtwPl_X_EventsInDay.hashCode() : 0);
        result = 31 * result + (MinDistBtwPl_X_EventsInDay != null ? MinDistBtwPl_X_EventsInDay.hashCode() : 0);
        result = 31 * result + (AvgDistBtwEventIncdntInDay != null ? AvgDistBtwEventIncdntInDay.hashCode() : 0);
        result = 31 * result + (MaxDistBtwEventIncdntInDay != null ? MaxDistBtwEventIncdntInDay.hashCode() : 0);
        result = 31 * result + (MinDistBtwEventIncdntInDay != null ? MinDistBtwEventIncdntInDay.hashCode() : 0);
        result = 31 * result + (AvgTimeBtwEventIncdntInDay != null ? AvgTimeBtwEventIncdntInDay.hashCode() : 0);
        result = 31 * result + (MaxTimeBtwEventIncdntInDay != null ? MaxTimeBtwEventIncdntInDay.hashCode() : 0);
        result = 31 * result + (MinTimeBtwEventIncdntInDay != null ? MinTimeBtwEventIncdntInDay.hashCode() : 0);
        result = 31 * result + (velocity_var != null ? velocity_var.hashCode() : 0);
        result = 31 * result + (GMAX_VAR != null ? GMAX_VAR.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AbstractEventByDay{" +
                "id=" + id +
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

    @Override
    public String getNotEqualsString(AbstractEventByDay that) {
        StringBuilder ret = new StringBuilder();
        if (TimeBtwFstLstEventOfDay != null ? !TimeBtwFstLstEventOfDay.equals(that.TimeBtwFstLstEventOfDay) : that.TimeBtwFstLstEventOfDay != null) {
            ret.append("TimeBtwFstLstEventOfDay ").append(TimeBtwFstLstEventOfDay).append(" != ").append(that.TimeBtwFstLstEventOfDay).append(" ");
        }
        if (TSL_EventOfDay != null ? !TSL_EventOfDay.equals(that.TSL_EventOfDay) : that.TSL_EventOfDay != null) {
            ret.append("TSL_EventOfDay ").append(TSL_EventOfDay).append(" != ").append(that.TSL_EventOfDay).append(" ");
        }
        if (TSF_EventOfDay != null ? !TSF_EventOfDay.equals(that.TSF_EventOfDay) : that.TSF_EventOfDay != null) {
            ret.append("TSF_EventOfDay ").append(TSF_EventOfDay).append(" != ").append(that.TSF_EventOfDay).append(" ");
        }
        if (AvgDistBtwPlEventsInDay != null ? !AvgDistBtwPlEventsInDay.equals(that.AvgDistBtwPlEventsInDay) : that.AvgDistBtwPlEventsInDay != null) {
            ret.append("AvgDistBtwPlEventsInDay ").append(AvgDistBtwPlEventsInDay).append(" != ").append(that.AvgDistBtwPlEventsInDay).append(" ");
        }
        if (MaxDistBtwPlEventsInDay != null ? !MaxDistBtwPlEventsInDay.equals(that.MaxDistBtwPlEventsInDay) : that.MaxDistBtwPlEventsInDay != null) {
            ret.append("MaxDistBtwPlEventsInDay ").append(MaxDistBtwPlEventsInDay).append(" != ").append(that.MaxDistBtwPlEventsInDay).append(" ");
        }
        if (MinDistBtwPlEventsInDay != null ? !MinDistBtwPlEventsInDay.equals(that.MinDistBtwPlEventsInDay) : that.MinDistBtwPlEventsInDay != null) {
            ret.append("MinDistBtwPlEventsInDay ").append(MinDistBtwPlEventsInDay).append(" != ").append(that.MinDistBtwPlEventsInDay).append(" ");
        }
        if (AvgDistBtwPl_X_EventsInDay != null ? !AvgDistBtwPl_X_EventsInDay.equals(that.AvgDistBtwPl_X_EventsInDay) : that.AvgDistBtwPl_X_EventsInDay != null) {
            ret.append("AvgDistBtwPl_X_EventsInDay ").append(AvgDistBtwPl_X_EventsInDay).append(" != ").append(that.AvgDistBtwPl_X_EventsInDay).append(" ");
        }
        if (MaxDistBtwPl_X_EventsInDay != null ? !MaxDistBtwPl_X_EventsInDay.equals(that.MaxDistBtwPl_X_EventsInDay) : that.MaxDistBtwPl_X_EventsInDay != null) {
            ret.append("MaxDistBtwPl_X_EventsInDay ").append(MaxDistBtwPl_X_EventsInDay).append(" != ").append(that.MaxDistBtwPl_X_EventsInDay).append(" ");
        }
        if (MinDistBtwPl_X_EventsInDay != null ? !MinDistBtwPl_X_EventsInDay.equals(that.MinDistBtwPl_X_EventsInDay) : that.MinDistBtwPl_X_EventsInDay != null) {
            ret.append("MinDistBtwPl_X_EventsInDay ").append(MinDistBtwPl_X_EventsInDay).append(" != ").append(that.MinDistBtwPl_X_EventsInDay).append(" ");
        }
        if (AvgDistBtwEventIncdntInDay != null ? !AvgDistBtwEventIncdntInDay.equals(that.AvgDistBtwEventIncdntInDay) : that.AvgDistBtwEventIncdntInDay != null) {
            ret.append("AvgDistBtwEventIncdntInDay ").append(AvgDistBtwEventIncdntInDay).append(" != ").append(that.AvgDistBtwEventIncdntInDay).append(" ");
        }
        if (MaxDistBtwEventIncdntInDay != null ? !MaxDistBtwEventIncdntInDay.equals(that.MaxDistBtwEventIncdntInDay) : that.MaxDistBtwEventIncdntInDay != null) {
            ret.append("MaxDistBtwEventIncdntInDay ").append(MaxDistBtwEventIncdntInDay).append(" != ").append(that.MaxDistBtwEventIncdntInDay).append(" ");
        }
        if (MinDistBtwEventIncdntInDay != null ? !MinDistBtwEventIncdntInDay.equals(that.MinDistBtwEventIncdntInDay) : that.MinDistBtwEventIncdntInDay != null) {
            ret.append("MinDistBtwEventIncdntInDay ").append(MinDistBtwEventIncdntInDay).append(" != ").append(that.MinDistBtwEventIncdntInDay).append(" ");
        }
        if (AvgTimeBtwEventIncdntInDay != null ? !AvgTimeBtwEventIncdntInDay.equals(that.AvgTimeBtwEventIncdntInDay) : that.AvgTimeBtwEventIncdntInDay != null) {
            ret.append("AvgTimeBtwEventIncdntInDay ").append(AvgTimeBtwEventIncdntInDay).append(" != ").append(that.AvgTimeBtwEventIncdntInDay).append(" ");
        }
        if (MaxTimeBtwEventIncdntInDay != null ? !MaxTimeBtwEventIncdntInDay.equals(that.MaxTimeBtwEventIncdntInDay) : that.MaxTimeBtwEventIncdntInDay != null) {
            ret.append("MaxTimeBtwEventIncdntInDay ").append(MaxTimeBtwEventIncdntInDay).append(" != ").append(that.MaxTimeBtwEventIncdntInDay).append(" ");
        }
        if (MinTimeBtwEventIncdntInDay != null ? !MinTimeBtwEventIncdntInDay.equals(that.MinTimeBtwEventIncdntInDay) : that.MinTimeBtwEventIncdntInDay != null) {
            ret.append("MinTimeBtwEventIncdntInDay ").append(MinTimeBtwEventIncdntInDay).append(" != ").append(that.MinTimeBtwEventIncdntInDay).append(" ");
        }
        if (velocity_var != null ? !velocity_var.equals(that.velocity_var) : that.velocity_var != null) {
            ret.append("velocity_var ").append(velocity_var).append(" != ").append(that.velocity_var).append(" ");
        }
        if (GMAX_VAR != null ? !GMAX_VAR.equals(that.GMAX_VAR) : that.GMAX_VAR != null) {
            ret.append("GMAX_VAR ").append(GMAX_VAR).append(" != ").append(that.GMAX_VAR).append(" ");
        }
        return ret.toString();
    }
}
