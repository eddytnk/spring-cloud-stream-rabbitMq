package com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.repository;

import com.eddytnk.springcloudstreamrabbitMq.springcloudstreamrabbitMq.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: edward <br/>
 * Date: 11/25/18 9:31 PM <br/>
 */

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
