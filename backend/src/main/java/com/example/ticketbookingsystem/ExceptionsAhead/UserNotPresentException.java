package com.example.ticketbookingsystem.ExceptionsAhead;

public class UserNotPresentException extends Exception{
    String msg;
    public UserNotPresentException(String msg){
        this.msg=msg;
        System.out.println(msg);
    }
}
