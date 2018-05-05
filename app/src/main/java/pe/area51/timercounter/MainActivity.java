package pe.area51.timercounter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTimeCount;
    private boolean isTimerRunning;
    private int count;
    private Handler uiThreadHandler;
    private Runnable timeCounterRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTimeCount =findViewById(R.id.textViewTimeCount);
        isTimerRunning=false;
        count=0;
        uiThreadHandler=new Handler();
        /*
        timeCounterRunning= new Runnable() {
            @Override
            public void run() {
                //textViewTimeCount.setText(String.valueOf(count));
                textViewTimeCount.setText(""+count);
                count++;
                uiThreadHandler.postDelayed(this,1000);
            }
        }*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main,menu);
        //menu.findItem(R.id.actionSwitchTimer).set
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.actionSwitchTimer:
                switchTimer();
                return true;
            default:
                return false;
        }
    }

    private void switchTimer(){
        if(isTimerRunning){

        }else{

        }

    }


    private void startCounter(){
        /*
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

            }
        },10);
        */
        /*
        Runnable runnable = ;
        uiThreadHandler.post(
                new Runnable() {
                    @Override
                    public void run() {
                        //textViewTimeCount.setText(String.valueOf(count));
                        textViewTimeCount.setText(""+count);
                        count++;
                        uiThreadHandler.postDelayed(this,1000);
                    }
                }
        );
        */
    /*
        new Runnable() {
            @Override
            public void run() {
                //textViewTimeCount.setText(String.valueOf(count));
                textViewTimeCount.setText(""+count);
                count++;
                uiThreadHandler.postDelayed(this,1000);
            }
        }.run();
    */
        //timeCounterRunning.run();

    }

    private void stopCounter(){

    }


}
