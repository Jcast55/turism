package com.web.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.web.app.model.Reservacion;
import com.web.app.model.Usuario;

public interface ReservacionDao extends JpaRepository<Reservacion, Long> {
        
        List<Reservacion> findAllByUsuario(Usuario usuario);
}
