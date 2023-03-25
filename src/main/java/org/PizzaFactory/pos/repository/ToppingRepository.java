package org.PizzaFactory.pos.repository;

import jakarta.transaction.Transactional;

import org.PizzaFactory.pos.domain.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ToppingRepository extends JpaRepository<Topping, Long>
{
  
}
