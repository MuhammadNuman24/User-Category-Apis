package com.example.demo;

public class CategoryModel {
    public Long webId;
    private String categoryNumber;
    public String category;
    public String subCategory;

    public CategoryModel(Long webId, String categoryNumber, String category, String subCategory) {
        this.webId = webId;
        this.categoryNumber = categoryNumber;
        this.category = category;
        this.subCategory = subCategory;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(String categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
}
