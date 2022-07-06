package com.personal.blog.menu;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MenuControler {


    @GetMapping("/api/menulist/all")
    public List<String> getMenuList(){
        List list = new ArrayList();

        for(int i = 0; i < 10; i++){
            list.add(i+"");
        }
        System.out.println(list);
        return list;
    }

}
