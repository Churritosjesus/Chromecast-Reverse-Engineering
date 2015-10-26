.class public final Ldfr;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:I

.field final f:Ljava/util/List;

.field g:Ljava/util/List;

.field h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 622
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 614
    const-string v0, ""

    iput-object v0, p0, Ldfr;->b:Ljava/lang/String;

    .line 615
    const-string v0, ""

    iput-object v0, p0, Ldfr;->c:Ljava/lang/String;

    .line 617
    const/4 v0, -0x1

    iput v0, p0, Ldfr;->e:I

    .line 618
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldfr;->f:Ljava/util/List;

    .line 623
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 624
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1315
    :try_start_0
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 1316
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_0

    .line 1320
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    .line 1318
    goto :goto_0

    .line 1320
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static b(Ljava/lang/String;II)I
    .locals 3

    .prologue
    .line 1169
    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_2

    .line 1170
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 1169
    :cond_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1172
    :cond_1
    :sswitch_0
    add-int/lit8 v0, v0, 0x1

    if-ge v0, p2, :cond_0

    .line 1173
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5d

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_2
    move v0, p2

    .line 1180
    :sswitch_1
    return v0

    .line 1170
    :sswitch_data_0
    .sparse-switch
        0x3a -> :sswitch_1
        0x5b -> :sswitch_0
    .end sparse-switch
.end method

.method static c(Ljava/lang/String;II)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1186
    invoke-static {p0, p1, p2}, Ldfq;->a(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    .line 1189
    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1190
    const/4 v2, 0x1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v1, v2, v3}, Ldfr;->e(Ljava/lang/String;II)Ljava/net/InetAddress;

    move-result-object v1

    .line 1191
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    .line 1204
    :cond_0
    :goto_0
    return-object v0

    .line 1195
    :cond_1
    invoke-static {v1}, Ldfr;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1196
    if-eqz v1, :cond_0

    .line 1199
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 1200
    const/4 v3, 0x0

    const-string v4, "\u0000\t\n\r #%/:?@[\\]"

    invoke-static {v1, v3, v2, v4}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v3

    if-ne v3, v2, :cond_0

    move-object v0, v1

    .line 1204
    goto :goto_0
.end method

.method static d(Ljava/lang/String;II)I
    .locals 7

    .prologue
    const/4 v6, -0x1

    .line 1327
    :try_start_0
    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-static/range {v0 .. v5}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    .line 1328
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 1329
    if-lez v0, :cond_0

    const v1, 0xffff

    if-gt v0, v1, :cond_0

    .line 1332
    :goto_0
    return v0

    :cond_0
    move v0, v6

    .line 1330
    goto :goto_0

    .line 1332
    :catch_0
    move-exception v0

    move v0, v6

    goto :goto_0
.end method

.method private static e(Ljava/lang/String;II)Ljava/net/InetAddress;
    .locals 11

    .prologue
    .line 1209
    const/16 v0, 0x10

    new-array v7, v0, [B

    .line 1210
    const/4 v2, 0x0

    .line 1211
    const/4 v1, -0x1

    .line 1212
    const/4 v4, -0x1

    .line 1214
    const/4 v0, 0x1

    :goto_0
    if-ge v0, p2, :cond_2

    .line 1215
    const/16 v3, 0x10

    if-ne v2, v3, :cond_0

    const/4 v0, 0x0

    .line 1272
    :goto_1
    return-object v0

    .line 1218
    :cond_0
    add-int/lit8 v3, v0, 0x2

    if-gt v3, p2, :cond_3

    const-string v3, "::"

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-virtual {p0, v0, v3, v5, v6}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1220
    const/4 v3, -0x1

    if-eq v1, v3, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 1221
    :cond_1
    add-int/lit8 v0, v0, 0x2

    .line 1222
    add-int/lit8 v1, v2, 0x2

    .line 1224
    if-ne v0, p2, :cond_16

    move v2, v1

    .line 1265
    :cond_2
    :goto_2
    const/16 v0, 0x10

    if-eq v2, v0, :cond_15

    .line 1266
    const/4 v0, -0x1

    if-ne v1, v0, :cond_14

    const/4 v0, 0x0

    goto :goto_1

    .line 1225
    :cond_3
    if-eqz v2, :cond_4

    .line 1227
    const-string v3, ":"

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {p0, v0, v3, v5, v6}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 1228
    add-int/lit8 v0, v0, 0x1

    .line 1240
    :cond_4
    :goto_3
    const/4 v3, 0x0

    move v4, v0

    .line 1242
    :goto_4
    if-ge v4, p2, :cond_11

    .line 1243
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 1244
    invoke-static {v5}, Ldfq;->a(C)I

    move-result v5

    .line 1245
    const/4 v6, -0x1

    if-eq v5, v6, :cond_11

    .line 1246
    shl-int/lit8 v3, v3, 0x4

    add-int/2addr v3, v5

    .line 1242
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 1229
    :cond_5
    const-string v3, "."

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {p0, v0, v3, v5, v6}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1231
    add-int/lit8 v6, v2, -0x2

    move v0, v4

    move v5, v6

    .line 2283
    :goto_5
    if-ge v0, p2, :cond_d

    .line 2284
    const/16 v3, 0x10

    if-ne v5, v3, :cond_6

    const/4 v0, 0x0

    .line 1231
    :goto_6
    if-nez v0, :cond_f

    const/4 v0, 0x0

    goto :goto_1

    .line 2287
    :cond_6
    if-eq v5, v6, :cond_8

    .line 2288
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_7

    const/4 v0, 0x0

    goto :goto_6

    .line 2289
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 2293
    :cond_8
    const/4 v3, 0x0

    move v4, v0

    .line 2295
    :goto_7
    if-ge v4, p2, :cond_b

    .line 2296
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 2297
    const/16 v9, 0x30

    if-lt v8, v9, :cond_b

    const/16 v9, 0x39

    if-gt v8, v9, :cond_b

    .line 2298
    if-nez v3, :cond_9

    if-eq v0, v4, :cond_9

    const/4 v0, 0x0

    goto :goto_6

    .line 2299
    :cond_9
    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v8

    add-int/lit8 v3, v3, -0x30

    .line 2300
    const/16 v8, 0xff

    if-le v3, v8, :cond_a

    const/4 v0, 0x0

    goto :goto_6

    .line 2295
    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    .line 2302
    :cond_b
    sub-int v0, v4, v0

    .line 2303
    if-nez v0, :cond_c

    const/4 v0, 0x0

    goto :goto_6

    .line 2306
    :cond_c
    add-int/lit8 v0, v5, 0x1

    int-to-byte v3, v3

    aput-byte v3, v7, v5

    move v5, v0

    move v0, v4

    .line 2307
    goto :goto_5

    .line 2309
    :cond_d
    add-int/lit8 v0, v6, 0x4

    if-eq v5, v0, :cond_e

    const/4 v0, 0x0

    goto :goto_6

    .line 2310
    :cond_e
    const/4 v0, 0x1

    goto :goto_6

    .line 1232
    :cond_f
    add-int/lit8 v2, v2, 0x2

    .line 1233
    goto/16 :goto_2

    .line 1235
    :cond_10
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 1248
    :cond_11
    sub-int v5, v4, v0

    .line 1249
    if-eqz v5, :cond_12

    const/4 v6, 0x4

    if-le v5, v6, :cond_13

    :cond_12
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 1252
    :cond_13
    add-int/lit8 v5, v2, 0x1

    ushr-int/lit8 v6, v3, 0x8

    int-to-byte v6, v6

    aput-byte v6, v7, v2

    .line 1253
    add-int/lit8 v2, v5, 0x1

    int-to-byte v3, v3

    aput-byte v3, v7, v5

    move v10, v4

    move v4, v0

    move v0, v10

    .line 1254
    goto/16 :goto_0

    .line 1267
    :cond_14
    sub-int v0, v2, v1

    rsub-int/lit8 v0, v0, 0x10

    sub-int v3, v2, v1

    invoke-static {v7, v1, v7, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1268
    rsub-int/lit8 v0, v2, 0x10

    add-int/2addr v0, v1

    const/4 v2, 0x0

    invoke-static {v7, v1, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 1272
    :cond_15
    :try_start_0
    invoke-static {v7}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_1

    .line 1274
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_16
    move v2, v1

    goto/16 :goto_3
.end method


# virtual methods
.method final a()I
    .locals 2

    .prologue
    .line 682
    iget v0, p0, Ldfr;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget v0, p0, Ldfr;->e:I

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Ldfr;->a:Ljava/lang/String;

    invoke-static {v0}, Ldfq;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method a(Ljava/lang/String;II)V
    .locals 7

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 1004
    if-ne p2, p3, :cond_1

    .line 1027
    :cond_0
    return-void

    .line 1008
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 1009
    const/16 v1, 0x2f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_7

    .line 1011
    :cond_2
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1012
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1013
    add-int/lit8 p2, p2, 0x1

    :goto_0
    move v1, p2

    .line 1020
    :goto_1
    if-ge v1, p3, :cond_0

    .line 1021
    const-string v0, "/\\"

    invoke-static {p1, v1, p3, v0}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v2

    .line 1022
    if-ge v2, p3, :cond_8

    move v6, v4

    .line 2032
    :goto_2
    const-string v3, " \"<>^`{}|/\\?#"

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    .line 2052
    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "%2e"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_3
    move v0, v4

    .line 2034
    :goto_3
    if-nez v0, :cond_5

    .line 2056
    const-string v0, ".."

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "%2e."

    .line 2057
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, ".%2e"

    .line 2058
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "%2e%2e"

    .line 2059
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_4
    move v0, v4

    .line 2037
    :goto_4
    if-eqz v0, :cond_c

    .line 2073
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    iget-object v1, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 2076
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    .line 2077
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    iget-object v1, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const-string v3, ""

    invoke-interface {v0, v1, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1025
    :cond_5
    :goto_5
    if-eqz v6, :cond_6

    add-int/lit8 v2, v2, 0x1

    :cond_6
    move v1, v2

    .line 1026
    goto :goto_1

    .line 1016
    :cond_7
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    iget-object v1, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_8
    move v6, v5

    .line 1022
    goto/16 :goto_2

    :cond_9
    move v0, v5

    .line 2052
    goto :goto_3

    :cond_a
    move v0, v5

    .line 2059
    goto :goto_4

    .line 2079
    :cond_b
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 2041
    :cond_c
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    iget-object v3, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2042
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    iget-object v3, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v3, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 2046
    :goto_6
    if-eqz v6, :cond_5

    .line 2047
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    const-string v1, ""

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 2044
    :cond_d
    iget-object v0, p0, Ldfr;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v3, 0x3a

    .line 837
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 838
    iget-object v1, p0, Ldfr;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 839
    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 841
    iget-object v1, p0, Ldfr;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ldfr;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 842
    :cond_0
    iget-object v1, p0, Ldfr;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 843
    iget-object v1, p0, Ldfr;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 844
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 845
    iget-object v1, p0, Ldfr;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    :cond_1
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 850
    :cond_2
    iget-object v1, p0, Ldfr;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_6

    .line 852
    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 853
    iget-object v1, p0, Ldfr;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 854
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 859
    :goto_0
    invoke-virtual {p0}, Ldfr;->a()I

    move-result v1

    .line 860
    iget-object v2, p0, Ldfr;->a:Ljava/lang/String;

    invoke-static {v2}, Ldfq;->a(Ljava/lang/String;)I

    move-result v2

    if-eq v1, v2, :cond_3

    .line 861
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 862
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 865
    :cond_3
    iget-object v1, p0, Ldfr;->f:Ljava/util/List;

    invoke-static {v0, v1}, Ldfq;->a(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 867
    iget-object v1, p0, Ldfr;->g:Ljava/util/List;

    if-eqz v1, :cond_4

    .line 868
    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 869
    iget-object v1, p0, Ldfr;->g:Ljava/util/List;

    invoke-static {v0, v1}, Ldfq;->b(Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 872
    :cond_4
    iget-object v1, p0, Ldfr;->h:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 873
    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 874
    iget-object v1, p0, Ldfr;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 877
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 856
    :cond_6
    iget-object v1, p0, Ldfr;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
