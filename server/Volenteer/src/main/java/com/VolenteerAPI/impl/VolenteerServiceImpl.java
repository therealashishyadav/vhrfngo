package com.VolenteerAPI.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VolenteerAPI.entity.Volenteer;
import com.VolenteerAPI.repo.VolenteerRepo;
import com.VolenteerAPI.service.VolenteerService;

@Service
public class VolenteerServiceImpl implements VolenteerService {

	@Autowired
	private VolenteerRepo volenteerRepo;
	
	@Override
	public Volenteer sendRequest(Volenteer volenteer) {

		
		return this.volenteerRepo.save(volenteer);
	}
	
	

}
