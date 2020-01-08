#!/bin/bash

find src/ | entr sh -c 'mvn -q exec:java -DskipTests=true'
