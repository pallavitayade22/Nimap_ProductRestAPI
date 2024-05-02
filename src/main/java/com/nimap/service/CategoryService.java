package com.nimap.service;

import java.util.List;

import com.nimap.entity.Category;

public interface CategoryService {
	
	public boolean saveCategory(Category category);
	public Category getCategoryById(long id);
	public List<Category> getAllCategory();
	public boolean updateCategory(Category category);
	public boolean deleteCategory(long categoryId);
	

}
