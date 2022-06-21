package com.example.tutorial2;

public class Calcullation {
    protected float convertCelciusToFahrenheit(Float value){
        Float ans =(value*9/5)+32;
        return ans;
    }
    protected float convertFahrenheeitToCelcius(Float value) {
        Float ans =(value-32)*5/9;
        return ans;
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAnswer();
            }
        });
    }
    private void calculateAnswer() {
        if( /* input value is empty */ -> write the condition){
            Toast.makeText(this, "Please add a value",
                    Toast.LENGTH_LONG).show();
        }
else{
            if( /* celcius button is checked */ ){
// convert it into Fahrenheit and display the answer
            }
            else{
// convert it into Celcius and display the answer
            }
        }
    }
}
