#!/bin/sh
for i in {1..10000} ; do
    curl springweb:8080/api/nasabah/v1/list
done