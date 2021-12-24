package ru.lookBag;

public class Main {

    public static void main(String[] args) {
	// Первая задача

        byte Byte = 5;
        short Short = -28659;
        int Int = 326554854;
        long Long = 5816545181519954324L;

        float Float = 568.123786f;
        double Double = -41.288452261154;

        char Char = 'C';
        boolean thisTrueOrFalse = true;

    // Вторая задача

        double weightFirstBoxer = 78.2;
        double weightSecondBoxer = 82.7;
        double totalWeight = weightFirstBoxer + weightSecondBoxer;
        double weightDifference = weightSecondBoxer - weightFirstBoxer;

        System.out.println("Общий вес бойцов: " + totalWeight + " кг");
        System.out.println("Разница между весами бойцов: " + weightDifference + " кг");
        System.out.println();

    // Третья задача

        int bananas = 80;
        int milk = 105;
        int iceCream = 100;
        int eggs = 70;
        int quantityBananas = 5;
        int quantityMilk = 2;
        int quantityIceCream = 2;
        int quantityEggs = 4;

        int totalBananas = bananas * quantityBananas;
        int totalMilk = milk * quantityMilk;
        int totalIceCream = iceCream * quantityIceCream;
        int totalEggs = eggs * quantityEggs;
        int totalGrams = totalEggs + totalBananas + totalMilk + totalIceCream;
        double totalKilograms = (double)totalGrams / 1000;
        System.out.println("Спорт завтрак: " + totalGrams + " г. или " + totalKilograms + " кг.");
        System.out.println();

    // Четвертая задача

        int weightLoss = 7000;
        int poorDiet = 250;
        int strongDiet = 500;

        int daysPoorDiet = weightLoss / poorDiet;
        int daysStrongDiet = weightLoss / strongDiet;
        int average = (daysPoorDiet + daysStrongDiet) / 2;

        System.out.println(daysPoorDiet + " дней при деете в 250 г.");
        System.out.println(daysStrongDiet + " дней при деете в 500 г.");
        System.out.println(average + " дней в среднем понадобится");
        System.out.println();

    // Пятая задача

        double salaryMashaMonth = 67760;
        double salaryDenisMonth = 83690;
        double salaryCrisMonth = 76230;
        double salaryMashaYear = salaryMashaMonth * 12;
        double salaryDenisYear = salaryDenisMonth * 12;
        double salaryCrisYear = salaryCrisMonth * 12;

        double newSalaryMashaMonth = (salaryMashaMonth / 100) * 110;
        double newSalaryDenisMonth = (salaryDenisMonth / 100) * 110;
        double newSalaryCrisMonth = (salaryCrisMonth / 100) * 110;
        double newSalaryMashaYear = newSalaryMashaMonth * 12;
        double newSalaryDenisYear = newSalaryDenisMonth * 12;
        double newSalaryCrisYear = newSalaryCrisMonth * 12;

        double incomeDifferenceMasha = newSalaryMashaYear - salaryMashaYear;
        double incomeDifferenceDenis = newSalaryDenisYear - salaryDenisYear;
        double incomeDifferenceCris = newSalaryCrisYear - salaryCrisYear;

        System.out.println("Маша теперь получает " + (int)newSalaryMashaMonth + " рублей. Годовой доход вырос на " + (int)incomeDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + (int)newSalaryDenisMonth + " рублей. Годовой доход вырос на " + (int)incomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + (int)newSalaryCrisMonth + " рублей. Годовой доход вырос на " + (int)incomeDifferenceCris + " рублей.");


    }
}
