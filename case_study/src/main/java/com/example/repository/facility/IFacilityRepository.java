package com.example.repository.facility;

import com.example.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {

    @Modifying
    @Query(value = "update facility set is_delete = 1 where id=:key ", nativeQuery = true)
    void deleteLogic(@Param("key") int id);

    @Query(value = "select * from facility where is_delete = 0", nativeQuery = true)
    Page<Facility> saveAll(Pageable pageable);

    @Query(value = "select * from facility where name like %:name% and is_delete = 0", nativeQuery = true)
    Page<Facility> searchByName(@Param("name") String name, Pageable pageable);
}
