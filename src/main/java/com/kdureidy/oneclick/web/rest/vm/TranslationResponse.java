package com.kdureidy.oneclick.web.rest.vm;

import java.util.List;

public class TranslationResponse {

    private List<TranslationOutput> outputs;

    public TranslationResponse() {
    }

    public List<TranslationOutput> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<TranslationOutput> outputs) {
        this.outputs = outputs;
    }
}
