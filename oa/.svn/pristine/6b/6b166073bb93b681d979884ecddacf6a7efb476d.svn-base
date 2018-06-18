<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<script type="text/javascript" src="/inc/js_lang.php"></script>
<script src="/static/js/module.js"></script>
<script type="text/javascript" src="/static/js/utility.js"></script>
<script type="text/javascript" src="/static/js/attach.js"></script>
<script src="/module/DatePicker/WdatePicker.js"></script>

<body class="bodycolor">

<table border="0" width="100%" cellspacing="0" cellpadding="3" class="small">
    <tr>
        <td><img src="<?= MYOA_STATIC_SERVER ?>/static/images/notify_new.gif" align="absmiddle"><span class="big3"> <?= _("考试管理详情") ?></span>&nbsp;&nbsp;
        </td>
    </tr>
</table>
<br>
<table class="TableBlock" width="80%" align="center">
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 学年：") ?></td>
        <td class="TableData"><?=$SCHOOL_YEAR?></td>
    </tr>
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 学期：") ?></td>
        <td class="TableData"><?=$SEMESTER?></td>
    </tr>
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 考试范围(年级)：") ?></td>
        <td class="TableData"><?=td_trim($GRADE_NAME)?></td>
    </tr>
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 考试范围(班级)：") ?></td>
        <td class="TableData"><?=td_trim($CLASS_NAME)?></td>
    </tr>
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 考试范围(人员)：") ?></td>
        <td class="TableData"><?=td_trim($EXAM_USER_NAME)?></td>
    </tr>
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 考试名称：") ?></td>
        <td class="TableData"><?=$EXAM_NAME?></td>
    </tr>
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 考试类型：") ?></td>
        <td class="TableData"><?=get_code_name($EXAM_TYPE, 'EXAM_TYPE');?></td>
    </tr>
    <tr>
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 考试安排：") ?></td>
        <td class="TableData"><?=$EXAM_ARRANGE?></td>
    </tr>
    <tr class="TableData" id="attachment2">
        <td nowrap class="TableData" style="width:100px;text-align:center;"><?= _(" 附件文档：") ?></td>
        <td nowrap colspan=3>
            <?
                    if ($ATTACHMENT_ID == "")
                        echo _("无附件");
                    else
                        echo attach_link($ATTACHMENT_ID, $ATTACHMENT_NAME, 1, 1, 1, 0, 0, 0, 0, 0);
                    ?>
        </td>
    </tr>

    <tr align="center" class="TableControl">
        <td colspan=4 nowrap>
            <input type="button" value="<?= _("关闭") ?>" class="BigButton" onClick="window.close()">
        </td>
    </tr>
</table>
</body>
</html>