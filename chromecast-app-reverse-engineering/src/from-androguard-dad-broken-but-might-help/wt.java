	
	    public wt(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public wt(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 16842884);
	        return;
	    }
	
	
	    public wt(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        android.content.res.TypedArray v0_1 = p5.obtainStyledAttributes(p6, oq.O, p7, 0);
	        boolean v1_1 = v0_1.getResourceId(oq.P, -1);
	        v0_1.recycle();
	        if (v1_1 != -1) {
	            android.content.res.TypedArray v0_3 = p5.obtainStyledAttributes(v1_1, oq.bH);
	            if (v0_3.hasValue(oq.bM)) {
	                this.setAllCaps(v0_3.getBoolean(oq.bM, 0));
	            }
	            v0_3.recycle();
	        }
	        android.content.res.TypedArray v0_5 = p5.obtainStyledAttributes(p6, oq.O, p7, 0);
	        if (v0_5.hasValue(oq.Q)) {
	            this.setAllCaps(v0_5.getBoolean(oq.Q, 0));
	        }
	        v0_5.recycle();
	        return;
	    }
	
	
	    public void setAllCaps(boolean p3)
	    {
	        int v0_0;
	        if (!p3) {
	            v0_0 = 0;
	        } else {
	            v0_0 = new pg(this.getContext());
	        }
	        this.setTransformationMethod(v0_0);
	        return;
	    }
	
	
	    public void setTextAppearance(android.content.Context p4, int p5)
	    {
	        super.setTextAppearance(p4, p5);
	        android.content.res.TypedArray v0_1 = p4.obtainStyledAttributes(p5, oq.bH);
	        if (v0_1.hasValue(oq.bM)) {
	            this.setAllCaps(v0_1.getBoolean(oq.bM, 0));
	        }
	        v0_1.recycle();
	        return;
	    }
	
