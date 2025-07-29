package com.lcwd.hotel.exceptions;

public class ResourseNotFoundException extends  RuntimeException {
    public ResourseNotFoundException(String s) {
        super(s);
    }

    public ResourseNotFoundException(){
        super("resource not found exception");
    }
}
