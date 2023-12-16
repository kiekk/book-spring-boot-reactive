package com.example.rsocketserver;

import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item, String>,
        ReactiveQueryByExampleExecutor<Item> {
}
