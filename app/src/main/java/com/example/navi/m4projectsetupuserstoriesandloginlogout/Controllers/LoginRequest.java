package com.example.navi.m4projectsetupuserstoriesandloginlogout.Controllers;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dfriedman32 on 2/17/18.
 *
 *
 */

class LoginRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL = "http://136.59.225.27/Login.php";
    //private static final String LOGIN_REQUEST_URL = "http://192.168.1.19/Login.php";
//    private static final String LOGIN_REQUEST_URL = "http://98.252.206.56/Login.php";


    private Map<String, String> params;

    public LoginRequest(String username, String password, Response.Listener<String> listener) {
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username",username);
        params.put("password",password);
    }


    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
