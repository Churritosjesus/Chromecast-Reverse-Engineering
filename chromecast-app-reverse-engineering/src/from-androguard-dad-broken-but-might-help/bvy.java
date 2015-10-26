	
	    public bvy()
	    {
	        this(android.os.Looper.getMainLooper());
	        return;
	    }
	
	
	    public bvy(android.os.Looper p1)
	    {
	        this(p1);
	        return;
	    }
	
	
	    public final void a(bwn p3, bwm p4)
	    {
	        this.sendMessage(this.obtainMessage(1, new android.util.Pair(p3, p4)));
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p3)
	    {
	        switch (p3.what) {
	            case 1:
	                bvx v0_4 = ((android.util.Pair) p3.obj);
	                bvx v0_6 = ((bwm) v0_4.second);
	                try {
	                    ((bwn) v0_4.first).a(v0_6);
	                } catch (RuntimeException v1_3) {
	                    bvx.b(v0_6);
	                    throw v1_3;
	                }
	                break;
	            case 2:
	                ((bvx) p3.obj).c(com.google.android.gms.common.api.Status.c);
	                break;
	            default:
	                android.util.Log.wtf("AbstractPendingResult", "Don\'t know how to handle this message.");
	        }
	        return;
	    }
	
