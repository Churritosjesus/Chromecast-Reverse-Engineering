	public static final android.os.Parcelable$Creator CREATOR
	private static final B j
	public java.lang.String a
	public bfu b
	 bfv c
	  d
	public java.lang.String e
	public  f
	public  g
	public  h
	public java.lang.String i
	
	    static bfs()
	    {
	        bft v0_1 = new byte[24];
	        v0_1 = {48, -126, 0, -97, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -126, 0, -115, 0};
	        bfs.j = v0_1;
	        bfs.CREATOR = new bft();
	        return;
	    }
	
	
	    public bfs()
	    {
	        return;
	    }
	
	
	    public bfs(android.os.Parcel p5)
	    {
	        String v0_10;
	        int v1 = 1;
	        this.a = ((String) p5.readValue(0));
	        this.b = ((bfu) p5.readValue(0));
	        this.c = ((bfv) p5.readValue(0));
	        this.d = p5.readInt();
	        this.e = ((String) p5.readValue(0));
	        if (p5.readInt() == 0) {
	            v0_10 = 0;
	        } else {
	            v0_10 = 1;
	        }
	        this.f = v0_10;
	        if (p5.readInt() == 0) {
	            v1 = 0;
	        }
	        this.g = v1;
	        this.h = p5.readInt();
	        this.i = ((String) p5.readValue(0));
	        return;
	    }
	
	
	    public bfs(bfs p2)
	    {
	        this.a = p2.a;
	        this.b = p2.b;
	        this.c = p2.c;
	        this.d = p2.d;
	        this.e = p2.e;
	        this.f = p2.f;
	        this.g = p2.g;
	        this.h = p2.h;
	        this.i = p2.i;
	        return;
	    }
	
	
	    public static String a(String p6, String p7)
	    {
	        if (!android.text.TextUtils.isEmpty(p7)) {
	            String v0_1 = android.util.Base64.decode(p7, 0);
	            javax.crypto.Cipher v1_3 = new byte[(bfs.j.length + v0_1.length)];
	            System.arraycopy(bfs.j, 0, v1_3, 0, bfs.j.length);
	            System.arraycopy(v0_1, 0, v1_3, bfs.j.length, v0_1.length);
	            bfs.a(v1_3, 2, (v1_3.length - 4));
	            bfs.a(v1_3, 21, (v0_1.length + 1));
	            String v0_6 = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(v1_3));
	            javax.crypto.Cipher v1_7 = javax.crypto.Cipher.getInstance("RSA/None/PKCS1Padding", "BC");
	            v1_7.init(1, v0_6);
	            return android.util.Base64.encodeToString(v1_7.doFinal(p6.getBytes()), 2);
	        } else {
	            throw new java.security.GeneralSecurityException("No public key available from Chromecast");
	        }
	    }
	
	
	    private static void a(byte[] p2, int p3, int p4)
	    {
	        p2[p3] = ((byte) (p4 / 256));
	        p2[(p3 + 1)] = ((byte) (p4 % 256));
	        return;
	    }
	
	
	    public final int describeContents()
	    {
	        return 0;
	    }
	
	
	    public final String toString()
	    {
	        return this.a;
	    }
	
	
	    public final void writeToParcel(android.os.Parcel p4, int p5)
	    {
	        String v0_6;
	        int v1 = 1;
	        p4.writeValue(this.a);
	        p4.writeValue(this.b);
	        p4.writeValue(this.c);
	        p4.writeInt(this.d);
	        p4.writeValue(this.e);
	        if (!this.f) {
	            v0_6 = 0;
	        } else {
	            v0_6 = 1;
	        }
	        p4.writeInt(v0_6);
	        if (!this.g) {
	            v1 = 0;
	        }
	        p4.writeInt(v1);
	        p4.writeInt(this.h);
	        p4.writeValue(this.i);
	        return;
	    }
	
