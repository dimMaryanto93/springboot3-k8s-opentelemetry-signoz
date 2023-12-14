package com.maryanto.dimas.example.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "nasabah")
public record Nasabah(
        @Id @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
        @GeneratedValue(generator = "uuid-gen")
        String id,
        @Column(name = "cif")
        String cif,
        @Column(name = "nama_lengkap")
        String namaLengkap,
        @Column(name = "tgl_lahir")
        LocalDate tanggalLahir,
        @Column(name = "saldo")
        BigDecimal saldo) {
}
