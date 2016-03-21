package com.itrex.model.eventinfo;

import com.itrex.model.NotEqualsString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by ITRex-User on 3/21/2016.
 */
@MappedSuperclass
public class AbstractEventInfo implements NotEqualsString<AbstractEventInfo> {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "block_group")
    private String block_group;

    @Column(name = "datetime_var")
    private Date datetime_var;

    @Column(name = "event_type")
    private String event_type;

    @Column(name = "shift")
    private String shift;

    @Column(name = "WeekEnd_v1", columnDefinition = "binary")
    private boolean WeekEnd_v1;

    @Column(name = "WeekEnd_v2", columnDefinition = "binary")
    private boolean WeekEnd_v2;

    @Column(name = "holiday_indicator_1", columnDefinition = "binary")
    private boolean holiday_indicator_1;

    @Column(name = "holiday_indicator_2", columnDefinition = "binary")
    private boolean holiday_indicator_2;

    @Column(name = "DailyEventCountType_ALL")
    private int DailyEventCountType_ALL;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBlock_group() {
        return block_group;
    }

    public void setBlock_group(String block_group) {
        this.block_group = block_group;
    }

    public Date getDatetime_var() {
        return datetime_var;
    }

    public void setDatetime_var(Date datetime_var) {
        this.datetime_var = datetime_var;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public boolean isWeekEnd_v1() {
        return WeekEnd_v1;
    }

    public void setWeekEnd_v1(boolean weekEnd_v1) {
        WeekEnd_v1 = weekEnd_v1;
    }

    public boolean isWeekEnd_v2() {
        return WeekEnd_v2;
    }

    public void setWeekEnd_v2(boolean weekEnd_v2) {
        WeekEnd_v2 = weekEnd_v2;
    }

    public boolean isHoliday_indicator_1() {
        return holiday_indicator_1;
    }

    public void setHoliday_indicator_1(boolean holiday_indicator_1) {
        this.holiday_indicator_1 = holiday_indicator_1;
    }

    public boolean isHoliday_indicator_2() {
        return holiday_indicator_2;
    }

    public void setHoliday_indicator_2(boolean holiday_indicator_2) {
        this.holiday_indicator_2 = holiday_indicator_2;
    }

    public int getDailyEventCountType_ALL() {
        return DailyEventCountType_ALL;
    }

    public void setDailyEventCountType_ALL(int dailyEventCountType_ALL) {
        DailyEventCountType_ALL = dailyEventCountType_ALL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractEventInfo that = (AbstractEventInfo) o;

        if (WeekEnd_v1 != that.WeekEnd_v1) return false;
        if (WeekEnd_v2 != that.WeekEnd_v2) return false;
        if (holiday_indicator_1 != that.holiday_indicator_1) return false;
        if (holiday_indicator_2 != that.holiday_indicator_2) return false;
        if (DailyEventCountType_ALL != that.DailyEventCountType_ALL) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (block_group != null ? !block_group.equals(that.block_group) : that.block_group != null) return false;
        if (datetime_var != null ? !datetime_var.equals(that.datetime_var) : that.datetime_var != null) return false;
        if (event_type != null ? !event_type.equals(that.event_type) : that.event_type != null) return false;
        return shift != null ? shift.equals(that.shift) : that.shift == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (block_group != null ? block_group.hashCode() : 0);
        result = 31 * result + (datetime_var != null ? datetime_var.hashCode() : 0);
        result = 31 * result + (event_type != null ? event_type.hashCode() : 0);
        result = 31 * result + (shift != null ? shift.hashCode() : 0);
        result = 31 * result + (WeekEnd_v1 ? 1 : 0);
        result = 31 * result + (WeekEnd_v2 ? 1 : 0);
        result = 31 * result + (holiday_indicator_1 ? 1 : 0);
        result = 31 * result + (holiday_indicator_2 ? 1 : 0);
        result = 31 * result + DailyEventCountType_ALL;
        return result;
    }

    @Override
    public String toString() {
        return "EventInfo{" +
                "id='" + id + '\'' +
                ", block_group='" + block_group + '\'' +
                ", datetime_var=" + datetime_var +
                ", event_type='" + event_type + '\'' +
                ", shift='" + shift + '\'' +
                ", WeekEnd_v1=" + WeekEnd_v1 +
                ", WeekEnd_v2=" + WeekEnd_v2 +
                ", holiday_indicator_1=" + holiday_indicator_1 +
                ", holiday_indicator_2=" + holiday_indicator_2 +
                ", DailyEventCountType_ALL=" + DailyEventCountType_ALL +
                '}';
    }

    @Override
    public String getNotEqualsString(AbstractEventInfo that) {
        StringBuilder ret = new StringBuilder();
        if (WeekEnd_v1 != that.WeekEnd_v1){
            ret.append("WeekEnd_v1 ").append(WeekEnd_v1).append(" != ").append(that.WeekEnd_v1).append(" ");
        }
        if (WeekEnd_v2 != that.WeekEnd_v2){
            ret.append("WeekEnd_v2 ").append(WeekEnd_v2).append(" != ").append(that.WeekEnd_v2).append(" ");
        }
        if (holiday_indicator_1 != that.holiday_indicator_1){
            ret.append("holiday_indicator_1 ").append(holiday_indicator_1).append(" != ").append(that.holiday_indicator_1).append(" ");
        }
        if (holiday_indicator_2 != that.holiday_indicator_2){
            ret.append("holiday_indicator_2 ").append(holiday_indicator_2).append(" != ").append(that.holiday_indicator_2).append(" ");
        }
        if (DailyEventCountType_ALL != that.DailyEventCountType_ALL){
            ret.append("DailyEventCountType_ALL ").append(DailyEventCountType_ALL).append(" != ").append(that.DailyEventCountType_ALL).append(" ");
        }
        if (block_group != null ? !block_group.equals(that.block_group) : that.block_group != null){
            ret.append("block_group ").append(block_group).append(" != ").append(that.block_group).append(" ");
        }
        if (datetime_var != null ? !datetime_var.equals(that.datetime_var) : that.datetime_var != null){
            ret.append("datetime_var ").append(datetime_var).append(" != ").append(that.datetime_var).append(" ");
        }
        if (event_type != null ? !event_type.equals(that.event_type) : that.event_type != null){
            ret.append("event_type ").append(event_type).append(" != ").append(that.event_type).append(" ");
        }
        if(shift != null ? !shift.equals(that.shift) : that.shift != null){
            ret.append("shift ").append(shift).append(" != ").append(that.shift).append(" ");
        }
        return ret.toString();
    }
}
