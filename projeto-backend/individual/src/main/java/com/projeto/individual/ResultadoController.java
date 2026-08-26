package com.projeto.individual;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/resultado")
public class ResultadoController {
    private final JdbcTemplate jdbcTemplate;

    public ResultadoController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resultado> getResultado(@PathVariable Integer id){
        String sql = "select personalidade, descricao, imagem from resultados where id = ?;";

        try {
            Resultado resultado = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Resultado.class), id);

            return ResponseEntity.status(200).body(resultado);
        } catch (EmptyResultDataAccessException e) {

            return ResponseEntity.status(404).build();
        }
    }

}
