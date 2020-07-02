package com.example.pappinnis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private SeekBar pepperonni;
    private SeekBar jamon;
    private SeekBar champiñones;
    private SeekBar piña;
    private SeekBar carne;
    private SeekBar aceitunas;
    private SeekBar jalapeños;
    private SeekBar queso;
    private SeekBar salami;
    private SeekBar pimientos;
    private SeekBar elote;
    private SeekBar frijoles;
    private SeekBar cebolla;
    private SeekBar chorizo;
    private SeekBar salchicha;
    private SeekBar salchichaitaliana;
    private SeekBar tocino;
    private Button button;

    public static final String SHARED_PREFS="sharedPrefs";
    public static final String SEEKBAR1="seek1";
    public static final String SEEKBAR2="seek2";
    public static final String SEEKBAR3="seek3";
    public static final String SEEKBAR4="seek4";
    public static final String SEEKBAR5="seek5";
    public static final String SEEKBAR6="seek6";
    public static final String SEEKBAR7="seek7";
    public static final String SEEKBAR8="seek8";
    public static final String SEEKBAR9="seek9";
    public static final String SEEKBAR10="seek10";
    public static final String SEEKBAR11="seek11";
    public static final String SEEKBAR12="seek12";
    public static final String SEEKBAR13="seek13";
    public static final String SEEKBAR14="seek14";
    public static final String SEEKBAR15="seek15";
    public static final String SEEKBAR16="seek16";
    public static final String SEEKBAR17="seek17";

    private int seekprog1;
    private int seekprog2;
    private int seekprog3;
    private int seekprog4;
    private int seekprog5;
    private int seekprog6;
    private int seekprog7;
    private int seekprog8;
    private int seekprog9;
    private int seekprog10;
    private int seekprog11;
    private int seekprog12;
    private int seekprog13;
    private int seekprog14;
    private int seekprog15;
    private int seekprog16;
    private int seekprog17;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pepperonni=(SeekBar) findViewById(R.id.pepperonni);
        jamon=(SeekBar) findViewById(R.id.jamon);
        champiñones=(SeekBar) findViewById(R.id.champiñones);
        piña=(SeekBar) findViewById(R.id.piña);
        carne=(SeekBar) findViewById(R.id.carne);
        aceitunas=(SeekBar) findViewById(R.id.aceitunas);
        jalapeños=(SeekBar) findViewById(R.id.jalapeños);
        queso=(SeekBar) findViewById(R.id.queso);
        salami=(SeekBar) findViewById(R.id.salami);
        pimientos=(SeekBar) findViewById(R.id.pimientos);
        elote=(SeekBar) findViewById(R.id.elote);
        frijoles=(SeekBar) findViewById(R.id.frijoles);
        cebolla=(SeekBar) findViewById(R.id.cebolla);
        chorizo=(SeekBar) findViewById(R.id.chorizo);
        salchicha=(SeekBar) findViewById(R.id.salchicha);
        salchichaitaliana=(SeekBar) findViewById(R.id.salchichaitaliana);
        tocino=(SeekBar) findViewById(R.id.tocino);
        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GuardarDatos();
            }
        });
        CargarDatos();
        Recargar();


    }

    public void GuardarDatos(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(SEEKBAR1,pepperonni.getProgress());
        editor.putInt(SEEKBAR2,jamon.getProgress());
        editor.putInt(SEEKBAR3,champiñones.getProgress());
        editor.putInt(SEEKBAR4,piña.getProgress());
        editor.putInt(SEEKBAR5,carne.getProgress());
        editor.putInt(SEEKBAR6,aceitunas.getProgress());
        editor.putInt(SEEKBAR7,jalapeños.getProgress());
        editor.putInt(SEEKBAR8,queso.getProgress());
        editor.putInt(SEEKBAR9,salami.getProgress());
        editor.putInt(SEEKBAR10,pimientos.getProgress());
        editor.putInt(SEEKBAR11,elote.getProgress());
        editor.putInt(SEEKBAR12,frijoles.getProgress());
        editor.putInt(SEEKBAR13,cebolla.getProgress());
        editor.putInt(SEEKBAR14,chorizo.getProgress());
        editor.putInt(SEEKBAR15,salchicha.getProgress());
        editor.putInt(SEEKBAR16,salchichaitaliana.getProgress());
        editor.putInt(SEEKBAR17,tocino.getProgress());

        editor.apply();
        Toast.makeText(this,"Datos guardados",Toast.LENGTH_SHORT).show();

    }

    public void CargarDatos(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        seekprog1=sharedPreferences.getInt(SEEKBAR1,0);
        seekprog2=sharedPreferences.getInt(SEEKBAR2,0);
        seekprog3=sharedPreferences.getInt(SEEKBAR3,0);
        seekprog4=sharedPreferences.getInt(SEEKBAR4,0);
        seekprog5=sharedPreferences.getInt(SEEKBAR5,0);
        seekprog6=sharedPreferences.getInt(SEEKBAR6,0);
        seekprog7=sharedPreferences.getInt(SEEKBAR7,0);
        seekprog8=sharedPreferences.getInt(SEEKBAR8,0);
        seekprog9=sharedPreferences.getInt(SEEKBAR9,0);
        seekprog10=sharedPreferences.getInt(SEEKBAR10,0);
        seekprog11=sharedPreferences.getInt(SEEKBAR11,0);
        seekprog12=sharedPreferences.getInt(SEEKBAR12,0);
        seekprog13=sharedPreferences.getInt(SEEKBAR13,0);
        seekprog14=sharedPreferences.getInt(SEEKBAR14,0);
        seekprog15=sharedPreferences.getInt(SEEKBAR15,0);
        seekprog16=sharedPreferences.getInt(SEEKBAR16,0);
        seekprog17=sharedPreferences.getInt(SEEKBAR17,0);

    }

    public void Recargar(){
        pepperonni.setProgress(seekprog1);
        jamon.setProgress(seekprog2);
        champiñones.setProgress(seekprog3);
        piña.setProgress(seekprog4);
        carne.setProgress(seekprog5);
        aceitunas.setProgress(seekprog6);
        jalapeños.setProgress(seekprog7);
        queso.setProgress(seekprog8);
        salami.setProgress(seekprog9);
        pimientos.setProgress(seekprog10);
        elote.setProgress(seekprog11);
        frijoles.setProgress(seekprog12);
        cebolla.setProgress(seekprog13);
        chorizo.setProgress(seekprog14);
        salchicha.setProgress(seekprog15);
        salchichaitaliana.setProgress(seekprog16);
        tocino.setProgress(seekprog17);
    }
}