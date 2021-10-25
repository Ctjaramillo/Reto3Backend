/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.servicio;


import co.edu.usa.misiontic.reto3.modelo.Score;
import co.edu.usa.misiontic.reto3.repository.ScoreRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carotobarj
 */
@Service
public class ScoreService {
    
    @Autowired
    private ScoreRepository scoreRepository;
    
    public List<Score> getAll(){
        return scoreRepository.getAll();
    }
    
    public Optional<Score> getScore(Integer id){
        return scoreRepository.getScore(id);
    }
    
    public Score save(Score score){
        if(score.getIdScore() == null){
            return scoreRepository.save(score);
        } else {
            Optional<Score> scoreAux = scoreRepository.getScore(score.getIdScore());
            if(scoreAux.isEmpty()){
                return scoreRepository.save(score);
            } else {
                return score;
            }
        }
    }
}
