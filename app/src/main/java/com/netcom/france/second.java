package com.netcom.france;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.netcom.france.databinding.FragmentSecondBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link second#newInstance} factory method to
 * create an instance of this fragment.
 */
public class second extends Fragment {


     FragmentSecondBinding binding;
    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private List<model> listitem;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String url="https://i.postimg.cc/LhKkR9Nr/babe.jpg";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public second() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment second.
     */
    // TODO: Rename and change types and number of parameters
    public static second newInstance(String param1, String param2) {
        second fragment = new second();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();


        /*View view=inflater.inflate(R.layout.fragment_second,container,false);*/

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         binding.studentName.setText("Steven");
         binding.studentClass.setText("9 th");
         Glide.with(getActivity()).load(url).into(binding.img1);
         binding.rev.setLayoutManager(new LinearLayoutManager(getContext()));
        listitem=new ArrayList<>();
        model ob1=new model("Account",R.drawable.profile_account_icon);
        listitem.add(ob1);
        model ob2=new model("My Subscription",R.drawable.profile_my_subscription_icon);
        listitem.add(ob2);
        model ob3=new model("About us",R.drawable.profile_about_us_icon);
        listitem.add(ob3);
        model ob4=new model("Report an issue",R.drawable.profile_report_an_issue_icon);
        listitem.add(ob4);
        model ob5=new model("Share the app",R.drawable.profile_share_app_icon);
        listitem.add(ob5);
        model ob6=new model("Sign Out",R.drawable.profile_sign_out_icon);
        listitem.add(ob6);
        adapter=new myadapter(listitem,getContext());
        binding.rev.setAdapter(adapter);




    }
}