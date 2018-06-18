<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>选择图书</title><%--选择人员--%>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/common/style.css" />
    <link rel="stylesheet" type="text/css" href="../css/common/select.css" />
    <!-- 	<link rel="stylesheet" type="text/css" href="../css/common/ui.dynatree.css"> -->
    <link rel="stylesheet" type="text/css" href="../css/common/org_select.css">
    <link rel="stylesheet" type="text/css" href="../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/easyui/themes/icon.css"/>
    <script src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
    <%--<script type="text/javascript" src="/lib/jQuery-File-Upload-master/jquery-1.8.3.min.js"></script>--%>
    <script src="/js/base/base.js"></script>
    <script type="text/javascript" src="../lib/easyui/jquery.easyui.min.js" ></script>
    <script type="text/javascript" src="../lib/easyui/tree.js" ></script>
    <style>
        body,html{
            width:100%;
            background:#f6f7f9;
        }
        .content{
            width:95%;
            background:#fff;
            margin:0 auto;
            font-size:14px;
            line-height: 21px;
            margin-top:8px;
        }
        th{
            background:#d6e7ef;
            text-align:left;
            font-weight:bold;
            font-size: 14px;
            height:25px;
            line-height:25px;
        }
        .num{
            font-size:14px;
            height:21px;
            line-height: 21px;
        }
        .num:hover{
            background-color:rgb(112,141,223);
            cursor:pointer;
        }
        .num td{
            padding:5px;
            text-align:center;
        }
    </style>
</head>
<body>
    <div>
        <table class="content">
            <thead>
                <tr>
                    <th>选择图书编号</th>
                </tr>
            </thead>
            <tbody class="list">

            </tbody>
        </table>
    </div>
    <script>
        $(function(){
            function show(){
                $.ajax({
                    url:'/bookInfo/selBookInfoByCond',
                    type:'get',
                    dataType:'json',
                    success:function(res){
                        var data=res.obj;

                        var str="";
                        for(var i=0;i<data.length;i++){
                            str+='<tr class="num">' +
                                '                    <td bookNo="'+data[i].bookNo+'" bookName="'+data[i].bookName+'">'+data[i].bookNo+'('+data[i].bookName+')'+'</td>' +
                                '                </tr>'
                        }
                        $('.list').html(str);
                        $('.num').each(function(){
                            $(this).click(function(){
                                var bookNo=$(this).text().split('(')[0].replace(/^\s*/,"");
                                 window.opener.document.getElementById('bookNo').value=bookNo;
                                window.close();
                            })
                        })
                    }
                })
            }
            show();
        })
    </script>
</body>
</html>