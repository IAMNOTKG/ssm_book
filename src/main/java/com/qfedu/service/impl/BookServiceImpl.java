package com.qfedu.service.impl;

import com.qfedu.dao.AppointmentDao;
import com.qfedu.dao.BookDao;
import com.qfedu.dto.AppointExecution;
import com.qfedu.entity.Appointment;
import com.qfedu.entity.Book;
import com.qfedu.enums.AppointStateEnum;
import com.qfedu.exception.AppointException;
import com.qfedu.exception.NoNumberException;
import com.qfedu.exception.RepeatAppointException;
import com.qfedu.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 16:02
 */
@Service
public class BookServiceImpl implements BookService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Book getById(Long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }

    @Override
    public AppointExecution appoint(Long bookId, Long studentId) {

        try {
            // 减库存
            int update = bookDao.reduceNumber(bookId);

            if (update <= 0) {
                throw new NoNumberException("库存不足");
//                return new AppointExecution(bookId, AppointStateEnum.NO_NUMBER); 错误写法
            } else {
                int insert = appointmentDao.insertAppointment(bookId, studentId);

                if (insert <= 0) {
                    throw new RepeatAppointException("重复预约");
//                    return new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT); 错误写法
                } else {
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);

                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }
            }

        } catch (NoNumberException e) {
            throw e;
        } catch (RepeatAppointException e) {
            throw e;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new AppointException("appoint inner error" + e.getMessage());
        }

    }
}
