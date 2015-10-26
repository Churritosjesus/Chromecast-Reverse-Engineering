	private cq a
	private dc b
	
	    public da(dm p2)
	    {
	        this.a = cr.a(((android.os.IBinder) p2.a));
	        return;
	    }
	
	
	    public final dc a()
	    {
	        if (this.b == null) {
	            this.b = new de(this.a);
	        }
	        return this.b;
	    }
	
	
	    public final void a(cu p5)
	    {
	        if (p5 != null) {
	            try {
	                this.a.b(((cn) cu.c(p5)));
	                this.a.asBinder().unlinkToDeath(p5, 0);
	                cu.a(p5, 0);
	            } catch (String v0_5) {
	                android.util.Log.e("MediaControllerCompat", new StringBuilder("Dead object in unregisterCallback. ").append(v0_5).toString());
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("callback may not be null.");
	        }
	    }
	
	
	    public final void a(cu p5, android.os.Handler p6)
	    {
	        if (p5 != null) {
	            try {
	                this.a.asBinder().linkToDeath(p5, 0);
	                this.a.a(((cn) cu.c(p5)));
	                cu.a(p5, p6);
	                cu.a(p5, 1);
	            } catch (String v0_5) {
	                android.util.Log.e("MediaControllerCompat", new StringBuilder("Dead object in registerCallback. ").append(v0_5).toString());
	                p5.a();
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("callback may not be null.");
	        }
	    }
	
	
	    public final dq b()
	    {
	        try {
	            int v0_1 = this.a.o();
	        } catch (int v0_2) {
	            android.util.Log.e("MediaControllerCompat", new StringBuilder("Dead object in getPlaybackState. ").append(v0_2).toString());
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public final ci c()
	    {
	        try {
	            int v0_1 = this.a.n();
	        } catch (int v0_2) {
	            android.util.Log.e("MediaControllerCompat", new StringBuilder("Dead object in getMetadata. ").append(v0_2).toString());
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
