package com.qfedu.dto;

import com.qfedu.entity.Appointment;
import com.qfedu.enums.AppointStateEnum;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 15:43
 */
public class AppointExecution {

    /**
     * 图书id
     */
    private Long bookId;
    /**
     * 秒杀预约结果状态
     */
    private int state;
    /**
     * 状态标识
     */
    private String stateInfo;
    /**
     * 预约成功对象
     */
    private Appointment appointment;

    public AppointExecution() {}

    /**
     * 预约失败的构造器
     * @param bookId
     * @param stateEnum
     */
    public AppointExecution(Long bookId, AppointStateEnum stateEnum) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    /**
     * 预约成功的构造器
     * @param bookId
     * @param stateEnum
     * @param appointment
     */
    public AppointExecution(Long bookId, AppointStateEnum stateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
