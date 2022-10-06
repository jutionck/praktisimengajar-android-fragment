package com.polinela.fragment_counter_app;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.polinela.fragment_counter_app.databinding.FragmentCounterShowBinding;

public class CounterShowFragment extends Fragment {

    private FragmentCounterShowBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCounterShowBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void notifyShowCounter(int counter) {
        binding.counterValue.setText(String.valueOf(counter));
    }
}