/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author cdroguet
 */
public class Flute implements IInstrument{

    @Override
    public String play() {
       return "tweet";
    }

    @Override
    public int getSoundVolume() {
        return 4;
    }

    @Override
    public String getColor() {
        return "wooden";
    }
    
}
