package com.example.demo.model;

import java.util.List;

public class sqrt_power{
    String function;
    private List<String> input;
    private List<String> output;



	/**
     *
     * @param input
     * @param output
     * @param function
     * @return 
     */
    public sqrt_power(List<String> input, List<String> output, String function) {
         this.function = function;
         this.input  = input;
         this.output = output;
    }

    public List<String> getInput() {
         return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    /**
     *
     * @return
     */
    public List<String> getOutput() {
        return output;
    }

    /**
     *
     * @param output
     */
    public void setOutput(List<String> output) {
        this.output = output;
    }

    /**
     *
     * @return
     */
    public String getFunction() {
        return function;
    }

    /**
     *
     * @param function
     */
    public void setFunction(String function) {
        this.function = function;
    }
}