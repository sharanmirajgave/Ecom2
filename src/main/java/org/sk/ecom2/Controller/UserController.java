package org.sk.ecom2.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @GetMapping
  public String getUsers() {
    return "Users API";
  }
  @PostMapping
  public String createUser(@RequestBody String name) {
    return "User created: " + name;
  }


}
