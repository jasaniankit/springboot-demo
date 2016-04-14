package com.ahj.retail.controller;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.ahj.retail.ProductService;
import com.ahj.retail.data.Product;
import com.ahj.retail.data.ProductDataDaoImpl;

/**
 * The Class ProductControllerTest.
 *
 * @author jasaniankit
 */
public class ProductControllerTest 
{
	
	ProductController productController = new ProductController();
	
	ProductService productService = Mockito.mock(ProductService.class);
	
	@Mock
	ProductDataDaoImpl productDao = Mockito.mock(ProductDataDaoImpl.class);
	
	@Before
	public void setup()
	{
		this.productController.setProductService(productService);
		this.productService.setProductDataDao(productDao);
		
		when(this.productService.getProductById(Matchers.anyString())).thenReturn(this.mockProductData());			
	}
	
	/**
	 * Mock product data.
	 *
	 * @return the product
	 */
	private Product mockProductData() 
	{
		Product prod = new Product();
		prod.setCategory("Electronics");
		prod.setName("LG TV");
		prod.setPrice("1400");
		prod.setSku("LG5A6");
		
		return prod;
	}
	@Test
	public void testGetProductById()
	{
		
		final Product prod = this.productController.getProduct("1");
		Assert.assertEquals("Electronics", prod.getCategory());

	}
	
	

}
