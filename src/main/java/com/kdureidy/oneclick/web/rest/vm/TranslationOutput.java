package com.kdureidy.oneclick.web.rest.vm;

public class TranslationOutput {

    private String output;
    private String detectedLanguage;
    private double detectedLanguageConfidence;
    private TranslationStatus status;

    public TranslationOutput() {
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getDetectedLanguage() {
        return detectedLanguage;
    }

    public void setDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
    }

    public double getDetectedLanguageConfidence() {
        return detectedLanguageConfidence;
    }

    public void setDetectedLanguageConfidence(double detectedLanguageConfidence) {
        this.detectedLanguageConfidence = detectedLanguageConfidence;
    }

    public TranslationStatus getStatus() {
        return status;
    }

    public void setStatus(TranslationStatus status) {
        this.status = status;
    }
}
