package com.hunter.job.controller;

import com.hunter.job.domain.ModelBasique;
import com.hunter.job.repositories.RepositoryBasique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
        produces =  MediaType.APPLICATION_JSON_VALUE)
public class ControleurGenerique<T extends ModelBasique> {
    
    @Autowired
    private RepositoryBasique<T> repositoryBasique;

    public ControleurGenerique() {}

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public T create(@RequestBody T entity) {
        return repositoryBasique.save(entity);
    }

    @RequestMapping(value = "{id}/update", method = RequestMethod.PUT)
    public T update(@PathVariable(value = "id") long id, @RequestBody T entity) {
        return repositoryBasique.save(entity);
    }

    @RequestMapping(value = "{id}/delete", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        repositoryBasique.delete(id);
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public void deleteAll() {
        repositoryBasique.deleteAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public T get(@PathVariable(value = "id") long id) {
        return repositoryBasique.findOne(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<T> getAll() {
        return repositoryBasique.findAll();
    }
}
