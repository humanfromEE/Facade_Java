public class DataOfPacient { // Дані про пасієнта (фасад - головна система)
    // Поля даних
    private MainCharacteristics mainCharacteristics;
    private SecondaryCharacteristics secondaryCharacteristics;
    private HistoryRoomClinicAndData historyRoomClinicAndData;
    private LetterHospital letterHospital;
    
    // Конструктори й методи
    public DataOfPacient(
        String fullname, int age, String firstDiagnosis, String date,
        double height, int numberRoomClinic, String colorHair,
        String firstRoomClinic, String mobileNumber
    ) {
        mainCharacteristics = new MainCharacteristics(fullname, age, firstDiagnosis, date);
        secondaryCharacteristics = new SecondaryCharacteristics(height, numberRoomClinic, colorHair);
        historyRoomClinicAndData = new HistoryRoomClinicAndData(firstRoomClinic, numberRoomClinic, mobileNumber);
        letterHospital = null; // Поки не буде використаний метод про виписку даних (до першої виписки)
    }

    public void setMainCharacteristics(String fullname, int age, String firstDiagnosis, String date) { // Установка нових даних про головні характеристики
        mainCharacteristics = new MainCharacteristics(fullname, age, firstDiagnosis, date);
    }

    public void setSecondaryCharacteristics(
        double height, int numberRoomClinic, String colorHair,
        String nameRoomClinic, String mobileNumber
    ) { // Установка нових даних про другорядні характеристики
        secondaryCharacteristics = new SecondaryCharacteristics(height, numberRoomClinic, colorHair);
        setRoomClinic(nameRoomClinic, numberRoomClinic, mobileNumber);
    }

    public void setRoomClinic(String roomClinic, int number, String mobileNumber) { // Установка нових даних про палату
        historyRoomClinicAndData.setData(roomClinic, number, mobileNumber);
        secondaryCharacteristics.setNumberClinic(number);
    }

    public void setLetterHospital(String diagnosis, String resultAnswer, String dateEnd) { // Виписка пацієнта
        letterHospital = new LetterHospital(diagnosis, resultAnswer, mainCharacteristics.getDate(), dateEnd);
    }

    public void setNullLetterHospital() { // При повторному попаданні в лікарню
        letterHospital = null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mainCharacteristics.toString());
        stringBuilder.append(secondaryCharacteristics.toString());
        stringBuilder.append(historyRoomClinicAndData.toString());
        stringBuilder.append((letterHospital != null) ? letterHospital.toString() : "Letter hospital - not get\n");
        return stringBuilder.toString();
    }
}