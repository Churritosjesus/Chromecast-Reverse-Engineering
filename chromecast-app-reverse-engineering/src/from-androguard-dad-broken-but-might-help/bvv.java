	private android.app.Dialog Z
	private android.content.DialogInterface$OnCancelListener aa
	
	    public bvv()
	    {
	        this.Z = 0;
	        this.aa = 0;
	        return;
	    }
	
	
	    public static bvv a(android.app.Dialog p3, android.content.DialogInterface$OnCancelListener p4)
	    {
	        bvv v1_1 = new bvv();
	        android.app.Dialog v0_2 = ((android.app.Dialog) a.f(p3, "Cannot display null dialog"));
	        v0_2.setOnCancelListener(0);
	        v0_2.setOnDismissListener(0);
	        v1_1.Z = v0_2;
	        if (p4 != null) {
	            v1_1.aa = p4;
	        }
	        return v1_1;
	    }
	
	
	    public final void a(r p1, String p2)
	    {
	        super.a(p1, p2);
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p2)
	    {
	        if (this.Z == null) {
	            this.c = 0;
	        }
	        return this.Z;
	    }
	
	
	    public final void onCancel(android.content.DialogInterface p2)
	    {
	        if (this.aa != null) {
	            this.aa.onCancel(p2);
	        }
	        return;
	    }
	
