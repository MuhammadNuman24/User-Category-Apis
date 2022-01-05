package com.example.demo;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/list")
    public List<CategoryModel> getCategory() {
        return Collections.singletonList(new CategoryModel(1l, "98798", "Hair", "CurlyHair"));
    }

    @PutMapping("/{id}")
    public CategoryModel updateModel(@PathVariable("id") long webId,@RequestBody CategoryModel model) {
        return model;
    }

    @GetMapping("/{id}")
    public CategoryModel getModel(@PathVariable("id") long webId) {
        return new CategoryModel(webId,"98098","TEST CATEGORY","TEST SUB CATEGORY");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CategoryModel postRequest(@RequestBody CategoryModel model) {
        return model;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean deleteRequest(@PathVariable("id") long webId) {
        return true;
    }
}