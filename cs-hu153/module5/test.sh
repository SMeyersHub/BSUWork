#!/bin/bash
#tests the RandomTest.java
counter=0
numRandoms=10
javac RandomTest.java
for ((i=0; i<100; i++))
do
	if('java RandomTest numRandoms' == "PASS")
	then counter=counter+1
	echo 'For numRandoms='$numRandoms 'pass rate =' $counter
done
