package com.Drone.DroneService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Drone.DroneService.Model.Drone;
import com.Drone.DroneService.Service.DroneService;

@RestController
@RequestMapping(value = "/")
public class DroneController {
	
	@Autowired
	private DroneService droneService;
	
	@GetMapping("")
	public List<Drone>  getDrones(){
		
		return droneService.getDrones();
		
	}
	
	
	@PostMapping(path = "/register", consumes = "application/json")
    public String addDrone(@RequestBody Drone drone) {

    	droneService.saveDrone(drone);
    	
        return "succesfully Registered a drone";
        
    }
	

}
