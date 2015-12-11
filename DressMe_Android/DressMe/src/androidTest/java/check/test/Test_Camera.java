package check.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.ImageView;


public class Test_Camera extends ActivityInstrumentationTestCase2<Creation_Add> {
    Creation_Add activity;
    public Button CamShot;
    public ImageView CamImage;

    public Test_Camera() {
        super(Creation_Add.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        setActivityInitialTouchMode(true);

    }
    @SmallTest
    public void test_Camera() {
        CamShot =(Button) activity.findViewById(R.id.btnSelectPhoto);
        assertNotNull(CamShot);
    }

    @SmallTest
    public void test_Image() {
        CamImage = (ImageView) activity.findViewById(R.id.ivImage);
        assertNotNull(CamImage);

    }
}
