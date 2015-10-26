	private final  a
	
	    public bfi(String p1, int p2)
	    {
	        this(p1);
	        this.a = p2;
	        return;
	    }
	
	
	    public static org.json.JSONObject a(int p3)
	    {
	        org.json.JSONException v0_2;
	        org.json.JSONObject v1_1 = new org.json.JSONObject();
	        switch (bfj.a[(p3 - 1)]) {
	            case 1:
	                v0_2 = "fdr";
	                break;
	            case 2:
	                v0_2 = "ota";
	                break;
	            case 3:
	                v0_2 = "idle";
	                break;
	            case 4:
	                v0_2 = "set recovery";
	                break;
	            default:
	                v0_2 = "now";
	        }
	        try {
	            v1_1.put("params", v0_2);
	        } catch (org.json.JSONException v0) {
	        }
	        return v1_1;
	    }
	
	
	    public final int a()
	    {
	        int v0 = -1;
	        try {
	            if (this.a("reboot", bfc.a(bfi.a(this.a)), bfi.c).b() == 200) {
	                v0 = 0;
	            }
	        } catch (java.io.IOException v1) {
	        } catch (int v0) {
	            v0 = -2;
	        }
	        return v0;
	    }
	
