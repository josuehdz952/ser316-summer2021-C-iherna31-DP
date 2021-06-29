package trainerDP;

/**
 * Used to simplify access to functionality in trainer.java when assesing a win
 * for a trainer. The facade provides a simple, single class interface that
 * hides the implementation detatils of the underlying code Taken from Go4
 * Facade Structural design pattern
 * 
 * @author irvin
 * @version 1.0
 *
 */
public class winnerFacade {
    public void assesWon(trainer t, int xp) {
        t.addXP(xp);
        int tempXp = t.getTrainerXP();
        int tempLevel = t.getTrainerLevel();
        System.out.printf("Trainer %s has leveled up to %d with %d XP\n", t.name, tempLevel, tempXp);
    }
}
