package com.hospitalbudget.budget.repository;

import com.hospitalbudget.budget.entity.CadPaciente;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadPacienteRepository extends JpaRepository <CadPaciente, Long>{
}
