package com.example.kt4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class OrderFragment extends Fragment {
    Context context;
    public static OrderFragment getInstance() {
        return new OrderFragment();
    }

    interface FragmentCallback {
        void onClickButton(OrderFragment fragment);
    }
    private OrderFragment.FragmentCallback mCallback;
    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_order, container, false);



        return root;
    }
}
