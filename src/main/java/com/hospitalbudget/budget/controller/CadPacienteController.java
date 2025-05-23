package com.hospitalbudget.budget.controller;

import com.hospitalbudget.budget.DTO.CadPacienteMinDto;
import com.hospitalbudget.budget.entity.CadPaciente;
import com.hospitalbudget.budget.service.CadPaceinteService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/CadPct")

public class CadPacienteController {
    @Autowired

    private CadPaceinteService cadPaceinteService;

    @GetMapping
    public List<CadPacienteMinDto> findAll() {
        List<CadPacienteMinDto> result = cadPaceinteService.findAll();
        return result;
    }



}
