package org.PizzaFactory.pos.repository;

import jakarta.transaction.Transactional;

import java.util.Optional;

import org.PizzaFactory.pos.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order, Long>
{

	//void save(Object order);

	
	//void saveAllAndFlush(Optional<Order> order);

	//void saveAll(Iterable<S> order);

	//void saveAll(Object order);

	//void save(Object order);

}
