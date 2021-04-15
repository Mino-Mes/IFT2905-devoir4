package com.example.devoir4.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.devoir4.CardAdapter;
import com.example.devoir4.Filter;
import com.example.devoir4.ForgotPassword;
import com.example.devoir4.MainActivity;
import com.example.devoir4.Movie;
import com.example.devoir4.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private int [] images = {R.drawable.mv1,R.drawable.mv2,R.drawable.mv3,R.drawable.mv4,R.drawable.mv5,R.drawable.mv6,R.drawable.mv7,R.drawable.mv8,R.drawable.mv9,R.drawable.mv10,R.drawable.mv11,R.drawable.mv12,R.drawable.mv13,R.drawable.mv14 };
    private int [] images2 = {R.drawable.mv14,R.drawable.mv13,R.drawable.mv12,R.drawable.mv11,R.drawable.mv10,R.drawable.mv9,R.drawable.mv8,R.drawable.mv7,R.drawable.mv6,R.drawable.mv5,R.drawable.mv4,R.drawable.mv3,R.drawable.mv2,R.drawable.mv1 };
    private int [] images3 = {R.drawable.mv10,R.drawable.mv11,R.drawable.mv9,R.drawable.mv1,R.drawable.mv3,R.drawable.mv5,R.drawable.mv4,R.drawable.mv2,R.drawable.mv8,R.drawable.mv7,R.drawable.mv6,R.drawable.mv14,R.drawable.mv13,R.drawable.mv10};
    private Button filterButton;
    private RecyclerView rc;
    private RecyclerView rc2;
    private RecyclerView rc3;
    private RecyclerView rc4;
    private CardAdapter adapter;
    private CardAdapter adapter2;
    private CardAdapter adapter3;
    private CardAdapter adapter4;
    private CardAdapter.RecyclerViewClickListener listener;

    private CardView cv;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        filterButton = view.findViewById(R.id.filterButton);
        filterButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(getActivity(), Filter.class);
            startActivity(myIntent);
        });

        rc = view.findViewById(R.id.card_recycler);
        setOnClickListener();
        adapter =  new CardAdapter(images, listener);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rc.setLayoutManager(manager);
        rc.setAdapter(adapter);
        rc.setHasFixedSize(true);

        rc2 = view.findViewById(R.id.card_recycler3);
        adapter2 =  new CardAdapter(images2, listener);
        LinearLayoutManager manager2 = new LinearLayoutManager(getActivity().getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rc2.setLayoutManager(manager2);
        rc2.setAdapter(adapter2);
        rc2.setHasFixedSize(true);


        rc3 = view.findViewById(R.id.card_recycler4);
        adapter3 =  new CardAdapter(images3, listener);
        LinearLayoutManager manager3 = new LinearLayoutManager(getActivity().getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rc3.setLayoutManager(manager3);
        rc3.setAdapter(adapter3);
        rc3.setHasFixedSize(true);


        rc4 = view.findViewById(R.id.card_recycler5);
        adapter4 =  new CardAdapter(images3, listener);
        LinearLayoutManager manager4 = new LinearLayoutManager(getActivity().getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rc4.setLayoutManager(manager4);
        rc4.setAdapter(adapter4);
        rc4.setHasFixedSize(true);
    }

    private void setOnClickListener() {
        listener = new CardAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent myIntent = new Intent(getActivity(), Movie.class);
                startActivity(myIntent);
            }
        };
    }
}