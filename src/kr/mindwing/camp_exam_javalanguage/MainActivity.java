package kr.mindwing.camp_exam_javalanguage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView resultView;
	private static final int FOR_COUNT = 50;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		resultView = (TextView) findViewById(R.id.result);
	}

	@Override
	protected void onResume() {
		super.onResume();

		String result = String.format("::::%d::::\n\n", FOR_COUNT + 1);

		result += getForResultBinary();
		result += "\n::::::::::\n";

		result += getForResultOctal();
		result += "\n::::::::::\n";

		result += getForResultDecimal();
		result += "\n::::::::::\n";

		result += getForResultHex();

		resultView.setText(result);
	}

	private String getForResultBinary() {
		String retVal = null;
		int number = 0b1;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "2진수 - 0b" + Integer.toBinaryString(number);

		return retVal;
	}

	private String getForResultOctal() {
		String retVal = null;
		int number = 01;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "8진수 - 0" + Integer.toOctalString(number);

		return retVal;
	}

	private String getForResultDecimal() {
		String retVal = null;
		int number = 1;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "10진수 - " + Integer.toString(number);

		return retVal;
	}

	private String getForResultHex() {
		String retVal = null;
		int number = 0x1;

		for (int i = 0; i < FOR_COUNT; ++i) {
			number++;
		}

		retVal = "16진수 - 0x" + Integer.toHexString(number);

		return retVal;
	}
}
