package com.example.johnpark.project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout Main;
    LinearLayout HK;
    LinearLayout CH;
    LinearLayout CI;
    LinearLayout TI;
    LinearLayout KO;
    TextView HKtext;
    TextView KOtext;
    TextView CItext;
    TextView TItext;
    TextView CHtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Main = (LinearLayout) findViewById(R.id.main);
        HK = (LinearLayout) findViewById(R.id.lyhk);
        CH = (LinearLayout) findViewById(R.id.lych);
        CI = (LinearLayout) findViewById(R.id.lyci);
        TI = (LinearLayout) findViewById(R.id.lyti);
        KO = (LinearLayout) findViewById(R.id.lyko);
        HKtext=(TextView)findViewById(R.id.hktext);
        KOtext=(TextView)findViewById(R.id.kotext);
        TItext=(TextView)findViewById(R.id.titext);
        CHtext=(TextView)findViewById(R.id.chtext);
        CItext=(TextView)findViewById(R.id.citext);


        Main.setVisibility(View.VISIBLE);
        HK.setVisibility(View.INVISIBLE);
        CH.setVisibility(View.INVISIBLE);
        CI.setVisibility(View.INVISIBLE);
        TI.setVisibility(View.INVISIBLE);
        KO.setVisibility(View.INVISIBLE);

    }


    public void event(View view) {


        switch (view.getId()) {

            case R.id.hong:
                reset();
                HK.setVisibility(View.VISIBLE);
                HKtext.setText("Hong Kong (Chinese: 香港; literally: \"Fragrant Harbour\"" +
                        " or \"Incense Harbour\"), officially Hong Kong Special" +
                        " Administrative Region of the People's Republic of China, is an" +
                        " autonomous territory south of Mainland China at the Pearl River" +
                        " Estuary of the Asia Pacific. With 7.2 million residents of" +
                        " various nationalities in a total land and sea area of" +
                        " 2,754 km2, Hong Kong is the world's fourth most densely" +
                        " populated sovereign state or territory.");
                break;
            case R.id.main:
                reset();
                Main.setVisibility(View.VISIBLE);
                break;
            case R.id.tie:
                reset();
                TI.setVisibility(View.VISIBLE);
                TItext.setText("Taiwan, officially the Republic of China (ROC), is a state " +
                        "in East Asia. Neighboring states include the People's Republic of" +
                        " China to the west, Japan to the northeast, and the Philippines to" +
                        " the south. Taiwan is the most populous non-UN state and the" +
                        " largest economy outside the UN.");
                break;
            case R.id.kor:
                reset();
                KO.setVisibility(View.VISIBLE);
                KOtext.setText("South Korea, officially the " +
                        "Republic of Korea (ROK; About this sound listen), is a sovereign" +
                        " state in East Asia, constituting the southern part of the Korean " +
                        "Peninsula.\n" +
                        "The name Korea is derived from the ancient Kingdom of Goguryeo, also "
                        + "known as Koryŏ. Highly urbanized at 92%,South Koreans lead a " +
                        " and the world's sixth leading global city with the " +
                        "fourth largest economy. 63.7% of South Korea is mountainous,");
                break;
            case R.id.che:
                reset();
                CH.setVisibility(View.VISIBLE);
                CHtext.setText("The Czech Republic, also known as Czechia  is a nation state " +
                        "in Central Europe bordered by Germany to the west, Austria " +
                        "to the south, Slovakia to the east and Poland to the northeast." +
                        " The Czech Republic covers an area of 78,866 square kilometres" +
                        " (30,450 sq mi) with mostly temperate continental climate. It is" +
                        " a unitary parliamentary republic, has 10.5 million inhabitants and" +
                        " the capital and largest city is Prague, with over 1.2 million" +
                        " residents. The Czech Republic includes its historical territories" +
                        " of Bohemia,Moravia, and Czech Silesia.");
                break;
            case R.id.chi:
                reset();
                CI.setVisibility(View.VISIBLE);
                CItext.setText("China, officially the People's Republic of China (PRC)," +
                        " in Asia, is the world's most populous state, with a population " +
                        "of over 1.381 billion. Covering approximately 9.6 million square" +
                        " kilometers, China is the world's second largest state by land area," +
                        " and either the third or fourth-largest by total area, depending" +
                        " on the method of measurement. China's landscape is vast and" +
                        " diverse, ranging from forest steppes and the Gobi and Taklamakan" +
                        " deserts in the arid north to subtropical forests in the wetter south. ");
                break;
        }
    }

    private void reset()
    {
        Main.setVisibility(View.GONE);
        HK.setVisibility(View.GONE);
        CH.setVisibility(View.GONE);
        CI.setVisibility(View.GONE);
        TI.setVisibility(View.GONE);
        KO.setVisibility(View.GONE);
    }

    public void reset_2(View view)
    {
        Main.setVisibility(View.VISIBLE);
        HK.setVisibility(View.GONE);
        CH.setVisibility(View.GONE);
        CI.setVisibility(View.GONE);
        TI.setVisibility(View.GONE);
        KO.setVisibility(View.GONE);
    }

}


