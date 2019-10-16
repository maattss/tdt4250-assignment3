# TDT4250 - Advanced Software Engineering - Assignment 3

## Content

Model To Text (M2T) transformation of Ecore model to HTML using Acceleo.

- Ecore model project: tdt4250.studyplan.model
- Acceleo project, transformation: tdt4250.studyplan.acceleo

Generated HTML-file located in tdt4250.studyplan.acceleo/generated folder

## Development and running transformation

How the model is transformed from Ecore to HTMl is described in the generate.mtl file. Edit this file if you want to change how the transforamtion is done.
To re-generate HTML file, using this transformation, run the generate-mtl file. In order for the generation to work properly specify these run configurations:

- Right-click generate.mtl file, 'Run-As', 'Run Configurations...'
- Select 'Acceleo Application' and click 'New launch configuration'
- Name: "Studyplan generate.mtl"
- Project: "tdt4250.studyplan.acceleo"
- Main class: "tdt4250.studyplan.acceleo.main.Generate"
- Model: "/tdt4250.studyplan.model/model/Sample.xmi"
- Target: "/tdt4250.studyplan.acceleo/generated/"

## Constraints

- Each semester can contain courses summarizing in a total of 30 credits (validated using OCL).
- Each course need to be at least 5 credits (manually written validation).

## Model structure

Study plan (program) with semesters, courses and specializations.
A program includes multiple semesters with optional specializations (single or multiple).
Every courses included in a semester can be mandatory or elective.

### Plant UML diagram

![plant UML model](https://i.imgur.com/q3alEsn.png)

## Model impovements from assignment 1

Based on feedback from assignment 1, the following model improvements have been done:

- Add a top level object i.e. Department where courses are contained
- Add a datatype for spring/fall in semesters
- Remove numbers from courses
- Rename "code" attributes

## Sample data

The Sample.xmi describes two studyprograms from the Department of Computer Science with specializations and courses:

- Msc - 2 year - Computer Science (MIDT)
  - Software Development
  - Artificial Intelligence
  - Databases and Search
- Msc - 2 year - Informatics (MSIT)
  - Software
  - Interaction Design, Game and Learning Technology

## Transformation
