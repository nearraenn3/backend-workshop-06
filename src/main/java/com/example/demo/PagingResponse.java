package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({"page", "ItemPerPage", "Users"})

public class PagingResponse {
    @JsonProperty("Users")
    private List<UsersResponse> users;

    private int page;

    @JsonProperty("ItemPerPage")
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
