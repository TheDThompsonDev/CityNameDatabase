package com.dannythompsondev.location.service;

import java.util.List;

import com.dannythompsondev.location.entities.Location;

public interface LocationService {

	
	Location savelocation(Location location);
	Location updatelocation(Location location);
	void deletelocation(Location location);
	Location getLocationById(int id);
	List<Location> getAllLocations();
	
	
}
