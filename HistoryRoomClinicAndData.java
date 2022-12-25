import java.util.ArrayList; // Для долучення історії пацієнта

public class HistoryRoomClinicAndData { // Історія переведення пацієнта з палати в палату  (підсистема)
    // Поля даних
    private ArrayList<String> history;
    private int number;
    private String mobileNumber; 

    // Конструктори й методи
    public HistoryRoomClinicAndData(String firstRoomClinic, int number, String mobileNumber) {
        history = new ArrayList<String>();
        history.add(firstRoomClinic);
        this.number = number;
        this.mobileNumber = mobileNumber;
    }

    public void setData(String roomClinic, int number, String mobileNumber) { // Перевод до іншої палати
        history.add(roomClinic);
        this.number = number;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() { // Конвертування у строку
        StringBuilder stringBuilder = new StringBuilder("History rooms of clinic:\n");
        for (int i = 0; i < history.size(); i++) {
            stringBuilder.append("\t").append(history.get(i)).append("\n");
        }
        stringBuilder.append("Number last clinic room: ").append(number).append("\n");
        stringBuilder.append("Mobile number last clinic room: ").append(mobileNumber).append("\n");
        return stringBuilder.toString();
    }
}
