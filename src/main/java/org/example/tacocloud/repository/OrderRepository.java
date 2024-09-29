package org.example.tacocloud.repository;

import org.example.tacocloud.domain.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {

    TacoOrder save(TacoOrder order);
}
