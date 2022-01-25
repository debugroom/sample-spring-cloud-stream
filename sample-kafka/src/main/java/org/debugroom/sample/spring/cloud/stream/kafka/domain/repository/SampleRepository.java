package org.debugroom.sample.spring.cloud.stream.kafka.domain.repository;

import org.debugroom.sample.spring.cloud.stream.kafka.domain.model.Sample;

public interface SampleRepository {

    public Sample save(Sample sample);

}
