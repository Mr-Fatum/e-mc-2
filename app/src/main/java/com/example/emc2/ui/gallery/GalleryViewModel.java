package com.example.emc2.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private String task1, task2, task3, task4;

    public GalleryViewModel() {
        task1 = "Задача№1:\nВесёлая задача: \n Расскажу я вам, дружочки, \n Как вышащивать грибочки: \n Нужно в поле утром рано \n Cдвинуть два куска урана... \n \n Вопрос: Какова должна быть общая масска кусков урана, чтобы произошел ядерный взрыв?";
        task2 = "\n\nЗадача№2:\nЛётчик самолёта Як-3, летевшего со скоростью 140 м/с открыл огонь из пулемёта по вражескому самолёту Ме-109, летевшему в том же направлении со скоростью 150 м/с. Скорость вылета пули, относительно Як-3 800 м/с. Какова скорость пули относительно Ме-109? Относительно неподвижного наземного наблюдателя?";
        task3 = "\n\nЗадача№3:\nСредняя скорость полёта реактивного снаряда боевой ракетной установки «Катюша» 212,5 м/с, максимальная дальность полёта снаряда - 8,5 км. Через какое время прилетит снаряд на позиции врага?";
        task4 = "\n\nЗадача№2:\nВ бутылку вмещается 500мл воды. Вместится ли в эту бутылку 720г серной кислоты?";
        mText = new MutableLiveData<>();
        mText.setValue(task1 + "\n" + task4);
    }

    public LiveData<String> getText() {
        return mText;
    }
}