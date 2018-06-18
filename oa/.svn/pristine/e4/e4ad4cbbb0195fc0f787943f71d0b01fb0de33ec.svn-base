<?
   include_once("../header.php");
   include_once("inc/utility_all.php");
   include_once("inc/check_type.php");
   ob_end_clean();
   
   if(!is_date($DATE))
   {
      echo _("日期格式不正确");
      exit;
   }else{
      $DIA_DATE = $DATE;   
   }

   $CUR_TIME = date("Y-m-d H:i:s",time());
   $SUBJECT = td_iconv(td_htmlspecialchars($SUBJECT), "utf-8", MYOA_CHARSET);
   $CONTENT = td_iconv(td_htmlspecialchars($CONTENT), "utf-8", MYOA_CHARSET);
   
   $NOTAGS_CONTENT = addslashes(strip_tags($CONTENT));
   $COMPRESS_CONTENT = bin2hex(gzcompress($CONTENT));	
		
   if($DIA_ID=="")
   {
      if($CONTENT==""){
         echo _("请填写日志内容");
         exit;      
      }
      //$query="insert into DIARY(USER_ID,DIA_DATE,DIA_TIME,DIA_TYPE,CONTENT) values ('".$_SESSION["LOGIN_USER_ID"]."','$DIA_DATE','$CUR_TIME','$DIA_TYPE','$CONTENT')";
      $query="insert into DIARY(USER_ID,DIA_DATE,DIA_TIME,DIA_TYPE,SUBJECT,CONTENT,COMPRESS_CONTENT) values ('".$_SESSION["LOGIN_USER_ID"]."','$DIA_DATE','$CUR_TIME','$DIA_TYPE','$SUBJECT','$NOTAGS_CONTENT',0x$COMPRESS_CONTENT)";
      if(exequery(TD::conn(),$query)) 
		   echo '{"status":"ok"}';
		   
		exit;
   }else
   {
	   $query="select USER_ID from DIARY where DIA_ID='$DIA_ID'";
	   $cursor=exequery(TD::conn(),$query);
	   if($ROW=mysql_fetch_array($cursor)) 
	     $USER_ID=$ROW["USER_ID"];
	     
      if($USER_ID==$_SESSION["LOGIN_USER_ID"])
      {
         $query="update DIARY set DIA_TYPE='$DIA_TYPE', CONTENT='$NOTAGS_CONTENT', COMPRESS_CONTENT = 0x$COMPRESS_CONTENT, DIA_DATE='$DIA_DATE', SUBJECT='$SUBJECT',  DIA_TIME='$CUR_TIME' where DIA_ID='$DIA_ID'";
         if(exequery(TD::conn(),$query))
      		echo '{"status":"ok"}';
      }else 
         echo _("非法操作");
   }
?>
