package com.hospitalbudget.budget.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "CadPct")
public class CadPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nameMother;
    private String nameFather;
    private Date dateBirth;
    private String cityBirth;
    private String stateBirth;
    private String rg;
    private String cpf;
    private String endereco;
    private String cep;
    private String cityHousing;
    private String stateHousing;
    private String email;
    private String fone;
    private String cellPhone;
    private String nameResponsible;
    private String rgResponsible;
    private String cpfResponsible;
    private String phoneResponsible;
    private String cellphoneResponsible;

    public CadPaciente() {
    }

    public CadPaciente(Long id, String name, String nameMother,
                       String nameFather, Date dateBirth, String cityBirth,
                       String stateBirth, String rg, String cpf,
                       String endereco, String cep, String cityHousing,
                       String stateHousing, String email, String fone,
                       String cellPhone, String nameResponsible, String rgResponsible,
                       String cpfResponsible, String phoneResponsible,
                       String cellphoneResponsible) {
        this.id = id;
        this.name = name;
        this.nameMother = nameMother;
        this.nameFather = nameFather;
        this.dateBirth = dateBirth;
        this.cityBirth = cityBirth;
        this.stateBirth = stateBirth;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.cityHousing = cityHousing;
        this.stateHousing = stateHousing;
        this.email = email;
        this.fone = fone;
        this.cellPhone = cellPhone;
        this.nameResponsible = nameResponsible;
        this.rgResponsible = rgResponsible;
        this.cpfResponsible = cpfResponsible;
        this.phoneResponsible = phoneResponsible;
        this.cellphoneResponsible = cellphoneResponsible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getCityBirth() {
        return cityBirth;
    }

    public void setCityBirth(String cityBirth) {
        this.cityBirth = cityBirth;
    }

    public String getStateBirth() {
        return stateBirth;
    }

    public void setStateBirth(String stateBirth) {
        this.stateBirth = stateBirth;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCityHousing() {
        return cityHousing;
    }

    public void setCityHousing(String cityHousing) {
        this.cityHousing = cityHousing;
    }

    public String getStateHousing() {
        return stateHousing;
    }

    public void setStateHousing(String stateHousing) {
        this.stateHousing = stateHousing;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getNameResponsible() {
        return nameResponsible;
    }

    public void setNameResponsible(String nameResponsible) {
        this.nameResponsible = nameResponsible;
    }

    public String getRgResponsible() {
        return rgResponsible;
    }

    public void setRgResponsible(String rgResponsible) {
        this.rgResponsible = rgResponsible;
    }

    public String getCpfResponsible() {
        return cpfResponsible;
    }

    public void setCpfResponsible(String cpfResponsible) {
        this.cpfResponsible = cpfResponsible;
    }

    public String getPhoneResponsible() {
        return phoneResponsible;
    }

    public void setPhoneResponsible(String phoneResponsible) {
        this.phoneResponsible = phoneResponsible;
    }

    public String getCellphoneResponsible() {
        return cellphoneResponsible;
    }

    public void setCellphoneResponsible(String cellphoneResponsible) {
        this.cellphoneResponsible = cellphoneResponsible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CadPaciente that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

