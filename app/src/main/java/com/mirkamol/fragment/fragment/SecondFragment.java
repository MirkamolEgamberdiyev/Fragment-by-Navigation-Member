package com.mirkamol.fragment.fragment;

import static android.content.ContentValues.TAG;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgs;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mirkamol.fragment.R;

public class SecondFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    private TextView textView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String amount = SecondFragmentArgs.fromBundle(getArguments()).getMember().getAge();
        String firstname = SecondFragmentArgs.fromBundle(getArguments()).getMember().getFirstName();
        String lastName = SecondFragmentArgs.fromBundle(getArguments()).getMember().getLastName();
        textView=view.findViewById(R.id.tv_member);
        textView.setText(("{"+ lastName +" "+ firstname + " " + amount + "}"));

    }
}