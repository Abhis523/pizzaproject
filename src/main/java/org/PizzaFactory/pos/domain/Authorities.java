package org.PizzaFactory.pos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Authorities 
{

  private static final long serialVersionUID = -7161503748223646498L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "authority_id")
  private Long authorityId;
  
  @Column(name = "authority_name")
  private String authorityName;
  
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

  public Long getAuthorityId()
  {
    return authorityId;
  }

  public void setAuthorityId(Long authorityId)
  {
    this.authorityId = authorityId;
  }

  public String getAuthorityName()
  {
    return authorityName;
  }

  public void setAuthorityName(String authorityName)
  {
    this.authorityName = authorityName;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public void setCustomer(Customer customer)
  {
    this.customer = customer;
  }

	/*
	 * @Override public String getAuthority() { return getAuthorityName(); }
	 */
  
  
}
