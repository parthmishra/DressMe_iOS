package androidinterview.com.cutomlistviewimage;
import check.test.R;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Favorites extends ListActivity {

    String[] itemname ={
            "Test1",
            "Test2",
            "Test3",
            "Test4",
            "Test5",
            "Test6",
            "Test7",
            "Test8"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        /*this.setListAdapter(new ArrayAdapter<String>(
                this, R.layout.mylist,
                R.id.Itemname,itemname));*/
    }
}
