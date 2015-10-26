	public static final java.lang.Object a
	
	    static cmq()
	    {
	        cmq.a = new Object();
	        return;
	    }
	
	
	    public static int a(int[] p1)
	    {
	        if ((p1 != null) && (p1.length != 0)) {
	            int v0_1 = java.util.Arrays.hashCode(p1);
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public static int a(Object[] p4)
	    {
	        int v0;
	        int v1_0 = 0;
	        if (p4 != null) {
	            v0 = p4.length;
	        } else {
	            v0 = 0;
	        }
	        int v2 = 0;
	        while (v2 < v0) {
	            int v3_0 = p4[v2];
	            if (v3_0 != 0) {
	                v1_0 = ((v1_0 * 31) + v3_0.hashCode());
	            }
	            v2++;
	        }
	        return v1_0;
	    }
	
	
	    public static int a(byte[][] p4)
	    {
	        int v0;
	        int v1_0 = 0;
	        if (p4 != null) {
	            v0 = p4.length;
	        } else {
	            v0 = 0;
	        }
	        int v2 = 0;
	        while (v2 < v0) {
	            int v3_0 = p4[v2];
	            if (v3_0 != 0) {
	                v1_0 = ((v1_0 * 31) + java.util.Arrays.hashCode(v3_0));
	            }
	            v2++;
	        }
	        return v1_0;
	    }
	
	
	    public static void a(cmm p1, cmm p2)
	    {
	        if (p1.m != null) {
	            p2.m = p1.m.b();
	        }
	        return;
	    }
	
	
	    public static boolean a(int[] p1, int[] p2)
	    {
	        if ((p1 != null) && (p1.length != 0)) {
	            int v0_1 = java.util.Arrays.equals(p1, p2);
	        } else {
	            if ((p2 != null) && (p2.length != 0)) {
	                v0_1 = 0;
	            } else {
	                v0_1 = 1;
	            }
	        }
	        return v0_1;
	    }
	
	
	    public static boolean a(Object[] p8, Object[] p9)
	    {
	        int v7;
	        int v1 = 0;
	        if (p8 != null) {
	            v7 = p8.length;
	        } else {
	            v7 = 0;
	        }
	        int v0_1;
	        if (p9 != null) {
	            v0_1 = p9.length;
	        } else {
	            v0_1 = 0;
	        }
	        int v3_0 = 0;
	        int v6 = 0;
	        while ((v6 >= v7) || (p8[v6] != null)) {
	            int v5 = v3_0;
	            while ((v5 < v0_1) && (p9[v5] == null)) {
	                v5++;
	            }
	            int v4_1;
	            if (v6 < v7) {
	                v4_1 = 0;
	            } else {
	                v4_1 = 1;
	            }
	            int v3_2;
	            if (v5 < v0_1) {
	                v3_2 = 0;
	            } else {
	                v3_2 = 1;
	            }
	            if ((v4_1 == 0) || (v3_2 == 0)) {
	                if ((v4_1 == v3_2) && (p8[v6].equals(p9[v5]))) {
	                    v3_0 = (v5 + 1);
	                    v6++;
	                }
	            } else {
	                v1 = 1;
	            }
	            return v1;
	        }
	        v6++;
	    }
	
	
	    public static boolean a(byte[][] p8, byte[][] p9)
	    {
	        int v7;
	        int v1 = 0;
	        if (p8 != null) {
	            v7 = p8.length;
	        } else {
	            v7 = 0;
	        }
	        int v0_1;
	        if (p9 != null) {
	            v0_1 = p9.length;
	        } else {
	            v0_1 = 0;
	        }
	        int v3_0 = 0;
	        int v6 = 0;
	        while ((v6 >= v7) || (p8[v6] != null)) {
	            int v5 = v3_0;
	            while ((v5 < v0_1) && (p9[v5] == null)) {
	                v5++;
	            }
	            int v4_1;
	            if (v6 < v7) {
	                v4_1 = 0;
	            } else {
	                v4_1 = 1;
	            }
	            int v3_2;
	            if (v5 < v0_1) {
	                v3_2 = 0;
	            } else {
	                v3_2 = 1;
	            }
	            if ((v4_1 == 0) || (v3_2 == 0)) {
	                if ((v4_1 == v3_2) && (java.util.Arrays.equals(p8[v6], p9[v5]))) {
	                    v3_0 = (v5 + 1);
	                    v6++;
	                }
	            } else {
	                v1 = 1;
	            }
	            return v1;
	        }
	        v6++;
	    }
	
