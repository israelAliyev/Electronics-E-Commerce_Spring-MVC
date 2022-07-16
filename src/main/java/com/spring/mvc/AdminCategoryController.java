package com.spring.mvc;


import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.entity.Category;
import com.spring.service.CategoryService;


@Controller
@RequestMapping(value = "admin/category")
public class AdminCategoryController {
	
	@Autowired
	private CategoryService categoryService;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, Locale locale) {

		model.addAttribute("locale", locale);
		
		return "category";
	}
	
	@RequestMapping(value = "/deleteTrash", method = RequestMethod.POST)
	public String deleteTrashList(HttpServletRequest request) {

		if (request.getParameter("emptyTrash") != null) {

			this.categoryService.deleteTrash();

		}

		return "redirect:/admin/category/trashList";
	}



	@RequestMapping(value = { "/addCategory" }, method = RequestMethod.POST)
	public String addCategory(@Valid @ModelAttribute("category") Category category, Errors errors,
			RedirectAttributes attributes) {



		if (errors.hasErrors()) {

			attributes.addFlashAttribute("error", errors.getFieldError("categoryName").getDefaultMessage());
			
			return "redirect:/home";

		}

		else {
			category.setStatus((short) 1);

			this.categoryService.addItem(category);
			return "redirect:/admin/category/";

		}


	}

	@RequestMapping(value = "/buckupCategory", method = RequestMethod.POST)
	public String buckUpCAtegory(Category category) {

		category.setStatus((short) 1);

		this.categoryService.buckUpItem(category);

		return "redirect:/admin/category/trashList";
	}

	@RequestMapping(value = { "/updateCategory" }, method = RequestMethod.POST)
	public String updateCategory(Category category) {

		this.categoryService.updateItem(category);

		return "redirect:/admin/category/";
	}


	@RequestMapping(value = { "/trashList" }, method = RequestMethod.GET)
	public String trashList() {

		return "trash";
	}

	@RequestMapping(value = { "/deleteCategory" }, method = RequestMethod.POST)
	public String deleteteCategory(@RequestParam String catId, Model model) {

		Category category = new Category();
		category.setCategoryId((long) Long.parseLong(catId));
		category.setStatus((short) 0);
		this.categoryService.deleteItem(category);
		model.addAttribute("cat", this.categories());
		return "CategoryAjax";
	}

	@RequestMapping(value = { "/deleteFromTrash" }, method = RequestMethod.POST)
	public String deleteFromTrash(@ModelAttribute(value = "category") Category category) {

		this.categoryService.deleteTrashItem(category);

		return "redirect:/admin/category/trashList";
	}

	@ModelAttribute("cat")
	public List<Category> categories() {

		return this.categoryService.listItem();
	}

	@ModelAttribute("trashCat")
	public List<Category> trashCatList() {

		return this.categoryService.trashList();
	}

	@ModelAttribute("category")
	public Category categoryForm() {

		return new Category();
	}
	
}
