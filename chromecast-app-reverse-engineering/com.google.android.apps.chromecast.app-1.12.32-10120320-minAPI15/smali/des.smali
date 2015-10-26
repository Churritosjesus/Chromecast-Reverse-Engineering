.class public final Ldes;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field static final a:Ldet;


# instance fields
.field b:[I

.field c:[Ldet;

.field d:I

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    new-instance v0, Ldet;

    invoke-direct {v0}, Ldet;-><init>()V

    sput-object v0, Ldes;->a:Ldet;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .prologue
    .line 55
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Ldes;-><init>(I)V

    .line 56
    return-void
.end method

.method private constructor <init>(I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-boolean v2, p0, Ldes;->e:Z

    .line 64
    invoke-virtual {p0, p1}, Ldes;->a(I)I

    move-result v0

    .line 65
    new-array v1, v0, [I

    iput-object v1, p0, Ldes;->b:[I

    .line 66
    new-array v0, v0, [Ldet;

    iput-object v0, p0, Ldes;->c:[Ldet;

    .line 67
    iput v2, p0, Ldes;->d:I

    .line 68
    return-void
.end method


# virtual methods
.method a(I)I
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 229
    shl-int/lit8 v0, p1, 0x2

    .line 3233
    const/4 v1, 0x4

    :goto_0
    const/16 v2, 0x20

    if-ge v1, v2, :cond_0

    .line 3234
    shl-int v2, v3, v1

    add-int/lit8 v2, v2, -0xc

    if-gt v0, v2, :cond_1

    .line 3235
    shl-int v0, v3, v1

    add-int/lit8 v0, v0, -0xc

    .line 229
    :cond_0
    div-int/lit8 v0, v0, 0x4

    return v0

    .line 3233
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public final a()Ldes;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 280
    .line 4178
    iget v1, p0, Ldes;->d:I

    .line 281
    new-instance v2, Ldes;

    invoke-direct {v2, v1}, Ldes;-><init>(I)V

    .line 282
    iget-object v3, p0, Ldes;->b:[I

    iget-object v4, v2, Ldes;->b:[I

    invoke-static {v3, v0, v4, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 283
    :goto_0
    if-ge v0, v1, :cond_1

    .line 284
    iget-object v3, p0, Ldes;->c:[Ldet;

    aget-object v3, v3, v0

    if-eqz v3, :cond_0

    .line 285
    iget-object v3, v2, Ldes;->c:[Ldet;

    iget-object v4, p0, Ldes;->c:[Ldet;

    aget-object v4, v4, v0

    invoke-virtual {v4}, Ldet;->b()Ldet;

    move-result-object v4

    aput-object v4, v3, v0

    .line 283
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 288
    :cond_1
    iput v1, v2, Ldes;->d:I

    .line 289
    return-object v2
.end method

.method b(I)I
    .locals 4

    .prologue
    .line 241
    const/4 v1, 0x0

    .line 242
    iget v0, p0, Ldes;->d:I

    add-int/lit8 v0, v0, -0x1

    move v2, v1

    move v1, v0

    .line 244
    :goto_0
    if-gt v2, v1, :cond_1

    .line 245
    add-int v0, v2, v1

    ushr-int/lit8 v0, v0, 0x1

    .line 246
    iget-object v3, p0, Ldes;->b:[I

    aget v3, v3, v0

    .line 248
    if-ge v3, p1, :cond_0

    .line 249
    add-int/lit8 v0, v0, 0x1

    move v2, v0

    goto :goto_0

    .line 250
    :cond_0
    if-le v3, p1, :cond_2

    .line 251
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    goto :goto_0

    .line 256
    :cond_1
    xor-int/lit8 v0, v2, -0x1

    :cond_2
    return v0
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0}, Ldes;->a()Ldes;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 200
    if-ne p1, p0, :cond_1

    .line 212
    :cond_0
    :goto_0
    return v0

    .line 203
    :cond_1
    instance-of v2, p1, Ldes;

    if-nez v2, :cond_2

    move v0, v1

    .line 204
    goto :goto_0

    .line 207
    :cond_2
    check-cast p1, Ldes;

    .line 1178
    iget v2, p0, Ldes;->d:I

    .line 2178
    iget v3, p1, Ldes;->d:I

    .line 208
    if-eq v2, v3, :cond_3

    move v0, v1

    .line 209
    goto :goto_0

    .line 211
    :cond_3
    iget-object v3, p0, Ldes;->b:[I

    iget-object v4, p1, Ldes;->b:[I

    iget v5, p0, Ldes;->d:I

    move v2, v1

    .line 2260
    :goto_1
    if-ge v2, v5, :cond_6

    .line 2261
    aget v6, v3, v2

    aget v7, v4, v2

    if-eq v6, v7, :cond_5

    move v2, v1

    .line 211
    :goto_2
    if-eqz v2, :cond_4

    iget-object v3, p0, Ldes;->c:[Ldet;

    iget-object v4, p1, Ldes;->c:[Ldet;

    iget v5, p0, Ldes;->d:I

    move v2, v1

    .line 2269
    :goto_3
    if-ge v2, v5, :cond_8

    .line 2270
    aget-object v6, v3, v2

    aget-object v7, v4, v2

    invoke-virtual {v6, v7}, Ldet;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    move v2, v1

    .line 212
    :goto_4
    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0

    .line 2260
    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    move v2, v0

    .line 2265
    goto :goto_2

    .line 2269
    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    move v2, v0

    .line 2274
    goto :goto_4
.end method

.method public final hashCode()I
    .locals 3

    .prologue
    .line 220
    const/16 v1, 0x11

    .line 221
    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Ldes;->d:I

    if-ge v0, v2, :cond_0

    .line 222
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ldes;->b:[I

    aget v2, v2, v0

    add-int/2addr v1, v2

    .line 223
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Ldes;->c:[Ldet;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ldet;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    .line 221
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 225
    :cond_0
    return v1
.end method
