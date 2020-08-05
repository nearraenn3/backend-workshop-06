package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

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
    @PostMapping("/users")
    public UsersResponse createNewUser(@RequestBody NewUserRequest request) {
        //Validate input
        //Create new user into dataBase =>
        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());
        user = userRepository.save(user);
        return new UsersResponse(user.getId(), user.getName() + user.getAge());
    }

}
