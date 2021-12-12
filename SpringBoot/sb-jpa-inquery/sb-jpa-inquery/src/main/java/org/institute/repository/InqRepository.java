package org.institute.repository;

import java.util.Date;
import java.util.List;

import org.institute.entity.InqueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InqRepository extends JpaRepository<InqueryEntity, Long> {

	InqueryEntity findByName(String name);

	List<InqueryEntity> findByCity(String city);

	List<InqueryEntity> findByInqDateBetween(Date startDate, Date endDate);

	
}
