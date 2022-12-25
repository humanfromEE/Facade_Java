public class LetterHospital { // Виписка пацієнта  (підсистема)
    // Поля даних
    String diagnosis;
    String resultAnswer;
    private String dateStart;
    private String dateEnd;

    // Конструктори й методи
    public LetterHospital(String diagnosis, String resultAnswer, String dateStart,  String dateEnd) {
        this.diagnosis = diagnosis;
        this.resultAnswer = resultAnswer;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() { // Конвертування у строку
        StringBuilder stringBuilder = new StringBuilder("Letter hospital:\n");
        stringBuilder.append("\tdiagnosis: ").append(diagnosis).append("\n");
        stringBuilder.append("\tresult: ").append(resultAnswer).append("\n");
        stringBuilder.append("\tdate start: ").append(dateStart).append("\n");
        stringBuilder.append("\tdate end: ").append(dateEnd).append("\n");
        return stringBuilder.toString();
    }
}
