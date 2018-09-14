package com.telran.jpaunihometask.repository;

import com.telran.jpaunihometask.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

//    @Query()
//    CompanyResponse getCompany(Long id);

//    @Query("select d.teamLeader from Developer d where d.teamLeader.name = :name")
//    TeamLeader getTeamLeader(@Param("name") String name);
}
