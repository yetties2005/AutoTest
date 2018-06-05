package com.course.model;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Arthur
 * Date: 2018-06-05
 * Time: 下午3:55
 */
@Data
public class GetUserInfoCase {
    private int id;
    private int userId;
    private String expected;
}
