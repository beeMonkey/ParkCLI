package com.thoughtworks.tdd;

import com.thoughtworks.tdd.IO.View;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.fest.assertions.api.Assertions.assertThat;


public class ParkingAppTest  {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_tip_before_input() throws IOException{
        //ParkingApp parkingApp = new ParkingApp();
        View view =new View();
        view.showBeginView();
//        assertThat(systemOut().contains("1. 停车\\n\" +\n" +
//                "                \"2. 取车 \\n\" +\n" +
//                "                \"请输入您要进行的操作："));
        assertThat(systemOut().endsWith("1. 停车\n" +
                "2. 取车 \n" +
                "请输入您要进行的操作："+"\n")).isTrue();
    }
    private String systemOut() {
        return outContent.toString();
    }

}
