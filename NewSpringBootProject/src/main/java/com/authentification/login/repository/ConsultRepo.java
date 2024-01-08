package com.authentification.login.repository;

import com.authentification.login.entitiy.Consult;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ConsultRepo extends JpaRepository<Consult,Integer > {
}
