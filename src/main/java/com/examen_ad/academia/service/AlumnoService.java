package com.examen_ad.academia.service;
import com.examen_ad.academia.model.Alumno;
import com.examen_ad.academia.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    public Alumno findById(Integer id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    public List<Alumno> findByCursoId(Integer id) {
        return alumnoRepository.findByCursoIdCurso(id);
    }

    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public Alumno update(Integer id, Alumno alumnoDetails) {
        Alumno alumno = findById(id);
        if (alumno != null) {
            alumno.setNombre(alumnoDetails.getNombre());
            alumno.setEmail(alumnoDetails.getEmail());
            alumno.setCurso(alumnoDetails.getCurso());
            return alumnoRepository.save(alumno);
        }
        return null;
    }

    public void delete(Integer id) {
        alumnoRepository.deleteById(id);
    }
}
