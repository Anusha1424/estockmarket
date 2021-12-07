package com.anusha.gateway.repository;

import com.anusha.gateway.bean.auth.JwtToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JwtTokenRepository extends MongoRepository<JwtToken,String> {
	
	public JwtToken findByToken(String token);
}
