package nikolaos.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPopularMoviesApp(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Popular Movies app.", Toast.LENGTH_SHORT).show();
    }

    public void launchStockHawkApp(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Stock Hawk app.", Toast.LENGTH_SHORT).show();
    }

    public void launchBuildItApp(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Build It Bigger app.", Toast.LENGTH_SHORT).show();
    }

    public void launchMaterialApp(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Material app.", Toast.LENGTH_SHORT).show();
    }

    public void launchUbiquitousApp(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Go Ubiquitous app.", Toast.LENGTH_SHORT).show();
    }

    public void launchCapstoneApp(View view) {
        Toast.makeText(getApplicationContext(), "This button will launch the Capstone Project app.", Toast.LENGTH_SHORT).show();
    }
}
