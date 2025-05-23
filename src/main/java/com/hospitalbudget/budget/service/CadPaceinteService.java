package com.hospitalbudget.budget.service;

import com.hospitalbudget.budget.DTO.CadPacienteMinDto;
import com.hospitalbudget.budget.entity.CadPaciente;
import com.hospitalbudget.budget.repository.CadPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadPaceinteService {

    @Autowired
    private CadPacienteRepository cadPacienteRepository;

    public static CadPaciente salvar(CadPaciente cadPaciente) {

        return cadPaciente;
    }


    public List<CadPacienteMinDto> findAll(){
        List<CadPaciente> result = cadPacienteRepository.findAll();
        return result.stream().map(CadPacienteMinDto::new).toList();
    }


}
