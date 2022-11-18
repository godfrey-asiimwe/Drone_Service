package com.Drone.DroneService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Drone.DroneService.Model.Drone;


public interface DroneRepository extends JpaRepository<Drone, String> {
	
	List<Drone> findAll();

}
