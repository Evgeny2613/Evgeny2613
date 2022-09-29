package lessons.lesson3.enumeration;

public enum Fruits {
    APPLE(52), ORANGE(47), BANANA(89), KIWI(61);

    private  int calories;

    Fruits(int calories) {
        this.calories = calories;
    }
     public int getCalories() {
         return calories;
        }

    // Набор констант
    // нельзя расширить после создания
    // Все экземпляры создаются один раз
    // У каждого есть свой номер
}
