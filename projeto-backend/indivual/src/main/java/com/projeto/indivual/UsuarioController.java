package com.projeto.indivual;


import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.*;

import java.sql.PreparedStatement;
import java.sql.Statement;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public UsuarioController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuarioParaCadastro) {
        String sql = "insert into usuario (nickname, fk_metrica) values (?,?);";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );
            ps.setString(1, usuarioParaCadastro.getNickname());
            ps.setInt(2, usuarioParaCadastro.getFk_metrica());

            return ps;
        }, keyHolder);

        Integer idGerado = keyHolder.getKeyAs(Integer.class);
        usuarioParaCadastro.setIdUsuario(idGerado);

        return ResponseEntity.status(201).body(usuarioParaCadastro);
    }
}
