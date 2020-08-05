package com.example.demo;

import java.util.List;

public class PagingResponse {
    private List<UsersResponse> users;
    private int page;
    private int item_per_page;

    public PagingResponse(int page, int item_per_page) {
        this.page = page;
        this.item_per_page = item_per_page;
    }

    public List<UsersResponse> getUsers() {
        return users;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getItem_per_page() {
        return item_per_page;
    }

    public void setItem_per_page(int item_per_page) {
        this.item_per_page = item_per_page;
    }

    public void setUsersResponse(List<UsersResponse> users) {
        this.users = users;
    }
}
