package com.pennapps.xv.adoperari.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pennapps.xv.adoperari.R;
import com.pennapps.xv.adoperari.models.Alarm;


public class GetStartedFragment extends Fragment {

    Alarm firstAlarm;
    Button nextButton;

    public GetStartedFragment() {
        // Required empty public constructor
    }

    public static GetStartedFragment newInstance(Alarm a) {
        GetStartedFragment fragment = new GetStartedFragment();
        fragment.setAlarm(a);
        return fragment;
    }

    void setAlarm(Alarm alarm){
        firstAlarm = alarm;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nextButton = (Button) getActivity().findViewById(R.id.getStartedButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(android.R.id.content, PickLocationFragment.newInstance(firstAlarm), "PICK_PLACE").commit();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_get_started, container, false);
    }


}
