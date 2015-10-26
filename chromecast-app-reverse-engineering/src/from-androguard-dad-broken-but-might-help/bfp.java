	private final android.net.Uri a
	public blp g
	public  h
	public  i
	
	    protected bfp(String p5)
	    {
	        this.h = 3;
	        this.i = 0;
	        this.g = new blp("SetupRequest");
	        android.net.Uri v0_5 = String.valueOf("/setup");
	        this.a = android.net.Uri.parse(new StringBuilder(((String.valueOf(p5).length() + 19) + String.valueOf(v0_5).length())).append("http://").append(p5).append(":8008").append(v0_5).toString());
	        return;
	    }
	
	
	    private android.net.Uri a(String p2, String p3)
	    {
	        android.net.Uri v0_2 = this.a.buildUpon().appendPath(p2);
	        if (p3 != null) {
	            v0_2.encodedQuery(p3);
	        }
	        return v0_2.build();
	    }
	
	
	    protected final bfq a(String p2, int p3)
	    {
	        return this.a(p2, 0, 0, p3);
	    }
	
	
	    protected final bfq a(String p6, bfc p7, int p8)
	    {
	        try {
	            return super.a(this.a(p6, 0), p7, p8);
	        } catch (java.util.concurrent.TimeoutException v0_3) {
	            Object[] v1_1 = new Object[2];
	            v1_1[0] = this.getClass().getSimpleName();
	            v1_1[1] = v0_3.toString();
	            throw v0_3;
	        } catch (java.util.concurrent.TimeoutException v0_4) {
	            Object[] v1_2 = new Object[2];
	            v1_2[0] = this.getClass().getSimpleName();
	            v1_2[1] = v0_4.toString();
	            throw v0_4;
	        }
	    }
	
	
	    protected final bfq a(String p6, String p7, java.util.Map p8, int p9)
	    {
	        try {
	            return super.a(this.a(p6, p7), p8, p9);
	        } catch (java.util.concurrent.TimeoutException v0_3) {
	            Object[] v1_2 = new Object[2];
	            v1_2[0] = this.getClass().getSimpleName();
	            v1_2[1] = v0_3.toString();
	            throw v0_3;
	        } catch (java.util.concurrent.TimeoutException v0_2) {
	            Object[] v1_1 = new Object[2];
	            v1_1[0] = this.getClass().getSimpleName();
	            v1_1[1] = v0_2.toString();
	            throw v0_2;
	        }
	    }
	
