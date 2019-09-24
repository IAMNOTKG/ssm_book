package com.qfedu.dao;

import com.qfedu.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 10:07
 */
public interface BookDao {

    /**
     * 通过id查询单本图书
     * @param id
     * @return
     */
    Book queryById(Long id);

    /**
     * 查询所有图书
     * @param offset
     *      查询起始位置
     * @param limit
     *      查询条数
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少馆藏数量
     * @param bookId
     * @return
     */
    int reduceNumber(Long bookId);
}
