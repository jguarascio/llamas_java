package com.llamas.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.llamas.data.entity.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long>{

}
