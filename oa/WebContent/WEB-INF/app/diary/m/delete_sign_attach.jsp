<?
include_once("inc/auth.inc.php");
include_once("inc/utility_file.php");
include_once("inc/header.inc.php");
ob_clean();
delete_attach($ATTACHMENT_ID,$ATTACHMENT_NAME);
echo 1;
exit;
?>