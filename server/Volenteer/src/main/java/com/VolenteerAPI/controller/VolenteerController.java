package com.VolenteerAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VolenteerAPI.entity.Volenteer;
import com.VolenteerAPI.service.VolenteerService;

@RestController
@RequestMapping("volenteer")
@CrossOrigin(origins = "http://localhost:4200")
public class VolenteerController {

	@Autowired
	private VolenteerService volenteerService;

	@PostMapping
	public Volenteer sendRequest(@RequestBody Volenteer volenteer) {
		return this.volenteerService.sendRequest(volenteer);
	}

}
