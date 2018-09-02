# Animal Demo
This is a demo of object modelling in Java using Animals as examples.

> Note: This is an assignment and the answer to the questions in the assignments
are tagged using versions like v1.1, v1.2, etc.

# Object models

## Overview

````
AbstractAnimal <- Animal (I)
 |- attributes: song, color, size
 |
 |- Bird <- SingAbility, WalkAbility
 |  |- FlyingBird <- FlyAbility
 |  |  |- Duck
 |  |  |- Parrot(SingAbility friend)
 |  |- Chicken
 |- Butterfly
 |- Cat 
 |- Caterpillar <- MorphAbility
 |- Fish
 |  |- Clowfish <- MakeJokeAbility
 |  |- Shark <- EatOwnKindAbility
 |- Dog
 |- Dolphin(fish)
 |- Rooster(chicken)
 
Phone <- SingAbility

Note: Some abilities are ommitted for brevity.
````

 * The `AbstractAnimal` is the parent class of all animals.
 * The abilities are defined in interfaces like `FlyAbility`, `SingAbility`,
 etc.
 * These abilities are separated to make them loosely coupled with the animals.
 * Other objects outside of animals like a `Phone` can implement the same
 abilities. Thus a `Parrot` can mimic any object as long as it has the singing
 ability.
 * The `Dolphin` and `Rooster` implementations are examples of getting the
 attributes and behaviors of fish and chicken, respectively without directly
 inheriting them.
 
## Demo
Run the different test cases to see how each object is used and how it interacts
with others.

## Enhancements
The models are created in such a way that enhancements like adding new abilities
or animals are not tied to the parent class and will not break the structure.

# Web service
A sample RESTful service can be implemented with the following:

## Create animal
PUT /v2/animal

Request:
````json
{
  "type": "CHICKEN",
  "song": "Cluck, cluck",
  "size": "SMALL",
  "color": "BLACK"
}
````
Response:
````json
{
  "result": "SUCCESS",
  "id": 123
}

````

## Get animal
GET /v2/animal/{id}
````
GET /v2/animal/123
````
