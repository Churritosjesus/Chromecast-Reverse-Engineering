	private android.app.Dialog a
	private android.content.DialogInterface$OnCancelListener b
	
	    public bvp()
	    {
	        this.a = 0;
	        this.b = 0;
	        return;
	    }
	
	
	    public static bvp a(android.app.Dialog p3, android.content.DialogInterface$OnCancelListener p4)
	    {
	        bvp v1_1 = new bvp();
	        android.app.Dialog v0_2 = ((android.app.Dialog) a.f(p3, "Cannot display null dialog"));
	        v0_2.setOnCancelListener(0);
	        v0_2.setOnDismissListener(0);
	        v1_1.a = v0_2;
	        if (p4 != null) {
	            v1_1.b = p4;
	        }
	        return v1_1;
	    }
	
	
	    public final void onCancel(android.content.DialogInterface p2)
	    {
	        if (this.b != null) {
	            this.b.onCancel(p2);
	        }
	        return;
	    }
	
	
	    public final android.app.Dialog onCreateDialog(android.os.Bundle p2)
	    {
	        if (this.a == null) {
	            this.setShowsDialog(0);
	        }
	        return this.a;
	    }
	
	
	    public final void show(android.app.FragmentManager p1, String p2)
	    {
	        super.show(p1, p2);
	        return;
	    }
	
