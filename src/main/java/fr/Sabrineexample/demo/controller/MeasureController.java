package fr.Sabrineexample.demo.controller;

import fr.Sabrineexample.demo.model.Measure;
import fr.Sabrineexample.demo.repository.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/API")
public class MeasureController {
    @Autowired
    MeasureRepository measureRepository;

    @RequestMapping(value = "/measures/last", method = RequestMethod.GET)
    public Measure last(@RequestParam("measure-type") String measureType) {// permet de récupérer ce qu'il y a après le ? measure-type
        System.out.println("Measure type : " + measureType);
        Measure resultat = null;
        return resultat;
    }
    @RequestMapping(value = "/measures/top", method = RequestMethod.GET)
    public Measure top(@RequestParam("measure-type") String measureType) {// permet de récupérer ce qu'il y a après le ? measure-type
        System.out.println("Measure type : " + measureType);
        Measure resultat2 =null;
        return resultat2;
    }
    @RequestMapping(value = "/measures", method = RequestMethod.GET)
    public List<Measure> table(){//@RequestParam("measure-type") String measureType, @RequestParam("start-date") String startDate, @RequestParam("end-date") String endDate) {

        return measureRepository.findAll();
    }

    @RequestMapping(value = "/measures", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Measure createMesure (@RequestBody Measure measure) {

                return measure;
    }
}


    /* @RequestMapping(value = "/sub", method = RequestMethod.GET) // Si la requête qui arrive est sur /API/sub, qu'elle est GET, il faut appliquer la méthode testSub
    public String testSub() {
        return "<H1> Test sub </H1>";
    }
    // Méthode qui va etre executé pour la requête GET sur le chemin /API/sub

    @RequestMapping(method = RequestMethod.POST) // Si la requête qui arrive est sur /API, qu'elle est POST, il faut appliquer la méthode create

    @ResponseStatus(HttpStatus.CREATED) // Quand tout s'est bien passé (OK), on execute la méthode create indiquant que la création s'est bien passé (coté utilisateur)
    // Permet de customiser la réponse automatique

    public Long create(@RequestBody long ressource) { // Passage entre ce qui circule dans la requete et les objets Java
        System.out.println("ressource :" + ressource);
        return 5L; // Retourne 1 de type Long
    }
}

*/