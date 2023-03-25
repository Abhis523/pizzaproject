/*
 * package org.PizzaFactory.pos.domain;
 * 
 * import java.util.Set; import java.util.TreeSet;
 * 
 * import jakarta.persistence.CascadeType; import jakarta.persistence.Column;
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.JoinColumn; import jakarta.persistence.JoinTable;
 * import jakarta.persistence.ManyToMany; import jakarta.persistence.ManyToOne;
 * 
 * import org.PizzaFactory.pos.enums.PizzaCrustEnum; import
 * org.PizzaFactory.pos.enums.PizzaSizeEnum;
 * 
 * @Entity public class Pizza implements Comparable<Pizza> {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "pizza_id") private Long pizzaId;
 * 
 * private PizzaSizeEnum size;
 * 
 * @Column(name = "crust_type") private PizzaCrustEnum crustType;
 * 
 * @ManyToMany(cascade = CascadeType.ALL)
 * 
 * @JoinTable(name = "pizza_topping", joinColumns=@JoinColumn(name =
 * "pizza_id"), inverseJoinColumns = @JoinColumn(name = "topping_id")) private
 * Set<Topping> toppings = new TreeSet<>();
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "order_id") private Order order;
 * 
 * private Double price;
 * 
 * public Order getOrder() { return order; }
 * 
 * public void setOrder(Order order) { this.order = order; }
 * 
 * public Long getPizzaId() { return pizzaId; }
 * 
 * public void setPizzaId(Long pizzaId) { this.pizzaId = pizzaId; }
 * 
 * public PizzaSizeEnum getSize() { return size; }
 * 
 * public void setSize(PizzaSizeEnum size) { this.size = size; }
 * 
 * public PizzaCrustEnum getCrustType() { return crustType; }
 * 
 * public void setCrustType(PizzaCrustEnum crustType) { this.crustType =
 * crustType; }
 * 
 * public Set<Topping> getToppings() { return toppings; }
 * 
 * public void setToppings(Set<Topping> toppings) { this.toppings = toppings; }
 * 
 * 
 * 
 * public Double getPrice() { return price; }
 * 
 * public void setPrice(Double price) { this.price = price; }
 * 
 * @Override public int compareTo(Pizza otherPizza) { if(this.getPizzaId() ==
 * null){ return 1; } if( otherPizza.getPizzaId() == null){ return -1; } return
 * this.getPizzaId().compareTo(otherPizza.getPizzaId());
 * 
 * 
 * }
 * 
 * @Override public int hashCode() { final int prime = 31; int result = 1;
 * result = prime * result + ((pizzaId == null) ? 0 : pizzaId.hashCode());
 * return result; }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Pizza other = (Pizza) obj; if (pizzaId == null) { if (other.pizzaId !=
 * null) return false; } else if (!pizzaId.equals(other.pizzaId)) return false;
 * return true; }
 * 
 * 
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
 * import jakarta.persistence.JoinColumn; import jakarta.persistence.JoinTable;
 * import jakarta.persistence.ManyToMany; import jakarta.persistence.ManyToOne;
 * 
 * import org.PizzaFactory.pos.enums.PizzaCrustEnum; import
 * org.PizzaFactory.pos.enums.PizzaSizeEnum; import
 * org.PizzaFactory.pos.enums.PizzaTypeEnum;
 * 
 * @Entity public class Pizza implements Comparable<Pizza> {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "pizza_id") private Long pizzaId;
 * 
 * private PizzaSizeEnum size;
 * 
 * @Column(name = "crust_type") private PizzaCrustEnum crustType;
 * 
 * @ManyToMany(cascade = CascadeType.ALL)
 * 
 * @JoinTable(name = "pizza_topping", joinColumns=@JoinColumn(name =
 * "pizza_id"), inverseJoinColumns = @JoinColumn(name = "topping_id")) private
 * Set<Topping> toppings = new TreeSet<>();
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "order_id") private Order order;
 * 
 * @Column(name = "pizza_type") private PizzaTypeEnum pizzaType;
 * 
 * private Double price;
 * 
 * public Order getOrder() { return order; }
 * 
 * public void setOrder(Order order) { this.order = order; }
 * 
 * public Long getPizzaId() { return pizzaId; }
 * 
 * public void setPizzaId(Long pizzaId) { this.pizzaId = pizzaId; }
 * 
 * public PizzaSizeEnum getSize() { return size; }
 * 
 * public void setSize(PizzaSizeEnum size) { this.size = size; }
 * 
 * public PizzaCrustEnum getCrustType() { return crustType; }
 * 
 * public void setCrustType(PizzaCrustEnum crustType) { this.crustType =
 * crustType; }
 * 
 * public Set<Topping> getToppings() { return toppings; }
 * 
 * public void setToppings(Set<Topping> toppings) { this.toppings = toppings; }
 * 
 * public PizzaTypeEnum getPizzaType() { return pizzaType; }
 * 
 * public void setPizzaType(PizzaTypeEnum pizzaType) { this.pizzaType =
 * pizzaType; }
 * 
 * public Double getPrice() { return price; }
 * 
 * public void setPrice(Double price) { this.price = price; }
 * 
 * @Override public int compareTo(Pizza otherPizza) { if (this.getPizzaId() ==
 * null) { return 1; } if (otherPizza.getPizzaId() == null) { return -1; }
 * return this.getPizzaId().compareTo(otherPizza.getPizzaId()); }
 * 
 * @Override public int hashCode() { final int prime = 31; int result = 1;
 * result = prime * result + ((pizzaId == null) ? 0 : pizzaId.hashCode());
 * return result; }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Pizza other = (Pizza) obj; if (pizzaId == null) { if (other.pizzaId !=
 * null) return false; return true; } } }
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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import org.PizzaFactory.pos.enums.PizzaCrustEnum;
import org.PizzaFactory.pos.enums.PizzaSizeEnum;
import org.PizzaFactory.pos.enums.PizzaTypeEnum;
import org.PizzaFactory.pos.enums.Side;
import org.springframework.lang.Nullable;

@Entity
public class Pizza implements Comparable<Pizza> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "pizza_id")
  private Long pizzaId;
  
  private PizzaSizeEnum size;
  @Nullable
  @Column(name = "crust_type")
  private PizzaCrustEnum crustType;
  
  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "pizza_topping", joinColumns=@JoinColumn(name = "pizza_id"), inverseJoinColumns = @JoinColumn(name = "topping_id"))
  private Set<Topping> toppings = new TreeSet<>();
  
  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;
  
  @Column(name = "pizza_type")
  private PizzaTypeEnum pizzaType;
  
  private Double price;
  
  @Column(name = "pizza_side")
  private Side side;

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Long getPizzaId() {
    return pizzaId;
  }

  public void setPizzaId(Long pizzaId) {
    this.pizzaId = pizzaId;
  }

  public PizzaSizeEnum getSize() {
    return size;
  }

  public void setSize(PizzaSizeEnum size) {
    this.size = size;
  }

  public PizzaCrustEnum getCrustType() {
    return crustType;
  }

  public void setCrustType(PizzaCrustEnum crustType) {
    this.crustType = crustType;
  }

  public Set<Topping> getToppings() {
    return toppings;
  }

  public void setToppings(Set<Topping> toppings) {
    this.toppings = toppings;
  }
  
  public PizzaTypeEnum getPizzaType() {
    return pizzaType;
  }

  public void setPizzaType(PizzaTypeEnum pizzaType) {
    this.pizzaType = pizzaType;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Side getSide() {
    return side;
  }

  public void setSide(Side side) {
    this.side = side;
  }

  @Override
  public int compareTo(Pizza otherPizza) {
    if (this.getPizzaId() == null) {
      return 1;
    }
    if (otherPizza.getPizzaId() == null) {
      return -1;
    }
    return this.getPizzaId().compareTo(otherPizza.getPizzaId());
  }
  @Override
  public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((pizzaId == null) ? 0 : pizzaId.hashCode());
      result = prime * result + ((side == null) ? 0 : side.hashCode());
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
      Pizza other = (Pizza) obj;
      if (pizzaId == null) {
          if (other.pizzaId != null)
              return false;
      } else if (!pizzaId.equals(other.pizzaId))
          return false;
      if (side != other.side)
          return false;
      return true;
  }
}