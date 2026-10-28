package com.vcube.teamexpensemanager.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.teamexpensemanager.entity.User;

@Repository
public interface EventRepository extends JpaRepository<User, Long> {

}