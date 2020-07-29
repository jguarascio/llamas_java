package com.llamas.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.llamas.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{

}
