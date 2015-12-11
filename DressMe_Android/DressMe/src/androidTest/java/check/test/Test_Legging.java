package check.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.ImageView;


public class Test_Legging extends ActivityInstrumentationTestCase2<ActivityClothingLeggings> {
    ActivityClothingLeggings activity;
    public ImageView CamImage;

    public Test_Legging() {
        super(ActivityClothingLeggings.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        setActivityInitialTouchMode(true);

    }
    @SmallTest
    public void test_ListLeggingView() {
        assertNotNull(R.id.list_leggings);
    }
}