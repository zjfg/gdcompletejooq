import cn.generated.Tables;
import cn.generated.tables.records.VbRecord;
import com.x2work.jooq.JooqDao;
import org.jooq.Record;
import org.jooq.Result;
import org.junit.Test;

import java.util.List;

import static cn.generated.tables.Vb.VB;

/**
 * Created by zhujie on 15/7/23.
 */
public class vbc extends JooqDao<VbRecord, vbcm, Integer> {
    public vbc() {
        super(VB, vbcm.class);
    }

    @Override
    protected Integer getId(vbcm object) {
        return object.getId();
    }


    public void slsl() {
        System.out.print("12");
//        String sql = "SELECT * FROM vb";
//        Result<Record> fetch = create().fetch(sql);
        List<VbRecord> fetch = create().selectFrom(VB).fetch();
        System.out.println(fetch);
        System.out.print("1");
    }


    public static void main(String[] args) {

        System.out.print("1");
    }


}


