package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

//    @GetMapping("/users")
//    public String getPage(@RequestParam(defaultValue = "1") String page,
//                          @RequestParam(defaultValue = "10") String item_per_page) {
//        return "Page: " + page + " , itemPerPage: " + item_per_page;
//    }

    @GetMapping("/users")
        public PagingResponse getAllUser(@RequestParam(defaultValue = "1") int page,
                                         @RequestParam(defaultValue = "10") int item_per_page) {

        PagingResponse pagingResponse = new PagingResponse(page, item_per_page);
        List<UsersResponse> users = new ArrayList<>();
        users.add(new UsersResponse(1, "User 1"));
        users.add(new UsersResponse(2, "User 2"));
        users.add(new UsersResponse(3, "User 3"));
        pagingResponse.setUsersResponse(users);
        return pagingResponse;
    }

//    @GetMapping("/users")
//    public List<UsersResponse> getAllUser() {
//        List<UsersResponse> users = new ArrayList<>();
//        users.add(new UsersResponse(1, "User 1"));
//        users.add(new UsersResponse(2, "User 2"));
//        users.add(new UsersResponse(3, "User 3"));
//        return users;
//    }

//    public UsersResponse[] getAllUser() {
//        UsersResponse[] usersResponses = new UsersResponse[2];
//        usersResponses[0] = new UsersResponse(1, "User 1");
//        usersResponses[1] = new UsersResponse(2, "User 2");
//        return usersResponses;
//    }

//    @GetMapping("/users/{id}")
//    public UsersResponse getUserById(@PathVariable int id) {
//        return new UsersResponse(id, "User " + id);
//    }
}
