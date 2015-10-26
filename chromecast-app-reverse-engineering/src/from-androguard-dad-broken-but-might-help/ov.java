	private synthetic ou a
	
	    ov(ou p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        qa v2_1;
	        int v3_0 = this.a;
	        android.view.Menu v1 = v3_0.h();
	        if (!(v1 instanceof qa)) {
	            v2_1 = 0;
	        } else {
	            v2_1 = ((qa) v1);
	        }
	        if (v2_1 != null) {
	            v2_1.d();
	        }
	        try {
	            v1.clear();
	        } catch (boolean v0_7) {
	            if (v2_1 != null) {
	                v2_1.e();
	            }
	            throw v0_7;
	        }
	        if ((!v3_0.c.onCreatePanelMenu(0, v1)) || (!v3_0.c.onPreparePanel(0, 0, v1))) {
	            v1.clear();
	        }
	        if (v2_1 != null) {
	            v2_1.e();
	        }
	        return;
	    }
	
