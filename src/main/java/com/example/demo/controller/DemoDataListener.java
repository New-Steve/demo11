package com.example.demo.controller;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.impl.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.dev.ReSave;
import org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DemoDataListener extends AnalysisEventListener<Student> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoDataListener.class);

    private static final int BATCH_COUNT =5;
    List<Student> list=new ArrayList<Student>();

    private StudentService studentServiceImpl;


    public DemoDataListener(StudentService studentServiceImpl){
        this.studentServiceImpl=studentServiceImpl;
    }


    @Override
    public void invoke(Student data, AnalysisContext Context) {
LOGGER.info("解析到一条数据：{}", JSON.toJSONString(data));
list.add(data);
if (list.size()>=BATCH_COUNT){
    saveData();
    list.clear();
}
    }


    @Override
    public void doAfterAllAnalysed(AnalysisContext Context) {
        saveData();
        LOGGER.info("所有数据解析完成");
    }
    private void saveData(){
        LOGGER.info("{}所有数据条，开始储存数据库",list.size());
        studentServiceImpl.saveBatch(list);
        LOGGER.info("存储完成");
    }
}
