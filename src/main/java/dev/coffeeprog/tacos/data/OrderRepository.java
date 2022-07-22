package dev.coffeeprog.tacos.data;

import dev.coffeeprog.tacos.TacoOrder;

import java.util.Optional;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);

    Optional<TacoOrder> findById(Long id);

}