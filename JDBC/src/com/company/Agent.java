package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Agent {

    private String name;
    private Long generatedFund;

    public Long getGeneratedFund() {
        return generatedFund;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGeneratedFund(Long generatedFund) {
        this.generatedFund = generatedFund;
    }

    public Agent() {
        // TODO Auto-generated constructor stub
        super();
    }
    public Agent(String name , Long generatedFund) {
        this.name = name;
        this.generatedFund = generatedFund;
    }

    public String toString() {
        return "Agent name : " + name + " genertedFund " + generatedFund;

    }
}















