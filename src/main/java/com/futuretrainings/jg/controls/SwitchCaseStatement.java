package com.futuretrainings.jg.controls;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        int zensur = 7;
        String ergebnis = "";

        switch (zensur) {
            case 1:
                ergebnis = "sehr gut";
                break;
            case 2:
                ergebnis = "gut";
                break;
            case 3:
                ergebnis = "befriedigend";
                break;
            case 4:
                ergebnis = "ausreichend";
                break;
            case 5:
                ergebnis = "mangelhaft";
                break;
            case 6:
                ergebnis = "ungenügend";
                break;
            default:
                ergebnis = "ungültige Angabe";
        }

        System.out.println(ergebnis);

        String eat = "Noodles";
        switch (eat) {
            case "Fleich":
                System.out.println("Rind oder Schwein");
                break;
            case "Fisch":
                System.out.println("Kabeljau oder Forelle");
                break;
            case "Nudeln":
            case "Teigwaren":
            case "Noodles":
                System.out.println("Spaghetti oder Tortelini");
                break;
            default:
                System.out.println("Dann bleib halt hungrig...");

        }

        // Switch als Funktion
        String operator = "x";
        String strOperator = switch ( operator ) {
            case "+" -> "plus";
            case "-" -> "minus";
            case "*", "x" -> {
                System.out.println("Der mal-Bereich");
                yield "mal";
            }
            case "/" -> "durch";
            default -> "unbekannt";
        };

        System.out.println(strOperator);
    }
}
