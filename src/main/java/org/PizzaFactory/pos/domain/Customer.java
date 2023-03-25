package org.PizzaFactory.pos.domain;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "customer_id")
  private Long customerId;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email_address")
  private String emailAddress;
  
  private String password;
  
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer")
  private Set<Authorities> authorities = new HashSet<>();

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer")
  private Set<Order> orders;

  public Customer() {}
  
  public Customer(Customer customer)
  {
    this.customerId = customer.getCustomerId();
    this.firstName = customer.getFirstName();
    this.lastName = customer.getLastName();
    this.emailAddress = customer.getEmailAddress();
    this.password = customer.getPassword();
    this.authorities = customer.getAuthorities();
    this.orders = customer.getOrders();
  }

  public Long getCustomerId()
  {
    return customerId;
  }

  public void setCustomerId(Long customerId)
  {
    this.customerId = customerId;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getEmailAddress()
  {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress)
  {
    this.emailAddress = emailAddress;
  }

  public Set<Order> getOrders()
  {
    return orders;
  }

  public void setOrders(Set<Order> orders)
  {
    this.orders = orders;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public Set<Authorities> getAuthorities()
  {
    return authorities;
  }

  public void setAuthorities(Set<Authorities> authorities)
  {
    this.authorities = authorities;
  }
  
  

}
