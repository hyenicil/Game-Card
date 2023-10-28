package com.gamecard.gamecard.common.service;

import com.gamecard.gamecard.common.repository.BaseRepository;

public abstract class BaseServiceProxy<Entity, IdType, Repository extends BaseRepository<Entity,IdType>>
{
    public abstract Repository getRepository();
}
