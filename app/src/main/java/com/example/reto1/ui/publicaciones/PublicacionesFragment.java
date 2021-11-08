package com.example.reto1.ui.publicaciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;

import com.example.reto1.databinding.FragmentPublicacionesBinding;
//import com.example.reto1.databinding.FragmentDashboardBinding;

public class PublicacionesFragment extends Fragment {

    private PublicacionesViewModel publicacionesViewModel;
    private FragmentPublicacionesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        publicacionesViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(PublicacionesViewModel.class);

        binding = FragmentPublicacionesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textView4;
        publicacionesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}