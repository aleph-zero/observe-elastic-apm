#!/bin/bash
docker run -p 8200:80 -v $PWD/nginx-reverse-proxy.conf:/etc/nginx/conf.d/default.conf nginx:latest
