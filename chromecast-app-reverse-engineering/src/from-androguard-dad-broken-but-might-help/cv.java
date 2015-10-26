	private synthetic cu a
	
	    public cv(cu p1, android.os.Looper p2)
	    {
	        this.a = p1;
	        this(p2);
	        return;
	    }
	
	
	    public final void a(int p2, Object p3)
	    {
	        this.obtainMessage(p2, p3).sendToTarget();
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p3)
	    {
	        if (cu.b(this.a)) {
	            switch (p3.what) {
	                case 1:
	                    p3.getData();
	                    break;
	                case 2:
	                    this.a.a(((dq) p3.obj));
	                    break;
	                case 3:
	                    this.a.a(((ci) p3.obj));
	                    break;
	                case 4:
	                    break;
	                case 5:
	                    break;
	                case 6:
	                    break;
	                case 7:
	                    break;
	                case 8:
	                    this.a.a();
	                    break;
	                default:
	            }
	        }
	        return;
	    }
	
