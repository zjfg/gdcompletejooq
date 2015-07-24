import com.x2work.test.AbstractTest;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Created by zhujie on 15/7/23.
 */
public class vbcTest extends AbstractTest {

    @Inject
    vbc vbc;

    @Test
    public void testSlsl() throws Exception {
        vbc.slsl();
    }
}