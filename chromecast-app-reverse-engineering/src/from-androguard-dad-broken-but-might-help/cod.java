	public final coa b
	
	    public cod(android.content.Context p9, android.os.Looper p10, bwg p11, bwh p12, String p13, byl p14)
	    {
	        this(p9, p10, p11, p12, p13, p14, com.google.android.gms.location.copresence.internal.CopresenceApiOptions.a);
	        return;
	    }
	
	
	    private cod(android.content.Context p7, android.os.Looper p8, bwg p9, bwh p10, String p11, byl p12, com.google.android.gms.location.copresence.internal.CopresenceApiOptions p13)
	    {
	        int v2;
	        cod v6_1 = this(p7, p8, p9, p10, p11, p12);
	        v6_1.b = new coa(p7, v6_1.a);
	        if (p12.a == null) {
	            v2 = 0;
	        } else {
	            v2 = p12.a.name;
	        }
	        new cnn(p7, v2, p12.e, v6_1.a, p13);
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.k()) {
	            try {
	                int v3_0 = this.b;
	            } catch (android.os.RemoteException v0_24) {
	                android.util.Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", v0_24);
	            }
	            try {
	            } catch (android.os.RemoteException v0_23) {
	                throw new IllegalStateException(v0_23);
	            }
	            java.util.Iterator v5_0 = v3_0.c.values().iterator();
	            while (v5_0.hasNext()) {
	                android.os.RemoteException v0_20 = ((coc) v5_0.next());
	                if (v0_20 != null) {
	                    ((cnu) v3_0.a.b()).a(com.google.android.gms.location.internal.LocationRequestUpdateData.a(v0_20));
	                }
	            }
	            v3_0.c.clear();
	            java.util.Iterator v5_1 = v3_0.d.values().iterator();
	            while (v5_1.hasNext()) {
	                android.os.RemoteException v0_17 = ((cob) v5_1.next());
	                if (v0_17 != null) {
	                    ((cnu) v3_0.a.b()).a(com.google.android.gms.location.internal.LocationRequestUpdateData.a(v0_17));
	                }
	            }
	            v3_0.d.clear();
	            IllegalStateException v1_0 = this.b;
	            if (v1_0.b) {
	                try {
	                    v1_0.a.a();
	                    ((cnu) v1_0.a.b()).a(0);
	                    v1_0.b = 0;
	                } catch (android.os.RemoteException v0_15) {
	                    throw new IllegalStateException(v0_15);
	                }
	            }
	        }
	        super.a();
	        return;
	    }
	
	
	    public final boolean p()
	    {
	        return 1;
	    }
	
