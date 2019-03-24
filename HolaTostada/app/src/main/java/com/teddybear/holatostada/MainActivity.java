package com.teddybear.holatostada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Se declara la variable del contador
    private int mCount;
    // Se declara la variable del textview
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Busca en el view el textview llamado show_count y
        // lo asigna a la variable mShowCount para pasar datos
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    // Metodo para mostar el toast
    public void showToast(View view){
        // Crear el toast y le pasa el mensaje que se desea mostar
        // En este caso, esta almacenado en un String llamado toast_message
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        // Muestra el toast
        toast.show();
    }

    public void countUp(View view){
        // Aumenta el contados
        mCount++;
        // Si el contador no esta vacio, muestra el numero almacenado
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
