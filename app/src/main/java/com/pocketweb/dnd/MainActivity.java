package com.pocketweb.dnd;

<<<<<<< HEAD
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
>>>>>>> 1d4e6733441e2a659cc9b4e113176e8610868e68

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        final ToggleButton b[]=new ToggleButton[7];
        EditText timeSelect = (EditText)findViewById(R.id.editText);
        String time = timeSelect.getText().toString();
        int hr=10*(time.charAt(0))+(time.charAt(1));
        int mins = 10*(time.charAt(2))+(time.charAt(3));

        AlarmManager alarmMgr;
        PendingIntent alarmIntent;

        alarmMgr = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this,MakeSilent.class);
        alarmIntent = PendingIntent.getService(this, 0, intent, 0);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY,hr);
        calendar.set(Calendar.MINUTE,mins);

        alarmMgr.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),1000*60*60*24*7,alarmIntent);
        CheckBox repeat = (CheckBox)findViewById(R.id.cbRepeat);
        b[0]=(ToggleButton)findViewById(R.id.toggleButton);
        b[1]=(ToggleButton)findViewById(R.id.toggleButton2);
        b[2]=(ToggleButton)findViewById(R.id.toggleButton3);
        b[3]=(ToggleButton)findViewById(R.id.toggleButton4);
        b[4]=(ToggleButton)findViewById(R.id.toggleButton5);
        b[5]=(ToggleButton)findViewById(R.id.toggleButton6);
        b[6]=(ToggleButton)findViewById(R.id.toggleButton7);

        repeat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(!isChecked){
                    for(int i=0;i<7;i++){
                        b[i].setChecked(false);
                    }
                }
                else{
                    for(int i=0;i<7;i++){
                        b[i].setChecked(true);
                    }
                }
            }
        });
        Switch sw = (Switch)findViewById(R.id.switch1);
        sw.setChecked(true);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    makeSilent();
                }
                else {
                    makeGeneral();
                }
            }

            private void makeGeneral() {
                AudioManager myAudioManager;
                myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                Toast.makeText(MainActivity.this,"Now in General Mode!", Toast.LENGTH_LONG).show();

            }

            private void makeSilent() {
                AudioManager myAudioManager;
                myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
                myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Toast.makeText(MainActivity.this,"Now in Vibrate Mode!", Toast.LENGTH_LONG).show();
            }
        });



    }

    public class MakeSilent {

            private void makeSilent() {
            AudioManager myAudioManager;
            myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
            myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
            Toast.makeText(MainActivity.this,"Now in Vibrate Mode!", Toast.LENGTH_LONG).show();

        }
    }



=======
    }
>>>>>>> 1d4e6733441e2a659cc9b4e113176e8610868e68
}
