	private final bwq a
	
	    public csg(bwq p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(int p8, android.os.Bundle p9, android.os.ParcelFileDescriptor p10, android.os.Bundle p11)
	    {
	        int v5 = 0;
	        if (a.b(3)) {
	            new StringBuilder("Avatar callback: status=").append(p8).append(" resolution=").append(p9).append(" pfd=").append(p10).toString();
	            a.b(3);
	        }
	        int v3;
	        int v4;
	        com.google.android.gms.common.api.Status v1_3 = csa.a(p8, 0, p9);
	        if (p11 == null) {
	            v4 = 0;
	            v3 = 0;
	        } else {
	            v3 = p11.getBoolean("rewindable");
	            v4 = p11.getInt("width");
	            v5 = p11.getInt("height");
	        }
	        this.a.a(new csb(v1_3, p10, v3, v4, v5));
	        return;
	    }
	
