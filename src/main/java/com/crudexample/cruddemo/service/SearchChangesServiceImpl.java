package com.crudexample.cruddemo.service;

import com.crudexample.cruddemo.model.SearchChanges;
import com.crudexample.cruddemo.repository.SearchChangesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SearchChangesServiceImpl implements ISearchChangesService {

    @Autowired
    private SearchChangesRepository searchChangesRepository;

    @Override
    public Optional<SearchChanges> getItemChange(String itemId) {

        Optional<SearchChanges> searchChange = searchChangesRepository.findById(itemId);

        return searchChange;
    }

    @Override
    public SearchChanges getSearchChange() {
        return null;
    }

    @Override
    public List<SearchChanges> getAllServiceChanges() {
        List<SearchChanges> changes = new ArrayList<>();
        searchChangesRepository.findAll()
                .forEach(changes::add);
        return changes;
    }
}
