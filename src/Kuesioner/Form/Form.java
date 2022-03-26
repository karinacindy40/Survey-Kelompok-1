/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kuesioner.Form;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demi
 */
public abstract class Form {

    private List<String> errorMessages = new ArrayList<String>();

    public abstract boolean save();

    public abstract boolean validate();

    public abstract void reset();

    public abstract void print();

    public void addErrorMessages(String errorMessage) {
        errorMessages.add(errorMessage);
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }
}
