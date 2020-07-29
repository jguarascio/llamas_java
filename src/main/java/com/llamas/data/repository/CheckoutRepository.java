package com.llamas.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.llamas.data.entity.Checkout;

@Repository
public interface CheckoutRepository extends CrudRepository<Checkout, Long>{
	Iterable<Checkout> findCheckoutByGuest(long guestId);
}
