	private byo a
	
	    public bys(byo p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p6, android.os.Bundle p7)
	    {
	        a.f(this.a, "onAccountValidationComplete can be called only once per call to validateAccount");
	        int v0_1 = this.a;
	        v0_1.i.sendMessage(v0_1.i.obtainMessage(5, new byw(v0_1, p6, p7)));
	        this.a = 0;
	        return;
	    }
	
	
	    public final void a(int p3, android.os.IBinder p4, android.os.Bundle p5)
	    {
	        a.f(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
	        this.a.a(p3, p4, p5);
	        this.a = 0;
	        return;
	    }
	
