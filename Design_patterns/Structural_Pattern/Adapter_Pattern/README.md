Introduction

The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together.
It acts as a bridge between two different interfaces.

In this example, we simulate:

A third-party Weather API that returns temperature in Fahrenheit.

A Weather Service (our system) that expects temperature in Celsius.

An Adapter that converts the Fahrenheit values into Celsius values before returning them to our system.

Running the Program:

Compile the code (from inside src folder):

javac Design_patterns/Structural_Pattern/Adapter_Pattern/*.java


Run the main program:

java Design_patterns.Structural_Pattern.Adapter_Pattern.Main