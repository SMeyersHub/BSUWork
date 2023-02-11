#!/bin/sh
#Find .java files
cd
for f in $(wc $f `find -name '*.java'`)
do
	echo
done | sort | sed 10q
