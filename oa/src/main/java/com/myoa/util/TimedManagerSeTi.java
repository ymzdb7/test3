 package com.myoa.util;
 
 import com.myoa.model.timedTaskManagement.TimedTaskManagement;
import com.myoa.model.timedTaskManagement.TimedTaskRecord;
import com.myoa.service.timedTaskManagement.TimedTaskManagementService;
import com.myoa.service.timedTaskManagement.TimedTaskRecordService;

 import java.io.PrintStream;
 import java.text.SimpleDateFormat;
 import java.util.Calendar;
 import java.util.Date;
 import java.util.List;
 import java.util.TimerTask;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
 @Component
 public class TimedManagerSeTi extends TimerTask
 {
 
   @Autowired
   private TimedTaskManagementService timedTaskManagementService;
 
   @Autowired
   private TimedTaskRecordService timedTaskRecordService;
 
   public void run()
   {
     Date date = new Date();
     Date date1 = null;
     TimedTaskRecord timedTaskRecord = new TimedTaskRecord();
     Calendar calendar = Calendar.getInstance();
     TimedTaskManagement timedTaskManagement1 = null;
     SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd");
     SimpleDateFormat dft = new SimpleDateFormat("HH:mm:ss");
 
     List<TimedTaskManagement> list = this.timedTaskManagementService.selectTimeManagerTo();
     for (TimedTaskManagement timedTaskManagement : list)
       if (timedTaskManagement.getTypeMet().intValue() == 1) {
         try {
           date = df.parse(df.format(date));
         } catch (Exception e) {
           e.printStackTrace();
         }
         if ((timedTaskManagement.getTaskType().intValue() != 0) && (timedTaskManagement.getTaskType() != null)) {
           switch (timedTaskManagement.getTaskType().intValue()) {
           case 1:
             System.out.println("方法一---------------------------------------------");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getLishiTime() == null) break;
               calendar.setTime(timedTaskManagement1.getLishiTime());
               if (timedTaskManagement1.getIntwevalTime() == null) {
                 timedTaskManagement1.setIntwevalTime("0");
               }
               calendar.add(12, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
               date1 = calendar.getTime();
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
               break;
             }
 
             Integer result = null;
 
             result = Integer.valueOf(0);
 
             timedTaskRecord.setResult(result);
 
             timedTaskRecord.setUserId("无");
             timedTaskRecord.setExecutionTime(date);
             timedTaskRecord.setLishiTime(date);
             timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
             this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             break;
           case 2:
             System.out.println("方法二----------------------------------------------------------------");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getLishiTime() == null) break;
               calendar.setTime(timedTaskManagement1.getLishiTime());
               if (timedTaskManagement1.getIntwevalTime() == null) {
                 timedTaskManagement1.setIntwevalTime("0");
               }
               calendar.add(12, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
               date1 = calendar.getTime();
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
               break;
             }
 
 
             result = Integer.valueOf(0);
 
             timedTaskRecord.setResult(result);
 
             timedTaskRecord.setUserId("无");
             timedTaskRecord.setExecutionTime(date);
             timedTaskRecord.setLishiTime(date);
             timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
             this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             break;
           case 3:
             System.out.println("方法三---------------------------------------------------------------------------");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getLishiTime() == null) break;
               calendar.setTime(timedTaskManagement1.getLishiTime());
               if (timedTaskManagement1.getIntwevalTime() == null) {
                 timedTaskManagement1.setIntwevalTime("0");
               }
               calendar.add(12, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
               date1 = calendar.getTime();
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
               break;
             }
 
 
             result = Integer.valueOf(0);
 
             timedTaskRecord.setResult(result);
 
             timedTaskRecord.setUserId("无");
             timedTaskRecord.setExecutionTime(date);
             timedTaskRecord.setLishiTime(date);
             timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
             this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             break;
           default:
             System.out.println("没用该方法-------------------------------------------------------------");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getLishiTime() == null) break;
               calendar.setTime(timedTaskManagement1.getLishiTime());
               if (timedTaskManagement1.getIntwevalTime() == null) {
                 timedTaskManagement1.setIntwevalTime("0");
               }
               calendar.add(12, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
               date1 = calendar.getTime();
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
               break;
             }
 
 
             result = Integer.valueOf(0);
 
             timedTaskRecord.setResult(result);
 
             timedTaskRecord.setUserId("无");
             timedTaskRecord.setExecutionTime(date);
             timedTaskRecord.setLishiTime(date);
             timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
             this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             break;
           }
 
         }
 
       }
       else if (timedTaskManagement.getTypeMet().intValue() == 0) {
         try {
           date = df.parse(df.format(date));
         } catch (Exception e) {
           e.printStackTrace();
         }
         if ((timedTaskManagement.getTaskType().intValue() != 0) && (timedTaskManagement.getTaskType() != null))
           switch (timedTaskManagement.getTaskType().intValue()) {
           case 1:
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getExecutionTimeat() == null) break;
               try {
                 Date date2 = dfs.parse(dfs.format(timedTaskManagement1.getExecutionTimeat()));
                 calendar.setTime(date2);
 
                 if (timedTaskManagement1.getIntwevalTime() == null) {
                   timedTaskManagement1.setIntwevalTime("0");
                 }
                 calendar.add(5, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
                 date1 = calendar.getTime();
                 String StringDate = dfs.format(date1);
                 StringDate = StringDate + timedTaskManagement1.getIntwevalTime();
                 date1 = df.parse(StringDate);
               } catch (Exception e) {
                 e.printStackTrace();
               }
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }
             else
             {
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(date);
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }break;
           case 2:
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getExecutionTimeat() == null) break;
               try {
                 Date date2 = dfs.parse(dfs.format(timedTaskManagement1.getExecutionTimeat()));
                 calendar.setTime(date2);
 
                 if (timedTaskManagement1.getIntwevalTime() == null) {
                   timedTaskManagement1.setIntwevalTime("0");
                 }
                 calendar.add(5, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
                 date1 = calendar.getTime();
                 String StringDate = dfs.format(date1);
                 StringDate = StringDate + timedTaskManagement1.getIntwevalTime();
                 date1 = df.parse(StringDate);
               } catch (Exception e) {
                 e.printStackTrace();
               }
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }
             else
             {
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(date);
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }break;
           case 3:
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getExecutionTimeat() == null) break;
               try {
                 Date date2 = dfs.parse(dfs.format(timedTaskManagement1.getExecutionTimeat()));
                 calendar.setTime(date2);
 
                 if (timedTaskManagement1.getIntwevalTime() == null) {
                   timedTaskManagement1.setIntwevalTime("0");
                 }
                 calendar.add(5, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
                 date1 = calendar.getTime();
                 String StringDate = dfs.format(date1);
                 StringDate = StringDate + timedTaskManagement1.getIntwevalTime();
                 date1 = df.parse(StringDate);
               } catch (Exception e) {
                 e.printStackTrace();
               }
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }
             else
             {
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(date);
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }break;
           case 4:
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getExecutionTimeat() == null) break;
               try {
                 Date date2 = dfs.parse(dfs.format(timedTaskManagement1.getExecutionTimeat()));
                 calendar.setTime(date2);
 
                 if (timedTaskManagement1.getIntwevalTime() == null) {
                   timedTaskManagement1.setIntwevalTime("0");
                 }
                 calendar.add(5, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
                 date1 = calendar.getTime();
                 String StringDate = dfs.format(date1);
                 StringDate = StringDate + timedTaskManagement1.getIntwevalTime();
                 date1 = df.parse(StringDate);
               } catch (Exception e) {
                 e.printStackTrace();
               }
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }
             else
             {
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(date);
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }break;
           default:
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             System.out.println("定点任务 方法一》》》》》》》》》》》》》》》》》》》》》》》》》");
             if ((timedTaskManagement.getExecute() == null) || 
               (timedTaskManagement.getExecute().intValue() != 1))
               break;
             timedTaskManagement1 = this.timedTaskManagementService.selectTimedTaskOne(timedTaskManagement.getTtmId(), timedTaskManagement.getTaskType());
             if (timedTaskManagement1 != null) {
               if (timedTaskManagement1.getExecutionTimeat() == null) break;
               try {
                 Date date2 = dfs.parse(dfs.format(timedTaskManagement1.getExecutionTimeat()));
                 calendar.setTime(date2);
 
                 if (timedTaskManagement1.getIntwevalTime() == null) {
                   timedTaskManagement1.setIntwevalTime("0");
                 }
                 calendar.add(5, Integer.valueOf(timedTaskManagement1.getIntwevalTime()).intValue());
                 date1 = calendar.getTime();
                 String StringDate = dfs.format(date1);
                 StringDate = StringDate + timedTaskManagement1.getIntwevalTime();
                 date1 = df.parse(StringDate);
               } catch (Exception e) {
                 e.printStackTrace();
               }
 
               if (date.getTime() - date1.getTime() / 1000L > 30L) break;
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(timedTaskManagement1.getExecutionTime());
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }
             else
             {
               Integer result = null;
 
               result = Integer.valueOf(0);
 
               timedTaskRecord.setResult(result);
 
               timedTaskRecord.setUserId("无");
               timedTaskRecord.setExecutionTime(date);
               timedTaskRecord.setLishiTime(date);
               timedTaskRecord.setTtmId(timedTaskManagement.getTtmId());
 
               this.timedTaskRecordService.insertTimedRecord(timedTaskRecord);
             }
           }
       }
   }
 }

