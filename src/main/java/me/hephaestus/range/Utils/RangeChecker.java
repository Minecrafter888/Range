package me.hephaestus.range.Utils;

import org.bukkit.Location;
import org.bukkit.entity.Player;

// Create a utility class for range checking
public class RangeChecker {
    // Method to check if a player is within range of a target location
    public static boolean isInRange(Player player, Location location, double range) {
        // Get the player's current location
        Location playerLocation = player.getLocation();

        // Calculate the distance between the player's location and the target location
        double distance = playerLocation.distance(location);

        // Check if the distance is within the specified range
        return distance <= range;
    }

}
