package com.aluracursos.literalura.repository;

import java.util.List;

import com.aluracursos.literalura.entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AutorRepository extends JpaRepository<AutorEntity, Long> {

    @Query("SELECT a FROM AutorEntity a WHERE :anio between a.fechaNacimiento AND a.fechaFallecimiento")
    List<AutorEntity> findForYear(int anio);

}
