	private java.lang.ref.WeakReference a
	private ih b
	private synthetic ii c
	
	    ij(ii p2, ih p3, android.view.View p4)
	    {
	        this.c = p2;
	        this.a = new ref.WeakReference(p4);
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        android.view.View v0_2 = ((android.view.View) this.a.get());
	        if (v0_2 != null) {
	            this.c.c(this.b, v0_2);
	        }
	        return;
	    }
	
