<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<!--[if IE 6 ]> <html class="ie6 lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 6 ]> <html class="lte_ie6 lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 7 ]> <html class="lte_ie7 lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 8 ]> <html class="lte_ie8 lte_ie9"> <![endif]-->
<!--[if lte IE 9 ]> <html class="lte_ie9"> <![endif]-->
<!--[if (gte IE 10)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <title><fmt:message code="hr.th.ImportExport" /></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../../css/style.css" />
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js"></script>
    <script src="../../js/news/page.js"></script>
    <script src="../../lib/laydate.js"></script>
    <script src="../../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../../lib/pagination/js/jquery.pagination.min.js" type="text/javascript" charset="utf-8"></script>

    <script type="text/javascript" >
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
</head>

<script src="/static/js/module.js?v=150805"></script>
<script src="/module/DatePicker/WdatePicker.js"></script>

<script Language="JavaScript">
    function my_export()
    {
        var CONTENT_NAME="";
        var to_id=document.form1.TO_ID.value;
        var to_name=document.form1.TO_NAME.value;

        var priv_id=document.form1.PRIV_ID.value;
        var priv_name=document.form1.PRIV_NAME.value;

        var to_id2=document.form1.TO_ID2.value;
        var to_name2=document.form1.TO_NAME2.value;

        if(document.form1.BEGIN_DATE.value!="" && document.form1.END_DATE.value!="")
        {
            if(document.form1.BEGIN_DATE.value > document.form1.END_DATE.value)
            { alert("<fmt:message code="hr.th.condition" />");
                return (false);
            }
        }
        for (i=0; i< document.form1.select1.options.length; i++)
            CONTENT_NAME+=document.form1.select1.options[i].text+',';
        document.form1.CONTENT_NAME.value= CONTENT_NAME;
        mysubmit();
    }

    // 字段选择Javascrpt
    function selected(){
        var isSelectedObj = document.getElementById("isSelected");
        var trObj = document.getElementById("conditionTr");
        if(isSelectedObj.checked){
            trObj.style.display="";
        }else{
            trObj.style.display="none";
        }
    }

    function func_insert()
    {
        for (i=0; i<document.form1.select2.options.length; i++)
        {
            if(document.form1.select2.options[i].selected)
            {
                option_text=document.form1.select2.options[i].text;
                option_value=document.form1.select2.options[i].value;
                option_style_color=document.form1.select2.options[i].style.color;

                var my_option = document.createElement("OPTION");
                my_option.text=option_text;
                my_option.value=option_value;
                my_option.style.color=option_style_color;

                pos=document.form1.select2.options.length;
                document.form1.select1.options.add(my_option,pos);
                document.form1.select2.remove(i);
                i--;
            }
        }//for
    }

    function func_delete()
    {
        for (i=0;i<document.form1.select1.options.length;i++)
        {
            if(document.form1.select1.options[i].selected)
            {
                option_text=document.form1.select1.options[i].text;
                option_value=document.form1.select1.options[i].value;

                var my_option = document.createElement("OPTION");
                my_option.text=option_text;
                my_option.value=option_value;

                if(option_text.indexOf("[必选]")>0)
                    continue;//  return;
                pos=document.form1.select2.options.length;
                document.form1.select2.options.add(my_option,pos);
                document.form1.select1.remove(i);
                i--;
            }
        }//for
    }

    function func_select_all1()
    {
        for (i=document.form1.select1.options.length-1; i>=0; i--)
            document.form1.select1.options[i].selected=true;
    }

    function func_select_all2()
    {
        for (i=document.form1.select2.options.length-1; i>=0; i--)
            document.form1.select2.options[i].selected=true;
    }

    function func_up()
    {
        sel_count=0;
        for (i=document.form1.select1.options.length-1; i>=0; i--)
        {
            if(document.form1.select1.options[i].selected)
                sel_count++;
        }

        if(sel_count==0)
        {
            alert("<fmt:message code="hr.th.OnlySelecteditems" />！");
            return;
        }
        else if(sel_count>1)
        {
            alert("<fmt:message code="hr.th.OnlySelected" />！");
            return;
        }

        i=document.form1.select1.selectedIndex;

        if(i!=0)
        {
            var my_option = document.createElement("OPTION");
            my_option.text=document.form1.select1.options[i].text;
            my_option.value=document.form1.select1.options[i].value;

            document.form1.select1.options.add(my_option,i-1);
            document.form1.select1.remove(i+1);
            document.form1.select1.options[i-1].selected=true;
        }
    }

    function func_down()
    {
        sel_count=0;
        for (i=document.form1.select1.options.length-1; i>=0; i--)
        {
            if(document.form1.select1.options[i].selected)
                sel_count++;
        }

        if(sel_count==0)
        {
            alert("<fmt:message code="hr.th.OnlySelecteditems" />！");
            return;
        }
        else if(sel_count>1)
        {
            alert("<fmt:message code="hr.th.OnlySelected" />！");
            return;
        }

        i=document.form1.select1.selectedIndex;

        if(i!=document.form1.select1.options.length-1)
        {
            var my_option = document.createElement("OPTION");
            my_option.text=document.form1.select1.options[i].text;
            my_option.value=document.form1.select1.options[i].value;

            document.form1.select1.options.add(my_option,i+2);
            document.form1.select1.remove(i);
            document.form1.select1.options[i+1].selected=true;
        }
    }

    function mysubmit()
    {
        fld_str="";
        for (i=0; i< document.form1.select1.options.length; i++)
        {
            options_value=document.form1.select1.options[i].value;
            fld_str+=options_value+",";
        }
        document.form1.fieldArrStr.value = fld_str;
        window.document.form1.submit();
    }

    function daoru(){
        str="in_out/import/index.php";
        window.open (str, 'newwindow', 'height=600, width=600, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no');

    }

    function CheckForm()
    {
        if(document.form2.EXCEL_FILE.value=="")
        {
            alert("<fmt:message code="user.th.selectImport" />！");
            return (false);
        }
        if(document.form2.EXCEL_FILE.value!="")
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
<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td class="Big"><img src="/static/images/export.gif" WIDTH="22" HEIGHT="20" align="absmiddle"><span class="big3"> <fmt:message code="hr.th.ContractDataExport" /></span>
        </td>
    </tr>
</table>

<br>

<form action="export.php" enctype="multipart/form-data"  method="post" name="form1">
    <table class="TableBlock" width="60%" align="center">
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.ScopeDepartment" />：</td>
            <td class="TableData">
                <input type="hidden" id="TO_ID" name="TO_ID" value="">
                <textarea cols=35 id="TO_NAME" name="TO_NAME" rows=2 class="BigStatic" wrap="yes" readonly></textarea>
                <a href="javascript:;" class="orgAdd" ><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" class="orgClear" ><fmt:message code="global.lang.empty" /></a>
                <span style="color: #666666;"><fmt:message code="hr.th.WeExport" /></span>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.RangeRole" />：</td>
            <td class="TableData">
                <input type="hidden" id="PRIV_ID" name="PRIV_ID" value="">
                <textarea cols=35 id="PRIV_NAME" name="PRIV_NAME" rows=2 class="BigStatic" wrap="yes" readonly></textarea>
                <a href="javascript:;" class="orgAdd" onClick="SelectPriv('')"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" class="orgClear" onClick="ClearUser('PRIV_ID', 'PRIV_NAME')"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>
        <tr>
            <td nowrap class="TableData"><fmt:message code="hr.th.RangePersonnel" />：</td>
            <td class="TableData">
                <input type="hidden" id="TO_ID2" name="TO_ID2" value="">
                <textarea cols=35 name="TO_NAME2" id="TO_NAME2" rows="2" class="BigStatic" wrap="yes" readonly></textarea>
                <a href="javascript:;" class="orgAdd" onClick="SelectUser('27','','TO_ID2', 'TO_NAME2')"><fmt:message code="global.lang.add" /></a>
                <a href="javascript:;" class="orgClear" onClick="ClearUser('TO_ID2', 'TO_NAME2')"><fmt:message code="global.lang.empty" /></a>
            </td>
        </tr>

        <tr>
            <td nowrap class="TableData" width="100"><fmt:message code="hr.th.ContractRegistrationTime" />：</td>
            <td class="TableData">
                <input type="text" id="start_time" name="BEGIN_DATE" size="12" maxlength="10" class="BigInput"  onClick="WdatePicker()">
                <fmt:message code="global.lang.to" />&nbsp;
                <input type="text" name="END_DATE" size="12" maxlength="10" class="BigInput"  onClick="WdatePicker({minDate:'#F{$dp.$D(\'start_time\')}'})">

            </td>
        <tr>
            <td  class='efCellCtrl'><input type="checkbox" name="isSelected" id="isSelected" value="selected" onClick="selected()" /> <fmt:message code="hr.th.SelectExportFields" /></td><td></td>

        </tr>
        <tr id="conditionTr" style="display:none">
            <td colspan="2" class='efCellCtrl'>

                <table width="500" border="1" cellspacing="0" cellpadding="3" align="center" bordercolorlight="#F7F7F7" bordercolordark="#F7F7F7" class="big">
                    <tr bgcolor="#CCCCCC">
                        <td align="center"><fmt:message code="global.lang.order" /></td>
                        <td align="center"><b><fmt:message code="hr.th.SelectedField" /></b></td>
                        <td align="center"><fmt:message code="global.lang.select" /></td>
                        <td align="center" valign="top"><b><fmt:message code="workflow.th.Alternatefield" /></b></td>
                    </tr>
                    <tr>
                        <td align="center" bgcolor="#F7F7F7">
                            <input type="button" class="SmallInput" value=" ↑ " onClick="func_up();"/>
                            <br><br>
                            <input type="button" class="SmallInput" value=" ↓ " onClick="func_down();"/>				</td>
                        <td valign="top" align="center" bgcolor="#F7F7F7">
                            <select  name="select1[]" id="select1" ondblclick="func_delete();" MULTIPLE style=" min-width: 107px; min-height: 100px;*width: 107px;">
                            </select>
                            <input type="button" value=" <fmt:message code="notice.th.allchose" /> " onClick="func_select_all1();" class="SmallInput"/>				</td>

                        <td align="center" bgcolor="#F7F7F7">
                            <input type="button" class="SmallInput" value=" ← " onClick="func_insert();"/>
                            <br><br>
                            <input type="button" class="SmallInput" value=" → " onClick="func_delete();"/>				</td>

                        <td align="center" valign="top" bgcolor="#F7F7F7">
                            <select  name="select2[]" id="select2" ondblclick="func_insert();" MULTIPLE style=" min-width: 107px;min-height: 100px; *width: 107px;"/>
                            <option value='USER_ID'><fmt:message code="userName" /></option><option value='STAFF_NAME'><fmt:message code="userDetails.th.name" /></option><option value='STAFF_CONTRACT_NO'><fmt:message code="hr.th.ContractNumber" /></option><option value='CONTRACT_TYPE'><fmt:message code="hr.th.typeContract" /></option><option value='STATUS'><fmt:message code="hr.th.ContractStatus" /></option><option value='CONTRACT_SPECIALIZATION'><fmt:message code="hr.th.ContractualTermAttributes" /></option><option value='CONTRACT_ENTERPRIES'><fmt:message code="hr.th.ContractSigningCompany" /></option><option value='MAKE_CONTRACT'><fmt:message code="hr.th.ContractDate" /></option><option value='PROBATION_EFFECTIVE_DATE'><fmt:message code="hr.th.ContractCommencementDate" /></option><option value='CONTRACT_END_TIME'><fmt:message code="hr.th.ContractTerminationDate" /></option><option value='IS_TRIAL'><fmt:message code="hr.th.Does" /></option><option value='TRAIL_OVER_TIME'><fmt:message code="hr.th.TrialDeadline" /></option><option value='PASS_OR_NOT'><fmt:message code="hr.th.AreEmployeesActive" /></option><option value='REMOVE_OR_NOT'><fmt:message code="hr.th.Has" /></option><option value='CONTRACT_REMOVE_TIME'><fmt:message code="hr.th.DateContract" /></option><option value='IS_RENEW'><fmt:message code="hr.th.IsRenewed" /></option><option value='RENEW_TIME'><fmt:message code="hr.th.RenewalDate" /></option><option value='REMARK'><fmt:message code="journal.th.Remarks" /></option>				</select>
                            <input type="button" value=" <fmt:message code="notice.th.allchose" /> " onClick="func_select_all2();" class="SmallInput">				</td>
                    </tr>

                    <tr bgcolor="#CCCCCC">
                        <td align="center" valign="top" colspan="4">
                            <fmt:message code="hr.th.ClickItems" /><br>				</td>
                    </tr>
                </table>		</td>
        </tr>
        <tr>
            <td class='efCellCtrl' align="center">
                <input type="hidden" name="ID" id="ID" value= />
                <input type="hidden" name="ORDER_CLAUSE" id="ORDER_CLAUSE" value="" />
                <input type="hidden" name="LIMIT_CLAUSE" id="LIMIT_CLAUSE" value="" />
                <input type="hidden" name="fieldArrStr" value="" />
            </td>
        </tr>
        </tr>

        <tr align="center" class="TableControl">
            <td colspan="2" nowrap>
                <input type="hidden" name="CONTENT_NAME" value="">
                <input type="button" value="导出" class="BigButton" onClick="my_export();">
            </td>
        </tr>
    </table>
</form>

<table border="0" width="90%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td class="Big"><img src="../../img/import.gif" WIDTH="22" HEIGHT="20" align="absmiddle"><span class="big3"> <fmt:message code="hr.th.ContractDataIntroduction" /></span>
        </td>
    </tr>
</table>
<br>
<form name="form2" method="post" action="import.php?" enctype="multipart/form-data" onSubmit="return CheckForm();">
    <table class="TableBlock" align="center" width="60%">
        <tr class="TableData" align="center" height="30">
            <td width="150" align="right"><b><fmt:message code="hr.th.DownloadImportTemplates" />：</b></td>
            <td width="400" align="left">
                <a href="#" onClick="window.location='templet_export.php'"><fmt:message code="hr.th.ContractDataTemplateDownload" /></a>
            </td>
        </tr>
        <tr class="TableData" align="center" height="30">
            <td width="150" align="right"><b>&nbsp;&nbsp;<fmt:message code="hr.th.SelectImportfile" />：</b></td>
            <td align="left" width="400">
                <input type="file" name="EXCEL_FILE" class="BigInput" size="30">
                <input type="hidden" name="FILE_NAME">
            </td>
        </tr>
        <tr class="TableData" align="center" height="30">
            <td width="150" align="right"><b><fmt:message code="hr.th.Explain" />：</b></td>
            <td width="400" align="left">
  	<span>
    1、<fmt:message code="hr.th.Import.XlsFile" />；    <br>
    2、<fmt:message code="hr.th.DataImported" />；    <br>
    3、<fmt:message code="hr.th.ContractDataTemplate" />；    <br>
    4、<fmt:message code="hr.th.FillContractStatus" />；    <br>
    5、<fmt:message code="hr.th.FormatDate" />：2009-10-15；    </span>
            </td>
        </tr>
        <tr>
            <td nowrap  class="TableControl" colspan="3" align="center">
                <input type="submit" value="<fmt:message code="workflow.th.Import" />" class="BigButton">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

