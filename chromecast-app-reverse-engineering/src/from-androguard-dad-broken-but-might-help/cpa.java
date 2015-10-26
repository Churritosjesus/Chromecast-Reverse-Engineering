	private synthetic coz a
	
	    cpa(coz p1, Runnable p2, Object p3)
	    {
	        this.a = p1;
	        this(p2, p3);
	        return;
	    }
	
	
	    protected final void setException(Throwable p4)
	    {
	        String v0_2 = cox.b(this.a.a);
	        if (v0_2 == null) {
	            if (android.util.Log.isLoggable("GAv4", 6)) {
	                android.util.Log.e("GAv4", new StringBuilder("MeasurementExecutor: job failed with ").append(p4).toString());
	            }
	        } else {
	            v0_2.uncaughtException(Thread.currentThread(), p4);
	        }
	        super.setException(p4);
	        return;
	    }
	
