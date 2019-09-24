package com.qfedu.test;

import com.qfedu.dao.AppointmentDao;
import com.qfedu.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 10:47
 */
public class AppointmentDaoTest extends BaseTest{

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void testInset() throws Exception {
        long bookId = 1000;
        long studentId = 12345678L;

        int insert = appointmentDao.insertAppointment(bookId, studentId);

        System.out.println("insert" + insert);
    }

    @Test
    public void testQueryByKeyWithBook() throws Exception {
        long bookId = 1000;
        long studentId = 12345678L;

        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);

        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }
}
