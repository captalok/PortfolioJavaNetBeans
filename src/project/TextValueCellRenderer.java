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
public class TextValueCellRenderer extends DefaultTableCellRenderer {

    private int targetColumn;

    public TextValueCellRenderer(int targetColumn) {
        this.targetColumn = targetColumn;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (column == targetColumn && value != null) {
            String cellValue = value.toString();
            switch (cellValue) {
                case "Receipt":
                    cell.setForeground(Color.BLUE);
                    break;
                case "Payment":
                    cell.setForeground(Color.RED);
                    break;
                case "Trades":
                    cell.setForeground(Color.BLUE);
                    break;
                case "Finance":
                    cell.setForeground(Color.RED);
                    break;
                case "Alok":
                    cell.setForeground(Color.RED);
                    break;
                case "Aryan":
                    cell.setForeground(Color.DARK_GRAY);
                    break;
                case "Akash":
                    cell.setForeground(Color.blue);
                    break;
                case "PaySlip":
                    cell.setForeground(Color.MAGENTA);
                    break;
                case "Immediate":
                    cell.setForeground(Color.RED);
                    break;
                case "Routine":
                    cell.setForeground(Color.DARK_GRAY);
                    break;
                case "Priority":
                    cell.setForeground(Color.BLUE);
                    break;
                case "Self":
                    cell.setForeground(Color.MAGENTA);
                    break;
                default:
                    cell.setForeground(Color.BLACK); // Default color for other values
                    break;
            }
        } else {
            cell.setForeground(Color.BLACK); // Default color for other columns
        }

        return cell;
    }
}
