package com.bruno.calculadorasimpres;

import android.widget.EditText;

public class Calculos {
	//Atribulos Globais
	public static double result;
	
	
	//M�todo de soma
	public static double Soma(double n1,double n2){
		return result = n1 + n2;
	}
	//M�todo de subtra��o
		public static double Sub(double n1,double n2){
			return result = n1 - n2;
		}
	//M�todos de divis�o
	public static double Div(double n1,double n2){
			return result = n1 / n2;
		}	
	//M�todo de multiplica��o
	public static double Mult(double n1,double n2){
			return result = n1 * n2;
		}
	public static void Clear(EditText txtn1,EditText txtn2,EditText txtresul){
		txtn1.setText(null);
		txtn2.setText(null);
		txtresul.setText(null);
	}
}
