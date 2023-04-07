package OOP_HW.Lesson_1;

import java.util.ArrayList;

public class Category {
    private String catName;
    private ArrayList<Object> catArray = new ArrayList<>();

    public Category(String catName) {
        this.catName = catName;
        this.catArray = catArray;
    }

    @Override
    public String toString() {
        return "Категория " + catName + ", Товары: " + catArray;
    }

    /**
     * Метод для добавления товара в категорию
     * @param goods карточка товара
     */
    public void addCategory(Object goods) {
        this.catArray.add(goods);
    }
}
