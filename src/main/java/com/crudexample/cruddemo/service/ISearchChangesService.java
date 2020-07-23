package com.crudexample.cruddemo.service;

import com.crudexample.cruddemo.model.SearchChanges;

import java.util.List;
import java.util.Optional;

public interface ISearchChangesService {
    public Optional<SearchChanges> getItemChange(String itemId);
    public SearchChanges getSearchChange();
    public List<SearchChanges> getAllServiceChanges();
}
