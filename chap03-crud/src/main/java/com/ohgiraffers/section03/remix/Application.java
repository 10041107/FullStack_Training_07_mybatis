package com.ohgiraffers.section03.remix;


import com.ohgiraffers.section03.remix.controller.MenuController;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args){
        MenuController menu = new MenuController();
        Map<String, String> value = new HashMap<>();
        value.put("name", "보리새우 떡볶이");
        value.put("price", "5000");
        value.put("category", "5");
        menu.registMenu(value);
        menu.selectAllMenu();


        MenuController menuController = new MenuController();
        Map<String, String> test = new HashMap<>();
        test.put("code","6");

        menuController.selectMenuByCode(test);

    }
}
