	private static android.graphics.PorterDuff$Mode b
	 android.graphics.drawable.Drawable a
	private android.content.res.ColorStateList c
	private android.graphics.PorterDuff$Mode d
	private  e
	private android.graphics.PorterDuff$Mode f
	private  g
	
	    static bv()
	    {
	        bv.b = android.graphics.PorterDuff$Mode.SRC_IN;
	        return;
	    }
	
	
	    public bv(android.graphics.drawable.Drawable p2)
	    {
	        this.d = bv.b;
	        this.a(p2);
	        return;
	    }
	
	
	    private boolean a(int[] p5)
	    {
	        int v0 = 1;
	        if ((this.c == null) || (this.d == null)) {
	            v0 = 0;
	        } else {
	            int v1_3 = this.c.getColorForState(p5, this.c.getDefaultColor());
	            android.graphics.PorterDuff$Mode v2_2 = this.d;
	            if ((this.g) && ((v1_3 == this.e) && (v2_2 == this.f))) {
	            } else {
	                this.setColorFilter(v1_3, v2_2);
	                this.e = v1_3;
	                this.f = v2_2;
	                this.g = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public final android.graphics.drawable.Drawable a()
	    {
	        return this.a;
	    }
	
	
	    public final void a(android.graphics.drawable.Drawable p3)
	    {
	        if (this.a != null) {
	            this.a.setCallback(0);
	        }
	        this.a = p3;
	        if (p3 != null) {
	            p3.setCallback(this);
	        }
	        this.invalidateSelf();
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
	
	
	    public boolean isStateful()
	    {
	        if (((this.c == null) || (!this.c.isStateful())) && (!this.a.isStateful())) {
	            int v0_5 = 0;
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public android.graphics.drawable.Drawable mutate()
	    {
	        android.graphics.drawable.Drawable v0 = this.a;
	        android.graphics.drawable.Drawable v1 = v0.mutate();
	        if (v1 != v0) {
	            this.a(v1);
	        }
	        return this;
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
	
	
	    public boolean setState(int[] p3)
	    {
	        int v0_2;
	        int v0_1 = this.a.setState(p3);
	        if ((!this.a(p3)) && (v0_1 == 0)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void setTint(int p2)
	    {
	        this.setTintList(android.content.res.ColorStateList.valueOf(p2));
	        return;
	    }
	
	
	    public void setTintList(android.content.res.ColorStateList p2)
	    {
	        this.c = p2;
	        this.a(this.getState());
	        return;
	    }
	
	
	    public void setTintMode(android.graphics.PorterDuff$Mode p2)
	    {
	        this.d = p2;
	        this.a(this.getState());
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
	
