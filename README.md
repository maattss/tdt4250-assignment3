# TDT4250 - Advanced Software Engineering - Assignment 3

Model To Text (M2T) transformation of Ecore model to HTML using Acceleo.

- Ecore project (model): [tdt4250.studyplan.model](https://github.com/maattss/tdt4250-assignment3/tree/master/tdt4250.studyplan.model)
- Acceleo project (transformation): [tdt4250.studyplan.acceleo](https://github.com/maattss/tdt4250-assignment3/tree/master/tdt4250.studyplan.acceleo)

Generated HTML-file located in [tdt4250.studyplan.acceleo/generated](https://github.com/maattss/tdt4250-assignment3/tree/master/tdt4250.studyplan.acceleo/generated) folder

## Development and running transformation

How the model is transformed from Ecore to HTML is described in the [generate.mtl](./tdt4250.studyplan.acceleo/src/tdt4250/studyplan/acceleo/main/generate.mtl) file. Edit this file if you want to change how the transformation is done.

To re-generate HTML file run, the generate.mtl file using this procedure and configurations:

1. Right-click generate.mtl file, 'Run-As', 'Run Configurations...'
2. Select 'Acceleo Application' and click 'New launch configuration'
    - Name: 'Studyplan generate.mtl'
    - Project: 'tdt4250.studyplan.acceleo'
    - Main class: 'tdt4250.studyplan.acceleo.main.Generate'
    - Model: '/tdt4250.studyplan.model/model/Sample.xmi'
    - Target: '/tdt4250.studyplan.acceleo/generated/'
3. Click 'Run'

## Constraints

- Each semester can contain courses summarizing in a total of 30 credits (validated using OCL).
- Each course need to be at least 5 credits (manually written validation).

## Model structure

Department with courses and programs (study plans).
A program includes multiple semesters and courses with optional specializations (single or multiple).
A courses included in a semester can be mandatory or elective.

### Plant UML diagram

<img src="https://i.imgur.com/q3alEsn.png" width="80%">

## Model improvements from assignment 1

Based on feedback, the following model improvements have been done:

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

## HTML rendered screenshot

<img src="https://i.imgur.com/n2xFHJJ.png" width="80%">
