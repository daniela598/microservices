package com.sena.microservicesEdwin.sv.controlador;

import com.sena.microservicesEdwin.sv.repositorio.InterfaceMascotas;
import com.sena.microservicesEdwin.sv.modelos.Mascotas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotasControlador {

    @Autowired
    public InterfaceMascotas interfaceMascotas;

    @GetMapping("/buscar")
    public List<Mascotas> mascotas() {
        return (List<Mascotas>) interfaceMascotas.findAll();

    }

    @PostMapping("/insertar")
    public Mascotas insertar(@RequestBody Mascotas mascotas) {
        return interfaceMascotas.save(mascotas);
    }

    @PutMapping("/modificar")
    public Mascotas modificar(@RequestBody Mascotas mascotas) {
        return interfaceMascotas.save(mascotas);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        interfaceMascotas.deleteById(id);
    }

    @GetMapping("/{id}")
    public Mascotas buscar(@PathVariable("id") Integer id) {
        return interfaceMascotas.findById(id).get();
    }
}




