package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int op1,op2,result,operand;
    public void update(View view)
    {
        {
            switch (view.getId())
            {
                case R.id.button1:
                    ((EditText)findViewById(R.id.screen)).append("1");
                    break;
                case R.id.button2:
                    ((EditText)findViewById(R.id.screen)).append("2");
                    break;
                case R.id.button3:
                    ((EditText)findViewById(R.id.screen)).append("3");
                    break;
                case R.id.button4:
                    ((EditText)findViewById(R.id.screen)).append("4");
                    break;
                case R.id.button5:
                    ((EditText)findViewById(R.id.screen)).append("5");
                    break;
                case R.id.button6:
                    ((EditText)findViewById(R.id.screen)).append("6");
                    break;
                case R.id.button7:
                    ((EditText)findViewById(R.id.screen)).append("7");
                    break;
                case R.id.button8:
                    ((EditText)findViewById(R.id.screen)).append("8");
                    break;
                case R.id.button9:
                    ((EditText)findViewById(R.id.screen)).append("9");
                    break;
                case R.id.button0:
                    ((EditText)findViewById(R.id.screen)).append("0");
                    break;
                case R.id.buttonadd:
                    op1=Integer.parseInt(((EditText)findViewById(R.id.screen)).getText().toString());
                    ((EditText)findViewById(R.id.screen)).setText("");
                    operand=1;
                    break;
                case R.id.buttonsub:
                    op1=Integer.parseInt(((EditText)findViewById(R.id.screen)).getText().toString());
                    ((EditText)findViewById(R.id.screen)).setText("");
                    operand=2;
                    break;
                case R.id.buttondiv:
                    op1=Integer.parseInt(((EditText)findViewById(R.id.screen)).getText().toString());
                    ((EditText)findViewById(R.id.screen)).setText("");
                    operand=3;
                    break;
                case R.id.buttonmul:
                    op1=Integer.parseInt(((EditText)findViewById(R.id.screen)).getText().toString());
                    ((EditText)findViewById(R.id.screen)).setText("");
                    operand=4;
                    break;
                case R.id.buttonmod:
                    op1=Integer.parseInt(((EditText)findViewById(R.id.screen)).getText().toString());
                    ((EditText)findViewById(R.id.screen)).setText("");
                    operand=5;
                    break;

                case R.id.buttonequal:
                    op2=Integer.parseInt(((EditText)findViewById(R.id.screen)).getText().toString());

                    switch(operand)
                    {
                        case 1:
                            result=op1+op2;
                            ((EditText)findViewById(R.id.screen)).setText(result+"");
                            break;
                        case 2:
                            result=op1-op2;
                            ((EditText)findViewById(R.id.screen)).setText(result+"");
                            break;
                        case 3:
                            result=op1/op2;
                            ((EditText)findViewById(R.id.screen)).setText(result+"");
                            break;
                        case 4:
                            result=op1*op2;
                            ((EditText)findViewById(R.id.screen)).setText(result+"");
                            break;
                        case 5:
                            result=op1%op2;
                            ((EditText)findViewById(R.id.screen)).setText(result+"");
                            break;
                        default:
                    }
                default:
            }
        }
    }
}

