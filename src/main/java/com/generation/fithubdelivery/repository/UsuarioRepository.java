package com.generation.fithubdelivery.repository;

import java.util.List;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.fithubdelivery.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Nullable
	List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}