package com.dco.aplicatiesdv;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import org.jetbrains.annotations.NotNull;

public class SuggestFragment extends Fragment {

    FrameLayout frameCategory1, frameCategory2, frameCategory3, frameCategory4, frameCategory5, frameCategory6;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_suggest, container, false);

        frameCategory1 = view.findViewById(R.id.frameCategory1);
        frameCategory2 = view.findViewById(R.id.frameCategory2);
        frameCategory3 = view.findViewById(R.id.frameCategory3);
        frameCategory4 = view.findViewById(R.id.frameCategory4);
        frameCategory5 = view.findViewById(R.id.frameCategory5);
        frameCategory6 = view.findViewById(R.id.frameCategory6);

        frameCategory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewSuggestionActivity.class);
                startActivity(intent);
            }
        });

        frameCategory2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewSuggestionActivity.class);
                startActivity(intent);
            }
        });

        frameCategory3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewSuggestionActivity.class);
                startActivity(intent);
            }
        });

        frameCategory4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewSuggestionActivity.class);
                startActivity(intent);
            }
        });

        frameCategory5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewSuggestionActivity.class);
                startActivity(intent);
            }
        });

        frameCategory6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewSuggestionActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}