package check.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;


public class Test_Accessories extends ActivityInstrumentationTestCase2<ActivityClothingAccessory> {
    ActivityClothingAccessory activity;
    public Button CamShot;
    public ImageView CamImage;

    public Test_Accessories() {
        super(ActivityClothingAccessory.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        setActivityInitialTouchMode(true);

    }
    @SmallTest
    public void test_ListAccessoryView() {
        assertNotNull(R.id.list_accessory);
    }

}