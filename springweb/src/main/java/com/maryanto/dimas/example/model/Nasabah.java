package com.maryanto.dimas.example.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Nasabah(
        String id,
        String cif,
        String namaLengkap,
        LocalDate tanggalLahir,
        BigDecimal saldo) {
}
