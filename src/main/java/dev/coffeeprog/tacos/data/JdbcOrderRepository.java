package dev.coffeeprog.tacos.data;

import dev.coffeeprog.tacos.TacoOrder;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.transaction.annotation.Transactional;

public class JdbcOrderRepository implements OrderRepository {

    private JdbcOperations jdbcOperations;

    public JdbcOrderRepository(JdbcOperations jdbcOperations){
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    @Transactional
    public TacoOrder save(TacoOrder order) {
        return null;
    }
}