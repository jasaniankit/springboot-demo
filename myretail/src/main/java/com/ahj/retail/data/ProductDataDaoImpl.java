/**
 * 
 */
package com.ahj.retail.data;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ahj.retail.data.mapper.ProductMapper;

/**
 * The Class ProductDataDaoImpl.
 *
 * @author jasaniankit
 */

@EnableWebMvc
@MapperScan("com.ahj.retail.data.mapper")
@Component
public class ProductDataDaoImpl
{
	
	public ProductDataDaoImpl()
	{
		super();
	}

	@Autowired
	ProductMapper mapper;
	
	
	/**
	 * Gets the product by id.
	 *
	 * @param productId the product id
	 * @return the product by id
	 */
	public Product getProductById(final String productId) 
	{
		return mapper.getProductById(Integer.valueOf(productId));
	}

	
	
	/**
	 * Gets the all products.
	 *
	 * @return the all products
	 */
	public List<Product> getAllProducts() 
	{
		return  mapper.getAllProducts();
	}

	/**
	 * Gets the mapper.
	 *
	 * @return the mapper
	 */
	public ProductMapper getMapper() {
		return mapper;
	}

	/**
	 * Sets the mapper.
	 *
	 * @param mapper the new mapper
	 */
	public void setMapper(final ProductMapper mapper) 
	{
		this.mapper = mapper;
	}
	

}
