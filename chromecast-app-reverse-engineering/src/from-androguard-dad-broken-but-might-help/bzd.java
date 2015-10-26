	private synthetic bzc a
	
	    public bzd(bzc p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onServiceConnected(android.content.ComponentName p4, android.os.IBinder p5)
	    {
	        bza.a(this.a.h);
	        try {
	            this.a.e = p5;
	            this.a.g = p4;
	            int v2_0 = this.a.b.iterator();
	        } catch (bzc v0_10) {
	            throw v0_10;
	        }
	        while (v2_0.hasNext()) {
	            ((android.content.ServiceConnection) v2_0.next()).onServiceConnected(p4, p5);
	        }
	        this.a.c = 1;
	        return;
	    }
	
	
	    public final void onServiceDisconnected(android.content.ComponentName p4)
	    {
	        bza.a(this.a.h);
	        try {
	            this.a.e = 0;
	            this.a.g = p4;
	            int v2_1 = this.a.b.iterator();
	        } catch (bzc v0_10) {
	            throw v0_10;
	        }
	        while (v2_1.hasNext()) {
	            ((android.content.ServiceConnection) v2_1.next()).onServiceDisconnected(p4);
	        }
	        this.a.c = 2;
	        return;
	    }
	
