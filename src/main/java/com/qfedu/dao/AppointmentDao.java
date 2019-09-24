package com.qfedu.dao;

import com.qfedu.entity.Appointment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 10:10
 */
public interface AppointmentDao {

    /**
     * 插入预约图书记录
     * @param bookId
     * @param studentId
     * @return
     */
    int insertAppointment(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

    /**
     * 通过主键查询预约图书记录 并且携带图书实体
     * @param bookId
     * @param studentId
     * @return
     */
    Appointment queryByKeyWithBook(@Param("bookId") Long bookId, @Param("studentId") Long studentId);

}
