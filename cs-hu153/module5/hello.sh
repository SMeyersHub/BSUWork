#!/bin/bash
STR="Hello world from $(hostname)!"
vendor=$(lscpu | grep Vendor)
echo $STR
echo $vendor
