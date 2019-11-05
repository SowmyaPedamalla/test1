package com.rs.bean.trans;

public class Product {
	private Integer productId;
	private String proName;
	private double price;

        private int v;

	public void setProductId(Integer productId)
	{
	    this.productId = productId;
	}
	public Integer getProductId()
	{
	    return productId;
	}

	public void setProName(String proName)
	{
	    this.proName = proName;
	}
	public String getProName()
	{
	    return proName;
	}

	public void setPrice(double price)
	{
	    this.price = price;
	}
	public double getPrice()
	{
	    return price;
	}

       public void setV(int v)
	{
	    this.v = v;
	}
	public int getV()
	{
	    return v;
	}
}


