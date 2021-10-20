package za.ac.mycput.studentmarks.service.results;


import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface ResultService extends IService<Results, Integer> {
   Set<Results> getAll();

}