package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0,scoreB=0;
    public void showRun1A(View view)
    {
        displayA(scoreA+=1);
    }
    public void showRun2A(View view)
    {
        displayA(scoreA+=2);
    }
    public void showRun3A(View view)
    {
        displayA(scoreA+=3);
    }
    public void showRun4A(View view)
    {
        displayA(scoreA+=4);
    }
    public void showRun6A(View view)
    {
        displayA(scoreA+=6);
    }
    public void showRun1B(View view)
    {
        displayB(scoreB+=1);
    }
    public void showRun2B(View view)
    {
        displayB(scoreB+=2);
    }
    public void showRun3B(View view)
    {
        displayB(scoreB+=3);
    }
    public void showRun4B(View view)
    {
        displayB(scoreB+=4);
    }
    public void showRun6B(View view)
    {
        displayB(scoreB+=6);
    }

    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayA(0);
        displayB(0);
    }
    private void displayA(int numb)
    {
        TextView dis=(TextView)findViewById(R.id.scoreA);
        dis.setText(""+numb);
    }

    private void displayB(int numb)
    {
        TextView dis=(TextView)findViewById(R.id.scoreB);
        dis.setText(""+numb);
    }
}