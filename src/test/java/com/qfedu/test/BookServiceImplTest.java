package com.qfedu.test;

import com.qfedu.dto.AppointExecution;
import com.qfedu.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 16:16
 */
public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint() throws Exception {

        Long bookId = 1001L;
        Long studentId = 1234567L;

        AppointExecution execution = bookService.appoint(bookId, studentId);

        System.out.println(execution);

    }
}
