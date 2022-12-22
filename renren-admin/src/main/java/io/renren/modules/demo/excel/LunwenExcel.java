package io.renren.modules.demo.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2022-12-11
 */
@Data
public class LunwenExcel {
    @Excel(name = "")
    private Long id;
    @Excel(name = "所属部门")
    private String depart;
    @Excel(name = "作者")
    private String author;
    @Excel(name = "论文题目")
    private String title;
    @Excel(name = "论文来源")
    private String source;
    @Excel(name = "检索网址")
    private String address;
    @Excel(name = "刊物名称")
    private String pubname;
    @Excel(name = "刊号")
    private String pubnum;
    @Excel(name = "刊物级别")
    private String level;
    @Excel(name = "起止页码")
    private String page;
    @Excel(name = "收录级别")
    private String include;

}