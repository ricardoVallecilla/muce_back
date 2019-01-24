package uce.edu.ec.muce.intefaces;


import org.springframework.data.jpa.repository.JpaRepository;

import uce.edu.ec.muce.modelos.Museo;



public interface MuseoRepositorio extends JpaRepository<Museo, Long> {
	
	

}
