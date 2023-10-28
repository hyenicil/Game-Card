package com.gamecard.gamecard.common.mapper;


import java.util.List;



public interface BaseMapper<Entity, Request, Response> {

    Entity toEntity(Request request);

    Response toResponse(Entity entity);
    List<Response> toListEntity(List<Entity> entities);

}
