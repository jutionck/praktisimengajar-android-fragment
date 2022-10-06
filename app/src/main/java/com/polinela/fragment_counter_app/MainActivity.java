package com.polinela.fragment_counter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.polinela.fragment_counter_app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // viewBinding
    private ActivityMainBinding binding;
    // Daftarkan fragment yang berada dalam activity
    private CounterFragment fragmenCounter;
    private CounterShowFragment fragmentCounterShow;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // kita inisialisasi fragment, supaya di tampilkan
        fragmenCounter = new CounterFragment();
        fragmentCounterShow = new CounterShowFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(binding.counterFragment.getId(), fragmenCounter, null)
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(binding.counterShowFragment.getId(), fragmentCounterShow, null)
                .commit();
    }

    // counter = counter + 1
    public void notifyIncrease() {
        counter++;
        fragmentCounterShow.notifyShowCounter(counter);
    }

    // counter = counter - 1
    public void notifyDecrease() {
        counter--;
        fragmentCounterShow.notifyShowCounter(counter);
    }
}