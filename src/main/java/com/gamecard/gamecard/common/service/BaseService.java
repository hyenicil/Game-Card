package com.gamecard.gamecard.common.service;


import com.gamecard.gamecard.common.repository.BaseRepository;


public abstract class BaseService <Entity, IdType> extends BaseServiceProxy<Entity,IdType, BaseRepository<Entity, IdType>>{


    public Entity save(Entity entity) {

        return this.getRepository().save(entity);
    }
}
