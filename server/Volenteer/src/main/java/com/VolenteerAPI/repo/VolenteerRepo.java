package com.VolenteerAPI.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VolenteerAPI.entity.Volenteer;

public interface VolenteerRepo extends JpaRepository<Volenteer, Long> {


}
