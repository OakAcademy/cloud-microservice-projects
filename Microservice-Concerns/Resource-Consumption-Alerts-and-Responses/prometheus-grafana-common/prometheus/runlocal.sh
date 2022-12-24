#!/bin/bash

docker run -it  \
    -p 9090:9090 \
    -v $(pwd)/prometheus.yml:/etc/prometheus/prometheus.yml \
    -v $(pwd)/alertmanager/alert.rules:/etc/prometheus/my_alert_rules1.alert \
    --add-host=host.docker.internal:host-gateway \
    prom/prometheus

