package org.sk.ecom2.Controller;
@Restcontroller
@Requestbody("/user")  
public class User {

  @Get("/details")
  public String getUser(){
    return "Sharan"
  }
}
