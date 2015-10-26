	private android.graphics.drawable.Drawable a
	
	    public os(android.graphics.drawable.Drawable p3)
	    {
	        if (this.a != null) {
	            this.a.setCallback(0);
	        }
	        this.a = p3;
	        if (p3 != null) {
	            p3.setCallback(this);
	        }
	        return;
	    }
	
	
	    public void draw(android.graphics.Canvas p2)
	    {
	        this.a.draw(p2);
	        return;
	    }
	
	
	    public int getChangingConfigurations()
	    {
	        return this.a.getChangingConfigurations();
	    }
	
	
	    public android.graphics.drawable.Drawable getCurrent()
	    {
	        return this.a.getCurrent();
	    }
	
	
	    public int getIntrinsicHeight()
	    {
	        return this.a.getIntrinsicHeight();
	    }
	
	
	    public int getIntrinsicWidth()
	    {
	        return this.a.getIntrinsicWidth();
	    }
	
	
	    public int getMinimumHeight()
	    {
	        return this.a.getMinimumHeight();
	    }
	
	
	    public int getMinimumWidth()
	    {
	        return this.a.getMinimumWidth();
	    }
	
	
	    public int getOpacity()
	    {
	        return this.a.getOpacity();
	    }
	
	
	    public boolean getPadding(android.graphics.Rect p2)
	    {
	        return this.a.getPadding(p2);
	    }
	
	
	    public int[] getState()
	    {
	        return this.a.getState();
	    }
	
	
	    public android.graphics.Region getTransparentRegion()
	    {
	        return this.a.getTransparentRegion();
	    }
	
	
	    public void invalidateDrawable(android.graphics.drawable.Drawable p1)
	    {
	        this.invalidateSelf();
	        return;
	    }
	
	
	    public boolean isAutoMirrored()
	    {
	        return bo.b(this.a);
	    }
	
	
	    public boolean isStateful()
	    {
	        return this.a.isStateful();
	    }
	
	
	    public void jumpToCurrentState()
	    {
	        bo.a(this.a);
	        return;
	    }
	
	
	    protected void onBoundsChange(android.graphics.Rect p2)
	    {
	        this.a.setBounds(p2);
	        return;
	    }
	
	
	    protected boolean onLevelChange(int p2)
	    {
	        return this.a.setLevel(p2);
	    }
	
	
	    public void scheduleDrawable(android.graphics.drawable.Drawable p2, Runnable p3, long p4)
	    {
	        this.scheduleSelf(p3, p4);
	        return;
	    }
	
	
	    public void setAlpha(int p2)
	    {
	        this.a.setAlpha(p2);
	        return;
	    }
	
	
	    public void setAutoMirrored(boolean p2)
	    {
	        bo.a(this.a, p2);
	        return;
	    }
	
	
	    public void setChangingConfigurations(int p2)
	    {
	        this.a.setChangingConfigurations(p2);
	        return;
	    }
	
	
	    public void setColorFilter(android.graphics.ColorFilter p2)
	    {
	        this.a.setColorFilter(p2);
	        return;
	    }
	
	
	    public void setDither(boolean p2)
	    {
	        this.a.setDither(p2);
	        return;
	    }
	
	
	    public void setFilterBitmap(boolean p2)
	    {
	        this.a.setFilterBitmap(p2);
	        return;
	    }
	
	
	    public void setHotspot(float p2, float p3)
	    {
	        bo.a(this.a, p2, p3);
	        return;
	    }
	
	
	    public void setHotspotBounds(int p2, int p3, int p4, int p5)
	    {
	        bo.a(this.a, p2, p3, p4, p5);
	        return;
	    }
	
	
	    public boolean setState(int[] p2)
	    {
	        return this.a.setState(p2);
	    }
	
	
	    public void setTint(int p2)
	    {
	        bo.a(this.a, p2);
	        return;
	    }
	
	
	    public void setTintList(android.content.res.ColorStateList p2)
	    {
	        bo.a(this.a, p2);
	        return;
	    }
	
	
	    public void setTintMode(android.graphics.PorterDuff$Mode p2)
	    {
	        bo.a(this.a, p2);
	        return;
	    }
	
	
	    public boolean setVisible(boolean p2, boolean p3)
	    {
	        if ((!super.setVisible(p2, p3)) && (!this.a.setVisible(p2, p3))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public void unscheduleDrawable(android.graphics.drawable.Drawable p1, Runnable p2)
	    {
	        this.unscheduleSelf(p2);
	        return;
	    }
	
