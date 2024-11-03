package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget. Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText editTextInTime;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRun = findViewById(R.id.btn_run);
        editTextInTime = findViewById(R.id.editText_intime);
        textViewResult = findViewById(R.id.textView_result);

        btnRun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MyAsyncTaskRunner runner = new MyAsyncTaskRunner();
                String input = editTextInTime.getText().toString();
                runner.execute(input);
            }
        });
    }


    private class MyAsyncTaskRunner extends AsyncTask<String,String,String>{
        private String response;
        ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            progressDialog= ProgressDialog.show(MainActivity.this,"Progress Dialog ","Wait For Some Time... "+editTextInTime.getText().toString()+" seconds");
        }

        @Override
        protected void onProgressUpdate(String... values) {
            textViewResult.setText(values[0]);
        }


        @Override
        protected String doInBackground(String... params) {
            publishProgress("Sleeping....");//call onProgressUpdate
            try{
                int timeInSecond = Integer.parseInt(params[0]);
                int timeInMilliSecond = timeInSecond*1000;
                for (int i = 0 ; i < timeInSecond ; i++){
                    Thread.sleep(1000);
                    response = "Slept for "+(i+1)+" for "+timeInSecond+" seconds";
                    publishProgress(response);
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            catch (Exception e){
                e.printStackTrace();
                response=e.getMessage();
            }
            return response;
        }

        @Override
        protected void onPostExecute(String s) {
            progressDialog.dismiss();
            textViewResult.setText(s);
        }
    }
}