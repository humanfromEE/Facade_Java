public class MainCharacteristics { // Головні характеристики (підсистема)
    // Поля даних
    private String fullname;
    private int age;
    private String firstDiagnosis;
    private String date;

    // Конструктори й методи
    public MainCharacteristics(String fullname, int age, String firstDiagnosis, String date) {
        this.fullname = fullname;
        this.age = age;
        this.firstDiagnosis = firstDiagnosis;
        this.date = date;
    }

    public String getDate() { // Для виписки
        return date.substring(0, date.length()); 
        // Повернув копію, щоб не було порушення інкапсуляції
        // Щоб дві різні змінні не посилались на одну строку й відпідно нічого не змінювалось, якщо буде така потреба
    }

    @Override
    public String toString() { // Конвертування у строку
        StringBuilder stringBuilder = new StringBuilder("Main characteristics:\n");
        stringBuilder.append("\tfullname: ").append(fullname).append("\n");
        stringBuilder.append("\tage: ").append(age).append("\n");
        stringBuilder.append("\tfirstDiagnosis: ").append(firstDiagnosis).append("\n");
        stringBuilder.append("\tdate: ").append(date).append("\n");
        return stringBuilder.toString();
    }
}