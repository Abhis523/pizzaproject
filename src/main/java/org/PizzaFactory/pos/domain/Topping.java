/*
 * package org.PizzaFactory.pos.domain;
 * 
 * import java.util.Set; import java.util.TreeSet;
 * 
 * import jakarta.persistence.CascadeType; import jakarta.persistence.Column;
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.JoinColumn; import jakarta.persistence.ManyToMany;
 * 
 * @Entity public class Topping implements Comparable<Topping> {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "topping_id") private Long toppingId;
 * 
 * private String description;
 * 
 * private Double price;
 * 
 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "toppings") private
 * Set<Pizza> pizzas = new TreeSet<>();
 * 
 * public Set<Pizza> getPizzas() { return pizzas; }
 * 
 * public void setPizzas(Set<Pizza> pizzas) { this.pizzas = pizzas; }
 * 
 * public Long getToppingId() { return toppingId; }
 * 
 * public void setToppingId(Long toppingId) { this.toppingId = toppingId; }
 * 
 * public String getDescription() { return description; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * public Double getPrice() { return price; }
 * 
 * public void setPrice(Double price) { this.price = price; }
 * 
 * @Override public int compareTo(Topping otherTopping) { if
 * (otherTopping.getToppingId() == null) { return -1; } if (this.getToppingId()
 * == null) { return 1; } return
 * this.getToppingId().compareTo(otherTopping.getToppingId());
 * 
 * }
 * 
 * @Override public int hashCode() { final int prime = 31; int result = 1;
 * result = prime * result + ((toppingId == null) ? 0 : toppingId.hashCode());
 * return result; }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Topping other = (Topping) obj; if (toppingId == null) { if
 * (other.toppingId != null) return false; } else if
 * (!toppingId.equals(other.toppingId)) return false; return true; }
 * 
 * @Override public String toString() { return "Topping [toppingId=" + toppingId
 * + ", description=" + description + ", price=" + price + "]"; }
 * 
 * 
 * 
 * }
 */
/*
 * package org.PizzaFactory.pos.domain;
 * 
 * import java.util.Set; import java.util.TreeSet;
 * 
 * import jakarta.persistence.CascadeType; import jakarta.persistence.Column;
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.JoinColumn; import jakarta.persistence.ManyToMany;
 * 
 * import org.PizzaFactory.pos.enums.PizzaTypeEnum;
 * 
 * @Entity public class Topping implements Comparable<Topping> {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "topping_id") private Long toppingId;
 * 
 * private String description;
 * 
 * private Double price;
 * 
 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "toppings") private
 * Set<Pizza> pizzas = new TreeSet<>();
 * 
 * private PizzaTypeEnum pizzaType;
 * 
 * public Set<Pizza> getPizzas() { return pizzas; }
 * 
 * public void setPizzas(Set<Pizza> pizzas) { this.pizzas = pizzas; }
 * 
 * public Long getToppingId() { return toppingId; }
 * 
 * public void setToppingId(Long toppingId) { this.toppingId = toppingId; }
 * 
 * public String getDescription() { return description; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * public Double getPrice() { return price; }
 * 
 * public void setPrice(Double price) { this.price = price; }
 * 
 * public PizzaTypeEnum getPizzaType() { return pizzaType; }
 * 
 * public void setPizzaType(PizzaTypeEnum pizzaType) { this.pizzaType =
 * pizzaType; }
 * 
 * @Override public int compareTo(Topping otherTopping) { if
 * (otherTopping.getToppingId() == null) { return -1; } if (this.getToppingId()
 * == null) { return 1; } return
 * this.getToppingId().compareTo(otherTopping.getToppingId());
 * 
 * }
 * 
 * @Override public int hashCode() { final int prime = 31; int result = 1;
 * result = prime * result + ((toppingId == null) ? 0 : toppingId.hashCode());
 * return result; }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Topping other = (Topping) obj; if (toppingId == null) { if
 * (other.toppingId != null) return false; } else if
 * (!toppingId.equals(other.toppingId)) return false; return true; }
 * 
 * @Override public String toString() { return "Topping [toppingId=" + toppingId
 * + ", description=" + description + ", price=" + price + ", pizzaType=" +
 * pizzaType + "]"; } }
 */
package org.PizzaFactory.pos.domain;

import java.util.Set;
import java.util.TreeSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

import org.PizzaFactory.pos.enums.PizzaTypeEnum;
import org.PizzaFactory.pos.enums.Side;


@Entity
public class Topping implements Comparable<Topping> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "topping_id")
    private Long toppingId;

    private String description;

    private Double price;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "toppings")
    private Set<Pizza> pizzas = new TreeSet<>();

    private PizzaTypeEnum pizzaType;

    private Side side;

    public Set<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(Set<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Long getToppingId() {
        return toppingId;
    }

    public void setToppingId(Long toppingId) {
        this.toppingId = toppingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PizzaTypeEnum getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaTypeEnum pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    @Override
    public int compareTo(Topping otherTopping) {
        if (otherTopping.getToppingId() == null) {
            return -1;
        }
        if (this.getToppingId() == null) {
            return 1;
        }
        return this.getToppingId().compareTo(otherTopping.getToppingId());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((toppingId == null) ? 0 : toppingId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Topping other = (Topping) obj;
        if (toppingId == null) {
            if (other.toppingId != null)
                return false;
        } else if (!toppingId.equals(other.toppingId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Topping [toppingId=" + toppingId + ", description=" + description + ", price=" + price
                + ", pizzaType=" + pizzaType + ", side=" + side + "]";
    }
}

