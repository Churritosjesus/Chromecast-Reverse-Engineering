	private synthetic rl a
	
	    rq(rl p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    private varargs Void a(Object[] p13)
	    {
	        int v2_0 = 0;
	        java.io.IOException v0_1 = ((java.util.List) p13[0]);
	        try {
	            StringBuilder v3_2 = rl.a(this.a).openFileOutput(((String) p13[1]), 0);
	            String v4_1 = android.util.Xml.newSerializer();
	        } catch (java.io.IOException v0_2) {
	            android.util.Log.e(rl.f(), new StringBuilder("Error writing historical recrod file: ").append(0).toString(), v0_2);
	            return 0;
	        }
	        try {
	            v4_1.setOutput(v3_2, 0);
	            v4_1.startDocument("UTF-8", Boolean.valueOf(1));
	            v4_1.startTag(0, "historical-records");
	            int v5_3 = v0_1.size();
	        } catch (java.io.IOException v0_11) {
	            rl.a(this.a, 1);
	            if (v3_2 != null) {
	                try {
	                    v3_2.close();
	                } catch (String v1) {
	                }
	            }
	            throw v0_11;
	        } catch (java.io.IOException v0_7) {
	            android.util.Log.e(rl.f(), new StringBuilder("Error writing historical recrod file: ").append(rl.b(this.a)).toString(), v0_7);
	            rl.a(this.a, 1);
	            if (v3_2 == null) {
	                return 0;
	            } else {
	                try {
	                    v3_2.close();
	                } catch (java.io.IOException v0) {
	                }
	                return 0;
	            }
	        } catch (java.io.IOException v0_9) {
	            android.util.Log.e(rl.f(), new StringBuilder("Error writing historical recrod file: ").append(rl.b(this.a)).toString(), v0_9);
	            rl.a(this.a, 1);
	            if (v3_2 == null) {
	                return 0;
	            } else {
	                try {
	                    v3_2.close();
	                } catch (java.io.IOException v0) {
	                }
	                return 0;
	            }
	        } catch (java.io.IOException v0_5) {
	            android.util.Log.e(rl.f(), new StringBuilder("Error writing historical recrod file: ").append(rl.b(this.a)).toString(), v0_5);
	            rl.a(this.a, 1);
	            if (v3_2 == null) {
	                return 0;
	            } else {
	                try {
	                    v3_2.close();
	                } catch (java.io.IOException v0) {
	                }
	                return 0;
	            }
	        }
	        while (v2_0 < v5_3) {
	            String v1_14 = ((rp) v0_1.remove(0));
	            v4_1.startTag(0, "historical-record");
	            v4_1.attribute(0, "activity", v1_14.a.flattenToString());
	            v4_1.attribute(0, "time", String.valueOf(v1_14.b));
	            v4_1.attribute(0, "weight", String.valueOf(v1_14.c));
	            v4_1.endTag(0, "historical-record");
	            v2_0++;
	        }
	        v4_1.endTag(0, "historical-records");
	        v4_1.endDocument();
	        rl.a(this.a, 1);
	        if (v3_2 == null) {
	            return 0;
	        } else {
	            try {
	                v3_2.close();
	            } catch (java.io.IOException v0) {
	            }
	            return 0;
	        }
	    }
	
	
	    public final synthetic Object doInBackground(Object[] p2)
	    {
	        return this.a(p2);
	    }
	
