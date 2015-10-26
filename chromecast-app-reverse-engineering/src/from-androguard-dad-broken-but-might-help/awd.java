	public static final android.os.ParcelUuid a
	public final java.util.List b
	public final java.lang.String c
	public final B d
	
	    static awd()
	    {
	        awd.a = android.os.ParcelUuid.fromString("0000FEA0-0000-1000-8000-00805F9B34FB");
	        return;
	    }
	
	
	    private awd(java.util.List p1, android.util.SparseArray p2, java.util.Map p3, int p4, int p5, String p6, byte[] p7)
	    {
	        this.b = p1;
	        this.c = p6;
	        this.d = p7;
	        return;
	    }
	
	
	    private static int a(byte[] p1, int p2, int p3, int p4, java.util.List p5)
	    {
	        while (p3 > 0) {
	            p5.add(avq.a(awd.a(p1, p2, p4)));
	            p3 -= p4;
	            p2 += p4;
	        }
	        return p2;
	    }
	
	
	    public static awd a(byte[] p14)
	    {
	        int v0_5;
	        if (p14 != null) {
	            int v0_0 = 0;
	            int v1_1 = new java.util.ArrayList();
	            int v2_1 = new android.util.SparseArray();
	            int v3_1 = new java.util.HashMap();
	            byte v5_0 = -2147483648;
	            String v6_0 = 0;
	            int v4_0 = -1;
	            try {
	                while (v0_0 < p14.length) {
	                    int v7_1 = (v0_0 + 1);
	                    int v0_2 = (p14[v0_0] & 255);
	                    if (v0_2 == 0) {
	                        break;
	                    }
	                    int v0_6 = (v0_2 - 1);
	                    int v11 = (v7_1 + 1);
	                    switch ((p14[v7_1] & 255)) {
	                        case 1:
	                            v4_0 = (p14[v11] & 255);
	                            break;
	                        case 2:
	                        case 3:
	                            awd.a(p14, v11, v0_6, 2, v1_1);
	                            break;
	                        case 4:
	                        case 5:
	                            awd.a(p14, v11, v0_6, 4, v1_1);
	                            break;
	                        case 6:
	                        case 7:
	                            awd.a(p14, v11, v0_6, 16, v1_1);
	                            break;
	                        case 8:
	                        case 9:
	                            v6_0 = new String(awd.a(p14, v11, v0_6));
	                            break;
	                        case 10:
	                            v5_0 = p14[v11];
	                            break;
	                        case 22:
	                            v3_1.put(avq.a(awd.a(p14, v11, 2)), awd.a(p14, (v11 + 2), (v0_6 - 2)));
	                            break;
	                        case 255:
	                            v2_1.put((((p14[(v11 + 1)] & 255) << 8) + (p14[v11] & 255)), awd.a(p14, (v11 + 2), (v0_6 - 2)));
	                            break;
	                    }
	                    v0_0 = (v0_6 + v11);
	                }
	            } catch (int v0) {
	                int v0_8 = String.valueOf(java.util.Arrays.toString(p14));
	                if (v0_8.length() == 0) {
	                    int v0_10 = new String("unable to parse scan record: ");
	                } else {
	                    v0_10 = "unable to parse scan record: ".concat(v0_8);
	                }
	                android.util.Log.e("ScanRecord", v0_10);
	                v0_5 = new awd(0, 0, 0, -1, -2147483648, 0, p14);
	            }
	            if (v1_1.isEmpty()) {
	                v1_1 = 0;
	            }
	            v0_5 = new awd(v1_1, v2_1, v3_1, v4_0, v5_0, v6_0, p14);
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    public static byte[] a(byte[] p2, int p3, int p4)
	    {
	        byte[] v0 = new byte[p4];
	        System.arraycopy(p2, p3, v0, 0, p4);
	        return v0;
	    }
	
