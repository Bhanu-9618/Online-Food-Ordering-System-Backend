package edu.icet.ecom.repository;

import edu.icet.ecom.model.Entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<OrdersEntity,Long> {
}
