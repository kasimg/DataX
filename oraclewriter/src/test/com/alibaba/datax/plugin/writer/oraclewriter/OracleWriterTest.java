package com.alibaba.datax.plugin.writer.oraclewriter;


import com.alibaba.datax.plugin.rdbms.util.DataBaseType;
import com.alibaba.datax.plugin.rdbms.writer.util.WriterUtil;
import com.sun.xml.internal.ws.api.pipe.Engine;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author kasim
 * @Date 2022/6/13
 */
public class OracleWriterTest {

    @Test
    public void test() {
        List<String> columnList = Arrays.asList("id", "name");
        List<String> valueList = Arrays.asList("1", "100");
        String s = WriterUtil.getWriteTemplate(columnList, valueList, "update(id)",
                DataBaseType.Oracle, false);
        System.out.println(s);
    }
}