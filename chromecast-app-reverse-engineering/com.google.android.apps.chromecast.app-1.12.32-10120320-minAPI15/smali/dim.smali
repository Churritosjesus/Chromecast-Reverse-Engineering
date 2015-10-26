.class final Ldim;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldib;


# instance fields
.field private final a:Ldkd;

.field private final b:Ldik;

.field private final c:Z

.field private d:Ldih;


# direct methods
.method constructor <init>(Ldkd;IZ)V
    .locals 3

    .prologue
    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, Ldim;->a:Ldkd;

    .line 97
    iput-boolean p3, p0, Ldim;->c:Z

    .line 98
    new-instance v0, Ldik;

    iget-object v1, p0, Ldim;->a:Ldkd;

    invoke-direct {v0, v1}, Ldik;-><init>(Ldkd;)V

    iput-object v0, p0, Ldim;->b:Ldik;

    .line 99
    new-instance v0, Ldih;

    const/16 v1, 0x1000

    iget-object v2, p0, Ldim;->b:Ldik;

    invoke-direct {v0, v1, v2}, Ldih;-><init>(ILdkv;)V

    iput-object v0, p0, Ldim;->d:Ldih;

    .line 100
    return-void
.end method

.method private a(ISBI)Ljava/util/List;
    .locals 8

    .prologue
    const/16 v7, 0x80

    const/16 v6, 0x40

    const/4 v5, -0x1

    .line 205
    iget-object v0, p0, Ldim;->b:Ldik;

    iget-object v1, p0, Ldim;->b:Ldik;

    iput p1, v1, Ldik;->d:I

    iput p1, v0, Ldik;->a:I

    .line 206
    iget-object v0, p0, Ldim;->b:Ldik;

    iput-short p2, v0, Ldik;->e:S

    .line 207
    iget-object v0, p0, Ldim;->b:Ldik;

    iput-byte p3, v0, Ldik;->b:B

    .line 208
    iget-object v0, p0, Ldim;->b:Ldik;

    iput p4, v0, Ldik;->c:I

    .line 212
    iget-object v0, p0, Ldim;->d:Ldih;

    .line 5192
    :goto_0
    iget-object v1, v0, Ldih;->b:Ldkd;

    invoke-interface {v1}, Ldkd;->e()Z

    move-result v1

    if-nez v1, :cond_c

    .line 5193
    iget-object v1, v0, Ldih;->b:Ldkd;

    invoke-interface {v1}, Ldkd;->g()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    .line 5194
    if-ne v1, v7, :cond_0

    .line 5195
    new-instance v0, Ljava/io/IOException;

    const-string v1, "index == 0"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5196
    :cond_0
    and-int/lit16 v2, v1, 0x80

    if-ne v2, v7, :cond_4

    .line 5197
    const/16 v2, 0x7f

    invoke-virtual {v0, v1, v2}, Ldih;->a(II)I

    move-result v1

    .line 5198
    add-int/lit8 v1, v1, -0x1

    .line 5227
    invoke-static {v1}, Ldih;->c(I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5228
    invoke-static {}, Ldig;->a()[Ldie;

    move-result-object v2

    aget-object v1, v2, v1

    .line 5229
    iget-object v2, v0, Ldih;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5231
    :cond_1
    invoke-static {}, Ldig;->a()[Ldie;

    move-result-object v2

    array-length v2, v2

    sub-int v2, v1, v2

    invoke-virtual {v0, v2}, Ldih;->a(I)I

    move-result v2

    .line 5232
    if-ltz v2, :cond_2

    iget-object v3, v0, Ldih;->e:[Ldie;

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    if-le v2, v3, :cond_3

    .line 5233
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Header index too large "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5235
    :cond_3
    iget-object v1, v0, Ldih;->a:Ljava/util/List;

    iget-object v3, v0, Ldih;->e:[Ldie;

    aget-object v2, v3, v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 5199
    :cond_4
    if-ne v1, v6, :cond_5

    .line 5264
    invoke-virtual {v0}, Ldih;->b()Ldke;

    move-result-object v1

    invoke-static {v1}, Ldig;->a(Ldke;)Ldke;

    move-result-object v1

    .line 5265
    invoke-virtual {v0}, Ldih;->b()Ldke;

    move-result-object v2

    .line 5266
    new-instance v3, Ldie;

    invoke-direct {v3, v1, v2}, Ldie;-><init>(Ldke;Ldke;)V

    invoke-virtual {v0, v5, v3}, Ldih;->a(ILdie;)V

    goto/16 :goto_0

    .line 5201
    :cond_5
    and-int/lit8 v2, v1, 0x40

    if-ne v2, v6, :cond_6

    .line 5202
    const/16 v2, 0x3f

    invoke-virtual {v0, v1, v2}, Ldih;->a(II)I

    move-result v1

    .line 5203
    add-int/lit8 v1, v1, -0x1

    .line 6258
    invoke-virtual {v0, v1}, Ldih;->b(I)Ldke;

    move-result-object v1

    .line 6259
    invoke-virtual {v0}, Ldih;->b()Ldke;

    move-result-object v2

    .line 6260
    new-instance v3, Ldie;

    invoke-direct {v3, v1, v2}, Ldie;-><init>(Ldke;Ldke;)V

    invoke-virtual {v0, v5, v3}, Ldih;->a(ILdie;)V

    goto/16 :goto_0

    .line 5204
    :cond_6
    and-int/lit8 v2, v1, 0x20

    const/16 v3, 0x20

    if-ne v2, v3, :cond_9

    .line 5205
    const/16 v2, 0x1f

    invoke-virtual {v0, v1, v2}, Ldih;->a(II)I

    move-result v1

    iput v1, v0, Ldih;->d:I

    .line 5206
    iget v1, v0, Ldih;->d:I

    if-ltz v1, :cond_7

    iget v1, v0, Ldih;->d:I

    iget v2, v0, Ldih;->c:I

    if-le v1, v2, :cond_8

    .line 5208
    :cond_7
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid dynamic table size update "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Ldih;->d:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5210
    :cond_8
    invoke-virtual {v0}, Ldih;->a()V

    goto/16 :goto_0

    .line 5211
    :cond_9
    const/16 v2, 0x10

    if-eq v1, v2, :cond_a

    if-nez v1, :cond_b

    .line 7251
    :cond_a
    invoke-virtual {v0}, Ldih;->b()Ldke;

    move-result-object v1

    invoke-static {v1}, Ldig;->a(Ldke;)Ldke;

    move-result-object v1

    .line 7252
    invoke-virtual {v0}, Ldih;->b()Ldke;

    move-result-object v2

    .line 7253
    iget-object v3, v0, Ldih;->a:Ljava/util/List;

    new-instance v4, Ldie;

    invoke-direct {v4, v1, v2}, Ldie;-><init>(Ldke;Ldke;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 5214
    :cond_b
    const/16 v2, 0xf

    invoke-virtual {v0, v1, v2}, Ldih;->a(II)I

    move-result v1

    .line 5215
    add-int/lit8 v1, v1, -0x1

    .line 8245
    invoke-virtual {v0, v1}, Ldih;->b(I)Ldke;

    move-result-object v1

    .line 8246
    invoke-virtual {v0}, Ldih;->b()Ldke;

    move-result-object v2

    .line 8247
    iget-object v3, v0, Ldih;->a:Ljava/util/List;

    new-instance v4, Ldie;

    invoke-direct {v4, v1, v2}, Ldie;-><init>(Ldke;Ldke;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 213
    :cond_c
    iget-object v0, p0, Ldim;->d:Ldih;

    .line 9221
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Ldih;->a:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9222
    iget-object v0, v0, Ldih;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 213
    return-object v1
.end method

.method private a(Ldic;I)V
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-interface {v0}, Ldkd;->i()I

    .line 243
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-interface {v0}, Ldkd;->g()B

    .line 245
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 103
    iget-boolean v0, p0, Ldim;->c:Z

    if-eqz v0, :cond_1

    .line 109
    :cond_0
    return-void

    .line 104
    :cond_1
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-static {}, Ldij;->a()Ldke;

    move-result-object v1

    .line 1281
    iget-object v1, v1, Ldke;->b:[B

    array-length v1, v1

    .line 104
    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Ldkd;->c(J)Ldke;

    move-result-object v0

    .line 105
    invoke-static {}, Ldij;->b()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Ldij;->b()Ljava/util/logging/Logger;

    move-result-object v1

    const-string v2, "<< CONNECTION %s"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Ldke;->b()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 106
    :cond_2
    invoke-static {}, Ldij;->a()Ldke;

    move-result-object v1

    invoke-virtual {v1, v0}, Ldke;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 107
    const-string v1, "Expected a connection header but was %s"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Ldke;->a()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v5

    invoke-static {v1, v2}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final a(Ldic;)Z
    .locals 11

    .prologue
    const/16 v10, 0x4000

    const/16 v9, 0x8

    const/4 v4, 0x4

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 113
    :try_start_0
    iget-object v0, p0, Ldim;->a:Ldkd;

    const-wide/16 v2, 0x9

    invoke-interface {v0, v2, v3}, Ldkd;->a(J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-static {v0}, Ldij;->a(Ldkd;)I

    move-result v0

    .line 131
    if-ltz v0, :cond_0

    if-le v0, v10, :cond_2

    .line 132
    :cond_0
    const-string v2, "FRAME_SIZE_ERROR: %s"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 115
    :catch_0
    move-exception v0

    move v6, v1

    .line 180
    :cond_1
    :goto_0
    return v6

    .line 134
    :cond_2
    iget-object v2, p0, Ldim;->a:Ldkd;

    invoke-interface {v2}, Ldkd;->g()B

    move-result v2

    int-to-byte v2, v2

    .line 135
    iget-object v3, p0, Ldim;->a:Ldkd;

    invoke-interface {v3}, Ldkd;->g()B

    move-result v3

    int-to-byte v5, v3

    .line 136
    iget-object v3, p0, Ldim;->a:Ldkd;

    invoke-interface {v3}, Ldkd;->i()I

    move-result v3

    const v7, 0x7fffffff

    and-int/2addr v3, v7

    .line 137
    invoke-static {}, Ldij;->b()Ljava/util/logging/Logger;

    move-result-object v7

    sget-object v8, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v7, v8}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-static {}, Ldij;->b()Ljava/util/logging/Logger;

    move-result-object v7

    invoke-static {v6, v3, v0, v2, v5}, Ldil;->a(ZIIBB)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 139
    :cond_3
    packed-switch v2, :pswitch_data_0

    .line 178
    iget-object v1, p0, Ldim;->a:Ldkd;

    int-to-long v2, v0

    invoke-interface {v1, v2, v3}, Ldkd;->f(J)V

    goto :goto_0

    .line 2219
    :pswitch_0
    and-int/lit8 v2, v5, 0x1

    if-eqz v2, :cond_4

    move v4, v6

    .line 2220
    :goto_1
    and-int/lit8 v2, v5, 0x20

    if-eqz v2, :cond_5

    move v2, v6

    .line 2221
    :goto_2
    if-eqz v2, :cond_6

    .line 2222
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_4
    move v4, v1

    .line 2219
    goto :goto_1

    :cond_5
    move v2, v1

    .line 2220
    goto :goto_2

    .line 2225
    :cond_6
    and-int/lit8 v2, v5, 0x8

    if-eqz v2, :cond_7

    iget-object v1, p0, Ldim;->a:Ldkd;

    invoke-interface {v1}, Ldkd;->g()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-short v1, v1

    .line 2226
    :cond_7
    invoke-static {v0, v5, v1}, Ldij;->a(IBS)I

    move-result v0

    .line 2228
    iget-object v2, p0, Ldim;->a:Ldkd;

    invoke-interface {p1, v4, v3, v2, v0}, Ldic;->a(ZILdkd;I)V

    .line 2229
    iget-object v0, p0, Ldim;->a:Ldkd;

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Ldkd;->f(J)V

    goto :goto_0

    .line 3185
    :pswitch_1
    if-nez v3, :cond_8

    const-string v0, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3187
    :cond_8
    and-int/lit8 v2, v5, 0x1

    if-eqz v2, :cond_a

    move v2, v6

    .line 3189
    :goto_3
    and-int/lit8 v4, v5, 0x8

    if-eqz v4, :cond_b

    iget-object v4, p0, Ldim;->a:Ldkd;

    invoke-interface {v4}, Ldkd;->g()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    int-to-short v4, v4

    .line 3191
    :goto_4
    and-int/lit8 v7, v5, 0x20

    if-eqz v7, :cond_9

    .line 3192
    invoke-direct {p0, p1, v3}, Ldim;->a(Ldic;I)V

    .line 3193
    add-int/lit8 v0, v0, -0x5

    .line 3196
    :cond_9
    invoke-static {v0, v5, v4}, Ldij;->a(IBS)I

    move-result v0

    .line 3198
    invoke-direct {p0, v0, v4, v5, v3}, Ldim;->a(ISBI)Ljava/util/List;

    move-result-object v4

    .line 3200
    sget-object v5, Ldif;->d:Ldif;

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Ldic;->a(ZZILjava/util/List;Ldif;)V

    goto/16 :goto_0

    :cond_a
    move v2, v1

    .line 3187
    goto :goto_3

    :cond_b
    move v4, v1

    .line 3189
    goto :goto_4

    .line 3234
    :pswitch_2
    const/4 v2, 0x5

    if-eq v0, v2, :cond_c

    const-string v2, "TYPE_PRIORITY length: %d != 5"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3235
    :cond_c
    if-nez v3, :cond_d

    const-string v0, "TYPE_PRIORITY streamId == 0"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3236
    :cond_d
    invoke-direct {p0, p1, v3}, Ldim;->a(Ldic;I)V

    goto/16 :goto_0

    .line 3249
    :pswitch_3
    if-eq v0, v4, :cond_e

    const-string v2, "TYPE_RST_STREAM length: %d != 4"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3250
    :cond_e
    if-nez v3, :cond_f

    const-string v0, "TYPE_RST_STREAM streamId == 0"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3251
    :cond_f
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-interface {v0}, Ldkd;->i()I

    move-result v0

    .line 3252
    invoke-static {v0}, Ldia;->b(I)Ldia;

    move-result-object v2

    .line 3253
    if-nez v2, :cond_10

    .line 3254
    const-string v2, "TYPE_RST_STREAM unexpected error code: %d"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3256
    :cond_10
    invoke-interface {p1, v3, v2}, Ldic;->a(ILdia;)V

    goto/16 :goto_0

    .line 3261
    :pswitch_4
    if-eqz v3, :cond_11

    const-string v0, "TYPE_SETTINGS streamId != 0"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3262
    :cond_11
    and-int/lit8 v2, v5, 0x1

    if-eqz v2, :cond_12

    .line 3263
    if-eqz v0, :cond_1

    const-string v0, "FRAME_SIZE_ERROR ack frame should be empty!"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3268
    :cond_12
    rem-int/lit8 v2, v0, 0x6

    if-eqz v2, :cond_13

    const-string v2, "TYPE_SETTINGS length %% 6 != 0: %s"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3269
    :cond_13
    new-instance v5, Ldix;

    invoke-direct {v5}, Ldix;-><init>()V

    move v3, v1

    .line 3270
    :goto_5
    if-ge v3, v0, :cond_16

    .line 3271
    iget-object v2, p0, Ldim;->a:Ldkd;

    invoke-interface {v2}, Ldkd;->h()S

    move-result v2

    .line 3272
    iget-object v7, p0, Ldim;->a:Ldkd;

    invoke-interface {v7}, Ldkd;->i()I

    move-result v7

    .line 3274
    packed-switch v2, :pswitch_data_1

    .line 3299
    const-string v0, "PROTOCOL_ERROR invalid settings id: %s"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-static {v0, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3278
    :pswitch_5
    if-eqz v7, :cond_14

    if-eq v7, v6, :cond_14

    .line 3279
    const-string v0, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :pswitch_6
    move v2, v4

    .line 3301
    :cond_14
    :pswitch_7
    invoke-virtual {v5, v2, v1, v7}, Ldix;->a(III)Ldix;

    .line 3270
    add-int/lit8 v2, v3, 0x6

    move v3, v2

    goto :goto_5

    .line 3286
    :pswitch_8
    const/4 v2, 0x7

    .line 3287
    if-gez v7, :cond_14

    .line 3288
    const-string v0, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3292
    :pswitch_9
    if-lt v7, v10, :cond_15

    const v8, 0xffffff

    if-le v7, v8, :cond_14

    .line 3293
    :cond_15
    const-string v0, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 3303
    :cond_16
    invoke-interface {p1, v1, v5}, Ldic;->a(ZLdix;)V

    .line 3304
    invoke-virtual {v5}, Ldix;->a()I

    move-result v0

    if-ltz v0, :cond_1

    .line 3305
    iget-object v0, p0, Ldim;->d:Ldih;

    invoke-virtual {v5}, Ldix;->a()I

    move-result v1

    .line 4146
    iput v1, v0, Ldih;->c:I

    .line 4147
    iput v1, v0, Ldih;->d:I

    .line 4148
    invoke-virtual {v0}, Ldih;->a()V

    goto/16 :goto_0

    .line 4311
    :pswitch_a
    if-nez v3, :cond_17

    .line 4312
    const-string v0, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4314
    :cond_17
    and-int/lit8 v2, v5, 0x8

    if-eqz v2, :cond_18

    iget-object v1, p0, Ldim;->a:Ldkd;

    invoke-interface {v1}, Ldkd;->g()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-short v1, v1

    .line 4315
    :cond_18
    iget-object v2, p0, Ldim;->a:Ldkd;

    invoke-interface {v2}, Ldkd;->i()I

    move-result v2

    const v4, 0x7fffffff

    and-int/2addr v2, v4

    .line 4316
    add-int/lit8 v0, v0, -0x4

    .line 4317
    invoke-static {v0, v5, v1}, Ldij;->a(IBS)I

    move-result v0

    .line 4318
    invoke-direct {p0, v0, v1, v5, v3}, Ldim;->a(ISBI)Ljava/util/List;

    move-result-object v0

    .line 4319
    invoke-interface {p1, v2, v0}, Ldic;->a(ILjava/util/List;)V

    goto/16 :goto_0

    .line 4324
    :pswitch_b
    if-eq v0, v9, :cond_19

    const-string v2, "TYPE_PING length != 8: %s"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4325
    :cond_19
    if-eqz v3, :cond_1a

    const-string v0, "TYPE_PING streamId != 0"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4326
    :cond_1a
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-interface {v0}, Ldkd;->i()I

    move-result v0

    .line 4327
    iget-object v2, p0, Ldim;->a:Ldkd;

    invoke-interface {v2}, Ldkd;->i()I

    move-result v2

    .line 4328
    and-int/lit8 v3, v5, 0x1

    if-eqz v3, :cond_1b

    move v1, v6

    .line 4329
    :cond_1b
    invoke-interface {p1, v1, v0, v2}, Ldic;->a(ZII)V

    goto/16 :goto_0

    .line 4334
    :pswitch_c
    if-ge v0, v9, :cond_1c

    const-string v2, "TYPE_GOAWAY length < 8: %s"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4335
    :cond_1c
    if-eqz v3, :cond_1d

    const-string v0, "TYPE_GOAWAY streamId != 0"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4336
    :cond_1d
    iget-object v2, p0, Ldim;->a:Ldkd;

    invoke-interface {v2}, Ldkd;->i()I

    move-result v2

    .line 4337
    iget-object v3, p0, Ldim;->a:Ldkd;

    invoke-interface {v3}, Ldkd;->i()I

    move-result v3

    .line 4338
    add-int/lit8 v4, v0, -0x8

    .line 4339
    invoke-static {v3}, Ldia;->b(I)Ldia;

    move-result-object v0

    .line 4340
    if-nez v0, :cond_1e

    .line 4341
    const-string v0, "TYPE_GOAWAY unexpected error code: %d"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4343
    :cond_1e
    sget-object v0, Ldke;->a:Ldke;

    .line 4344
    if-lez v4, :cond_1f

    .line 4345
    iget-object v0, p0, Ldim;->a:Ldkd;

    int-to-long v4, v4

    invoke-interface {v0, v4, v5}, Ldkd;->c(J)Ldke;

    move-result-object v0

    .line 4347
    :cond_1f
    invoke-interface {p1, v2, v0}, Ldic;->a(ILdke;)V

    goto/16 :goto_0

    .line 4352
    :pswitch_d
    if-eq v0, v4, :cond_20

    const-string v2, "TYPE_WINDOW_UPDATE length !=4: %s"

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    invoke-static {v2, v3}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4353
    :cond_20
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-interface {v0}, Ldkd;->i()I

    move-result v0

    int-to-long v4, v0

    const-wide/32 v8, 0x7fffffff

    and-long/2addr v4, v8

    .line 4354
    const-wide/16 v8, 0x0

    cmp-long v0, v4, v8

    if-nez v0, :cond_21

    const-string v0, "windowSizeIncrement was 0"

    new-array v2, v6, [Ljava/lang/Object;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ldij;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    .line 4355
    :cond_21
    invoke-interface {p1, v3, v4, v5}, Ldic;->a(IJ)V

    goto/16 :goto_0

    .line 139
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch

    .line 3274
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_5
        :pswitch_6
        :pswitch_8
        :pswitch_9
        :pswitch_7
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    .prologue
    .line 359
    iget-object v0, p0, Ldim;->a:Ldkd;

    invoke-interface {v0}, Ldkd;->close()V

    .line 360
    return-void
.end method
