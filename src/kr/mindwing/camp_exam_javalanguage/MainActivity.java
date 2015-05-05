package kr.mindwing.camp_exam_javalanguage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView resultView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		resultView = (TextView) findViewById(R.id.result);
	}

	@Override
	protected void onResume() {
		super.onResume();

		String result = getCalcResult();
		resultView.setText(result);
	}

	private String getCalcResult() {
		String retVal = null;

		int a = 5;
		int b = 10;

		int y = a * 3 + b;

		retVal = "a = 5\nb = 10\n\na * 3 + b = " + y;

		return retVal;
	}
}
