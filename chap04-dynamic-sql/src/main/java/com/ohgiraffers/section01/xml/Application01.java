package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.model.SearchCriteria;

import java.util.*;

public class Application01 {

    public static void main(String[] args){

        MenuService menuService = new MenuService();
//        menuService.selectMenuByPrice(5000);
        SearchCriteria criteria = new SearchCriteria("menuCode", "1");
//        menuService.searchMenuBySupCategory(criteria);

//        menuService.searchMenuByRandomMenuCode(createRandomMenuCodeList());
//        menuService.searchMenuByCodeOrSearchAll(criteria);

        Map<String, Object> test = new HashMap<>();
//        test.put("name", "보리");
//        test.put("categoryCode", "5");
        test.put("orderableStatus", "N");
        test.put("code", "1");

//        menuService.searchMenuByNameOrCategory(test);

        menuService.modifyMenu(test);
    }


    public static List<Integer> createRandomMenuCodeList(){
        Set<Integer> set = new HashSet<>();
        while(set.size() < 5){
            int temp = ((int) (Math.random() * 21) )+1;
            set.add(temp);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}
