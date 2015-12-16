package and_401.customtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyTextViewListActivity extends AppCompatActivity {

    private ListView lstTextViewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_text_view_list);
        lstTextViewList = (ListView)findViewById(R.id.lstCustomTextViews);

        final ArrayList<String>stringArrayList = new ArrayList<>();
        stringArrayList.add("Alfredo");
        stringArrayList.add("Manuel");
        stringArrayList.add("Rodrigo");
        stringArrayList.add("Jaime");
        stringArrayList.add("Adrian");
        stringArrayList.add("Charlie");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.my_text_view,stringArrayList);
        lstTextViewList.setAdapter(adapter);
    }
}
