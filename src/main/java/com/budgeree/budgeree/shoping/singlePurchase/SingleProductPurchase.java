package com.budgeree.budgeree.shoping.singlePurchase;

import com.budgeree.budgeree.shoping.product.Product;

import javax.persistence.*;

@Entity
public class SingleProductPurchase {

    @Id
    @GeneratedValue(generator = "spurchaseSeq")
    @SequenceGenerator(name = "spurchaseSeq", sequenceName = "spurchase_seq", allocationSize = 1)
    private long id;

    @OneToOne(targetEntity = Product.class)
    private Product product;

    private double quantity;
    private double price;

    public SingleProductPurchase(Product product, double quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
