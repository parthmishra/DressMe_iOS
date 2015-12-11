package check.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.ImageView;


public class Test_Shoes extends ActivityInstrumentationTestCase2<ActivityClothingShoe> {
    ActivityClothingShoe activity;
    public ImageView CamImage;

    public Test_Shoes() {
        super(ActivityClothingShoe.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        setActivityInitialTouchMode(true);

    }
    @SmallTest
    public void test_ListShoesView() {
        assertNotNull(R.id.list_shoe);
    }

}