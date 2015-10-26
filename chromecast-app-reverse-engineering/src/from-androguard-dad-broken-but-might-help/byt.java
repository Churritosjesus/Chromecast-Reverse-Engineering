	private synthetic byo a
	
	    public byt(byo p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onServiceConnected(android.content.ComponentName p6, android.os.IBinder p7)
	    {
	        a.f(p7, "Expecting a valid IBinder");
	        byo.a(this.a, bzm.a(p7));
	        android.os.Message v0_2 = this.a;
	        v0_2.i.sendMessage(v0_2.i.obtainMessage(6, new byv(v0_2)));
	        return;
	    }
	
	
	    public final void onServiceDisconnected(android.content.ComponentName p5)
	    {
	        this.a.i.sendMessage(this.a.i.obtainMessage(4, Integer.valueOf(1)));
	        return;
	    }
	
