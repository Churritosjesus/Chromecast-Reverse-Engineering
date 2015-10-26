	private final blp a
	
	    public blq(android.content.Context p4)
	    {
	        Object[] v0_1 = p4.getResources().getDisplayMetrics();
	        this((((((v0_1.heightPixels * v0_1.widthPixels) << 2) / 2) * 3) / 1024));
	        this.a = new blp("LruBitmapCache", 0);
	        Object[] v0_11 = new Object[1];
	        v0_11[0] = Integer.valueOf(this.b());
	        return;
	    }
	
	
	    public final android.graphics.Bitmap a(String p2)
	    {
	        return ((android.graphics.Bitmap) this.a(p2));
	    }
	
	
	    public final void a(String p3, android.graphics.Bitmap p4)
	    {
	        Object[] v0_1 = new Object[1];
	        v0_1[0] = p3;
	        this.a(p3, p4);
	        return;
	    }
	
	
	    protected final synthetic int b(Object p3, Object p4)
	    {
	        int v0_3;
	        if (android.os.Build$VERSION.SDK_INT < 19) {
	            v0_3 = ((((android.graphics.Bitmap) p4).getRowBytes() * ((android.graphics.Bitmap) p4).getHeight()) / 1024);
	        } else {
	            v0_3 = (((android.graphics.Bitmap) p4).getAllocationByteCount() / 1024);
	        }
	        return v0_3;
	    }
	
