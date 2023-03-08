#!/bin/bash

sudo yum update
sudo yum -y install java-17-amazon-corretto git

git clone https://github.com/DmytroFromServian/fluffy-engine.git
cd fluffy-engine/
./mvnw install
java -jar target/*.jar