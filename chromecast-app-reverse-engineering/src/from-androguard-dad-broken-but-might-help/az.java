	public final java.util.ArrayList a
	public final android.content.Context b
	
	    static az()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 11) {
	            new bc();
	        } else {
	            new bd();
	        }
	        return;
	    }
	
	
	    private az(android.content.Context p2)
	    {
	        this.a = new java.util.ArrayList();
	        this.b = p2;
	        return;
	    }
	
	
	    public static az a(android.content.Context p1)
	    {
	        return new az(p1);
	    }
	
	
	    public final az a(android.content.ComponentName p4)
	    {
	        IllegalArgumentException v1_0 = this.a.size();
	        try {
	            android.content.Intent v0_2 = at.a(this.b, p4);
	        } catch (android.content.Intent v0_3) {
	            android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
	            throw new IllegalArgumentException(v0_3);
	        }
	        while (v0_2 != null) {
	            this.a.add(v1_0, v0_2);
	            v0_2 = at.a(this.b, v0_2.getComponent());
	        }
	        return this;
	    }
	
	
	    public final java.util.Iterator iterator()
	    {
	        return this.a.iterator();
	    }
	
