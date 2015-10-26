	
	    aii()
	    {
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p5, String p6, Object p7)
	    {
	        StringBuilder v2_1 = new java.util.ArrayList();
	        if (((org.json.JSONArray) p7).length() != 0) {
	            IllegalArgumentException v1_0 = 0;
	            while (v1_0 < ((org.json.JSONArray) p7).length()) {
	                String v0_3 = ((org.json.JSONArray) p7).get(v1_0);
	                if (!(v0_3 instanceof String)) {
	                    String v0_5 = String.valueOf(v0_3.getClass());
	                    throw new IllegalArgumentException(new StringBuilder((String.valueOf(v0_5).length() + 29)).append("Unexpected type in an array: ").append(v0_5).toString());
	                } else {
	                    v2_1.add(((String) v0_3));
	                    v1_0++;
	                }
	            }
	            p5.putStringArrayList(p6, v2_1);
	        } else {
	            p5.putStringArrayList(p6, v2_1);
	        }
	        return;
	    }
	
