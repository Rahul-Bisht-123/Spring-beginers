//we need an additional class , to embed the inner quotation itself.
//The Value record class fills that need 
package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Value(Long id , String quote){}

//this uses the same annotations but maps onto other data field.