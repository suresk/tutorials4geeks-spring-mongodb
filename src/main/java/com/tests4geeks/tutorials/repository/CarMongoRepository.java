package com.tests4geeks.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.tests4geeks.tutorials.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}