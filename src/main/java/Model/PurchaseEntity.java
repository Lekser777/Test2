package Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "purchase", schema = "shoping")
@NamedQuery(name = "Purchase.getAll", query = "SELECT u from PurchaseEntity u")
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CATEGORY")
    private String category;
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "PRODUCT")
    private String product;
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "PRICE")
    private Integer price;
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "DATEOFBUYING")
    private Date dateofbuying;
    public Date getDateofbuying() {
        return dateofbuying;
    }

    public void setDateofbuying(Date dateofbuying) {
        this.dateofbuying = dateofbuying;
    }

    @Basic
    @Column(name = "PLACEOFBUYING")
    private String placeofbuying;
    public String getPlaceofbuying() {
        return placeofbuying;
    }

    public void setPlaceofbuying(String placeofbuying) {
        this.placeofbuying = placeofbuying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PurchaseEntity that = (PurchaseEntity) o;

        if (id != that.id) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (dateofbuying != null ? !dateofbuying.equals(that.dateofbuying) : that.dateofbuying != null) return false;
        if (placeofbuying != null ? !placeofbuying.equals(that.placeofbuying) : that.placeofbuying != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (dateofbuying != null ? dateofbuying.hashCode() : 0);
        result = 31 * result + (placeofbuying != null ? placeofbuying.hashCode() : 0);
        return result;
    }
}
