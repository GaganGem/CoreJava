package com.raystech.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {

	private static JdbcDataSource jds1 = null;

	private ComboPooledDataSource jds = null;

	private JdbcDataSource() {

		jds = new ComboPooledDataSource();

	}

}
