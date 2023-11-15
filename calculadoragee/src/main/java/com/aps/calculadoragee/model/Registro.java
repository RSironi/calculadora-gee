package com.aps.calculadoragee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Registro {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "quantidade")
    private Long qnt;
    private double co2;
    private double ch4;;
    private double n20;
    private double agua; // Média de água (em ton) consumida pelo rebanho durante 1 ano
    private double alimento; // Média de água (em ton) consumida pelo rebanho durante 1 ano

    private UUID uuid;

    public Registro(Long qnt, UUID uuid){
        this.qnt = qnt;
        this.uuid = uuid;

        this.co2 = qnt * 1.70537402339;
        this.ch4 = qnt * 0.06090621329;;
        this.n20 = qnt * 0.04844;
        this.agua = (qnt / 1000) * 132 * 365;
        this.alimento = (qnt / 1000) * 65 * 365;
    }

}