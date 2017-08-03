package guru.springframework.domain;

import java.math.BigDecimal;

/**
 * Created by El-Feky on 7/20/17.
 */
public class Product implements DomainObject{
    private Integer id;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
