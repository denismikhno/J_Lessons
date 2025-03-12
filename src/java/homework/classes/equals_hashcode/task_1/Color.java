package homework.classes.equals_hashcode.task_1;

import java.util.Objects;

public class Color {
    private int red;
    private int green;
    private int blue;

    // Конструируем цвет с проверкой на допустимые значения
    public Color(int red, int green, int blue) throws Exception {
        if (red >= 0 && red <= 255) {
            this.red = red;
        } else {
            throw new Exception("Красный цвет не в том диапазоне!");
        }
        if (green >= 0 && green <= 255) {
            this.green = green;
        } else {
            throw new Exception("Зеленый цвет не в том диапазоне!");
        }
        if (blue >= 0 && blue <= 255) {
            this.blue = blue;
        } else {
            throw new Exception("Голубой цвет не в том диапазоне!");
        }
    }

    // переопределенные методы equals и hashCode для сравнения цветов
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    // метод main
    public static void main(String[] args) throws Exception {
        // создание цветов
        Color color1 = new Color(125, 125, 125);
        Color color2 = new Color(34, 34, 34);

        // сравнение цветов c помощью hashCode
        System.out.println(color1.hashCode());
        System.out.println(color2.hashCode());
        // проверка на равенство цветов с помощью equals
        System.out.println(color1.equals(color2));

//        // этот код вызовет ошибку т.к мы не попадаем в пределы цвета
//        Color color3 = new Color(256, 100, 100);
    }
}
