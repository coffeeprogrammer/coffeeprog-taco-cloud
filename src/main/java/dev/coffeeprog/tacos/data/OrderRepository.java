package dev.coffeeprog.tacos.data;

import dev.coffeeprog.tacos.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);

}