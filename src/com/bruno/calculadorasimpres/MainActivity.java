package com.bruno.calculadorasimpres;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bruno.calculadorasimpres.Calculos;


public class MainActivity extends Activity {
	
	Button btnsoma,btnsub,btndiv,btnmult,btnclear;
	EditText txtn1,txtn2,txtresul;
	Double n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnsoma = (Button) findViewById(R.id.btnsoma);
        btnsub = (Button) findViewById(R.id.btnsub);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmult = (Button) findViewById(R.id.btnmult);
        btnclear = (Button) findViewById(R.id.btnclear);
     
        txtn1 = (EditText) findViewById(R.id.txtnumber1);
        txtn2 = (EditText) findViewById(R.id.txtnumber2);
        txtresul = (EditText) findViewById(R.id.txtresult);
        
        
        //BOTÃO DE SOMA
        btnsoma.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				try {
					n1 = Double.parseDouble(txtn1.getText().toString());
					n2 = Double.parseDouble(txtn2.getText().toString());
					txtresul.setText(String.valueOf(Calculos.Soma(n1, n2)));
				} catch (Exception e) {
					Toast.makeText(MainActivity.this,"Válores Inválidos",Toast.LENGTH_SHORT).show();
				}
			}
		});
       
      //BOTÃO DE SUBTRAÇÃO
        btnsub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try {
					n1 = Double.parseDouble(txtn1.getText().toString());
					n2 = Double.parseDouble(txtn2.getText().toString());
					txtresul.setText(String.valueOf(Calculos.Sub(n1, n2)));
				} catch (Exception e) {
					Toast.makeText(MainActivity.this,"Válores Inválidos",Toast.LENGTH_SHORT).show();
				}				
			}
		});
        
      //BOTÃO DE DIVISÃO 
       btndiv.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			try {
				n1 = Double.parseDouble(txtn1.getText().toString());
				n2 = Double.parseDouble(txtn2.getText().toString());
				if((n1 == 0)){
					Toast.makeText(MainActivity.this,"Não é possível dividir por zero!!",Toast.LENGTH_SHORT).show();
				}else{
					txtresul.setText(String.valueOf(Calculos.Sub(n1, n2)));
				}
				} catch (Exception e) {
					Toast.makeText(MainActivity.this,"Válores Inválidos",Toast.LENGTH_SHORT).show();
				}
			}
       }) ;
       
       //BOTÃO DE MULTIPLICACAO
       btnmult.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			try {
				n1 = Double.parseDouble(txtn1.getText().toString());
				n2= Double.parseDouble(txtn2.getText().toString());
				txtresul.setText(String.valueOf(Calculos.Mult(n1, n2)));
			} catch (Exception e) {
				Toast.makeText(MainActivity.this,"Válores Invalidos",Toast.LENGTH_SHORT).show();
			}
			
		}
	});
       
       btnclear.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Calculos.Clear(txtn1, txtn2, txtresul);
			
		}
	});
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
