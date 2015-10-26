.class final Lagk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lagg;


# instance fields
.field private final a:Ljava/io/OutputStream;

.field private final b:Laiw;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Laiw;Z)V
    .locals 1

    .prologue
    .line 1958
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1955
    const/4 v0, 0x1

    iput-boolean v0, p0, Lagk;->c:Z

    .line 1956
    const/4 v0, 0x0

    iput-boolean v0, p0, Lagk;->d:Z

    .line 1959
    iput-object p1, p0, Lagk;->a:Ljava/io/OutputStream;

    .line 1960
    iput-object p2, p0, Lagk;->b:Laiw;

    .line 1961
    iput-boolean p3, p0, Lagk;->d:Z

    .line 1962
    return-void
.end method

.method private static a()Ljava/lang/RuntimeException;
    .locals 2

    .prologue
    .line 1997
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value is not a supported type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 2064
    if-nez p3, :cond_0

    .line 2065
    const-string p3, "content/unknown"

    .line 2067
    :cond_0
    invoke-direct {p0, p1, p1, p3}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2070
    invoke-static {}, Lafv;->f()Landroid/content/Context;

    move-result-object v0

    .line 2071
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 2072
    invoke-virtual {v0, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    .line 2075
    iget-object v2, p0, Lagk;->a:Ljava/io/OutputStream;

    instance-of v2, v2, Lagy;

    if-eqz v2, :cond_2

    .line 2077
    invoke-static {p2}, Laji;->a(Landroid/net/Uri;)J

    move-result-wide v2

    .line 2079
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    check-cast v0, Lagy;

    invoke-virtual {v0, v2, v3}, Lagy;->a(J)V

    move v0, v1

    .line 2084
    :goto_0
    const-string v2, ""

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2085
    invoke-direct {p0}, Lagk;->b()V

    .line 2086
    iget-object v2, p0, Lagk;->b:Laiw;

    if-eqz v2, :cond_1

    .line 2087
    iget-object v3, p0, Lagk;->b:Laiw;

    const-string v4, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v5, "<Data: %d>"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    .line 2089
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v1

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2087
    invoke-virtual {v3, v2, v0}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2091
    :cond_1
    return-void

    .line 2081
    :cond_2
    iget-object v2, p0, Lagk;->a:Ljava/io/OutputStream;

    invoke-static {v0, v2}, Laji;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    goto :goto_0

    .line 2087
    :cond_3
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 2098
    if-nez p3, :cond_0

    .line 2099
    const-string p3, "content/unknown"

    .line 2101
    :cond_0
    invoke-direct {p0, p1, p1, p3}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2105
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    instance-of v0, v0, Lagy;

    if-eqz v0, :cond_2

    .line 2107
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    check-cast v0, Lagy;

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lagy;->a(J)V

    move v0, v1

    .line 2113
    :goto_0
    const-string v2, ""

    new-array v3, v1, [Ljava/lang/Object;

    invoke-direct {p0, v2, v3}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2114
    invoke-direct {p0}, Lagk;->b()V

    .line 2115
    iget-object v2, p0, Lagk;->b:Laiw;

    if-eqz v2, :cond_1

    .line 2116
    iget-object v3, p0, Lagk;->b:Laiw;

    const-string v4, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v5, "<Data: %d>"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    .line 2118
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v6, v1

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2116
    invoke-virtual {v3, v2, v0}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2120
    :cond_1
    return-void

    .line 2109
    :cond_2
    new-instance v0, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {v0, p2}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 2111
    iget-object v2, p0, Lagk;->a:Ljava/io/OutputStream;

    invoke-static {v0, v2}, Laji;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    goto :goto_0

    .line 2116
    :cond_3
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 2135
    iget-boolean v0, p0, Lagk;->d:Z

    if-nez v0, :cond_2

    .line 2136
    const-string v0, "Content-Disposition: form-data; name=\"%s\""

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p1, v1, v3

    invoke-direct {p0, v0, v1}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2137
    if-eqz p2, :cond_0

    .line 2138
    const-string v0, "; filename=\"%s\""

    new-array v1, v4, [Ljava/lang/Object;

    aput-object p2, v1, v3

    invoke-direct {p0, v0, v1}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2140
    :cond_0
    const-string v0, ""

    new-array v1, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2141
    if-eqz p3, :cond_1

    .line 2142
    const-string v0, "%s: %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Content-Type"

    aput-object v2, v1, v3

    aput-object p3, v1, v4

    invoke-direct {p0, v0, v1}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2144
    :cond_1
    const-string v0, ""

    new-array v1, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2148
    :goto_0
    return-void

    .line 2146
    :cond_2
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    const-string v1, "%s="

    new-array v2, v4, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0
.end method

.method private varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 2151
    iget-boolean v0, p0, Lagk;->d:Z

    if-nez v0, :cond_1

    .line 2152
    iget-boolean v0, p0, Lagk;->c:Z

    if-eqz v0, :cond_0

    .line 2154
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    const-string v1, "--"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2155
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    const-string v1, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2156
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    const-string v1, "\r\n"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2157
    const/4 v0, 0x0

    iput-boolean v0, p0, Lagk;->c:Z

    .line 2159
    :cond_0
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 2165
    :goto_0
    return-void

    .line 2161
    :cond_1
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2163
    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    .line 2162
    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2163
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 2161
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 2123
    iget-boolean v0, p0, Lagk;->d:Z

    if-nez v0, :cond_0

    .line 2124
    const-string v0, "--%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2128
    :goto_0
    return-void

    .line 2126
    :cond_0
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    const-string v1, "&"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0
.end method

.method private varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 2168
    invoke-direct {p0, p1, p2}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2169
    iget-boolean v0, p0, Lagk;->d:Z

    if-nez v0, :cond_0

    .line 2170
    const-string v0, "\r\n"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2172
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;Laga;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    const/4 v6, 0x0

    .line 1965
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    instance-of v0, v0, Lahb;

    if-eqz v0, :cond_0

    .line 1966
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    check-cast v0, Lahb;

    invoke-interface {v0, p3}, Lahb;->a(Laga;)V

    .line 1969
    :cond_0
    invoke-static {p2}, Laga;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1970
    invoke-static {p2}, Laga;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1994
    :cond_1
    :goto_0
    return-void

    .line 1971
    :cond_2
    instance-of v0, p2, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    .line 1972
    check-cast p2, Landroid/graphics/Bitmap;

    .line 3040
    const-string v0, "image/png"

    invoke-direct {p0, p1, p1, v0}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3042
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    iget-object v2, p0, Lagk;->a:Ljava/io/OutputStream;

    invoke-virtual {p2, v0, v1, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 3043
    const-string v0, ""

    new-array v1, v6, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3044
    invoke-direct {p0}, Lagk;->b()V

    .line 3045
    iget-object v0, p0, Lagk;->b:Laiw;

    if-eqz v0, :cond_1

    .line 3046
    iget-object v1, p0, Lagk;->b:Laiw;

    const-string v2, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v2, "<Image>"

    invoke-virtual {v1, v0, v2}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    .line 1973
    :cond_4
    instance-of v0, p2, [B

    if-eqz v0, :cond_6

    .line 1974
    check-cast p2, [B

    .line 3051
    const-string v0, "content/unknown"

    invoke-direct {p0, p1, p1, v0}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3052
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    .line 3053
    const-string v0, ""

    new-array v1, v6, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3054
    invoke-direct {p0}, Lagk;->b()V

    .line 3055
    iget-object v0, p0, Lagk;->b:Laiw;

    if-eqz v0, :cond_1

    .line 3056
    iget-object v1, p0, Lagk;->b:Laiw;

    const-string v2, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "<Data: %d>"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    array-length v5, p2

    .line 3058
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 3056
    invoke-virtual {v1, v0, v2}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 1975
    :cond_6
    instance-of v0, p2, Landroid/net/Uri;

    if-eqz v0, :cond_7

    .line 1976
    check-cast p2, Landroid/net/Uri;

    invoke-direct {p0, p1, p2, v1}, Lagk;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1977
    :cond_7
    instance-of v0, p2, Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_8

    .line 1978
    check-cast p2, Landroid/os/ParcelFileDescriptor;

    invoke-direct {p0, p1, p2, v1}, Lagk;->a(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1979
    :cond_8
    instance-of v0, p2, Lagi;

    if-eqz v0, :cond_b

    .line 1980
    check-cast p2, Lagi;

    .line 3247
    iget-object v0, p2, Lagi;->b:Landroid/os/Parcelable;

    .line 4243
    iget-object v1, p2, Lagi;->a:Ljava/lang/String;

    .line 1984
    instance-of v2, v0, Landroid/os/ParcelFileDescriptor;

    if-eqz v2, :cond_9

    .line 1985
    check-cast v0, Landroid/os/ParcelFileDescriptor;

    invoke-direct {p0, p1, v0, v1}, Lagk;->a(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1986
    :cond_9
    instance-of v2, v0, Landroid/net/Uri;

    if-eqz v2, :cond_a

    .line 1987
    check-cast v0, Landroid/net/Uri;

    invoke-direct {p0, p1, v0, v1}, Lagk;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1989
    :cond_a
    invoke-static {}, Lagk;->a()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    .line 1992
    :cond_b
    invoke-static {}, Lagk;->a()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 2031
    invoke-direct {p0, p1, v0, v0}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2032
    const-string v0, "%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-direct {p0, v0, v1}, Lagk;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2033
    invoke-direct {p0}, Lagk;->b()V

    .line 2034
    iget-object v0, p0, Lagk;->b:Laiw;

    if-eqz v0, :cond_0

    .line 2035
    iget-object v1, p0, Lagk;->b:Laiw;

    const-string v2, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0, p2}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2037
    :cond_0
    return-void

    .line 2035
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 2005
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    instance-of v0, v0, Lahb;

    if-nez v0, :cond_1

    .line 2006
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2028
    :cond_0
    :goto_0
    return-void

    .line 2010
    :cond_1
    iget-object v0, p0, Lagk;->a:Ljava/io/OutputStream;

    check-cast v0, Lahb;

    .line 2011
    invoke-direct {p0, p1, v1, v1}, Lagk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2012
    const-string v1, "["

    new-array v2, v3, [Ljava/lang/Object;

    invoke-direct {p0, v1, v2}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2014
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v2, v3

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laga;

    .line 2015
    invoke-virtual {p2, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 2016
    invoke-interface {v0, v1}, Lahb;->a(Laga;)V

    .line 2017
    if-lez v2, :cond_2

    .line 2018
    const-string v1, ",%s"

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v3

    invoke-direct {p0, v1, v6}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2022
    :goto_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    .line 2023
    goto :goto_1

    .line 2020
    :cond_2
    const-string v1, "%s"

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v3

    invoke-direct {p0, v1, v6}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 2024
    :cond_3
    const-string v0, "]"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lagk;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2025
    iget-object v0, p0, Lagk;->b:Laiw;

    if-eqz v0, :cond_0

    .line 2026
    iget-object v1, p0, Lagk;->b:Laiw;

    const-string v2, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Laiw;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3
.end method
