package com.dannythompsondev.location.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dannythompsondev.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
