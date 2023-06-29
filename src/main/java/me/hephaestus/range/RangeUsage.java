package me.hephaestus.range;
// This code demonstrates the usage of a RangeChecker utility class to check if a player is within a certain range of a target location.

/*
* Import necessary classes
* note this will happen automatically or with ALT+ENTER
 */
import me.hephaestus.range.Utils.RangeChecker;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class RangeUsage {
    // Method to check if a player is within range of a target location
    public void someMethod(Player player) {
        // Define the target location
        Location targetLocation = new Location(player.getWorld(), 0, 0, 0);

        // Define the desired range
        double range = 10.0;

        // Check if the player is within range using the RangeChecker utility class
        boolean isInRange = RangeChecker.isInRange(player, targetLocation, range);

        // Perform actions based on the result
        if (isInRange) {
            // Player is within range
            // Perform appropriate actions
        } else {
            // Player is outside the range
            // Perform alternative actions
        }
    }

}
