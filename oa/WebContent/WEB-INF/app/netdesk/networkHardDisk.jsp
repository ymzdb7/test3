<%--
  Created by IntelliJ IDEA.
  User: 骆鹏
  Date: 2017/7/4
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags"%>

<html>
<head>
    <title><fmt:message code="main.network" /></title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="../css/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="../css/easyui/icon.css">
    <link rel="stylesheet" type="text/css" href="../lib/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="../css/cabinet.css">
    <link rel="stylesheet" type="text/css" href="/css/netdesk/networkHardDisk.css">
    <%--<script type="text/javascript" src="../js/easyui/jquery.min.js"></script>--%>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" src="../js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/easyui/easyui-lang-zh_CN.js"></script>
    <script src="../js/base/base.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/layer/layer.js" type="text/javascript" charset="utf-8"></script>
    <script src="../lib/laydate.js" type="text/javascript" charset="utf-8"></script>
    <%--<script src="../lib/jquery.form.min.js" type="text/javascript" ></script>--%>
    <script src="/lib/jquery.form.min.js"></script>
    <script src="/js/common/language.js"></script>
    <script src="/js/networkHardDisk.js" type="text/javascript" ></script>
    <link rel="stylesheet" type="text/css" href="/css/commonTheme/${sessionScope.InterfaceModel}/commonTheme.css"/>

</head>
<body>
    <div style="width: 100%">
        <div class="cabinet_left">
            <div  id="personal" style="width:100%;height:44px;line-height:44px;">
                <div class="div_Img">
                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_publicFile.png" style="vertical-align: middle;" alt="">
                </div>
                <div class="divP"><fmt:message code="main.network" /></div>
            </div>
            <div id="fileTransfor">

            </div>
        </div>
        <div class="cabinet_info">


            <div class="noData" id="noFile" style="display: none;"><!--路径-->
                <div class="bgImg">
                    <div class="IMG">
                        <img src="../img/sys/icon64_info.png">
                    </div>
                    <div class="TXT" id="TXT"><fmt:message code="doc.th.IncorrectPath" /></div>
                </div>
            </div>





            <div class="mainContent" id="mainContent" style="display: block"><!--文档-->
                <div class="head w clearfix">

                    <div id="batch" class="ss twos clearfix" style="position: relative">
                        <form id="uploadimgform" target="uploadiframe" action="" enctype="multipart/form-data" method="post">
                            <div class="formfile formfile1" style="top: 0;left: 1px">
                                <input type="hidden" name="path">
                                <a href="javascript:void(0)" ><img style="margin-top: -3px;margin-left: -17px;margin-right: 3px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="doc.th.SingleUpload" /></a>
                                <input type="file" name="file"  onchange="filechanges($(this))"  class="w-icon5" num="1" >
                            </div>


                            <div class="formfile formfile2" style="top: 0;right: 0px;">
                                <a href="javascript:void(0)" id="uploadimg"><img style="margin-top: -3px;margin-left: -17px;margin-right: 3px;" src="../../img/mywork/shangchuan.png" alt=""><fmt:message code="notice.th.up" /></a>
                                <input type="file" name="file"  onchange="filechanges($(this))"  multiple="multiple" class="w-icon5"  num="2">

                            </div>
                        </form>
                    </div>
                    <div class="ss one" id="newsAdd"> <a id="contentAdd" href="javascript:;"><img style="margin-top: -3px;margin-left: -17px;margin-right: 3px;" src="../../img/mywork/newbuildworjk.png" alt=""><fmt:message code="adding.th.newF"/></a></div>
                    <div class="selected" id="one_selected" style="display: block;">

                        <div id="TitleOne" class="doTitle"><span style="margin-left: 38px;"><fmt:message code="file.th.op" /></span></div>
                        <div id="classA" class="hideDiv" style="display: none;width: 125px;">
                            <ul>
                                <li data-id="1"><fmt:message code="doc.th.RenameFolder" /></li>
                                <li data-id="2"><fmt:message code="doc.th.DeleteFolder" /></li>
                            </ul>
                        </div>
                    </div>
                    <div id="SEARCH" class="ss three"> <a class="SEARCH" href="javascript:;"><fmt:message code="workflow.th.sousuo" /></a></div>


                    <div class="selected"  style="display: block;">

                        <div  class="doTitle"><span style="margin-left: 38px;"><fmt:message code="global.lang.order" /></span></div>
                        <div  class="hideDiv" style="display: none;width: 125px;">
                            <ul id="typeActive" style="border-bottom: 1px solid #ddd">
                                <li class="typeActive" data-id="0"><fmt:message code="doc.th.ByName" /></li>
                                <li data-id="1"><fmt:message code="doc.th.Bytype" /></li>
                                <li data-id="2"><fmt:message code="doc.th.BySize" /></li>
                                <li data-id="3"><fmt:message code="doc.th.PressModifyTime" /></li>
                            </ul>
                            <ul id="sortActive">
                                <li class="sortActive" data-num="0"><fmt:message code="netdisk.th.asc" /></li>
                                <li data-num="1"><fmt:message code="netdisk.th.desc" /></li>
                            </ul>
                        </div>
                    </div>




                </div>
                <!--middle部分开始-->
                <div class="w">
                    <div class="neww" style="line-height: 33px;margin: 10px 0px;background: #ebeef5;padding-left: 10px;">
                        <span><fmt:message code="main.network" /></span>
                        <label>
                        <span></span>
                        </label>
                    </div>
                    <div class="wrap">
                        <input type="hidden" name="sortTxt" value="<fmt:message code="doc.th.CompanySystem" />">
                        <input type="hidden" name="folderId" value="6">
                        <table class="w">
                            <thead>
                            <tr>
                                <td class="th" align="center" width="10%"><input id="checkedAll" type="checkbox">
                                    <label for="checkedAll"><fmt:message code="notice.th.allchose" /></label></td>
                                <td class="th" width="20%" align="center"><fmt:message code="file.th.name" /></td>
                                <td class="th" width="20%" align="center"><fmt:message code="notice.th.type" /></td>
                                <td class="th" width="20%" align="center">
                                    <fmt:message code="netdisk.th.Size" />
                                </td>
                                <td class="th" width="30%" align="center">
                                    <fmt:message code="email.th.time" />
                                </td>
                            </tr>
                            </thead>
                            <tbody id="file_Tachr">
                            </tbody>
                        </table>
                    </div>
                </div>
                <!--bottom 部分开始-->
                <div class="bottom w">

                    <div class="boto" id="singReading">
                        <a class="ONES dowmloadOne" href="javascript:void (0)"><span><fmt:message code="file.th.download" /></span></a>
                    </div>
                    <div class="boto" id="copy">
                        <a class="TWOS copyfile" data-numcopy="0" href="javascript:void (0)"><span><fmt:message code="file.th.copy" /></span></a>
                    </div>
                    <div class="boto" id="shear">
                        <a class="THREE copyfile" data-numcopy="1" href="javascript:void (0)"><span><fmt:message code="file.th.cut" /></span></a>
                    </div>
                    <div class="boto" id="paste">
                        <a class="SIX" href="javascript:void (0)"><span><fmt:message code="fille.th.paste" /></span></a>
                    </div>
                    <div class="boto" id="deletebtn">
                        <a class="FOURs" href="javascript:void (0)"><span><fmt:message code="global.lang.delete" /></span></a>
                    </div>
                    <div class="boto" id="download" style="display: none;">
                        <a class="FIVE" href="javascript:void (0)"><span><fmt:message code="file.th.download" /></span></a>
                    </div>

                </div>
            </div>












        </div>
    </div>
</body>
</html>
