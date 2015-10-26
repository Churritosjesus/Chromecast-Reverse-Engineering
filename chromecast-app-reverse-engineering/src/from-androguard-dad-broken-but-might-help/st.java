	private synthetic sr a
	
	    st(sr p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onGlobalLayout()
	    {
	        if (!sr.a(this.a).b()) {
	            sr.a(this.a).c();
	        }
	        android.view.ViewTreeObserver v0_6 = this.a.getViewTreeObserver();
	        if (v0_6 != null) {
	            v0_6.removeGlobalOnLayoutListener(this);
	        }
	        return;
	    }
	
