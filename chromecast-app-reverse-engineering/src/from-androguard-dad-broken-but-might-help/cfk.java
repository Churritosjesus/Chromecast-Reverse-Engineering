	private static final java.lang.ref.WeakReference b
	private java.lang.ref.WeakReference a
	
	    static cfk()
	    {
	        cfk.b = new ref.WeakReference(0);
	        return;
	    }
	
	
	    cfk(byte[] p2)
	    {
	        this(p2);
	        this.a = cfk.b;
	        return;
	    }
	
	
	    final byte[] a()
	    {
	        try {
	            byte[] v0_2 = ((byte[]) this.a.get());
	        } catch (byte[] v0_3) {
	            throw v0_3;
	        }
	        if (v0_2 == null) {
	            v0_2 = this.b();
	            this.a = new ref.WeakReference(v0_2);
	        }
	        return v0_2;
	    }
	
