package check.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.ImageView;


public class Test_Top extends ActivityInstrumentationTestCase2<ActivityClothingTop> {
    ActivityClothingTop activity;
    public Button CamShot;
    public ImageView CamImage;

    public Test_Top() {
        super(ActivityClothingTop.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        setActivityInitialTouchMode(true);

    }
    @SmallTest
    public void test_ListTopView() {
        assertNotNull(R.id.list_top);
    }

}