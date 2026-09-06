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
@RequestMapping("/resultados")
public class ResultadoController {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public ResultadoController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping
    public ResponseEntity<List<Resultado>> getResultados(){
        String sql = "select * from resultados;";

        List<Resultado> resultados = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Resultado.class));

        return ResponseEntity.status(200).body(resultados);
    }
}
