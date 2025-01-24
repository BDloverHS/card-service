package org.port.train.controllers;

import lombok.RequiredArgsConstructor;
import org.port.train.entities.TrainData;
import org.port.train.services.PredictService;
import org.port.train.services.TrainService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Profile("ml")
@RestController
@RequiredArgsConstructor
public class TrainController {
    private final TrainService trainService;
    private final PredictService predictService;

    @GetMapping("/train/{mode}")
    public List<TrainData> trainData(@PathVariable("mode") String mode) {
        return trainService.getList(mode.equals("all"));
    }

    @GetMapping("/predict")
    public List<Integer> trainData(@RequestParam("data") List<Double> items) {
        return predictService.predict(items);
    }
}
