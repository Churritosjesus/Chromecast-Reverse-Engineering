.class public abstract Lcmm;
.super Lcms;


# instance fields
.field public m:Lcmo;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcms;-><init>()V

    return-void
.end method

.method private b()Lcmm;
    .locals 1

    invoke-super {p0}, Lcms;->d()Lcms;

    move-result-object v0

    check-cast v0, Lcmm;

    invoke-static {p0, v0}, Lcmq;->a(Lcmm;Lcmm;)V

    return-object v0
.end method


# virtual methods
.method protected a()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 0
    iget-object v1, p0, Lcmm;->m:Lcmo;

    if-eqz v1, :cond_0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcmm;->m:Lcmo;

    .line 1000
    iget v2, v2, Lcmo;->d:I

    .line 0
    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcmm;->m:Lcmo;

    .line 2000
    iget-object v2, v2, Lcmo;->c:[Lcmp;

    aget-object v2, v2, v0

    .line 0
    invoke-virtual {v2}, Lcmp;->a()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :cond_1
    return v1
.end method

.method public final a(Lcmn;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 0
    iget-object v0, p0, Lcmm;->m:Lcmo;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-object v1

    :cond_1
    iget-object v0, p0, Lcmm;->m:Lcmo;

    iget v2, p1, Lcmn;->b:I

    invoke-static {v2}, Lcmu;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcmo;->a(I)Lcmp;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5000
    iget-object v0, v2, Lcmp;->b:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, v2, Lcmp;->a:Lcmn;

    if-eq v0, p1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Tried to getExtension with a differernt Extension."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iput-object p1, v2, Lcmp;->a:Lcmn;

    iget-object v0, v2, Lcmp;->c:Ljava/util/List;

    .line 6000
    if-nez v0, :cond_4

    move-object v0, v1

    .line 5000
    :goto_1
    iput-object v0, v2, Lcmp;->b:Ljava/lang/Object;

    iput-object v1, v2, Lcmp;->c:Ljava/util/List;

    :cond_3
    iget-object v1, v2, Lcmp;->b:Ljava/lang/Object;

    goto :goto_0

    .line 6000
    :cond_4
    iget-boolean v3, p1, Lcmn;->c:Z

    if-eqz v3, :cond_5

    invoke-virtual {p1, v0}, Lcmn;->a(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v0}, Lcmn;->b(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Lcmk;)V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lcmm;->m:Lcmo;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcmm;->m:Lcmo;

    .line 3000
    iget v1, v1, Lcmo;->d:I

    .line 0
    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcmm;->m:Lcmo;

    .line 4000
    iget-object v1, v1, Lcmo;->c:[Lcmp;

    aget-object v1, v1, v0

    .line 0
    invoke-virtual {v1, p1}, Lcmp;->a(Lcmk;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected final a(Lcmj;I)Z
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 0
    invoke-virtual {p1}, Lcmj;->i()I

    move-result v2

    invoke-virtual {p1, p2}, Lcmj;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    invoke-static {p2}, Lcmu;->b(I)I

    move-result v3

    invoke-virtual {p1}, Lcmj;->i()I

    move-result v0

    sub-int v4, v0, v2

    .line 7000
    if-nez v4, :cond_2

    sget-object v0, Lcmu;->d:[B

    .line 0
    :goto_1
    new-instance v2, Lcmt;

    invoke-direct {v2, p2, v0}, Lcmt;-><init>(I[B)V

    const/4 v0, 0x0

    iget-object v4, p0, Lcmm;->m:Lcmo;

    if-nez v4, :cond_3

    new-instance v4, Lcmo;

    invoke-direct {v4}, Lcmo;-><init>()V

    iput-object v4, p0, Lcmm;->m:Lcmo;

    :goto_2
    if-nez v0, :cond_1

    new-instance v0, Lcmp;

    invoke-direct {v0}, Lcmp;-><init>()V

    iget-object v4, p0, Lcmm;->m:Lcmo;

    .line 8000
    invoke-virtual {v4, v3}, Lcmo;->c(I)I

    move-result v5

    if-ltz v5, :cond_4

    iget-object v1, v4, Lcmo;->c:[Lcmp;

    aput-object v0, v1, v5

    .line 9000
    :cond_1
    :goto_3
    iget-object v0, v0, Lcmp;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 0
    const/4 v0, 0x1

    goto :goto_0

    .line 7000
    :cond_2
    new-array v0, v4, [B

    iget v5, p1, Lcmj;->b:I

    add-int/2addr v2, v5

    iget-object v5, p1, Lcmj;->a:[B

    invoke-static {v5, v2, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 0
    :cond_3
    iget-object v0, p0, Lcmm;->m:Lcmo;

    invoke-virtual {v0, v3}, Lcmo;->a(I)Lcmp;

    move-result-object v0

    goto :goto_2

    .line 8000
    :cond_4
    xor-int/lit8 v5, v5, -0x1

    iget v6, v4, Lcmo;->d:I

    if-ge v5, v6, :cond_5

    iget-object v6, v4, Lcmo;->c:[Lcmp;

    aget-object v6, v6, v5

    sget-object v7, Lcmo;->a:Lcmp;

    if-ne v6, v7, :cond_5

    iget-object v1, v4, Lcmo;->b:[I

    aput v3, v1, v5

    iget-object v1, v4, Lcmo;->c:[Lcmp;

    aput-object v0, v1, v5

    goto :goto_3

    :cond_5
    iget v6, v4, Lcmo;->d:I

    iget-object v7, v4, Lcmo;->b:[I

    array-length v7, v7

    if-lt v6, v7, :cond_6

    iget v6, v4, Lcmo;->d:I

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v4, v6}, Lcmo;->b(I)I

    move-result v6

    new-array v7, v6, [I

    new-array v6, v6, [Lcmp;

    iget-object v8, v4, Lcmo;->b:[I

    iget-object v9, v4, Lcmo;->b:[I

    array-length v9, v9

    invoke-static {v8, v1, v7, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v8, v4, Lcmo;->c:[Lcmp;

    iget-object v9, v4, Lcmo;->c:[Lcmp;

    array-length v9, v9

    invoke-static {v8, v1, v6, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v7, v4, Lcmo;->b:[I

    iput-object v6, v4, Lcmo;->c:[Lcmp;

    :cond_6
    iget v1, v4, Lcmo;->d:I

    sub-int/2addr v1, v5

    if-eqz v1, :cond_7

    iget-object v1, v4, Lcmo;->b:[I

    iget-object v6, v4, Lcmo;->b:[I

    add-int/lit8 v7, v5, 0x1

    iget v8, v4, Lcmo;->d:I

    sub-int/2addr v8, v5

    invoke-static {v1, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v4, Lcmo;->c:[Lcmp;

    iget-object v6, v4, Lcmo;->c:[Lcmp;

    add-int/lit8 v7, v5, 0x1

    iget v8, v4, Lcmo;->d:I

    sub-int/2addr v8, v5

    invoke-static {v1, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    iget-object v1, v4, Lcmo;->b:[I

    aput v3, v1, v5

    iget-object v1, v4, Lcmo;->c:[Lcmp;

    aput-object v0, v1, v5

    iget v1, v4, Lcmo;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v4, Lcmo;->d:I

    goto/16 :goto_3
.end method

.method protected final a(Lcmm;)Z
    .locals 2

    iget-object v0, p0, Lcmm;->m:Lcmo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcmm;->m:Lcmo;

    invoke-virtual {v0}, Lcmo;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p1, Lcmm;->m:Lcmo;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcmm;->m:Lcmo;

    invoke-virtual {v0}, Lcmo;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcmm;->m:Lcmo;

    iget-object v1, p1, Lcmm;->m:Lcmo;

    invoke-virtual {v0, v1}, Lcmo;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method protected final c()I
    .locals 1

    iget-object v0, p0, Lcmm;->m:Lcmo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcmm;->m:Lcmo;

    invoke-virtual {v0}, Lcmo;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcmm;->m:Lcmo;

    invoke-virtual {v0}, Lcmo;->hashCode()I

    move-result v0

    goto :goto_0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcmm;->b()Lcmm;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d()Lcms;
    .locals 1

    invoke-direct {p0}, Lcmm;->b()Lcmm;

    move-result-object v0

    return-object v0
.end method
