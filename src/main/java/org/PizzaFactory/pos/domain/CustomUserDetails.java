package org.PizzaFactory.pos.domain;

import java.util.Set;

public class CustomUserDetails extends Customer
{

  private static final long serialVersionUID = -5744988040426037064L;

  public CustomUserDetails(){}
  
  public CustomUserDetails(Customer customer)
  {
    super(customer);
  }

  @Override
  public Set<Authorities> getAuthorities()
  {
    return super.getAuthorities();
  }

  @Override
  public String getPassword()
  {
    return super.getPassword();
  }

	/*
	 * @Override public String getUsername() { return super.getEmailAddress(); }
	 */

	/*
	 * @Override public boolean isAccountNonExpired() { return true; }
	 * 
	 * @Override public boolean isAccountNonLocked() { return true; }
	 * 
	 * @Override public boolean isCredentialsNonExpired() { return true; }
	 * 
	 * @Override public boolean isEnabled() { return true; }
	 */

}
