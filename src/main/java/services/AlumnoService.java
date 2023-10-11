package services;

import models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> buscarAlumnos() {
        List<Alumno> alumnos =  alumnoRepository.findAll();
        System.out.println(alumnos.get(0).getNombre());
        return alumnos;
    }

    public Alumno crearAlumno(Alumno alu) {
        return alumnoRepository.save(alu);
    }
}
