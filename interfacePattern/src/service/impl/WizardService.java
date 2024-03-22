package service.impl;

import service.GameMovesService;

public class WizardService implements GameMovesService {
    
    @Override
    public String fight(){
        String fightMove = "Confringo!";
        return fightMove;
    }

    @Override 
    public String defend(){
        String defendMove = "Illumina shield!";
        return defendMove;
    }

    @Override 
    public String usePower(){
        String usePowerMove = "Cursario!";
        return usePowerMove;
    }

}
