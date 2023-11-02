package com.portfolio.util;

public final class Constants {

    private Constants() {

    }

    public static final String API_ROOT = "/v1";

    //  Posts
    public static final String POSTS = "/posts";
    public static final String CREATE_POST = POSTS + "/create";
    public static final String UPDATE_POST = POSTS + "/update";
    public static final String DELETE_POST = POSTS + "/delete";
    public static final String GET_POST = POSTS + "/{id}";

    // Contacts
    public static final String CONTACT = "/contact";
    public static final String SEND_MESSAGE = CONTACT + "/send";
}
