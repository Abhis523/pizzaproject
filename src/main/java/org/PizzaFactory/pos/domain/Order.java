/*
 * package org.PizzaFactory.pos.domain;
 * 
 * import java.util.Set; import java.util.TreeSet;
 * 
 * import jakarta.persistence.CascadeType; import jakarta.persistence.Column;
 * import jakarta.persistence.Entity; import jakarta.persistence.FetchType;
 * import jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.JoinColumn; import jakarta.persistence.ManyToOne; import
 * jakarta.persistence.OneToMany; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "orders") public class Order {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "order_id") private Long orderId;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "customer_id") private Customer customer;
 * 
 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER , mappedBy =
 * "order") private Set<Pizza> pizzas = new TreeSet<>();
 * 
 * @Column(name = "final_price")
 * 
 * private Boolean completed = false;
 * 
 * public Long getOrderId() { return orderId; }
 * 
 * public void setOrderId(Long orderId) { this.orderId = orderId; }
 * 
 * public Customer getCustomer() { return customer; }
 * 
 * public void setCustomer(Customer customer) { this.customer = customer; }
 * 
 * public Set<Pizza> getPizzas() { return pizzas; }
 * 
 * public void setPizzas(Set<Pizza> pizzas) { this.pizzas = pizzas; }
 * 
 * public Double getFinalPrice() { return finalPrice; }
 * 
 * public void setFinalPrice(Double finalPrice) { this.finalPrice = finalPrice;
 * }
 * 
 * public Boolean getCompleted() { return completed; }
 * 
 * public void setCompleted(Boolean completed) { this.completed = completed; }
 * 
 * 
 * 
 * 
 * }
 * 
 * package org.PizzaFactory.pos.domain;
 * 
 * import java.util.Set; import java.util.TreeSet;
 * 
 * import jakarta.persistence.CascadeType; import jakarta.persistence.Column;
 * import jakarta.persistence.Entity; import jakarta.persistence.FetchType;
 * import jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.JoinColumn; import jakarta.persistence.ManyToOne; import
 * jakarta.persistence.OneToMany; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "orders") public class Order {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "order_id") private Long orderId;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "customer_id") private Customer customer;
 * 
 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy =
 * "order") private Set<Pizza> pizzas = new TreeSet<>();
 * 
 * @Column(name = "final_price") private Double finalPrice;
 * 
 * private Boolean completed = false;
 * 
 * public Long getOrderId() { return orderId; }
 * 
 * public void setOrderId(Long orderId) { this.orderId = orderId; }
 * 
 * public Customer getCustomer() { return customer; }
 * 
 * public void setCustomer(Customer customer) { this.customer = customer; }
 * 
 * public Set<Pizza> getPizzas() { return pizzas; }
 * 
 * public void setPizzas(Set<Pizza> pizzas) { this.pizzas = pizzas; }
 * 
 * public Double getFinalPrice() { return finalPrice; }
 * 
 * public void setFinalPrice(Double finalPrice) { this.finalPrice = finalPrice;
 * }
 * 
 * public Boolean getCompleted() { return completed; }
 * 
 * public void setCompleted(Boolean completed) { this.completed = completed; } }
 */
/*
 * package org.PizzaFactory.pos.domain;
 * 
 * import java.util.Set; import java.util.TreeSet;
 * 
 * import org.PizzaFactory.pos.enums.PizzaTypeEnum;
 * 
 * import jakarta.persistence.CascadeType; import jakarta.persistence.Column;
 * import jakarta.persistence.Entity; import jakarta.persistence.FetchType;
 * import jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.JoinColumn; import jakarta.persistence.ManyToOne; import
 * jakarta.persistence.OneToMany; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "orders") public class Order {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO)
 * 
 * @Column(name = "order_id") private Long orderId;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "customer_id") private Customer customer;
 * 
 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy =
 * "order") private Set<Pizza> pizzas = new TreeSet<>();
 * 
 * @Column(name = "final_price") private Double finalPrice;
 * 
 * @Column(name = "pizza_type") private PizzaTypeEnum pizzaType;
 * 
 * private Boolean completed = false;
 * 
 * public Long getOrderId() { return orderId; }
 * 
 * public void setOrderId(Long orderId) { this.orderId = orderId; }
 * 
 * public Customer getCustomer() { return customer; }
 * 
 * public void setCustomer(Customer customer) { this.customer = customer; }
 * 
 * public Set<Pizza> getPizzas() { return pizzas; }
 * 
 * public void setPizzas(Set<Pizza> pizzas) { this.pizzas = pizzas; }
 * 
 * public Double getFinalPrice() { return finalPrice; }
 * 
 * public void setFinalPrice(Double finalPrice) { this.finalPrice = finalPrice;
 * }
 * 
 * public Boolean getCompleted() { return completed; }
 * 
 * public void setCompleted(Boolean completed) { this.completed = completed; }
 * 
 * public PizzaTypeEnum getPizzaType() { return pizzaType; }
 * 
 * public void setPizzaType(PizzaTypeEnum pizzaType) { this.pizzaType =
 * pizzaType; } }
 */
package org.PizzaFactory.pos.domain;

import java.util.Set;
import java.util.TreeSet;

import org.PizzaFactory.pos.enums.PizzaTypeEnum;
import org.PizzaFactory.pos.enums.Side;

/*import org.hibernate.metamodel.mapping.ForeignKeyDescriptor.Side;*/
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "order_id")
  private Long orderId;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "order")
  private Set<Pizza> pizzas = new TreeSet<>();

  @Column(name = "final_price")
  private Double finalPrice;

  @Column(name = "pizza_type")
  private PizzaTypeEnum pizzaType;

  @Column(name = "pizza_side")
  private Side side;

  private Boolean completed = false;

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Set<Pizza> getPizzas() {
    return pizzas;
  }

  public void setPizzas(Set<Pizza> pizzas) {
    this.pizzas = pizzas;
  }

  public Double getFinalPrice() {
    return finalPrice;
  }

  public void setFinalPrice(Double finalPrice) {
    this.finalPrice = finalPrice;
  }

  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
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

  public void setSide(Side pizzaAside) {
    this. side = pizzaAside;
  }
}
