package com.hospitalbudget.budget.DTO;

import com.hospitalbudget.budget.entity.CadPaciente;

import java.util.Date;

public class CadPacienteMinDto {

    private Long id;
    public String name;
    private String nameMother;
    private String rg;
    private String cpf;
    private String fone;
    private String cellPhone;
    private String nameResponsible;
    private String phoneResponsible;
    private String cellphoneResponsible;


    public CadPacienteMinDto(){

    }

    public CadPacienteMinDto(CadPaciente entity) {
        id = entity.getId();
        name = entity.getName();
        nameMother = entity.getNameMother();
        rg = entity.getRg();
        cpf = entity.getCpf();
        fone = entity.getFone();
        cellPhone = entity.getCellPhone();
        nameResponsible = entity.getPhoneResponsible();
        phoneResponsible = entity.getPhoneResponsible();
        cellphoneResponsible = entity.getCellphoneResponsible();
    }
}
