package com.example.emc2.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.emc2.ui.home.HomeViewModel.*;

import com.example.emc2.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private Button btn;
    private FragmentHomeBinding binding;
    public String task = "Весёлая задача: \n Расскажу я вам, дружочки, \n Как вышащивать грибочки: \n Нужно в поле утром рано \n Cдвинуть два куска урана... \n \n Вопрос: Какова должна быть общая масска кусков крана, чтобы произошел ядерный взрыв?";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}