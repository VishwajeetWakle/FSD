package org.institute.repository;

import org.institute.entity.EmployeeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpInfoRepo extends JpaRepository<EmployeeInfo, Long> {

}
