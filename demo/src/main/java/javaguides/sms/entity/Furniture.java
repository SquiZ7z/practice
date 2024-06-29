package javaguides.sms.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "furniture")

public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "material")
    private String material;

    @Column (name = "price")
    private float price;



    public Furniture(String name, String material, float price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public Furniture() {

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
