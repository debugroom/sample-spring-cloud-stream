#!/usr/bin/env bash

#stack_name="sample-spring-cloud-stream-ec2"
#stack_name="sample-spring-cloud-stream-ng"
#stack_name="sample-spring-cloud-stream-sg"
stack_name="sample-spring-cloud-stream-vpc"

aws cloudformation delete-stack --stack-name ${stack_name}