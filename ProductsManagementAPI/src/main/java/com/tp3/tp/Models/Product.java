package com.tp3.tp.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prodName;

    private String prodDesc;

    private String prodImage;

    private Double prodPrice;

    private int prodQte;

    public Product()
    {

    }

    public Product(String prodName, String prodDesc, String prodImage,Double prodPrice,int prodQte)
    {
        this.prodName=prodName;
        this.prodDesc=prodDesc;
        this.prodImage=prodImage;
        this.prodPrice=prodPrice;
        this.prodQte=prodQte;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id=id;
    }

    public String getProdName()
    {
        return prodName;
    }

    public void setProdName(String prodName)
    {
        this.prodName=prodName;
    }

    public String getProdDesc()
    {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc)
    {
        this.prodDesc=prodDesc;
    }

    public String getProdImage()
    {
        return prodImage;
    }

    public void setProdImage(String prodImage)
    {
        this.prodImage=prodImage;
    }

    public Double getProdPrice()
    {
        return prodPrice;
    }

    public void setProdPrice(Double prodPrice)
    {
        this.prodPrice= prodPrice;
    }

    public int getProdQte()
    {
        return prodQte;
    }

    public void setProdQte(int prodQte)
    {
        this.prodQte=prodQte;
    }
}