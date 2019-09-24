package com.qfedu.entity;

/**
 * @author 李冠凯.
 * @Description
 * @date 2019/9/21.
 * @time 10:02
 */
public class Book {

    /**
     * 图书id
     */
    private Long bookId;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 馆藏数量
     */
    private Integer number;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
