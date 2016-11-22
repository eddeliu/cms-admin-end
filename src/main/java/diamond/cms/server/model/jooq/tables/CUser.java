/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables;


import diamond.cms.server.model.jooq.Cms;
import diamond.cms.server.model.jooq.Keys;
import diamond.cms.server.model.jooq.tables.records.CUserRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CUser extends TableImpl<CUserRecord> {

	private static final long serialVersionUID = 160884567;

	/**
	 * The reference instance of <code>cms.c_user</code>
	 */
	public static final CUser C_USER = new CUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CUserRecord> getRecordType() {
		return CUserRecord.class;
	}

	/**
	 * The column <code>cms.c_user.id</code>.
	 */
	public final TableField<CUserRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

	/**
	 * The column <code>cms.c_user.username</code>.
	 */
	public final TableField<CUserRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false), this, "");

	/**
	 * The column <code>cms.c_user.password</code>.
	 */
	public final TableField<CUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

	/**
	 * The column <code>cms.c_user.token</code>.
	 */
	public final TableField<CUserRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

	/**
	 * The column <code>cms.c_user.expired</code>.
	 */
	public final TableField<CUserRecord, Long> EXPIRED = createField("expired", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cms.c_user.create_time</code>.
	 */
	public final TableField<CUserRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>cms.c_user.last_login_time</code>.
	 */
	public final TableField<CUserRecord, Timestamp> LAST_LOGIN_TIME = createField("last_login_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>cms.c_user</code> table reference
	 */
	public CUser() {
		this("c_user", null);
	}

	/**
	 * Create an aliased <code>cms.c_user</code> table reference
	 */
	public CUser(String alias) {
		this(alias, C_USER);
	}

	private CUser(String alias, Table<CUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private CUser(String alias, Table<CUserRecord> aliased, Field<?>[] parameters) {
		super(alias, Cms.CMS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<CUserRecord> getPrimaryKey() {
		return Keys.KEY_C_USER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<CUserRecord>> getKeys() {
		return Arrays.<UniqueKey<CUserRecord>>asList(Keys.KEY_C_USER_PRIMARY, Keys.KEY_C_USER_UK_E4YLW9V9NHRB2RJVY09B1Y7XS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CUser as(String alias) {
		return new CUser(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CUser rename(String name) {
		return new CUser(name, null);
	}
}