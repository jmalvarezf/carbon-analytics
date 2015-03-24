/*
*  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.analytics.datasource.hbase.util;

public class HBaseAnalyticsDSConstants {

    public static final String DATASOURCE_NAME = "datasource";

    public static final String ANALYTICS_USER_TABLE_PREFIX = "ANX";
    public static final String ANALYTICS_INDEX_TABLE_PREFIX = "IDX";
    public static final String ANALYTICS_META_TABLE_PREFIX = "META";

    public static final int DATA = 1;
    public static final int INDEX = 2;
    public static final int META = 3;

    public static final byte[] ANALYTICS_DATA_COLUMN_FAMILY_NAME = "carbon-analytics-data".getBytes();
    public static final byte[] ANALYTICS_META_COLUMN_FAMILY_NAME = "carbon-analytics-meta".getBytes();
    public static final byte[] ANALYTICS_INDEX_COLUMN_FAMILY_NAME = "carbon-analytics-index".getBytes();
    public static final byte[] ANALYTICS_TIMESTAMP_COLUMN_FAMILY_NAME = "carbon-analytics-timestamp".getBytes();

    public static final byte[] ANALYTICS_ROWDATA_QUALIFIER_NAME = "row-values".getBytes();
    public static final byte[] ANALYTICS_SCHEMA_QUALIFIER_NAME = "database-schema".getBytes();
    public static final byte[] ANALYTICS_TS_QUALIFIER_NAME = "timestamp".getBytes();

    public static final int DEFAULT_QUERY_BATCH_SIZE = 7000;
    public static final String HBASE_ANALYTICS_CONFIG_FILE = "hbase-analytics-config.xml";

}