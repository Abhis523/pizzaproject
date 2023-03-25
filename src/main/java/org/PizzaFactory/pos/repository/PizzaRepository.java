package org.PizzaFactory.pos.repository;

import jakarta.transaction.Transactional;

import org.PizzaFactory.pos.domain.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PizzaRepository extends JpaRepository<Pizza , Long>
{

  
}
