package com.nimap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.entity.Category;
import com.nimap.service.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@PostMapping(value = "/save-category")
	public boolean saveCategory(@RequestBody Category category) {

		boolean isAdded = service.saveCategory(category);
		return isAdded;
	}

	@GetMapping(value = "/get-category-by-id/{id}")
	public Category getCategoryById(@PathVariable int id) {
		Category category = service.getCategoryById(id);
		return category;
	}

	@GetMapping(value = "/get-all-category")
	public List<Category> getAllCategory() {
		List<Category> list = service.getAllCategory();
		return list;
	}

	@DeleteMapping("/delete-category-by-id/{categoryId}")
	public boolean deleteCategory(@PathVariable long categoryId) {
		boolean isDeleted = service.deleteCategory(categoryId);
		return isDeleted;
	}

	@PutMapping("/update-category")
	public boolean updateCategory(@RequestBody Category category) {
		return service.updateCategory(category);
	}

}
