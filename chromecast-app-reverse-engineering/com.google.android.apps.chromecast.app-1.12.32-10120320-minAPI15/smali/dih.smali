.class final Ldih;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ljava/util/List;

.field final b:Ldkd;

.field c:I

.field d:I

.field e:[Ldie;

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method constructor <init>(ILdkv;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldih;->a:Ljava/util/List;

    .line 122
    const/16 v0, 0x8

    new-array v0, v0, [Ldie;

    iput-object v0, p0, Ldih;->e:[Ldie;

    .line 124
    iget-object v0, p0, Ldih;->e:[Ldie;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ldih;->f:I

    .line 125
    iput v1, p0, Ldih;->g:I

    .line 126
    iput v1, p0, Ldih;->h:I

    .line 129
    iput p1, p0, Ldih;->c:I

    .line 130
    iput p1, p0, Ldih;->d:I

    .line 131
    invoke-static {p2}, Ldkk;->a(Ldkv;)Ldkd;

    move-result-object v0

    iput-object v0, p0, Ldih;->b:Ldkd;

    .line 132
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 162
    iget-object v0, p0, Ldih;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 163
    iget-object v0, p0, Ldih;->e:[Ldie;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Ldih;->e:[Ldie;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ldih;->f:I

    .line 165
    iput v2, p0, Ldih;->g:I

    .line 166
    iput v2, p0, Ldih;->h:I

    .line 167
    return-void
.end method

.method static c(I)Z
    .locals 1

    .prologue
    .line 278
    if-ltz p0, :cond_0

    invoke-static {}, Ldig;->a()[Ldie;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()I
    .locals 1

    .prologue
    .line 318
    iget-object v0, p0, Ldih;->b:Ldkd;

    invoke-interface {v0}, Ldkd;->g()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method private d(I)I
    .locals 6

    .prologue
    .line 171
    const/4 v1, 0x0

    .line 172
    if-lez p1, :cond_1

    .line 174
    iget-object v0, p0, Ldih;->e:[Ldie;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iget v2, p0, Ldih;->f:I

    if-lt v0, v2, :cond_0

    if-lez p1, :cond_0

    .line 175
    iget-object v2, p0, Ldih;->e:[Ldie;

    aget-object v2, v2, v0

    iget v2, v2, Ldie;->j:I

    sub-int/2addr p1, v2

    .line 176
    iget v2, p0, Ldih;->h:I

    iget-object v3, p0, Ldih;->e:[Ldie;

    aget-object v3, v3, v0

    iget v3, v3, Ldie;->j:I

    sub-int/2addr v2, v3

    iput v2, p0, Ldih;->h:I

    .line 177
    iget v2, p0, Ldih;->g:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ldih;->g:I

    .line 178
    add-int/lit8 v1, v1, 0x1

    .line 174
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 180
    :cond_0
    iget-object v0, p0, Ldih;->e:[Ldie;

    iget v2, p0, Ldih;->f:I

    add-int/lit8 v2, v2, 0x1

    iget-object v3, p0, Ldih;->e:[Ldie;

    iget v4, p0, Ldih;->f:I

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v4, v1

    iget v5, p0, Ldih;->g:I

    invoke-static {v0, v2, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    iget v0, p0, Ldih;->f:I

    add-int/2addr v0, v1

    iput v0, p0, Ldih;->f:I

    .line 184
    :cond_1
    return v1
.end method


# virtual methods
.method a(I)I
    .locals 1

    .prologue
    .line 241
    iget v0, p0, Ldih;->f:I

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p1

    return v0
.end method

.method final a(II)I
    .locals 3

    .prologue
    .line 322
    and-int v0, p1, p2

    .line 323
    if-ge v0, p2, :cond_0

    .line 340
    :goto_0
    return v0

    .line 329
    :cond_0
    const/4 v0, 0x0

    .line 331
    :goto_1
    invoke-direct {p0}, Ldih;->d()I

    move-result v1

    .line 332
    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_1

    .line 333
    and-int/lit8 v1, v1, 0x7f

    shl-int/2addr v1, v0

    add-int/2addr p2, v1

    .line 334
    add-int/lit8 v0, v0, 0x7

    goto :goto_1

    .line 336
    :cond_1
    shl-int v0, v1, v0

    add-int/2addr v0, p2

    .line 337
    goto :goto_0
.end method

.method a()V
    .locals 2

    .prologue
    .line 152
    iget v0, p0, Ldih;->d:I

    iget v1, p0, Ldih;->h:I

    if-ge v0, v1, :cond_0

    .line 153
    iget v0, p0, Ldih;->d:I

    if-nez v0, :cond_1

    .line 154
    invoke-direct {p0}, Ldih;->c()V

    .line 159
    :cond_0
    :goto_0
    return-void

    .line 156
    :cond_1
    iget v0, p0, Ldih;->h:I

    iget v1, p0, Ldih;->d:I

    sub-int/2addr v0, v1

    invoke-direct {p0, v0}, Ldih;->d(I)I

    goto :goto_0
.end method

.method a(ILdie;)V
    .locals 6

    .prologue
    .line 283
    iget-object v0, p0, Ldih;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 285
    iget v0, p2, Ldie;->j:I

    .line 291
    iget v1, p0, Ldih;->d:I

    if-le v0, v1, :cond_0

    .line 292
    invoke-direct {p0}, Ldih;->c()V

    .line 315
    :goto_0
    return-void

    .line 297
    :cond_0
    iget v1, p0, Ldih;->h:I

    add-int/2addr v1, v0

    iget v2, p0, Ldih;->d:I

    sub-int/2addr v1, v2

    .line 298
    invoke-direct {p0, v1}, Ldih;->d(I)I

    .line 301
    iget v1, p0, Ldih;->g:I

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Ldih;->e:[Ldie;

    array-length v2, v2

    if-le v1, v2, :cond_1

    .line 302
    iget-object v1, p0, Ldih;->e:[Ldie;

    array-length v1, v1

    shl-int/lit8 v1, v1, 0x1

    new-array v1, v1, [Ldie;

    .line 303
    iget-object v2, p0, Ldih;->e:[Ldie;

    const/4 v3, 0x0

    iget-object v4, p0, Ldih;->e:[Ldie;

    array-length v4, v4

    iget-object v5, p0, Ldih;->e:[Ldie;

    array-length v5, v5

    invoke-static {v2, v3, v1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 304
    iget-object v2, p0, Ldih;->e:[Ldie;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ldih;->f:I

    .line 305
    iput-object v1, p0, Ldih;->e:[Ldie;

    .line 307
    :cond_1
    iget v1, p0, Ldih;->f:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Ldih;->f:I

    .line 308
    iget-object v2, p0, Ldih;->e:[Ldie;

    aput-object p2, v2, v1

    .line 309
    iget v1, p0, Ldih;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ldih;->g:I

    .line 314
    iget v1, p0, Ldih;->h:I

    add-int/2addr v0, v1

    iput v0, p0, Ldih;->h:I

    goto :goto_0
.end method

.method final b()Ldke;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 345
    invoke-direct {p0}, Ldih;->d()I

    move-result v2

    .line 346
    and-int/lit16 v0, v2, 0x80

    const/16 v3, 0x80

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    .line 347
    :goto_0
    const/16 v3, 0x7f

    invoke-virtual {p0, v2, v3}, Ldih;->a(II)I

    move-result v2

    .line 349
    if-eqz v0, :cond_5

    .line 350
    invoke-static {}, Ldio;->a()Ldio;

    move-result-object v4

    iget-object v0, p0, Ldih;->b:Ldkd;

    int-to-long v2, v2

    invoke-interface {v0, v2, v3}, Ldkd;->e(J)[B

    move-result-object v5

    .line 1127
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1128
    iget-object v0, v4, Ldio;->a:Ldip;

    move v2, v1

    move-object v3, v0

    move v0, v1

    .line 1131
    :goto_1
    array-length v7, v5

    if-ge v1, v7, :cond_3

    .line 1132
    aget-byte v7, v5, v1

    and-int/lit16 v7, v7, 0xff

    .line 1133
    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v7

    .line 1134
    add-int/lit8 v0, v0, 0x8

    .line 1135
    :goto_2
    const/16 v7, 0x8

    if-lt v0, v7, :cond_2

    .line 1136
    add-int/lit8 v7, v0, -0x8

    ushr-int v7, v2, v7

    and-int/lit16 v7, v7, 0xff

    .line 1194
    iget-object v3, v3, Ldip;->a:[Ldip;

    .line 1137
    aget-object v3, v3, v7

    .line 2194
    iget-object v7, v3, Ldip;->a:[Ldip;

    .line 1138
    if-nez v7, :cond_1

    .line 3194
    iget v7, v3, Ldip;->b:I

    .line 1140
    invoke-virtual {v6, v7}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 4194
    iget v3, v3, Ldip;->c:I

    .line 1141
    sub-int/2addr v0, v3

    .line 1142
    iget-object v3, v4, Ldio;->a:Ldip;

    goto :goto_2

    :cond_0
    move v0, v1

    .line 346
    goto :goto_0

    .line 1145
    :cond_1
    add-int/lit8 v0, v0, -0x8

    .line 1147
    goto :goto_2

    .line 1131
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1150
    :cond_3
    :goto_3
    if-lez v0, :cond_4

    .line 1151
    rsub-int/lit8 v1, v0, 0x8

    shl-int v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    .line 5194
    iget-object v3, v3, Ldip;->a:[Ldip;

    .line 1152
    aget-object v1, v3, v1

    .line 6194
    iget-object v3, v1, Ldip;->a:[Ldip;

    .line 1153
    if-nez v3, :cond_4

    .line 7194
    iget v3, v1, Ldip;->c:I

    .line 1153
    if-gt v3, v0, :cond_4

    .line 8194
    iget v3, v1, Ldip;->b:I

    .line 1156
    invoke-virtual {v6, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 9194
    iget v1, v1, Ldip;->c:I

    .line 1157
    sub-int/2addr v0, v1

    .line 1158
    iget-object v3, v4, Ldio;->a:Ldip;

    goto :goto_3

    .line 1161
    :cond_4
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 350
    invoke-static {v0}, Ldke;->a([B)Ldke;

    move-result-object v0

    .line 352
    :goto_4
    return-object v0

    :cond_5
    iget-object v0, p0, Ldih;->b:Ldkd;

    int-to-long v2, v2

    invoke-interface {v0, v2, v3}, Ldkd;->c(J)Ldke;

    move-result-object v0

    goto :goto_4
.end method

.method b(I)Ldke;
    .locals 2

    .prologue
    .line 270
    invoke-static {p1}, Ldih;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    invoke-static {}, Ldig;->a()[Ldie;

    move-result-object v0

    aget-object v0, v0, p1

    iget-object v0, v0, Ldie;->h:Ldke;

    .line 273
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Ldih;->e:[Ldie;

    invoke-static {}, Ldig;->a()[Ldie;

    move-result-object v1

    array-length v1, v1

    sub-int v1, p1, v1

    invoke-virtual {p0, v1}, Ldih;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    iget-object v0, v0, Ldie;->h:Ldke;

    goto :goto_0
.end method
