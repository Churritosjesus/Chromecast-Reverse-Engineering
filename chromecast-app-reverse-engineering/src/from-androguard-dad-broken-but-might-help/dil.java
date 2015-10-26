	private static final Ljava.lang.String a
	private static final Ljava.lang.String b
	private static final Ljava.lang.String c
	
	    static dil()
	    {
	        int v1 = 0;
	        String[] v0_1 = new String[10];
	        v0_1[0] = "DATA";
	        v0_1[1] = "HEADERS";
	        v0_1[2] = "PRIORITY";
	        v0_1[3] = "RST_STREAM";
	        v0_1[4] = "SETTINGS";
	        v0_1[5] = "PUSH_PROMISE";
	        v0_1[6] = "PING";
	        v0_1[7] = "GOAWAY";
	        v0_1[8] = "WINDOW_UPDATE";
	        v0_1[9] = "CONTINUATION";
	        dil.a = v0_1;
	        String[] v0_3 = new String[64];
	        dil.b = v0_3;
	        String[] v0_5 = new String[256];
	        dil.c = v0_5;
	        String[] v0_6 = 0;
	        while (v0_6 < dil.c.length) {
	            int[] v4_4 = new Object[1];
	            v4_4[0] = Integer.toBinaryString(v0_6);
	            dil.c[v0_6] = String.format("%8s", v4_4).replace(32, 48);
	            v0_6++;
	        }
	        dil.b[0] = "";
	        dil.b[1] = "END_STREAM";
	        int[] v3_5 = new int[1];
	        v3_5[0] = 1;
	        dil.b[8] = "PADDED";
	        String[] v0_10 = 0;
	        while (v0_10 <= null) {
	            String v2_21 = v3_5[v0_10];
	            dil.b[(v2_21 | 8)] = new StringBuilder().append(dil.b[v2_21]).append("|PADDED").toString();
	            v0_10++;
	        }
	        dil.b[4] = "END_HEADERS";
	        dil.b[32] = "PRIORITY";
	        dil.b[36] = "END_HEADERS|PRIORITY";
	        int[] v4_2 = new int[3];
	        v4_2 = {4, 32, 36};
	        String v2_18 = 0;
	        while (v2_18 < 3) {
	            int v5_0 = v4_2[v2_18];
	            String[] v0_19 = 0;
	            while (v0_19 <= null) {
	                String v6_1 = v3_5[v0_19];
	                dil.b[(v6_1 | v5_0)] = new StringBuilder().append(dil.b[v6_1]).append(124).append(dil.b[v5_0]).toString();
	                dil.b[((v6_1 | v5_0) | 8)] = new StringBuilder().append(dil.b[v6_1]).append(124).append(dil.b[v5_0]).append("|PADDED").toString();
	                v0_19++;
	            }
	            v2_18++;
	        }
	        while (v1 < dil.b.length) {
	            if (dil.b[v1] == null) {
	                dil.b[v1] = dil.c[v1];
	            }
	            v1++;
	        }
	        return;
	    }
	
	
	    dil()
	    {
	        return;
	    }
	
	
	    static String a(boolean p7, int p8, int p9, byte p10, byte p11)
	    {
	        String v2_1;
	        if (p10 >= dil.a.length) {
	            String v1_0 = new Object[1];
	            v1_0[0] = Byte.valueOf(p10);
	            v2_1 = String.format("0x%02x", v1_0);
	        } else {
	            v2_1 = dil.a[p10];
	        }
	        String v0_7;
	        if (p11 != 0) {
	            switch (p10) {
	                case 2:
	                case 3:
	                case 7:
	                case 8:
	                    v0_7 = dil.c[p11];
	                    break;
	                case 4:
	                case 6:
	                    if (p11 != 1) {
	                        v0_7 = dil.c[p11];
	                    } else {
	                        v0_7 = "ACK";
	                    }
	                    break;
	                case 5:
	                default:
	                    if (p11 >= dil.b.length) {
	                        v0_7 = dil.c[p11];
	                    } else {
	                        v0_7 = dil.b[p11];
	                    }
	                    if ((p10 != 5) || ((p11 & 4) == 0)) {
	                        if ((p10 == 0) && ((p11 & 32) != 0)) {
	                            v0_7 = v0_7.replace("PRIORITY", "COMPRESSED");
	                        }
	                    } else {
	                        v0_7 = v0_7.replace("HEADERS", "PUSH_PROMISE");
	                    }
	                    break;
	            }
	        } else {
	            v0_7 = "";
	        }
	        String v1_5;
	        Object[] v4_1 = new Object[5];
	        if (!p7) {
	            v1_5 = ">>";
	        } else {
	            v1_5 = "<<";
	        }
	        v4_1[0] = v1_5;
	        v4_1[1] = Integer.valueOf(p8);
	        v4_1[2] = Integer.valueOf(p9);
	        v4_1[3] = v2_1;
	        v4_1[4] = v0_7;
	        return String.format("%s 0x%08x %5d %-13s %s", v4_1);
	    }
	
