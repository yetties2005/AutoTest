package com.course.model;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Arthur
 * Date: 2018-06-05
 * Time: 下午3:46
 */
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String age;
    private String sex;
    private String permission;
    private String idDelete;

    @Override
    public String toString() {
        return (
                "{id" + id + "," +
                "userName" + userName + "," +
                "password" + password + "," +
                "age" + age + "," +
                "sex" + sex + "," +
                "permission" + permission + "," +
                "idDelete" + idDelete + "}"
        );
    }
}
