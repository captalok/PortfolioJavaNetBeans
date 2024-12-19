/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;

/**
 *
 * @author alk_6
 */
public class ColorGenerator {
    // Define your colors
    private static final Color[] primaryColors = {
        Color.decode("#3F51B5"),   
        Color.decode("#009688"),   
        Color.decode("#FF5722"),
        Color.decode("#607D8B"),
        Color.decode("#FF9800"),
        Color.decode("#9C27B0"),
        Color.decode("#2196F3"),
        Color.decode("#EA676C"),
        Color.decode("#E41A4A"),
        Color.decode("#5978BB"),
        Color.decode("#018790"),
        Color.decode("#00B0AD"),
        Color.decode("#721D47"),
        Color.decode("#EA4833"),
        Color.decode("#EF937E"),
        Color.decode("#F37521"),
        Color.decode("#A12059"),
        Color.decode("#126881"),
        Color.decode("#8BC240"),
        Color.decode("#364D5B"),
        Color.decode("#C7DC5B"),
        Color.decode("#0094BC"),
        Color.decode("#E4126B"),
        Color.decode("#43B76E"),
        Color.decode("#7BCFE9"),
        Color.decode("#483D8B"),
        Color.decode("#556B2F"),
        Color.decode("#8B008B"),
        Color.decode("#2F4f4F"),
        Color.decode("#3C1414"),
        Color.decode("#9400D3"),
        Color.decode("#36454F"),
        Color.decode("#8B0000"),
        Color.decode("#654321"),
        Color.decode("#003366"),
        Color.decode("#9400D3"),
        Color.decode("#4B0082"),
        Color.decode("#08457E"),
        Color.decode("#8B4513"),
        Color.decode("#800000"),
        Color.decode("#986960"),
        Color.decode("#BC8F8F"),
        Color.decode("#918151"),
        Color.decode("#B71C46")        
        // Add more colors if needed
    };

    private static final Color[] secondaryColors = new Color[primaryColors.length];
    private static final Color[] thirdColors = new Color[primaryColors.length];

    static {
        for (int i = 0; i < primaryColors.length; i++) {
            secondaryColors[i] = generateDarkerShade(primaryColors[i]);
            thirdColors[i] = generateDarkerShade(secondaryColors[i]);
        }
    }

    // Method to generate a darker shade of a given color
    private static Color generateDarkerShade(Color color) {
        int red = Math.max((int)(color.getRed() * 0.7), 0);
        int green = Math.max((int)(color.getGreen() * 0.7), 0);
        int blue = Math.max((int)(color.getBlue() * 0.7), 0);
        return new Color(red, green, blue);
    }

    // Method to generate a random primary color
    public static Color generateRandomPrimaryColor() {
        int index = (int) (Math.random() * primaryColors.length);
        return primaryColors[index];
    }

    // Method to generate a secondary color based on the given primary color
    public static Color generateSecondaryColor(Color primaryColor) {
        // Find the index of the primary color
        int index = -1;
        for (int i = 0; i < primaryColors.length; i++) {
            if (primaryColors[i].equals(primaryColor)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return secondaryColors[index];
        } else {
            // Return a default secondary color if the given color is not found
            return secondaryColors[0];
        }
    }

    // Method to generate a third color based on the given secondary color
    public static Color generateThirdColor(Color secondaryColor) {
        // Find the index of the secondary color
        int index = -1;
        for (int i = 0; i < secondaryColors.length; i++) {
            if (secondaryColors[i].equals(secondaryColor)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return thirdColors[index];
        } else {
            // Return a default third color if the given color is not found
            return thirdColors[0];
        }
    }

}
