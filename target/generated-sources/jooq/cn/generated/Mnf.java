/**
 * This class is generated by jOOQ
 */
package cn.generated;


import cn.generated.tables.Vb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mnf extends SchemaImpl {

	private static final long serialVersionUID = 757725963;

	/**
	 * The reference instance of <code>mnf</code>
	 */
	public static final Mnf MNF = new Mnf();

	/**
	 * No further instances allowed
	 */
	private Mnf() {
		super("mnf");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Vb.VB);
	}
}
