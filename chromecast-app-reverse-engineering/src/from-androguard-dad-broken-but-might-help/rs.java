	private synthetic android.support.v7.internal.widget.ActivityChooserView a
	
	    public rs(android.support.v7.internal.widget.ActivityChooserView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onGlobalLayout()
	    {
	        if (this.a.c()) {
	            if (this.a.isShown()) {
	                android.support.v7.internal.widget.ActivityChooserView.b(this.a).c();
	                if (this.a.c != null) {
	                    this.a.c.a(1);
	                }
	            } else {
	                android.support.v7.internal.widget.ActivityChooserView.b(this.a).a();
	            }
	        }
	        return;
	    }
	
