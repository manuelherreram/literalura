package com.aluracursos.literalura.mapper;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
