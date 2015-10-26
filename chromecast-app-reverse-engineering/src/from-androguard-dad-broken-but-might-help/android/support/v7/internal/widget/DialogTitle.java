	
	    public DialogTitle(android.content.Context p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public DialogTitle(android.content.Context p1, android.util.AttributeSet p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public DialogTitle(android.content.Context p1, android.util.AttributeSet p2, int p3)
	    {
	        this(p1, p2, p3);
	        return;
	    }
	
	
	    protected void onMeasure(int p7, int p8)
	    {
	        super.onMeasure(p7, p8);
	        android.content.res.TypedArray v0_0 = this.getLayout();
	        if (v0_0 != null) {
	            float v1_0 = v0_0.getLineCount();
	            if ((v1_0 > 0) && (v0_0.getEllipsisCount((v1_0 - 1)) > 0)) {
	                this.setSingleLine(0);
	                this.setMaxLines(2);
	                android.content.res.TypedArray v0_4 = this.getContext().obtainStyledAttributes(0, oq.bH, 16842817, 16973892);
	                float v1_4 = v0_4.getDimensionPixelSize(oq.bJ, 0);
	                if (v1_4 != 0) {
	                    this.setTextSize(0, ((float) v1_4));
	                }
	                v0_4.recycle();
	                super.onMeasure(p7, p8);
	            }
	        }
	        return;
	    }
	
