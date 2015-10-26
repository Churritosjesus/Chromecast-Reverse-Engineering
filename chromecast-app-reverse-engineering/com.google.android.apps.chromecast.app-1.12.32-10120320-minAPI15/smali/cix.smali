.class public final Lcix;
.super Lcmm;


# instance fields
.field public a:[Lcje;

.field public b:[Lcje;

.field public c:[Lciw;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 0
    invoke-direct {p0}, Lcmm;-><init>()V

    .line 1000
    invoke-static {}, Lcje;->b()[Lcje;

    move-result-object v0

    iput-object v0, p0, Lcix;->a:[Lcje;

    invoke-static {}, Lcje;->b()[Lcje;

    move-result-object v0

    iput-object v0, p0, Lcix;->b:[Lcje;

    invoke-static {}, Lciw;->b()[Lciw;

    move-result-object v0

    iput-object v0, p0, Lcix;->c:[Lciw;

    const/4 v0, 0x0

    iput-object v0, p0, Lcix;->m:Lcmo;

    const/4 v0, -0x1

    iput v0, p0, Lcix;->n:I

    .line 0
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 5

    const/4 v1, 0x0

    invoke-super {p0}, Lcmm;->a()I

    move-result v0

    iget-object v2, p0, Lcix;->a:[Lcje;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcix;->a:[Lcje;

    array-length v2, v2

    if-lez v2, :cond_2

    move v2, v0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcix;->a:[Lcje;

    array-length v3, v3

    if-ge v0, v3, :cond_1

    iget-object v3, p0, Lcix;->a:[Lcje;

    aget-object v3, v3, v0

    if-eqz v3, :cond_0

    const/4 v4, 0x1

    invoke-static {v4, v3}, Lcmk;->b(ILcms;)I

    move-result v3

    add-int/2addr v2, v3

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v2

    :cond_2
    iget-object v2, p0, Lcix;->b:[Lcje;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcix;->b:[Lcje;

    array-length v2, v2

    if-lez v2, :cond_5

    move v2, v0

    move v0, v1

    :goto_1
    iget-object v3, p0, Lcix;->b:[Lcje;

    array-length v3, v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lcix;->b:[Lcje;

    aget-object v3, v3, v0

    if-eqz v3, :cond_3

    const/4 v4, 0x2

    invoke-static {v4, v3}, Lcmk;->b(ILcms;)I

    move-result v3

    add-int/2addr v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    move v0, v2

    :cond_5
    iget-object v2, p0, Lcix;->c:[Lciw;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcix;->c:[Lciw;

    array-length v2, v2

    if-lez v2, :cond_7

    :goto_2
    iget-object v2, p0, Lcix;->c:[Lciw;

    array-length v2, v2

    if-ge v1, v2, :cond_7

    iget-object v2, p0, Lcix;->c:[Lciw;

    aget-object v2, v2, v1

    if-eqz v2, :cond_6

    const/4 v3, 0x3

    invoke-static {v3, v2}, Lcmk;->b(ILcms;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    return v0
.end method

.method public final synthetic a(Lcmj;)Lcms;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 0
    .line 2000
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcmj;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcix;->a(Lcmj;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    :sswitch_1
    const/16 v0, 0xa

    invoke-static {p1, v0}, Lcmu;->a(Lcmj;I)I

    move-result v2

    iget-object v0, p0, Lcix;->a:[Lcje;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcje;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcix;->a:[Lcje;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcje;

    invoke-direct {v3}, Lcje;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcmj;->a(Lcms;)V

    invoke-virtual {p1}, Lcmj;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcix;->a:[Lcje;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcje;

    invoke-direct {v3}, Lcje;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    iput-object v2, p0, Lcix;->a:[Lcje;

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x12

    invoke-static {p1, v0}, Lcmu;->a(Lcmj;I)I

    move-result v2

    iget-object v0, p0, Lcix;->b:[Lcje;

    if-nez v0, :cond_5

    move v0, v1

    :goto_3
    add-int/2addr v2, v0

    new-array v2, v2, [Lcje;

    if-eqz v0, :cond_4

    iget-object v3, p0, Lcix;->b:[Lcje;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    :goto_4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_6

    new-instance v3, Lcje;

    invoke-direct {v3}, Lcje;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcmj;->a(Lcms;)V

    invoke-virtual {p1}, Lcmj;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcix;->b:[Lcje;

    array-length v0, v0

    goto :goto_3

    :cond_6
    new-instance v3, Lcje;

    invoke-direct {v3}, Lcje;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    iput-object v2, p0, Lcix;->b:[Lcje;

    goto/16 :goto_0

    :sswitch_3
    const/16 v0, 0x1a

    invoke-static {p1, v0}, Lcmu;->a(Lcmj;I)I

    move-result v2

    iget-object v0, p0, Lcix;->c:[Lciw;

    if-nez v0, :cond_8

    move v0, v1

    :goto_5
    add-int/2addr v2, v0

    new-array v2, v2, [Lciw;

    if-eqz v0, :cond_7

    iget-object v3, p0, Lcix;->c:[Lciw;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_7
    :goto_6
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_9

    new-instance v3, Lciw;

    invoke-direct {v3}, Lciw;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcmj;->a(Lcms;)V

    invoke-virtual {p1}, Lcmj;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_8
    iget-object v0, p0, Lcix;->c:[Lciw;

    array-length v0, v0

    goto :goto_5

    :cond_9
    new-instance v3, Lciw;

    invoke-direct {v3}, Lciw;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    iput-object v2, p0, Lcix;->c:[Lciw;

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public final a(Lcmk;)V
    .locals 4

    const/4 v1, 0x0

    iget-object v0, p0, Lcix;->a:[Lcje;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcix;->a:[Lcje;

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcix;->a:[Lcje;

    array-length v2, v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcix;->a:[Lcje;

    aget-object v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    invoke-virtual {p1, v3, v2}, Lcmk;->a(ILcms;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcix;->b:[Lcje;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcix;->b:[Lcje;

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcix;->b:[Lcje;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcix;->b:[Lcje;

    aget-object v2, v2, v0

    if-eqz v2, :cond_2

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v2}, Lcmk;->a(ILcms;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcix;->c:[Lciw;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcix;->c:[Lciw;

    array-length v0, v0

    if-lez v0, :cond_5

    :goto_2
    iget-object v0, p0, Lcix;->c:[Lciw;

    array-length v0, v0

    if-ge v1, v0, :cond_5

    iget-object v0, p0, Lcix;->c:[Lciw;

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v0}, Lcmk;->a(ILcms;)V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    invoke-super {p0, p1}, Lcmm;->a(Lcmk;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcix;

    if-eqz v1, :cond_0

    check-cast p1, Lcix;

    iget-object v1, p0, Lcix;->a:[Lcje;

    iget-object v2, p1, Lcix;->a:[Lcje;

    invoke-static {v1, v2}, Lcmq;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcix;->b:[Lcje;

    iget-object v2, p1, Lcix;->b:[Lcje;

    invoke-static {v1, v2}, Lcmq;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcix;->c:[Lciw;

    iget-object v2, p1, Lcix;->c:[Lciw;

    invoke-static {v1, v2}, Lcmq;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lcix;->a(Lcmm;)Z

    move-result v0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcix;->a:[Lcje;

    invoke-static {v0}, Lcmq;->a([Ljava/lang/Object;)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcix;->b:[Lcje;

    invoke-static {v1}, Lcmq;->a([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcix;->c:[Lciw;

    invoke-static {v1}, Lcmq;->a([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcix;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
