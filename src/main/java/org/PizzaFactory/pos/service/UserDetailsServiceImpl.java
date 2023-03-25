/*
 * package org.PizzaFactory.pos.service;
 * 
 * import org.PizzaFactory.pos.domain.CustomUserDetails; import
 * org.PizzaFactory.pos.domain.Customer; import
 * org.PizzaFactory.pos.repository.CustomerRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * @Service public class UserDetailsServiceImpl implements UserDetailsService {
 * 
 * @Autowired private CustomerRepository customerRepo;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { Customer customer =
 * customerRepo.findByEmailAddress(username);
 * 
 * if(customer == null) { throw new UsernameNotFoundException("Username " +
 * username + " not found."); }else { return new CustomUserDetails(customer); }
 * 
 * }
 * 
 * }
 * 
 */
package org.PizzaFactory.pos.service;

import java.util.function.Function;

import org.PizzaFactory.pos.domain.CustomUserDetails;
import org.PizzaFactory.pos.domain.Customer;
import org.PizzaFactory.pos.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements Function<String, CustomUserDetails> {

  @Autowired
  private CustomerRepository customerRepo;

  @Override
  public CustomUserDetails apply(String username) {
    Customer customer = customerRepo.findByEmailAddress(username);

    if (customer == null) {
      throw new RuntimeException("Username " + username + " not found.");
    } else {
      return new CustomUserDetails(customer);
    }
  }

}
