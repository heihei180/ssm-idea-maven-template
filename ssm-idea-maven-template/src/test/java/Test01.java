import com.test.model.TestTable;
import com.test.service.InsertUser;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Test01 {

    @Autowired
    private InsertUser insertUser;
    @Before
    public void dd(){

    }

    @Test
    public void tet(){

        TestTable tt =  new TestTable();
        tt.setTestAddr("北京市");
        tt.setTestName("胡硕");
        tt.setTestGender("男");
        insertUser.insertUser(tt);

    }


}
