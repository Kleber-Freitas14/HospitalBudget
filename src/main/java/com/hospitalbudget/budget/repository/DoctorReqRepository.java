package com.hospitalbudget.budget.repository;

import com.hospitalbudget.budget.entity.DoctorReq;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorReqRepository extends JpaRepository <DoctorReq, Long> {
}
