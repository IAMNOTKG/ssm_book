package com.qfedu.service;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 15:56
 */

import com.qfedu.dto.AppointExecution;
import com.qfedu.entity.Book;

import java.util.List;

/**
 * 业务接口：站在“使用者”角度涉及接口
 * 三个方面：方面定义粒度，参数，返回类型（return 类型/异常）
 */
public interface BookService {

    /**
     * 查询一本图书
     * @return
     */
    Book getById(Long bookId);

    /**
     * 查询所有图书
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(Long bookId, Long studentId);
}
