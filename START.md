# OpenPodcastAPI

## References

- https://github.com/OpenAPITools/openapi-generator?tab=readme-ov-file#15---homebrew

## Installation and setup

- Install the client sdk generator 

`brew install openapi-generator`

## Generate SDK

Generate SDK for Java

- `/opt/homebrew/bin/openapi-generator generate  -i ../schema.yml -g java`

## Install

- Install `mvn`

`brew install mvn`

- Build the code

`mvn clean install`