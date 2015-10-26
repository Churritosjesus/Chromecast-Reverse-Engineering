.class public final Ldfq;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final b:[C


# instance fields
.field final a:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:I

.field private final g:Ljava/util/List;

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 256
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Ldfq;->b:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method constructor <init>(Ldfr;)V
    .locals 1

    .prologue
    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 301
    iget-object v0, p1, Ldfr;->a:Ljava/lang/String;

    iput-object v0, p0, Ldfq;->a:Ljava/lang/String;

    .line 302
    iget-object v0, p1, Ldfr;->b:Ljava/lang/String;

    invoke-static {v0}, Ldfq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldfq;->c:Ljava/lang/String;

    .line 303
    iget-object v0, p1, Ldfr;->c:Ljava/lang/String;

    invoke-static {v0}, Ldfq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldfq;->d:Ljava/lang/String;

    .line 304
    iget-object v0, p1, Ldfr;->d:Ljava/lang/String;

    iput-object v0, p0, Ldfq;->e:Ljava/lang/String;

    .line 305
    invoke-virtual {p1}, Ldfr;->a()I

    move-result v0

    iput v0, p0, Ldfq;->f:I

    .line 306
    iget-object v0, p1, Ldfr;->f:Ljava/util/List;

    invoke-static {v0}, Ldfq;->a(Ljava/util/List;)Ljava/util/List;

    .line 307
    iget-object v0, p1, Ldfr;->g:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p1, Ldfr;->g:Ljava/util/List;

    .line 308
    invoke-static {v0}, Ldfq;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ldfq;->g:Ljava/util/List;

    .line 310
    iget-object v0, p1, Ldfr;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p1, Ldfr;->h:Ljava/lang/String;

    .line 311
    invoke-static {v0}, Ldfq;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    :cond_0
    invoke-virtual {p1}, Ldfr;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldfq;->h:Ljava/lang/String;

    .line 314
    return-void

    .line 308
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static a(C)I
    .locals 1

    .prologue
    .line 1394
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    add-int/lit8 v0, p0, -0x30

    .line 1397
    :goto_0
    return v0

    .line 1395
    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 v0, p0, -0x61

    add-int/lit8 v0, v0, 0xa

    goto :goto_0

    .line 1396
    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 v0, p0, -0x41

    add-int/lit8 v0, v0, 0xa

    goto :goto_0

    .line 1397
    :cond_2
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 401
    const-string v0, "http"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    const/16 v0, 0x50

    .line 406
    :goto_0
    return v0

    .line 403
    :cond_0
    const-string v0, "https"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 404
    const/16 v0, 0x1bb

    goto :goto_0

    .line 406
    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method static synthetic a(Ljava/lang/String;IILjava/lang/String;)I
    .locals 1

    .prologue
    .line 255
    invoke-static {p0, p1, p2, p3}, Ldfq;->b(Ljava/lang/String;IILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static a(Ljava/net/URL;)Ldfq;
    .locals 12

    .prologue
    .line 593
    invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1585
    new-instance v9, Ldfr;

    invoke-direct {v9}, Ldfr;-><init>()V

    .line 1881
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 2088
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    .line 2089
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    sparse-switch v3, :sswitch_data_0

    .line 1882
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 2108
    add-int/lit8 v1, v1, -0x1

    :goto_2
    if-lt v1, v2, :cond_5

    .line 2109
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    sparse-switch v3, :sswitch_data_1

    .line 2117
    add-int/lit8 v1, v1, 0x1

    move v8, v1

    .line 2128
    :goto_3
    sub-int v1, v8, v2

    const/4 v3, 0x2

    if-lt v1, v3, :cond_a

    .line 2130
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 2131
    const/16 v3, 0x61

    if-lt v1, v3, :cond_0

    const/16 v3, 0x7a

    if-le v1, v3, :cond_6

    :cond_0
    const/16 v3, 0x41

    if-lt v1, v3, :cond_1

    const/16 v3, 0x5a

    if-le v1, v3, :cond_6

    :cond_1
    const/4 v1, -0x1

    .line 1886
    :cond_2
    :goto_4
    const/4 v3, -0x1

    if-eq v1, v3, :cond_d

    .line 1887
    const/4 v1, 0x1

    const-string v3, "https:"

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 1888
    const-string v1, "https"

    iput-object v1, v9, Ldfr;->a:Ljava/lang/String;

    .line 1889
    add-int/lit8 v1, v2, 0x6

    .line 1903
    :goto_5
    const/4 v3, 0x0

    .line 1904
    const/4 v2, 0x0

    .line 2154
    const/4 v4, 0x0

    move v5, v1

    .line 2155
    :goto_6
    if-ge v5, v8, :cond_e

    .line 2156
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 2157
    const/16 v7, 0x5c

    if-eq v6, v7, :cond_3

    const/16 v7, 0x2f

    if-ne v6, v7, :cond_e

    .line 2158
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 2159
    add-int/lit8 v5, v5, 0x1

    .line 2163
    goto :goto_6

    .line 2088
    :sswitch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    move v2, v1

    .line 2100
    goto :goto_1

    .line 2108
    :sswitch_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_5
    move v8, v2

    .line 2120
    goto :goto_3

    .line 2133
    :cond_6
    add-int/lit8 v1, v2, 0x1

    :goto_7
    if-ge v1, v8, :cond_a

    .line 2134
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 2136
    const/16 v4, 0x61

    if-lt v3, v4, :cond_7

    const/16 v4, 0x7a

    if-le v3, v4, :cond_9

    :cond_7
    const/16 v4, 0x41

    if-lt v3, v4, :cond_8

    const/16 v4, 0x5a

    if-le v3, v4, :cond_9

    :cond_8
    const/16 v4, 0x2b

    if-eq v3, v4, :cond_9

    const/16 v4, 0x2d

    if-eq v3, v4, :cond_9

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_9

    .line 2142
    const/16 v4, 0x3a

    if-eq v3, v4, :cond_2

    .line 2145
    const/4 v1, -0x1

    goto :goto_4

    .line 2133
    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 2149
    :cond_a
    const/4 v1, -0x1

    goto :goto_4

    .line 1890
    :cond_b
    const/4 v1, 0x1

    const-string v3, "http:"

    const/4 v4, 0x0

    const/4 v5, 0x5

    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1891
    const-string v1, "http"

    iput-object v1, v9, Ldfr;->a:Ljava/lang/String;

    .line 1892
    add-int/lit8 v1, v2, 0x5

    goto :goto_5

    .line 1894
    :cond_c
    const/4 v0, 0x0

    .line 1962
    :goto_8
    return-object v0

    .line 1899
    :cond_d
    const/4 v0, 0x0

    goto :goto_8

    .line 1916
    :cond_e
    add-int/2addr v1, v4

    move v6, v2

    move v7, v3

    .line 1919
    :goto_9
    const-string v2, "@/\\?#"

    .line 2255
    invoke-static {v0, v1, v8, v2}, Ldfq;->b(Ljava/lang/String;IILjava/lang/String;)I

    move-result v10

    .line 1920
    if-eq v10, v8, :cond_f

    .line 1921
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 1923
    :goto_a
    sparse-switch v2, :sswitch_data_2

    goto :goto_9

    .line 1953
    :sswitch_2
    invoke-static {v0, v1, v10}, Ldfr;->b(Ljava/lang/String;II)I

    move-result v2

    .line 1954
    add-int/lit8 v3, v2, 0x1

    if-ge v3, v10, :cond_13

    .line 1955
    invoke-static {v0, v1, v2}, Ldfr;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ldfr;->d:Ljava/lang/String;

    .line 1956
    add-int/lit8 v1, v2, 0x1

    invoke-static {v0, v1, v10}, Ldfr;->d(Ljava/lang/String;II)I

    move-result v1

    iput v1, v9, Ldfr;->e:I

    .line 1957
    iget v1, v9, Ldfr;->e:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_14

    const/4 v0, 0x0

    goto :goto_8

    .line 1921
    :cond_f
    const/4 v2, -0x1

    goto :goto_a

    .line 1926
    :sswitch_3
    if-nez v6, :cond_12

    .line 1927
    const-string v2, ":"

    .line 3255
    invoke-static {v0, v1, v10, v2}, Ldfq;->b(Ljava/lang/String;IILjava/lang/String;)I

    move-result v2

    .line 1929
    const-string v3, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    .line 1931
    if-eqz v7, :cond_10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v9, Ldfr;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%40"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_10
    iput-object v1, v9, Ldfr;->b:Ljava/lang/String;

    .line 1934
    if-eq v2, v10, :cond_11

    .line 1935
    const/4 v6, 0x1

    .line 1936
    add-int/lit8 v1, v2, 0x1

    const-string v3, " \"\':;<=>@[]\\^`{}|/\\?#"

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v2, v10

    invoke-static/range {v0 .. v5}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ldfr;->c:Ljava/lang/String;

    .line 1939
    :cond_11
    const/4 v2, 0x1

    move v1, v6

    .line 1944
    :goto_b
    add-int/lit8 v3, v10, 0x1

    move v6, v1

    move v7, v2

    move v1, v3

    .line 1945
    goto :goto_9

    .line 1941
    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v9, Ldfr;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "%40"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v3, " \"\':;<=>@[]\\^`{}|/\\?#"

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v2, v10

    invoke-static/range {v0 .. v5}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ldfr;->c:Ljava/lang/String;

    move v1, v6

    move v2, v7

    goto :goto_b

    .line 1959
    :cond_13
    invoke-static {v0, v1, v2}, Ldfr;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v9, Ldfr;->d:Ljava/lang/String;

    .line 1960
    iget-object v1, v9, Ldfr;->a:Ljava/lang/String;

    invoke-static {v1}, Ldfq;->a(Ljava/lang/String;)I

    move-result v1

    iput v1, v9, Ldfr;->e:I

    .line 1962
    :cond_14
    iget-object v1, v9, Ldfr;->d:Ljava/lang/String;

    if-nez v1, :cond_15

    const/4 v0, 0x0

    goto/16 :goto_8

    .line 1981
    :cond_15
    const-string v1, "?#"

    invoke-static {v0, v10, v8, v1}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v1

    .line 1982
    invoke-virtual {v9, v0, v10, v1}, Ldfr;->a(Ljava/lang/String;II)V

    .line 1986
    if-ge v1, v8, :cond_19

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x3f

    if-ne v2, v3, :cond_19

    .line 1987
    const-string v2, "#"

    invoke-static {v0, v1, v8, v2}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;)I

    move-result v2

    .line 1988
    add-int/lit8 v1, v1, 0x1

    const-string v3, " \"\'<>#"

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldfq;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v9, Ldfr;->g:Ljava/util/List;

    .line 1994
    :goto_c
    if-ge v2, v8, :cond_16

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x23

    if-ne v1, v3, :cond_16

    .line 1995
    add-int/lit8 v1, v2, 0x1

    const-string v3, ""

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v2, v8

    invoke-static/range {v0 .. v5}, Ldfq;->a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v9, Ldfr;->h:Ljava/lang/String;

    .line 3831
    :cond_16
    iget-object v0, v9, Ldfr;->a:Ljava/lang/String;

    if-nez v0, :cond_17

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3832
    :cond_17
    iget-object v0, v9, Ldfr;->d:Ljava/lang/String;

    if-nez v0, :cond_18

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3833
    :cond_18
    new-instance v0, Ldfq;

    .line 4255
    invoke-direct {v0, v9}, Ldfq;-><init>(Ldfr;)V

    goto/16 :goto_8

    :cond_19
    move v2, v1

    goto :goto_c

    .line 2089
    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_0
        0xa -> :sswitch_0
        0xc -> :sswitch_0
        0xd -> :sswitch_0
        0x20 -> :sswitch_0
    .end sparse-switch

    .line 2109
    :sswitch_data_1
    .sparse-switch
        0x9 -> :sswitch_1
        0xa -> :sswitch_1
        0xc -> :sswitch_1
        0xd -> :sswitch_1
        0x20 -> :sswitch_1
    .end sparse-switch

    .line 1923
    :sswitch_data_2
    .sparse-switch
        -0x1 -> :sswitch_2
        0x23 -> :sswitch_2
        0x2f -> :sswitch_2
        0x3f -> :sswitch_2
        0x40 -> :sswitch_3
        0x5c -> :sswitch_2
    .end sparse-switch
.end method

.method static a(Ljava/lang/String;II)Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v6, 0x25

    const/4 v5, -0x1

    .line 1361
    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_3

    .line 1362
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 1363
    if-ne v1, v6, :cond_2

    .line 1365
    new-instance v1, Ldjz;

    invoke-direct {v1}, Ldjz;-><init>()V

    .line 1366
    invoke-virtual {v1, p0, p1, v0}, Ldjz;->a(Ljava/lang/String;II)Ldjz;

    .line 4378
    :goto_1
    if-ge v0, p2, :cond_1

    .line 4379
    invoke-virtual {p0, v0}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    .line 4380
    if-ne v2, v6, :cond_0

    add-int/lit8 v3, v0, 0x2

    if-ge v3, p2, :cond_0

    .line 4381
    add-int/lit8 v3, v0, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ldfq;->a(C)I

    move-result v3

    .line 4382
    add-int/lit8 v4, v0, 0x2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ldfq;->a(C)I

    move-result v4

    .line 4383
    if-eq v3, v5, :cond_0

    if-eq v4, v5, :cond_0

    .line 4384
    shl-int/lit8 v3, v3, 0x4

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Ldjz;->b(I)Ldjz;

    .line 4385
    add-int/lit8 v0, v0, 0x2

    .line 4378
    :goto_2
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_1

    .line 4389
    :cond_0
    invoke-virtual {v1, v2}, Ldjz;->a(I)Ldjz;

    goto :goto_2

    .line 1368
    :cond_1
    invoke-virtual {v1}, Ldjz;->n()Ljava/lang/String;

    move-result-object v0

    .line 1373
    :goto_3
    return-object v0

    .line 1361
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1373
    :cond_3
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_3
.end method

.method static a(Ljava/lang/String;IILjava/lang/String;ZZ)Ljava/lang/String;
    .locals 7

    .prologue
    .line 1417
    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_b

    .line 1418
    invoke-virtual {p0, v0}, Ljava/lang/String;->codePointAt(I)I

    move-result v1

    .line 1419
    const/16 v2, 0x20

    if-lt v1, v2, :cond_1

    const/16 v2, 0x7f

    if-ge v1, v2, :cond_1

    .line 1421
    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    const/16 v2, 0x25

    if-ne v1, v2, :cond_0

    if-eqz p4, :cond_1

    :cond_0
    if-eqz p5, :cond_a

    const/16 v2, 0x2b

    if-ne v1, v2, :cond_a

    .line 1425
    :cond_1
    new-instance v3, Ldjz;

    invoke-direct {v3}, Ldjz;-><init>()V

    .line 1426
    invoke-virtual {v3, p0, p1, v0}, Ldjz;->a(Ljava/lang/String;II)Ldjz;

    .line 4438
    const/4 v1, 0x0

    move v2, v0

    move-object v0, v1

    .line 4440
    :goto_1
    if-ge v2, p2, :cond_9

    .line 4441
    invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I

    move-result v4

    .line 4442
    if-eqz p4, :cond_2

    const/16 v1, 0x9

    if-eq v4, v1, :cond_3

    const/16 v1, 0xa

    if-eq v4, v1, :cond_3

    const/16 v1, 0xc

    if-eq v4, v1, :cond_3

    const/16 v1, 0xd

    if-eq v4, v1, :cond_3

    .line 4445
    :cond_2
    if-eqz p5, :cond_5

    const/16 v1, 0x2b

    if-ne v4, v1, :cond_5

    .line 4447
    if-eqz p4, :cond_4

    const-string v1, "%20"

    :goto_2
    invoke-virtual {v3, v1}, Ldjz;->a(Ljava/lang/String;)Ldjz;

    .line 4440
    :cond_3
    :goto_3
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v1, v2

    move v2, v1

    goto :goto_1

    .line 4447
    :cond_4
    const-string v1, "%2B"

    goto :goto_2

    .line 4448
    :cond_5
    const/16 v1, 0x20

    if-lt v4, v1, :cond_6

    const/16 v1, 0x7f

    if-ge v4, v1, :cond_6

    .line 4450
    invoke-virtual {p3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v5, -0x1

    if-ne v1, v5, :cond_6

    const/16 v1, 0x25

    if-ne v4, v1, :cond_8

    if-nez p4, :cond_8

    .line 4453
    :cond_6
    if-nez v0, :cond_7

    .line 4454
    new-instance v0, Ldjz;

    invoke-direct {v0}, Ldjz;-><init>()V

    .line 4456
    :cond_7
    invoke-virtual {v0, v4}, Ldjz;->a(I)Ldjz;

    .line 4457
    :goto_4
    invoke-virtual {v0}, Ldjz;->e()Z

    move-result v1

    if-nez v1, :cond_3

    .line 4458
    invoke-virtual {v0}, Ldjz;->g()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    .line 4459
    const/16 v5, 0x25

    invoke-virtual {v3, v5}, Ldjz;->b(I)Ldjz;

    .line 4460
    sget-object v5, Ldfq;->b:[C

    shr-int/lit8 v6, v1, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v5, v5, v6

    invoke-virtual {v3, v5}, Ldjz;->b(I)Ldjz;

    .line 4461
    sget-object v5, Ldfq;->b:[C

    and-int/lit8 v1, v1, 0xf

    aget-char v1, v5, v1

    invoke-virtual {v3, v1}, Ldjz;->b(I)Ldjz;

    goto :goto_4

    .line 4465
    :cond_8
    invoke-virtual {v3, v4}, Ldjz;->a(I)Ldjz;

    goto :goto_3

    .line 1428
    :cond_9
    invoke-virtual {v3}, Ldjz;->n()Ljava/lang/String;

    move-result-object v0

    .line 1433
    :goto_5
    return-object v0

    .line 1417
    :cond_a
    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v1

    add-int/2addr v0, v1

    goto/16 :goto_0

    .line 1433
    :cond_b
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_5
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .prologue
    .line 1353
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1354
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1355
    if-eqz v0, :cond_0

    invoke-static {v0}, Ldfq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 1357
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static a(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 3

    .prologue
    .line 425
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 426
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 427
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 429
    :cond_0
    return-void
.end method

.method private static b(Ljava/lang/String;IILjava/lang/String;)I
    .locals 3

    .prologue
    .line 1342
    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_0

    .line 1343
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    move p2, v0

    .line 1345
    :cond_0
    return p2

    .line 1342
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static b(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 480
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 481
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v0, v1, :cond_3

    .line 482
    const/16 v1, 0x26

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    .line 483
    if-ne v1, v4, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 485
    :cond_0
    const/16 v3, 0x3d

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 486
    if-eq v3, v4, :cond_1

    if-le v3, v1, :cond_2

    .line 487
    :cond_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 488
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    :goto_1
    add-int/lit8 v0, v1, 0x1

    .line 494
    goto :goto_0

    .line 490
    :cond_2
    invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 491
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 495
    :cond_3
    return-object v2
.end method

.method static b(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 5

    .prologue
    .line 461
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    move v2, v0

    :goto_0
    if-ge v2, v3, :cond_2

    .line 462
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 463
    add-int/lit8 v1, v2, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 464
    if-lez v2, :cond_0

    const/16 v4, 0x26

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 465
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    if-eqz v1, :cond_1

    .line 467
    const/16 v0, 0x3d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 468
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    :cond_1
    add-int/lit8 v0, v2, 0x2

    move v2, v0

    goto :goto_0

    .line 471
    :cond_2
    return-void
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 1349
    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {p0, v0, v1}, Ldfq;->a(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/net/URL;
    .locals 2

    .prologue
    .line 319
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Ldfq;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 320
    :catch_0
    move-exception v0

    .line 321
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b()Ljava/net/URI;
    .locals 3

    .prologue
    .line 333
    :try_start_0
    new-instance v0, Ljava/net/URI;

    iget-object v1, p0, Ldfq;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 335
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "not valid as a java.net.URI: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldfq;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 601
    instance-of v0, p1, Ldfq;

    if-eqz v0, :cond_0

    check-cast p1, Ldfq;

    iget-object v0, p1, Ldfq;->h:Ljava/lang/String;

    iget-object v1, p0, Ldfq;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 605
    iget-object v0, p0, Ldfq;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 609
    iget-object v0, p0, Ldfq;->h:Ljava/lang/String;

    return-object v0
.end method
