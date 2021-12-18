package org.institute.repository;

import java.util.List;

import org.institute.entity.InqueryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InqRepository extends JpaRepository<InqueryEntity, Long> {

	InqueryEntity findByName(String name);

	List<InqueryEntity> findByCity(String city);

	List<InqueryEntity> findByInqDateBetween(String startDate, String endDate);

	List<InqueryEntity> findByInqDate(String date);

	@Query(value = "from InqueryEntity where month(inqDate)=?1")
	List<InqueryEntity> findByMonth(int month);

	@Query(value = "from InqueryEntity where year(inqDate)=?1")
	List<InqueryEntity> findByYear(int year);

	@Query(value = "select * from inquery_entity where month(inq_date)=?1 and year(inq_date)=?2", nativeQuery = true)
	List<InqueryEntity> findByMonthYear(int month, int year);

	
}
