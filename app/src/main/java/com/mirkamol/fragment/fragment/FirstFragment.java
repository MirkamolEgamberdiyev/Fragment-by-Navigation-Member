package com.mirkamol.fragment.fragment;

import android.app.Notification;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mirkamol.fragment.R;
import com.mirkamol.fragment.model.Member;


public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn_button = view.findViewById(R.id.btn_first_fragment);

        btn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Member member = new Member("Mirkamol", "Egamberdiyev", "22");
                Navigation.findNavController(view).navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(member));
            }
        });
    }
}