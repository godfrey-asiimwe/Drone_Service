package com.Drone.DroneService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Drone.DroneService.Model.Drone;
import com.Drone.DroneService.Repository.DroneRepository;

@Service
@Transactional
public class DroneService {
	@Autowired
	private DroneRepository droneRepository;
	
	public List<Drone> getDrones(){
		
		return droneRepository.findAll();
		
	}
	
	public Drone saveDrone(Drone drone) {
		
		return droneRepository.save(drone);
		
	}

}
