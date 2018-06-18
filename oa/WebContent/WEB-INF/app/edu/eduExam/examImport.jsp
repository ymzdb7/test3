<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <title>考试管理导入</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <link rel="stylesheet" href="/css/base.css">
    <link rel="stylesheet" type="text/css" href="../css/news/new_news.css"/>
    <link rel="stylesheet" type="text/css" href="../css/edu/eduExam/insertExam.css"/>
    <script type="text/javascript" src="../js/news/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="/static/js/ccorrect_btn.js"></script>
    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
</head>
<script Language="JavaScript">

    function CheckForm2()
    {
        if(document.form2.EXCEL_FILE.value=="")
        { alert("请选择要导入的文件！");
            return (false);
        }
        if (document.form2.EXCEL_FILE.value!="")
        {
            var file_temp=document.form2.EXCEL_FILE.value,file_name;
            var Pos;
            Pos=file_temp.lastIndexOf("\\");
            file_name=file_temp.substring(Pos+1,file_temp.length);
            document.form2.FILE_NAME.value=file_name;
        }

        return (true);
    }

</script>


<body class="bodycolor">
<div class="bx">
    <div class="center" id="" style="width: 100%;margin-left: 10px;">
        <div class="nav_box clearfix">
            <div class="nav_t1"><img src="/img/commonTheme/${sessionScope.InterfaceModel}/la2.png"></div>
            <div class="nav_t2" class="news">考试管理导入</div>
        </div>
        <form name="form2" method="post" action="import.php" enctype="multipart/form-data" onSubmit="return CheckForm2();">
            <table class="TableBlock" align="center" width="70%">
                <tr class="TableData" align="center" height="30">
                    <td width="150" align="right"><b>下载导入模板：</b></td>
                    <td width="400" align="left">
                        <a href="#" onClick="window.location='templet_export.php'">考试管理导入模板下载</a>
                    </td>
                </tr>
                <tr class="TableData" align="center" height="30">
                    <td width="150" align="right"><b>&nbsp;&nbsp;选择导入文件：</b></td>
                    <td align="left" width="400">
                        <input type="file" name="EXCEL_FILE" class="BigInput" size="30">
                        <input type="hidden" name="FILE_NAME">
                        <input type="hidden" name="GROUP_ID" value="">
                    </td>
                </tr>
                <tr class="TableData" align="center" height="30">
                    <td align="right"><b>说明：</b></td>
                    <td align="left">
                        <span>
                        1、请导入.xls文件。</br>
                            2、导入文件中，“学年”的格式为（2013-2014）。</br>
                            3、导入文件中，“学期”的格式为（上学期、下学期）。</br>
                            4、导入文件中，“班级”的格式为（一年级，二年级，三年级，）若有多个班级，请用英文逗号分开。</br>
                            5、导入文件中，“考试类型”的格式为（入学、期中、期末）。</br>
                            6、导入文件中， 模板中每个字段都应该填写。</br>
                        </span>
                    </td>
                </tr>
                <tr>
                    <td nowrap  class="TableControl" colspan="2" align="center">
                        <button id="importBtn" class="import">导入</button>
                    </td>
                </tr>
            </table>
        </form>

    </div>
</div>
</body>
</html>
<script>
    $(function(){







    })


</script>