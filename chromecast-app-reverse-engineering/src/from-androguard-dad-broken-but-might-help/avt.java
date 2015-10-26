	private synthetic avs a
	
	    avt(avs p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.a.b.obtainMessage(1).sendToTarget();
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.a.b.obtainMessage(0).sendToTarget();
	        return;
	    }
	
