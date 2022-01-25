package org.debugroom.sample.spring.cloud.stream.kafka.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import org.debugroom.sample.spring.cloud.stream.kafka.domain.model.Sample;

@Component
public class KafkaRepositoryImpl implements SampleRepository{

    @Autowired
    private StreamBridge streamBridge;

    @Override
    public Sample save(Sample sample) {
        streamBridge.send("sample-topic", sample);
        return sample;
    }

}
