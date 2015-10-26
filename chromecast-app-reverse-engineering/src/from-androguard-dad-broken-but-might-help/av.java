	
	    av()
	    {
	        return;
	    }
	
	
	    public final android.content.Intent a(android.app.Activity p2)
	    {
	        android.content.Intent v0 = p2.getParentActivityIntent();
	        if (v0 == null) {
	            v0 = super.a(p2);
	        }
	        return v0;
	    }
	
	
	    public final String a(android.content.Context p2, android.content.pm.ActivityInfo p3)
	    {
	        String v0 = p3.parentActivityName;
	        if (v0 == null) {
	            v0 = super.a(p2, p3);
	        }
	        return v0;
	    }
	
	
	    public final boolean a(android.app.Activity p2, android.content.Intent p3)
	    {
	        return p2.shouldUpRecreateTask(p3);
	    }
	
	
	    public final void b(android.app.Activity p1, android.content.Intent p2)
	    {
	        p1.navigateUpTo(p2);
	        return;
	    }
	
