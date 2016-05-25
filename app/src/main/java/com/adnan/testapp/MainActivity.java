package com.adnan.testapp;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout bottomSheet;
    Button btnToggle;

    int currentState = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomSheet = (LinearLayout) findViewById(R.id.llBottomSheet);
        btnToggle = (Button) findViewById(R.id.btnToggle);

        final BottomSheetBehavior<LinearLayout> bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        bottomSheetBehavior.setHideable(false);
        bottomSheetBehavior.setPeekHeight(280);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        currentState = BottomSheetBehavior.STATE_COLLAPSED;

        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (currentState == BottomSheetBehavior.STATE_EXPANDED) {

                    currentState = BottomSheetBehavior.STATE_COLLAPSED;

                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

                }else if (currentState == BottomSheetBehavior.STATE_COLLAPSED) {

                    currentState = BottomSheetBehavior.STATE_EXPANDED;

                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

                }

            }
        });

    }
}
