package com.nimap.dao;

import java.util.List;

import com.nimap.entity.Category;

public interface CategoryDao {
	
	public boolean saveCategory(Category category);
	public Category getCategoryById(long id);
	
	public List<Category> getAllCategory();
	public boolean updateCategory(Category category);
	public boolean deleteCategory(long categoryId);

}
