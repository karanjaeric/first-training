/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.firsttraining.controllers;

import com.example.firsttraining.database.Trainee;
import com.example.firsttraining.database.TraineeRepository;
import jakarta.persistence.PostRemove;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erick.karanja_cellul
 */
@RestController
@RequestMapping("/trainees")
public class TraineeController {

    @Autowired
    private TraineeRepository traineeRepository;

    @PostMapping("/create")
    public Trainee createTrainee(@RequestBody Trainee trainee) {
        //save the trainee to the DB
        trainee = traineeRepository.save(trainee);
        //return the trainee back to the caller
        return trainee;
    }

}
