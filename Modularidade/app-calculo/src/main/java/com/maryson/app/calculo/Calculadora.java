package com.maryson.app.calculo;

import com.maryson.app.calculo.interno.OperacoesAritmeticas;
import com.maryson.app.logging.Logger;

public class Calculadora {
    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAritmeticas.soma(nums);
    }
}
