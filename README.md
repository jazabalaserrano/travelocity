# Serenity JUnit Starter project


This is the simplest possible build script setup for Serenity BDD using Java. 

This is a very minimal sample project using JUnit and Serenity BDD in Java. 
You can use this project as a quick starting point for your own projects.
## Google Version

	Version 90.0.4280.88 (Official Build) (64-bit)

## Maven version
	
	Version 3.6.2

## Java jdk Version
 	
	1.8.0

## Get the code

Git:

    git clone https://github.com/jazabalaserrano/travelolcity
    cd travelolcity


Or simply [download a zip](https://github.com/jazabalaserrano/travelolcity) file.

## Use Maven to run 5 automated test cases

Open a command window and run:

    mvn clean verify


## Use Maven to run a specific case from this list
	
	@travelocity
	@1buscarCrucero
	@2buscarCarro
	@inicioSesion
	@3buscarHotel
	@4buscarVuelo

Example:
- Open a command window and run:

	mvn test -Dcucumber.options="--tags @travelocity"
	mvn test -Dcucumber.options="--tags @1buscarCrucero"
	mvn test -Dcucumber.options="--tags @2buscarCarro"
	mvn test -Dcucumber.options="--tags @inicioSesion"
	mvn test -Dcucumber.options="--tags @3buscarHotel"
	mvn test -Dcucumber.options="--tags @4buscarVuelo"
	
	

## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!




