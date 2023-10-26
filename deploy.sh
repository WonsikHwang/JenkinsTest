#!/bin/bash

sudo docker ps -a -q --filter "name=jenkins" | grep -q . && docker stop jenkins && docker rm jenkins | true

# 기존 이미지 삭제
sudo docker rmi hws6745@naver.com/jenkinstest:1

# 도커허브 이미지 pull
sudo docker pull 도커계정이름/jenkinstest:1


# 도커 run
docker run -d -p 8080:8080 --name jenkins hws6745@naver.com/jenkinstest:1

# 사용하지 않는 불필요한 이미지 삭제 -> 현재 컨테이너가 물고 있는 이미지는 삭제되지 않습니다.
docker rmi -f $(docker images -f "dangling=true" -q) || true
