.class public final Lawd;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Landroid/os/ParcelUuid;


# instance fields
.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/String;

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 61
    const-string v0, "0000FEA0-0000-1000-8000-00805F9B34FB"

    .line 62
    invoke-static {v0}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v0

    sput-object v0, Lawd;->a:Landroid/os/ParcelUuid;

    .line 61
    return-void
.end method

.method private constructor <init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V
    .locals 0

    .prologue
    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    iput-object p1, p0, Lawd;->b:Ljava/util/List;

    .line 169
    iput-object p6, p0, Lawd;->c:Ljava/lang/String;

    .line 172
    iput-object p7, p0, Lawd;->d:[B

    .line 173
    return-void
.end method

.method private static a([BIIILjava/util/List;)I
    .locals 1

    .prologue
    .line 282
    :goto_0
    if-lez p2, :cond_0

    .line 283
    invoke-static {p0, p1, p3}, Lawd;->a([BII)[B

    move-result-object v0

    .line 285
    invoke-static {v0}, Lavq;->a([B)Landroid/os/ParcelUuid;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    sub-int/2addr p2, p3

    .line 287
    add-int/2addr p1, p3

    .line 288
    goto :goto_0

    .line 289
    :cond_0
    return p1
.end method

.method public static a([B)Lawd;
    .locals 14

    .prologue
    const/4 v10, -0x1

    const/high16 v9, -0x80000000

    const/4 v8, 0x0

    .line 187
    if-nez p0, :cond_0

    move-object v0, v8

    .line 275
    :goto_0
    return-object v0

    .line 191
    :cond_0
    const/4 v0, 0x0

    .line 193
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 197
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 198
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    move v5, v9

    move-object v6, v8

    move v4, v10

    .line 201
    :goto_1
    :try_start_0
    array-length v7, p0

    if-ge v0, v7, :cond_1

    .line 203
    add-int/lit8 v7, v0, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    .line 204
    if-eqz v0, :cond_1

    .line 208
    add-int/lit8 v0, v0, -0x1

    .line 210
    add-int/lit8 v11, v7, 0x1

    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    .line 211
    sparse-switch v7, :sswitch_data_0

    .line 263
    :goto_2
    add-int/2addr v0, v11

    .line 264
    goto :goto_1

    .line 213
    :sswitch_0
    aget-byte v4, p0, v11

    and-int/lit16 v4, v4, 0xff

    .line 214
    goto :goto_2

    .line 217
    :sswitch_1
    const/4 v7, 0x2

    invoke-static {p0, v11, v0, v7, v1}, Lawd;->a([BIIILjava/util/List;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 272
    :catch_0
    move-exception v0

    const-string v1, "ScanRecord"

    const-string v2, "unable to parse scan record: "

    invoke-static {p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    new-instance v0, Lawd;

    move-object v1, v8

    move-object v2, v8

    move-object v3, v8

    move v4, v10

    move v5, v9

    move-object v6, v8

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, Lawd;-><init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V

    goto :goto_0

    .line 222
    :sswitch_2
    const/4 v7, 0x4

    :try_start_1
    invoke-static {p0, v11, v0, v7, v1}, Lawd;->a([BIIILjava/util/List;)I

    goto :goto_2

    .line 227
    :sswitch_3
    const/16 v7, 0x10

    invoke-static {p0, v11, v0, v7, v1}, Lawd;->a([BIIILjava/util/List;)I

    goto :goto_2

    .line 232
    :sswitch_4
    new-instance v6, Ljava/lang/String;

    .line 233
    invoke-static {p0, v11, v0}, Lawd;->a([BII)[B

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/String;-><init>([B)V

    goto :goto_2

    .line 236
    :sswitch_5
    aget-byte v5, p0, v11

    goto :goto_2

    .line 242
    :sswitch_6
    const/4 v7, 0x2

    invoke-static {p0, v11, v7}, Lawd;->a([BII)[B

    move-result-object v7

    .line 244
    invoke-static {v7}, Lavq;->a([B)Landroid/os/ParcelUuid;

    move-result-object v7

    .line 246
    add-int/lit8 v12, v11, 0x2

    add-int/lit8 v13, v0, -0x2

    invoke-static {p0, v12, v13}, Lawd;->a([BII)[B

    move-result-object v12

    .line 248
    invoke-interface {v3, v7, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 253
    :sswitch_7
    add-int/lit8 v7, v11, 0x1

    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x8

    aget-byte v12, p0, v11

    and-int/lit16 v12, v12, 0xff

    add-int/2addr v7, v12

    .line 255
    add-int/lit8 v12, v11, 0x2

    add-int/lit8 v13, v0, -0x2

    invoke-static {p0, v12, v13}, Lawd;->a([BII)[B

    move-result-object v12

    .line 257
    invoke-virtual {v2, v7, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_2

    .line 266
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v1, v8

    .line 269
    :cond_2
    new-instance v0, Lawd;

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, Lawd;-><init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0

    .line 272
    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    .line 211
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_1
        0x4 -> :sswitch_2
        0x5 -> :sswitch_2
        0x6 -> :sswitch_3
        0x7 -> :sswitch_3
        0x8 -> :sswitch_4
        0x9 -> :sswitch_4
        0xa -> :sswitch_5
        0x16 -> :sswitch_6
        0xff -> :sswitch_7
    .end sparse-switch
.end method

.method public static a([BII)[B
    .locals 2

    .prologue
    .line 294
    new-array v0, p2, [B

    .line 295
    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 296
    return-object v0
.end method
