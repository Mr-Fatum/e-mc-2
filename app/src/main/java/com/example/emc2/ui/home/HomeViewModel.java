package com.example.emc2.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    public String task = "Весёлая задача: \n Расскажу я вам, дружочки, \n Как вышащивать грибочки: \n Нужно в поле утром рано \n Cдвинуть два куска урана... \n \n Вопрос: Какова должна быть общая масска кусков урана, чтобы произошел ядерный взрыв?";

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(task);
    }

    public LiveData<String> getText() {
        return mText;
    }
}