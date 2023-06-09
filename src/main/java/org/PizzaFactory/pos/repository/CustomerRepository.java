package org.PizzaFactory.pos.repository;

import jakarta.transaction.Transactional;

import org.PizzaFactory.pos.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

  Customer findByEmailAddress(String username);

}
