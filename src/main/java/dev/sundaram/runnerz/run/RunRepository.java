package dev.sundaram.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {
    private List<Run> runs= new ArrayList<>();
    List<Run> findAll(){
        return runs;
    }
    Optional<Run> findById(Integer id){
        return runs.stream().filter(run -> run.id()==id).findFirst();
    }
    void create(Run run){
        runs.add(run);
    }
    @PostConstruct
    private void init(){
        runs.add(new Run(1,
                "Monday morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(2,ChronoUnit.HOURS),
                3,
                Location.Indoor));
        runs.add(new Run(2,
                "Tuesday morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(3,ChronoUnit.HOURS),
                4,
                Location.Indoor));
    }
}
