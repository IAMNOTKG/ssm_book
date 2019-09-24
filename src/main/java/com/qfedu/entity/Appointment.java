package com.qfedu.entity;

import java.util.Date;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 10:04
 */
public class Appointment {

    /**
     * 图书id
     */
    private Long bookId;

    /**
     * 学号
     */
    private Long studentId;

    /**
     * 预约时间
     */
    private Date appointTime;

    /**
     * 多对一的复合属性
     * 图书实体
     */
    private Book book;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "bookId=" + bookId +
                ", studentId=" + studentId +
                ", appointTime=" + appointTime +
                ", book=" + book +
                '}';
    }
}
