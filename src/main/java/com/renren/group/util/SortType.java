package com.renren.group.util;

/**
 * The Sort Type.
 */
public enum SortType {
	
	/** Sort by PRICE. */
	PRICE("price"),
	
	/** Sort by Sold out count. */
	SOLD_OUT("sold_out"),
	
	/** Sort by DISCOUNT. */
	DISCOUNT("discount");

	/** The sort type. */
	private String type;

	/**
	 * The Constructor.
	 * 
	 * @param type the sort type
	 */
	private SortType(String type) {
		this.type = type;
	}

	/**
	 * Gets the sort type.
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}
}
