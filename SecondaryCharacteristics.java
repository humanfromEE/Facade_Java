public class SecondaryCharacteristics { // Другорядні характеристики (підсистема)
    // Поля даних
    private double height;
    private int numberRoomClinic;
    private String colorHair;

    // Конструктори й методи
    public SecondaryCharacteristics(double height, int numberRoomClinic, String colorHair) {
        this.height = height;
        this.numberRoomClinic = numberRoomClinic;
        this.colorHair = colorHair;
    }

    public void setNumberClinic(int numberRoomClinic) { // Уставновка нової палати
        this.numberRoomClinic = numberRoomClinic;
    }

    @Override
    public String toString() { // Конвертування у строку
        StringBuilder stringBuilder = new StringBuilder("Secondary characteristics:\n");
        stringBuilder.append("\theight: ").append(height).append("\n");
        stringBuilder.append("\tnumber room clinic: ").append(numberRoomClinic).append("\n");
        stringBuilder.append("\tcolor hair: ").append(colorHair).append("\n");
        return stringBuilder.toString();
    }
}
