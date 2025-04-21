import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pages.TestViki;

public class TestOne extends BaseTest{

    @DisplayName("Википедия")
    @Test
    public void Test(){
        TestViki testViki = new TestViki();
        testViki.openPage()
                .inputRequest()
                .eleventVisible();
    }  
}
