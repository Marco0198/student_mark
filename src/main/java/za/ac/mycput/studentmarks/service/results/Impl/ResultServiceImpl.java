package za.ac.mycput.studentmarks.service.results.Impl;

import org.springframework.stereotype.Service;
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.repository.results.ResultRepository;
import za.ac.mycput.studentmarks.service.results.ResultService;


import java.util.Set;
import java.util.stream.Collectors;
@Service
public class ResultServiceImpl implements ResultService {

    private ResultRepository repository;
    @Override
    public Set<Results> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Results create(Results results) {
        return this.repository.save(results);
    }

    @Override
    public Results read(Integer s) {
        return this.repository.findById(s).orElse(null);
    }


    @Override
    public Results update(Results results) {
        return create(results);
    }

    @Override
    public boolean delete(Integer s) {
        repository.deleteById(s);
        return !repository.existsById(s);
    }

}

