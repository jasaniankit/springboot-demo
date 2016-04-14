package com.ahj.retail.controller;

import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahj.retail.ProductService;
import com.ahj.retail.data.Product;

/**
 * The Class ProductController.
 */
@RestController
@RequestMapping("/product")
public class ProductController 
{
	
	/** The ps. */
	@Autowired
	ProductService productService;
	

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@RequestMapping("/all")
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAll() 
	{
		return productService.getAll();

	}
	
	/**
	 * Gets the product.
	 *
	 * @param id the id
	 * @return the product
	 */
	@RequestMapping(value ="/{id}" , method =RequestMethod.GET)
	@ResponseBody
	@Produces(MediaType.APPLICATION_JSON_VALUE)
	public Product getProduct(@PathVariable("id") String id) 
	{		

		return productService.getProductById(id);
	}

	/**
	 * Sets the product service.
	 * 
	 * @param productService
	 *            the new product service
	 */
	public void setProductService(final ProductService productService) 
	{
		this.productService = productService;
	}

	
}
