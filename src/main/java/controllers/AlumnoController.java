package controllers;

import models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> buscarAlumnos(){
        return this.alumnoService.buscarAlumnos();
    }

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alu){
        return this.alumnoService.crearAlumno(alu);
    }
}
