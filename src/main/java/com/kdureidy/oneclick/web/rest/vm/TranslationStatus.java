package com.kdureidy.oneclick.web.rest.vm;

public class TranslationStatus {

    private int elapsed_time;
    private int nb_characters;
    private int nb_tokens;
    private int nb_tus;
    private int nb_tus_failed;

    public TranslationStatus(){}

    public int getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(int elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public int getNb_characters() {
        return nb_characters;
    }

    public void setNb_characters(int nb_characters) {
        this.nb_characters = nb_characters;
    }

    public int getNb_tokens() {
        return nb_tokens;
    }

    public void setNb_tokens(int nb_tokens) {
        this.nb_tokens = nb_tokens;
    }

    public int getNb_tus() {
        return nb_tus;
    }

    public void setNb_tus(int nb_tus) {
        this.nb_tus = nb_tus;
    }

    public int getNb_tus_failed() {
        return nb_tus_failed;
    }

    public void setNb_tus_failed(int nb_tus_failed) {
        this.nb_tus_failed = nb_tus_failed;
    }
}
