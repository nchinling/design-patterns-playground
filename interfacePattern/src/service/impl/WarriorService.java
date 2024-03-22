package service.impl;

import service.GameMovesService;

public class WarriorService implements GameMovesService {
    
    @Override
    public String fight(){
        String fightMove = "Hee ya chop!";
        return fightMove;
    }

    @Override 
    public String defend(){
        String defendMove = "Warrior shield!";
        return defendMove;
    }

    @Override 
    public String usePower(){
        String usePowerMove = "Bazooka chop!";
        return usePowerMove;
    }
}


// String fight();

// String defend();

// String usePower();

// String useRecoverPotion();