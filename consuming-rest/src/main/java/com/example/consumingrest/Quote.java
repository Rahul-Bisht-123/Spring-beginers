package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//creating a domain class to contain the data that we need
//The follwing listing shows the Quote record class ,which we can use as our domain class


@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type,Value value){}


// This simple Java record class is annotated with @JsonIgnoreProperties 
// from the Jackson JSON processing library to indicate that any properties 
// not bound in this type should be ignored.

