package com.example.ludus.repository;

import com.example.ludus.dao.BaseDao;
import com.example.ludus.entity.BaseEntity;
import com.example.ludus.exeption.BadRequestException;
import com.example.ludus.filter.Filter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.util.List;


@RequiredArgsConstructor
public class BaseRepository<Ent extends BaseEntity, Dao extends BaseDao<Ent>> {
    protected final Dao dao;

    public List<Ent> getAll() {
        return dao.findAll();
    }

    public List<Ent> getAll(Filter filter) {
        return dao.findAll(filter);
    }

    public Ent get(long id) {
        return dao.getOne(id);
    }

    public Ent create(Ent entity) {
        return dao.save(entity);
    }

    @SneakyThrows
    public Ent update(Ent entity) {

        if (entity.getId() == null)
            throw new BadRequestException("Поле id не может быть пустым");

        return dao.save(entity);
    }

    public void delete(long id) {
        dao.deleteById(id);
    }
}
