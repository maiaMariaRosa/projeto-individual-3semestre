package com.projeto.individual;

import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.*;

import java.sql.PreparedStatement;
import java.sql.Statement;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private JdbcTemplate jdbcTemplate;

    public UsuarioController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/jaAssistiu")
    public ResponseEntity<Usuario> getJaAssistiu() {
        String sql = "select jaAssistiu from metrica;";

        Usuario usuario = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Usuario.class));

        return ResponseEntity.status(200).body(usuario);

    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuarioParaCriar) {
        String sql = "insert into usuarios (nickname, jaAssistiu) values (?,?);";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, usuarioParaCriar.getNickname());
            ps.setString(2, usuarioParaCriar.getJaAssistiu());

            return ps;
        }, keyHolder);

        Integer idGerado = keyHolder.getKeyAs(Integer.class);
        usuarioParaCriar.setIdNickname(idGerado);

        return ResponseEntity.status(200).body(usuarioParaCriar);
    }
}
