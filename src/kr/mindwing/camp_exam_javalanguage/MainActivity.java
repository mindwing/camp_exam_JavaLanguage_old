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

		String result = getIfResult(5, 10);

		result = result + "\n\n::::::::::::::::\n\n";

		result = result + getIfResult(100, 10);

		result = result + "\n\n::::::::::::::::\n\n";

		result = result + getIfResult(500, 500);

		resultView.setText(result);
	}

	private String getIfResult(int a, int b) {
		String retVal = null;

		if (a > b) {
			retVal = String.format("a = %d\nb = %d\n\na > b", a, b);
		} else if (a < b) {
			retVal = String.format("a = %d\nb = %d\n\na < b", a, b);
		} else {
			retVal = String.format("a = %d\nb = %d\n\na == b", a, b);
		}

		return retVal;
	}
}
