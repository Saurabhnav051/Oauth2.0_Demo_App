package com.sbiepay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbiepay.model.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{

	  Client findByClientId(String clientId);
}
