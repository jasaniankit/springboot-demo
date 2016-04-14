package com.ahj.retail.data;

import java.io.Serializable;
import java.sql.Date;


/**
 * The Class Product.
 *
 * @author jasaniankit
 */
public class Product implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The category. */
	private String category;
	
	/** The sku. */
	private String sku;
	
	/** The updated on. */
	private Date updatedOn;
	
	/** The price. */
	private String price;

	public Product() {
	}

	public Product(String id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}


	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the category.
	 *
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * Gets the sku.
	 *
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setId(final String id) {
		this.id = id;
	}
	
	public void setName(final String name) {
		this.name = name;
	}

	
	public void setCategory(final String category) {
		this.category = category;
	}

	public void setSku(final String sku) {
		this.sku = sku;
	}

	/**
	 * Sets the updated on.
	 *
	 * @param updatedOn the new updated on
	 */
	public void setUpdatedOn(final Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(final String price) {
		this.price = price;
	}
}