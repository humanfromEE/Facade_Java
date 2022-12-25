public class TestAllSystems {
    public static void main(String[] args) {
        String lineString = new String("\n====================================================================================================\n");

        // Занесення даних (образне)
        System.out.println("Paste data pacient (construcotor):" + lineString);
        DataOfPacient dataOfPacient = new DataOfPacient
        ("Bojan Krile", 18, "Stress", "19.11.2022",
        186, 1, "Brown",
        "Clinic room # 1", "+380 11 111 11 11");
        System.out.println(dataOfPacient.toString() + "\n\n\n");

        // Внесення зміни у характеристики
        System.out.println("Test setMainCharacteristics(...) and setSecondaryCharacteristics(...) :" + lineString);
        dataOfPacient.setMainCharacteristics("Bojan Krile", 18, "Stress", "20.11.2022");
        dataOfPacient.setSecondaryCharacteristics(186, 2, "brown", "Clinic room # 2", "+ 380 22 222 22 22");
        System.out.println(dataOfPacient.toString() + "\n\n\n");

        // Перевід з палати
        System.out.println("Test setRoomClinic(...):" + lineString);
        dataOfPacient.setRoomClinic("Clinic room # 3", 3, "+380 33 333 33 33");
        System.out.println(dataOfPacient.toString() + "\n\n\n");

        // Виписка з лікарні
        System.out.println("Test setLetterHospital(...):" + lineString);
        dataOfPacient.setLetterHospital("Mega stress", "Mega relax", "23.11.2022");
        System.out.println(dataOfPacient.toString() + "\n\n\n");
    }
}
