.class public abstract Lder;
.super Ldew;
.source "PG"


# instance fields
.field public i:Ldes;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ldew;-><init>()V

    return-void
.end method

.method private b()Lder;
    .locals 1

    .prologue
    .line 165
    invoke-super {p0}, Ldew;->c()Ldew;

    move-result-object v0

    check-cast v0, Lder;

    .line 166
    invoke-static {p0, v0}, Ldeu;->a(Lder;Lder;)V

    .line 167
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 49
    .line 50
    iget-object v1, p0, Lder;->i:Ldes;

    if-eqz v1, :cond_0

    move v1, v0

    .line 51
    :goto_0
    iget-object v2, p0, Lder;->i:Ldes;

    .line 1178
    iget v2, v2, Ldes;->d:I

    .line 51
    if-ge v0, v2, :cond_1

    .line 52
    iget-object v2, p0, Lder;->i:Ldes;

    .line 1195
    iget-object v2, v2, Ldes;->c:[Ldet;

    aget-object v2, v2, v0

    .line 53
    invoke-virtual {v2}, Ldet;->a()I

    move-result v2

    add-int/2addr v1, v2

    .line 51
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 56
    :cond_1
    return v1
.end method

.method public a(Ldep;)V
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Lder;->i:Ldes;

    if-nez v0, :cond_1

    .line 68
    :cond_0
    return-void

    .line 64
    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lder;->i:Ldes;

    .line 2178
    iget v1, v1, Ldes;->d:I

    .line 64
    if-ge v0, v1, :cond_0

    .line 65
    iget-object v1, p0, Lder;->i:Ldes;

    .line 2195
    iget-object v1, v1, Ldes;->c:[Ldet;

    aget-object v1, v1, v0

    .line 66
    invoke-virtual {v1, p1}, Ldet;->a(Ldep;)V

    .line 64
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final a(Ldeo;I)Z
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 140
    invoke-virtual {p1}, Ldeo;->i()I

    move-result v3

    .line 141
    invoke-virtual {p1, p2}, Ldeo;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    .line 160
    :goto_0
    return v0

    .line 144
    :cond_0
    invoke-static {p2}, Ldey;->b(I)I

    move-result v4

    .line 145
    invoke-virtual {p1}, Ldeo;->i()I

    move-result v0

    .line 146
    sub-int v5, v0, v3

    .line 2553
    if-nez v5, :cond_2

    .line 2554
    sget-object v0, Ldey;->c:[B

    .line 147
    :goto_1
    new-instance v3, Ldex;

    invoke-direct {v3, p2, v0}, Ldex;-><init>(I[B)V

    .line 150
    iget-object v0, p0, Lder;->i:Ldes;

    if-nez v0, :cond_3

    .line 151
    new-instance v0, Ldes;

    invoke-direct {v0}, Ldes;-><init>()V

    iput-object v0, p0, Lder;->i:Ldes;

    move-object v0, v1

    .line 155
    :goto_2
    if-nez v0, :cond_1

    .line 156
    new-instance v0, Ldet;

    invoke-direct {v0}, Ldet;-><init>()V

    .line 157
    iget-object v1, p0, Lder;->i:Ldes;

    .line 3125
    invoke-virtual {v1, v4}, Ldes;->b(I)I

    move-result v5

    .line 3127
    if-ltz v5, :cond_6

    .line 3128
    iget-object v1, v1, Ldes;->c:[Ldet;

    aput-object v0, v1, v5

    .line 4058
    :cond_1
    :goto_3
    iget-object v0, v0, Ldet;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    const/4 v0, 0x1

    goto :goto_0

    .line 2556
    :cond_2
    new-array v0, v5, [B

    .line 2557
    iget v6, p1, Ldeo;->b:I

    add-int/2addr v3, v6

    .line 2558
    iget-object v6, p1, Ldeo;->a:[B

    invoke-static {v6, v3, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 153
    :cond_3
    iget-object v0, p0, Lder;->i:Ldes;

    .line 3075
    invoke-virtual {v0, v4}, Ldes;->b(I)I

    move-result v5

    .line 3077
    if-ltz v5, :cond_4

    iget-object v6, v0, Ldes;->c:[Ldet;

    aget-object v6, v6, v5

    sget-object v7, Ldes;->a:Ldet;

    if-ne v6, v7, :cond_5

    :cond_4
    move-object v0, v1

    .line 3078
    goto :goto_2

    .line 3080
    :cond_5
    iget-object v0, v0, Ldes;->c:[Ldet;

    aget-object v0, v0, v5

    goto :goto_2

    .line 3130
    :cond_6
    xor-int/lit8 v5, v5, -0x1

    .line 3132
    iget v6, v1, Ldes;->d:I

    if-ge v5, v6, :cond_7

    iget-object v6, v1, Ldes;->c:[Ldet;

    aget-object v6, v6, v5

    sget-object v7, Ldes;->a:Ldet;

    if-ne v6, v7, :cond_7

    .line 3133
    iget-object v2, v1, Ldes;->b:[I

    aput v4, v2, v5

    .line 3134
    iget-object v1, v1, Ldes;->c:[Ldet;

    aput-object v0, v1, v5

    goto :goto_3

    .line 3145
    :cond_7
    iget v6, v1, Ldes;->d:I

    iget-object v7, v1, Ldes;->b:[I

    array-length v7, v7

    if-lt v6, v7, :cond_8

    .line 3146
    iget v6, v1, Ldes;->d:I

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v1, v6}, Ldes;->a(I)I

    move-result v6

    .line 3148
    new-array v7, v6, [I

    .line 3149
    new-array v6, v6, [Ldet;

    .line 3151
    iget-object v8, v1, Ldes;->b:[I

    iget-object v9, v1, Ldes;->b:[I

    array-length v9, v9

    invoke-static {v8, v2, v7, v2, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3152
    iget-object v8, v1, Ldes;->c:[Ldet;

    iget-object v9, v1, Ldes;->c:[Ldet;

    array-length v9, v9

    invoke-static {v8, v2, v6, v2, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3154
    iput-object v7, v1, Ldes;->b:[I

    .line 3155
    iput-object v6, v1, Ldes;->c:[Ldet;

    .line 3158
    :cond_8
    iget v2, v1, Ldes;->d:I

    sub-int/2addr v2, v5

    if-eqz v2, :cond_9

    .line 3159
    iget-object v2, v1, Ldes;->b:[I

    iget-object v6, v1, Ldes;->b:[I

    add-int/lit8 v7, v5, 0x1

    iget v8, v1, Ldes;->d:I

    sub-int/2addr v8, v5

    invoke-static {v2, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3160
    iget-object v2, v1, Ldes;->c:[Ldet;

    iget-object v6, v1, Ldes;->c:[Ldet;

    add-int/lit8 v7, v5, 0x1

    iget v8, v1, Ldes;->d:I

    sub-int/2addr v8, v5

    invoke-static {v2, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3163
    :cond_9
    iget-object v2, v1, Ldes;->b:[I

    aput v4, v2, v5

    .line 3164
    iget-object v2, v1, Ldes;->c:[Ldet;

    aput-object v0, v2, v5

    .line 3165
    iget v2, v1, Ldes;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Ldes;->d:I

    goto/16 :goto_3
.end method

.method public final synthetic c()Ldew;
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lder;->b()Lder;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Lder;->b()Lder;

    move-result-object v0

    return-object v0
.end method
