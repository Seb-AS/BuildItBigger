package com.example.sebas.myapplication.backend;

import com.sebas.JokeLibrary;

/**
 * The object model for the data we are sending through endpoints
 */
class MyBean {

    private JokeLibrary jokeLibrary;

    public MyBean() {
        jokeLibrary = new JokeLibrary();
    }

    public String getJoke() {
        return jokeLibrary.getRandomJoke();
    }
}