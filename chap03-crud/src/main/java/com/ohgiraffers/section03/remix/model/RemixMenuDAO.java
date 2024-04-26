package com.ohgiraffers.section03.remix.model;

import com.ohgiraffers.dto.MenuDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface RemixMenuDAO {

    List<MenuDTO> selectAllMenu();

    MenuDTO selectByMenuCode(int code);

    int registMenu( MenuDTO menu);

    int modifyMenu(MenuDTO menu);

    int deleteMenu(int code);
}
