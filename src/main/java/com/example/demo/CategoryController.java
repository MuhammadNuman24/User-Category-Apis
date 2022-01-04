package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @GetMapping("/list")
    public List<CategoryModel> getCategory(){
    return Collections.singletonList(new CategoryModel(1l,"Hair", "CurlyHair"));
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public CategoryModel postRequest(@RequestBody CategoryModel model){
        return model;
    }
    @RequestMapping(value = "/{id}" , method= RequestMethod.DELETE)
        public long deleteRequest( @PathVariable("id") long webId){
            return webId;
        }
}