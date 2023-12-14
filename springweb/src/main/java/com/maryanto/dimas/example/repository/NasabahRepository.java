package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.model.Nasabah;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class NasabahRepository {

    public List<Nasabah> findAll() {
        List<Nasabah> list = new ArrayList<>();
        list.add(new Nasabah(
                UUID.randomUUID().toString(),
                "001", "Dimas Maryanto",
                LocalDate.of(1991, 3, 30),
                BigDecimal.ZERO));
        return list;
    }


}
