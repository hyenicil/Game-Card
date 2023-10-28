package com.gamecard.gamecard.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface BaseRepository<Entity,IdType> extends JpaRepository<Entity,IdType>{

}
