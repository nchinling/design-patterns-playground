import service.GameMovesService;
import service.impl.WarriorService;
import service.impl.WizardService;

public class Game {
    
    public static void main(String[] args) {
        
        GameMovesService warriorMoves = new WarriorService();
        GameMovesService wizardMoves = new WizardService();

        System.out.println(warriorMoves.fight());
        System.out.println(warriorMoves.defend());

        System.out.println(wizardMoves.defend());
        
        System.out.println(wizardMoves.fight());
        System.out.println(warriorMoves.defend());
        System.out.println(warriorMoves.usePower());
        System.out.println(wizardMoves.usePower());
    }
}
