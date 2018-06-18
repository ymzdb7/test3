 package com.myoa.service.surface.impl;
 
 import com.myoa.dao.surface.SurfaceMapper;
import com.myoa.model.surface.Surface;
import com.myoa.service.surface.SurfaceService;

 import java.util.List;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class SurfaceServiceImpl
   implements SurfaceService
 {
 
   @Resource
   private SurfaceMapper surfaceMapper;
 
   public void updateSurf(Surface surface)
   {
     this.surfaceMapper.updateSurf(surface);
   }
 
   public List<Surface> getIeTitle()
   {
     return this.surfaceMapper.getIeTitle();
   }
 }

