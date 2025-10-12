package br.com.teacup.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Equipamento extends PanacheEntity {
    public String nome;
    public String serialNumber;
    public String localizacao;
    public Integer riscoPontuacao;
    public String riscoDescricao;
}
