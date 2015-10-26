	private synthetic aop a
	
	    aok(and p1, aop p2)
	    {
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p2, int p3)
	    {
	        if (this.a != null) {
	            this.a.b();
	        }
	        return;
	    }
	
