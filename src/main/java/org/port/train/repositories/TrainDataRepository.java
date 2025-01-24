package org.port.train.repositories;

import org.port.train.entities.TrainData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface TrainDataRepository extends JpaRepository<TrainData, Long>, QuerydslPredicateExecutor<TrainData> {

}
