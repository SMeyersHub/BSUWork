#!/bin/bash

if test "$name" = "forest"
then
	/bin/rm -fr forest
	mkdir forest
	cd forest
else
	mkdir forest
	cd forest
fi

for ((i=0; i<200; i++))
do 
	echo "Creating folder $i"
	mkdir folder$i
	rmdir folder$i
done

