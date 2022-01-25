package org.debugroom.sample.spring.cloud.stream.kafka.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.debugroom.sample.spring.cloud.stream.kafka.domain.model.Sample;
import org.debugroom.sample.spring.cloud.stream.kafka.domain.repository.SampleRepository;

@RestController
public class SampleController {

    @Autowired
    SampleRepository sampleRepository;

    @PostMapping("/sample/new")
    public Sample preserve(String message){
        return sampleRepository.save(
                Sample.builder()
                        .message(message)
                        .build());
    }

}
