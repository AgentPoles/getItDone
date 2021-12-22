package com.mycompany.myapp.getitdone;

public class EllaTwoEEE {

    double voltage;
    double current;
    double resistance;

    public double findResistance(double voltage, double current){
        return voltage/current;
    }

    public double averageResistance(double resistance, int factor){
        return resistance/factor;
    }

    public double findUnknownBridgeResistorWheatStone(double R1, double R2, double R3){
        return (R1*R3)/R2;
    }

    public double findUnknownCapacitorScheringBridge(double R3, double R1, double C2){
        return (R3 * C2)/R1;
    }

    public double findUnknownResistanceScheringBridge(double R2, double C2, double C3){
        return (C3 * R2)/C2;
    }

    public double averageCapacitance(double capacitance, int factor){
        return capacitance/factor;
    }

    public double findUnknownResistanceUsingMaxwellBridge(double R1, double R2, double R3){
        return (R1*R2)/R3;
    }

    public double findUnknownInductanceUsingMaxwellsBridge(double R1, double R2, double C){
        return (R1*R2*C);
    }
    public double averageInductance(double inductance, int factor){
        return (inductance/factor);
    }

    public double findInductanceUsingLn(double R, double t, double L, double V, double Vr){
        double base = Math.log(V/(V-Vr))*L;
        return (R*t)/base;
    }

    public double deflectionSensitivity(double voltage, double deflection){
        return voltage/deflection;
    }

    public double averagedeflection( double s, int factor){
        return s/factor;
    }

    public double peakVoltage(double vrms){
        return vrms/Math.sqrt(2);
    }

    public double deflectionSensitivityLong(double L, double Vp){
        return (2*Vp)/L;
    }

    public double measurePeriod(double d, double t){
        return d*t;
    }

    public double measuredFrequency(double period){
        return 1/period;
    }

    public double voltageRatio(double v1, double v2){
        return v2/v1;
    }

    public double turnsRatio(double N1, double N2){
        return N2/N1;
    }

    public double powerFactor(double powerInWatts, double v, double i){
        return powerInWatts/(i*v);
    }

    public double powerInVA(double i, double v){
        return i*v;
    }

    public double efficiencyWithPower(double w1, double w2){
        return w2/w1;
    }

    public double EmfFrowTerminalVoltageSeperatelyExcited(double terminalVoltage, double i, double R){
        return terminalVoltage + (i*R);
    }

    public double EmfFrowTerminalVoltageShuntExcited(double vt, double il, double If, double Ra){
        return (vt + (If+il)*Ra);
    }

    public double torqueMotorInputPower(double Ia, double If, double v){
        return (Ia + If)*v;
    }

    public double torqueMotorOutputPower(double ia, double If, double ra, double v){
        double firstpart = v*(ia+If);
        double secondpart = Math.pow(ia,2)*ra;
        return firstpart - secondpart;
    }


}
