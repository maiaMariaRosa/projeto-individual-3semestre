package com.projeto.indivual;


import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/metricas")
public class MetricaController {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public MetricaController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public ResponseEntity<List<Metrica>> getMetricas() {
        String sql = "select * from metricas;";

        List<Metrica> metricas = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Metrica.class));

        return ResponseEntity.status(200).body(metricas);
    }
}
