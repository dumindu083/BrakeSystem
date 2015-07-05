/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileConnection;

import javax.swing.JOptionPane;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

public class IO {

    //Inputs
    double Obstacle;
    double BrakeForce;
    double SlipRatio;

    public double getObstacle() {
        return Obstacle;
    }

    public void setObstacle(double Obstacle) {
        this.Obstacle = Obstacle;
    }

    public double getBrakeForce() {
        return BrakeForce;
    }

    public void setBrakeForce(double BrakeForce) {
        this.BrakeForce = BrakeForce;
    }

    public double getSlipRatio() {
        return SlipRatio;
    }

    public void setSlipRatio(double SlipRatio) {
        this.SlipRatio = SlipRatio;
    }

    //Output
    double PWM;

    public double getPWM() {
        return PWM;
    }

    public void setPWM(double PWM) {
        this.PWM = PWM;
    }

    //Perfoming Mamdani
    public void evalutaePWM(IO io) {

        String filename = "braker.fcl";

        FIS fis = FIS.load(filename, true); //Where the FCL file is loaded 

        if (fis == null) { // Exception Handling for FileNotFound
            JOptionPane.showMessageDialog(null, "Error while loading the file...", new UI.Controller().getTitle(), JOptionPane.ERROR_MESSAGE);
            return;
        }
        FunctionBlock functionBlock = fis.getFunctionBlock(null);

        //Getting the variables from the FCL file      
        Variable obstacle = functionBlock.getVariable("Obstacle");
        Variable brakeForce = functionBlock.getVariable("BrakeForce");
        Variable slipRatio = functionBlock.getVariable("SlipRatio");

        //initializing variables with the values taken from the UI
        obstacle.setValue(io.getObstacle());
        brakeForce.setValue(io.getBrakeForce());
        slipRatio.setValue(io.getSlipRatio());

        functionBlock.evaluate(); // evaluate for a crisp output based on the rules defined in the FCL file

        Variable PWM = functionBlock.getVariable("PWM");//Getting the variable from the FCL file

        PWM.defuzzify(); // sets the defuzzified value to the output variable

        io.setPWM((double) Math.round(PWM.getLatestDefuzzifiedValue() * 100) / 100);

    }

    //ploting graphs    
    public void plotGraphs(IO io) {

        String filename = "braker.fcl";

        FIS fis = FIS.load(filename, true);

        if (fis == null) { // Exception Handling for FileNotFound
            JOptionPane.showMessageDialog(null, "Error while loading the file...", new UI.Controller().getTitle(), JOptionPane.ERROR_MESSAGE);
            return;
        }

        FunctionBlock functionBlock = fis.getFunctionBlock(null);

        //Getting the variables from the FCL file      
        Variable obstacle = functionBlock.getVariable("Obstacle");
        Variable brakeForce = functionBlock.getVariable("BrakeForce");
        Variable slipRatio = functionBlock.getVariable("SlipRatio");

        //initializing variables with the values taken from the UI
        obstacle.setValue(io.getObstacle());
        brakeForce.setValue(io.getBrakeForce());
        slipRatio.setValue(io.getSlipRatio());

        functionBlock.evaluate(); // evaluate for a crisp output based on the rules defined in the FCL file

        Variable PWM = functionBlock.getVariable("PWM");//Getting the variable from the FCL file

        PWM.defuzzify(); // sets the defuzzified value to the output variable

        //plotting the graphs of inputs
        JFuzzyChart.get().chart(obstacle, true);
        JFuzzyChart.get().chart(brakeForce, true);
        JFuzzyChart.get().chart(slipRatio, true);

        //plotting the graphs of output
        JFuzzyChart.get().chart(PWM, true);
        JFuzzyChart.get().chart(PWM, PWM.getDefuzzifier(), true);

    }

}
