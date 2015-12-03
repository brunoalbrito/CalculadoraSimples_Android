package com.bruno.calculadorasimpres;

import android.widget.EditText;

public class Calculos {
	//Atribulos Globais
	public static double result;
	
	
	//Método de soma
	public static double Soma(double n1,double n2){
		return result = n1 + n2;
	}
	//Método de subtração
		public static double Sub(double n1,double n2){
			return result = n1 - n2;
		}
	//Métodos de divisão
	public static double Div(double n1,double n2){
			return result = n1 / n2;
		}	
	//Método de multiplicação
	public static double Mult(double n1,double n2){
			return result = n1 * n2;
		}
	public static void Clear(EditText txtn1,EditText txtn2,EditText txtresul){
		txtn1.setText(null);
		txtn2.setText(null);
		txtresul.setText(null);
	}
}
