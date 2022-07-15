## VARIABLES
BASH 				:= /bin/bash
REPO				:= docker
NAME 				:= $(BASH python .tools/pom.py artifactId)
TAG 				:= $(BASH python .tools/pom.py version)
GROUP_ID 			:= $(subst .,/,$(BASH .tools/pom.py groupId))
JAVA_SOURCE_FILES	:= $(BASH find ./src -name '*.java')

## APPLICATION
DOCKER_COMPOSE 	?= ./docker-compose.yml
DOCKER			?= docker
GRADLE 			?= $(DOCKER_COMPOSE) run --rm gradle -B

## HELPERS
run:
	$(DOCKER_COMPOSE)  -f --force-recreate app

.PHONE: all run tinker

## CLEAN
clean:
	gradle clean

clean-docker:
	$(DOCKER_COMPOSE) $($(DOCKER) ps -a -q)

clean-all: clean clean-docker

.PHONY: clean clean-docker clean-all