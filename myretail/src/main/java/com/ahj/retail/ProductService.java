package com.ahj.retail;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ahj.retail.data.Product;
import com.ahj.retail.data.ProductDataDaoImpl;

/**
 * The Class ProductService.
 *
 * @author jasaniankit
 */
@Service
@ComponentScan("com.ahj.retail.data")
public class ProductService 
{
	Hashtable<String,Product> products = new Hashtable<String,Product>();
	
	/** The product data dao. */
	@Autowired
	ProductDataDaoImpl productDataDao; 
	
	/**
	 * Constructor
	 */
	public ProductService()
	{
		super();
		
	}
	
	/**
	 * Gets the product.
	 *
	 * @param id the id
	 * @return the product
	 */
	public Product getProduct(final String id) 
	{

		return products.get(id);

	}
	
	/**
	 * Gets the product by id.
	 *
	 * @param id the id
	 * @return the product by id
	 */
	public Product getProductById(final String id) 
	{

		return productDataDao.getProductById(id);

	}
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<Product> getAll()
	{
		return productDataDao.getAllProducts();
	}

	/**
	 * Sets the product data dao.
	 *
	 * @param productDataDao the new product data dao
	 */
	public void setProductDataDao(final ProductDataDaoImpl productDataDao) 
	{
		this.productDataDao = productDataDao;
	}
	

}
