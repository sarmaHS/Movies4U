package com.runit.moviesmvvmmockup.data.remote;

/**
 * Created by Radovan Ristovic on 3/29/2018.
 * Quantox.com
 * radovanr995@gmail.com
 */

public interface NetworkConstants {
    String BASE_URL = "http://api.themoviedb.org/3/";
    String LOGIN_PAGE = "https://www.themoviedb.org/authenticate/";
    String API_KEY = "4a7073eab437a124b83abd47adb7097e";
    // Connection timeout in seconds
    int TIME_OUT_SECONDS = 10;
    // Cache size in KiB
    long CACHE_SIZE = 10 * 1024 * 1024; // 10Mib

    static String loginPage(String token) {
        return LOGIN_PAGE + token;
    }
}
