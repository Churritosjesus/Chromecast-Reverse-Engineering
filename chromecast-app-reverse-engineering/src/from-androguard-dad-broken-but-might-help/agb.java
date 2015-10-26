	private synthetic agf a
	
	    agb(aga p1, agf p2)
	    {
	        this.a = p2;
	        return;
	    }
	
	
	    public final void a(agp p10)
	    {
	        int v0_1;
	        int v0_0 = p10.a;
	        if (v0_0 == 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = v0_0.optJSONObject("__debug__");
	        }
	        int v6;
	        if (v0_1 == 0) {
	            v6 = 0;
	        } else {
	            v6 = v0_1.optJSONArray("messages");
	        }
	        if (v6 != 0) {
	            int v0_3 = 0;
	            while (v0_3 < v6.length()) {
	                String v2_0;
	                String v3_0 = v6.optJSONObject(v0_3);
	                if (v3_0 == null) {
	                    v2_0 = 0;
	                } else {
	                    v2_0 = v3_0.optString("message");
	                }
	                String v5_0;
	                if (v3_0 == null) {
	                    v5_0 = 0;
	                } else {
	                    v5_0 = v3_0.optString("type");
	                }
	                String v3_1;
	                if (v3_0 == null) {
	                    v3_1 = 0;
	                } else {
	                    v3_1 = v3_0.optString("link");
	                }
	                if ((v2_0 != null) && (v5_0 != null)) {
	                    ags v1_8 = ags.h;
	                    if (v5_0.equals("warning")) {
	                        v1_8 = ags.g;
	                    }
	                    if (!aji.a(v3_1)) {
	                        String v2_1 = String.valueOf(v2_0);
	                        v2_0 = new StringBuilder(((String.valueOf(v2_1).length() + 7) + String.valueOf(v3_1).length())).append(v2_1).append(" Link: ").append(v3_1).toString();
	                    }
	                    aiw.a(v1_8, aga.a, v2_0);
	                }
	                v0_3++;
	            }
	        }
	        if (this.a != null) {
	            this.a.a(p10);
	        }
	        return;
	    }
	
