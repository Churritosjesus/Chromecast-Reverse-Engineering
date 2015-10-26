	
	    private aw(android.content.Context p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    static android.view.ViewGroup a(android.view.View p3)
	    {
	        aw v0_1 = new aw(p3.getContext());
	        android.widget.FrameLayout$LayoutParams v1_1 = p3.getLayoutParams();
	        if (v1_1 != null) {
	            v0_1.setLayoutParams(v1_1);
	        }
	        p3.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-1, -1));
	        v0_1.addView(p3);
	        return v0_1;
	    }
	
	
	    protected final void dispatchRestoreInstanceState(android.util.SparseArray p1)
	    {
	        this.dispatchThawSelfOnly(p1);
	        return;
	    }
	
	
	    protected final void dispatchSaveInstanceState(android.util.SparseArray p1)
	    {
	        this.dispatchFreezeSelfOnly(p1);
	        return;
	    }
	
