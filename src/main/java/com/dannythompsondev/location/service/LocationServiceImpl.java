package com.dannythompsondev.location.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dannythompsondev.location.entities.Location;
import com.dannythompsondev.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;
	
	@Override
	public Location savelocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updatelocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deletelocation(Location location) {
		repository.delete(location);

	}

	@Override
	public Location getLocationById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}
	
	public LocationRepository getRepository() {
		return repository;
	}
	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}

}
