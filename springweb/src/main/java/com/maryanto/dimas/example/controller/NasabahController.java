package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.model.Nasabah;
import com.maryanto.dimas.example.repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nasabah/v1")
public class NasabahController {

    public NasabahRepository nasabahRepo;

    @Autowired
    public NasabahController(NasabahRepository nasabahRepo) {
        this.nasabahRepo = nasabahRepo;
    }

    @GetMapping("/list")
    public List<Nasabah> findAll() {
        return this.nasabahRepo.findAll();
    }

}
