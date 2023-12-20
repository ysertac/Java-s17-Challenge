package com.workintech.validaton;


import com.workintech.exceptions.ApiException;
import org.springframework.http.HttpStatus;

public class Validation {
    public static void checkName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ApiException("Name can not be empty or null! " + name, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkCredit(Integer credit) {
        if (credit == null || credit < 0 || credit > 4) {
            throw new ApiException("Credit is null or not between 0 - 4! " + credit, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkId(Integer id) {
        if (id == null || id <= 0) {
            throw new ApiException("Id can not be null and must be 1 at least " + id, HttpStatus.BAD_REQUEST);
        }
    }
}
