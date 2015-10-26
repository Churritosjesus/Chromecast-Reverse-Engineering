	private static aia a
	private android.content.Context b
	
	    private aia(android.content.Context p2)
	    {
	        this.b = p2.getApplicationContext();
	        return;
	    }
	
	
	    public static aia a(android.content.Context p4)
	    {
	        aia v0_3;
	        if (aia.a == null) {
	            aia v0_2 = new aia(p4);
	            aia.a = v0_2;
	            bk.a(v0_2.b).a(v0_2, new android.content.IntentFilter("com.parse.bolts.measurement_event"));
	            v0_3 = aia.a;
	        } else {
	            v0_3 = aia.a;
	        }
	        return v0_3;
	    }
	
	
	    protected final void finalize()
	    {
	        try {
	            bk v8 = bk.a(this.b);
	        } catch (Throwable v0_5) {
	            super.finalize();
	            throw v0_5;
	        }
	        Throwable v0_3 = ((java.util.ArrayList) v8.a.remove(this));
	        if (v0_3 != null) {
	            int v7 = 0;
	            while (v7 < v0_3.size()) {
	                int v1_2 = ((android.content.IntentFilter) v0_3.get(v7));
	                int v6 = 0;
	                while (v6 < v1_2.countActions()) {
	                    String v10 = v1_2.getAction(v6);
	                    java.util.HashMap v2_3 = ((java.util.ArrayList) v8.b.get(v10));
	                    if (v2_3 != null) {
	                        int v4 = 0;
	                        while (v4 < v2_3.size()) {
	                            int v3_4;
	                            if (((bn) v2_3.get(v4)).b != this) {
	                                v3_4 = v4;
	                            } else {
	                                v2_3.remove(v4);
	                                v3_4 = (v4 - 1);
	                            }
	                            v4 = (v3_4 + 1);
	                        }
	                        if (v2_3.size() <= 0) {
	                            v8.b.remove(v10);
	                        }
	                    }
	                    v6++;
	                }
	                v7++;
	            }
	        } else {
	        }
	        super.finalize();
	        return;
	    }
	
	
	    public final void onReceive(android.content.Context p10, android.content.Intent p11)
	    {
	        String v1_1;
	        ahe v2 = ahe.a(p10);
	        String v1_0 = String.valueOf("bf_");
	        String v0_3 = String.valueOf(p11.getStringExtra("event_name"));
	        if (v0_3.length() == 0) {
	            v1_1 = new String(v1_0);
	        } else {
	            v1_1 = v1_0.concat(v0_3);
	        }
	        android.os.Bundle v3_1 = p11.getBundleExtra("event_args");
	        android.os.Bundle v4_1 = new android.os.Bundle();
	        java.util.Iterator v5 = v3_1.keySet().iterator();
	        while (v5.hasNext()) {
	            String v0_11 = ((String) v5.next());
	            v4_1.putString(v0_11.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), ((String) v3_1.get(v0_11)));
	        }
	        v2.a(v1_1, v4_1);
	        return;
	    }
	
