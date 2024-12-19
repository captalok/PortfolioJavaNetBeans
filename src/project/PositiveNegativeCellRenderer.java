/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author alk_6
 */
public class PositiveNegativeCellRenderer extends DefaultTableCellRenderer {
    private int targetColumn;
    private Color primaryColor = ColorGenerator.generateRandomPrimaryColor();
    private Color secondaryColor = ColorGenerator.generateSecondaryColor(primaryColor);
    private Color thirdColor = ColorGenerator.generateThirdColor(secondaryColor);

    public PositiveNegativeCellRenderer(int targetColumn) {
        this.targetColumn = targetColumn;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == targetColumn) {
            try {
                double numericValue = Double.parseDouble(value.toString().replaceAll("[^\\d.-]", ""));
                if (numericValue > 0) {
                    cell.setForeground(Color.BLUE);
                } else if (numericValue < 0) {
                    cell.setForeground(Color.MAGENTA);
                } else {
                    cell.setForeground(Color.BLACK); // Default color for zero values
                }
            } catch (NumberFormatException e) {
                // Handle the case where the cell value is not a number
                cell.setForeground(Color.BLACK); // Default color for non-numeric values
            }
        } else {
            cell.setForeground(thirdColor); // Default color for other columns
        }

        return cell;
    }
}
