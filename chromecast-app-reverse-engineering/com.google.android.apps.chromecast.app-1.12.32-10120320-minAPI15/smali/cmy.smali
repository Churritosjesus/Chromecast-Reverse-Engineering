.class public final Lcmy;
.super Lcmm;


# instance fields
.field public a:J

.field public b:[B

.field public c:J

.field private d:J

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:Z

.field private i:[Lcmz;

.field private j:Lcmw;

.field private k:[B

.field private l:[B

.field private o:Lcmv;

.field private p:Ljava/lang/String;

.field private q:Lcmx;


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 0
    invoke-direct {p0}, Lcmm;-><init>()V

    .line 1000
    iput-wide v4, p0, Lcmy;->a:J

    iput-wide v4, p0, Lcmy;->d:J

    const-string v0, ""

    iput-object v0, p0, Lcmy;->e:Ljava/lang/String;

    iput v1, p0, Lcmy;->f:I

    iput v1, p0, Lcmy;->g:I

    iput-boolean v1, p0, Lcmy;->h:Z

    invoke-static {}, Lcmz;->b()[Lcmz;

    move-result-object v0

    iput-object v0, p0, Lcmy;->i:[Lcmz;

    iput-object v2, p0, Lcmy;->j:Lcmw;

    sget-object v0, Lcmu;->d:[B

    iput-object v0, p0, Lcmy;->b:[B

    sget-object v0, Lcmu;->d:[B

    iput-object v0, p0, Lcmy;->k:[B

    sget-object v0, Lcmu;->d:[B

    iput-object v0, p0, Lcmy;->l:[B

    iput-object v2, p0, Lcmy;->o:Lcmv;

    const-string v0, ""

    iput-object v0, p0, Lcmy;->p:Ljava/lang/String;

    const-wide/32 v0, 0x2bf20

    iput-wide v0, p0, Lcmy;->c:J

    iput-object v2, p0, Lcmy;->q:Lcmx;

    iput-object v2, p0, Lcmy;->m:Lcmo;

    const/4 v0, -0x1

    iput v0, p0, Lcmy;->n:I

    .line 0
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 9

    .prologue
    const-wide/16 v6, 0x0

    .line 0
    invoke-super {p0}, Lcmm;->a()I

    move-result v0

    iget-wide v2, p0, Lcmy;->a:J

    cmp-long v1, v2, v6

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget-wide v2, p0, Lcmy;->a:J

    invoke-static {v1, v2, v3}, Lcmk;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcmy;->e:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    iget-object v2, p0, Lcmy;->e:Ljava/lang/String;

    invoke-static {v1, v2}, Lcmk;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-object v1, p0, Lcmy;->i:[Lcmz;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcmy;->i:[Lcmz;

    array-length v1, v1

    if-lez v1, :cond_4

    const/4 v1, 0x0

    move v8, v1

    move v1, v0

    move v0, v8

    :goto_0
    iget-object v2, p0, Lcmy;->i:[Lcmz;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcmy;->i:[Lcmz;

    aget-object v2, v2, v0

    if-eqz v2, :cond_2

    const/4 v3, 0x3

    invoke-static {v3, v2}, Lcmk;->b(ILcms;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v1

    :cond_4
    iget-object v1, p0, Lcmy;->b:[B

    sget-object v2, Lcmu;->d:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x6

    iget-object v2, p0, Lcmy;->b:[B

    invoke-static {v1, v2}, Lcmk;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-object v1, p0, Lcmy;->o:Lcmv;

    if-eqz v1, :cond_6

    const/4 v1, 0x7

    iget-object v2, p0, Lcmy;->o:Lcmv;

    invoke-static {v1, v2}, Lcmk;->b(ILcms;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-object v1, p0, Lcmy;->k:[B

    sget-object v2, Lcmu;->d:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_7

    const/16 v1, 0x8

    iget-object v2, p0, Lcmy;->k:[B

    invoke-static {v1, v2}, Lcmk;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-object v1, p0, Lcmy;->j:Lcmw;

    if-eqz v1, :cond_8

    const/16 v1, 0x9

    iget-object v2, p0, Lcmy;->j:Lcmw;

    invoke-static {v1, v2}, Lcmk;->b(ILcms;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget-boolean v1, p0, Lcmy;->h:Z

    if-eqz v1, :cond_9

    const/16 v1, 0xa

    iget-boolean v2, p0, Lcmy;->h:Z

    .line 4000
    invoke-static {v1}, Lcmk;->c(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 0
    add-int/2addr v0, v1

    :cond_9
    iget v1, p0, Lcmy;->f:I

    if-eqz v1, :cond_a

    const/16 v1, 0xb

    iget v2, p0, Lcmy;->f:I

    invoke-static {v1, v2}, Lcmk;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_a
    iget v1, p0, Lcmy;->g:I

    if-eqz v1, :cond_b

    const/16 v1, 0xc

    iget v2, p0, Lcmy;->g:I

    invoke-static {v1, v2}, Lcmk;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_b
    iget-object v1, p0, Lcmy;->l:[B

    sget-object v2, Lcmu;->d:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_c

    const/16 v1, 0xd

    iget-object v2, p0, Lcmy;->l:[B

    invoke-static {v1, v2}, Lcmk;->b(I[B)I

    move-result v1

    add-int/2addr v0, v1

    :cond_c
    iget-object v1, p0, Lcmy;->p:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    const/16 v1, 0xe

    iget-object v2, p0, Lcmy;->p:Ljava/lang/String;

    invoke-static {v1, v2}, Lcmk;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_d
    iget-wide v2, p0, Lcmy;->c:J

    const-wide/32 v4, 0x2bf20

    cmp-long v1, v2, v4

    if-eqz v1, :cond_e

    iget-wide v2, p0, Lcmy;->c:J

    .line 5000
    const/16 v1, 0xf

    invoke-static {v1}, Lcmk;->c(I)I

    move-result v1

    .line 6000
    invoke-static {v2, v3}, Lcmk;->c(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcmk;->b(J)I

    move-result v2

    .line 5000
    add-int/2addr v1, v2

    .line 0
    add-int/2addr v0, v1

    :cond_e
    iget-object v1, p0, Lcmy;->q:Lcmx;

    if-eqz v1, :cond_f

    const/16 v1, 0x10

    iget-object v2, p0, Lcmy;->q:Lcmx;

    invoke-static {v1, v2}, Lcmk;->b(ILcms;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_f
    iget-wide v2, p0, Lcmy;->d:J

    cmp-long v1, v2, v6

    if-eqz v1, :cond_10

    const/16 v1, 0x11

    iget-wide v2, p0, Lcmy;->d:J

    invoke-static {v1, v2, v3}, Lcmk;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_10
    return v0
.end method

.method public final synthetic a(Lcmj;)Lcms;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 0
    .line 7000
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcmj;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-virtual {p0, p1, v0}, Lcmy;->a(Lcmj;I)Z

    move-result v0

    if-nez v0, :cond_0

    :sswitch_0
    return-object p0

    .line 8000
    :sswitch_1
    invoke-virtual {p1}, Lcmj;->f()J

    move-result-wide v2

    .line 7000
    iput-wide v2, p0, Lcmy;->a:J

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1}, Lcmj;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcmy;->e:Ljava/lang/String;

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x1a

    invoke-static {p1, v0}, Lcmu;->a(Lcmj;I)I

    move-result v2

    iget-object v0, p0, Lcmy;->i:[Lcmz;

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    add-int/2addr v2, v0

    new-array v2, v2, [Lcmz;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcmy;->i:[Lcmz;

    invoke-static {v3, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_2
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    if-ge v0, v3, :cond_3

    new-instance v3, Lcmz;

    invoke-direct {v3}, Lcmz;-><init>()V

    aput-object v3, v2, v0

    aget-object v3, v2, v0

    invoke-virtual {p1, v3}, Lcmj;->a(Lcms;)V

    invoke-virtual {p1}, Lcmj;->a()I

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcmy;->i:[Lcmz;

    array-length v0, v0

    goto :goto_1

    :cond_3
    new-instance v3, Lcmz;

    invoke-direct {v3}, Lcmz;-><init>()V

    aput-object v3, v2, v0

    aget-object v0, v2, v0

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    iput-object v2, p0, Lcmy;->i:[Lcmz;

    goto :goto_0

    :sswitch_4
    invoke-virtual {p1}, Lcmj;->d()[B

    move-result-object v0

    iput-object v0, p0, Lcmy;->b:[B

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lcmy;->o:Lcmv;

    if-nez v0, :cond_4

    new-instance v0, Lcmv;

    invoke-direct {v0}, Lcmv;-><init>()V

    iput-object v0, p0, Lcmy;->o:Lcmv;

    :cond_4
    iget-object v0, p0, Lcmy;->o:Lcmv;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto :goto_0

    :sswitch_6
    invoke-virtual {p1}, Lcmj;->d()[B

    move-result-object v0

    iput-object v0, p0, Lcmy;->k:[B

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Lcmy;->j:Lcmw;

    if-nez v0, :cond_5

    new-instance v0, Lcmw;

    invoke-direct {v0}, Lcmw;-><init>()V

    iput-object v0, p0, Lcmy;->j:Lcmw;

    :cond_5
    iget-object v0, p0, Lcmy;->j:Lcmw;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Lcmj;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcmy;->h:Z

    goto/16 :goto_0

    .line 9000
    :sswitch_9
    invoke-virtual {p1}, Lcmj;->e()I

    move-result v0

    .line 7000
    iput v0, p0, Lcmy;->f:I

    goto/16 :goto_0

    .line 10000
    :sswitch_a
    invoke-virtual {p1}, Lcmj;->e()I

    move-result v0

    .line 7000
    iput v0, p0, Lcmy;->g:I

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p1}, Lcmj;->d()[B

    move-result-object v0

    iput-object v0, p0, Lcmy;->l:[B

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p1}, Lcmj;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcmy;->p:Ljava/lang/String;

    goto/16 :goto_0

    .line 11000
    :sswitch_d
    invoke-virtual {p1}, Lcmj;->f()J

    move-result-wide v2

    .line 12000
    const/4 v0, 0x1

    ushr-long v4, v2, v0

    const-wide/16 v6, 0x1

    and-long/2addr v2, v6

    neg-long v2, v2

    xor-long/2addr v2, v4

    .line 7000
    iput-wide v2, p0, Lcmy;->c:J

    goto/16 :goto_0

    :sswitch_e
    iget-object v0, p0, Lcmy;->q:Lcmx;

    if-nez v0, :cond_6

    new-instance v0, Lcmx;

    invoke-direct {v0}, Lcmx;-><init>()V

    iput-object v0, p0, Lcmy;->q:Lcmx;

    :cond_6
    iget-object v0, p0, Lcmy;->q:Lcmx;

    invoke-virtual {p1, v0}, Lcmj;->a(Lcms;)V

    goto/16 :goto_0

    .line 13000
    :sswitch_f
    invoke-virtual {p1}, Lcmj;->f()J

    move-result-wide v2

    .line 7000
    iput-wide v2, p0, Lcmy;->d:J

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x32 -> :sswitch_4
        0x3a -> :sswitch_5
        0x42 -> :sswitch_6
        0x4a -> :sswitch_7
        0x50 -> :sswitch_8
        0x58 -> :sswitch_9
        0x60 -> :sswitch_a
        0x6a -> :sswitch_b
        0x72 -> :sswitch_c
        0x78 -> :sswitch_d
        0x82 -> :sswitch_e
        0x88 -> :sswitch_f
    .end sparse-switch
.end method

.method public final a(Lcmk;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    .line 0
    iget-wide v2, p0, Lcmy;->a:J

    cmp-long v0, v2, v6

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-wide v2, p0, Lcmy;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcmk;->a(IJ)V

    :cond_0
    iget-object v0, p0, Lcmy;->e:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    iget-object v2, p0, Lcmy;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcmk;->a(ILjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcmy;->i:[Lcmz;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcmy;->i:[Lcmz;

    array-length v0, v0

    if-lez v0, :cond_3

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcmy;->i:[Lcmz;

    array-length v2, v2

    if-ge v0, v2, :cond_3

    iget-object v2, p0, Lcmy;->i:[Lcmz;

    aget-object v2, v2, v0

    if-eqz v2, :cond_2

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v2}, Lcmk;->a(ILcms;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcmy;->b:[B

    sget-object v2, Lcmu;->d:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x6

    iget-object v2, p0, Lcmy;->b:[B

    invoke-virtual {p1, v0, v2}, Lcmk;->a(I[B)V

    :cond_4
    iget-object v0, p0, Lcmy;->o:Lcmv;

    if-eqz v0, :cond_5

    const/4 v0, 0x7

    iget-object v2, p0, Lcmy;->o:Lcmv;

    invoke-virtual {p1, v0, v2}, Lcmk;->a(ILcms;)V

    :cond_5
    iget-object v0, p0, Lcmy;->k:[B

    sget-object v2, Lcmu;->d:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_6

    const/16 v0, 0x8

    iget-object v2, p0, Lcmy;->k:[B

    invoke-virtual {p1, v0, v2}, Lcmk;->a(I[B)V

    :cond_6
    iget-object v0, p0, Lcmy;->j:Lcmw;

    if-eqz v0, :cond_7

    const/16 v0, 0x9

    iget-object v2, p0, Lcmy;->j:Lcmw;

    invoke-virtual {p1, v0, v2}, Lcmk;->a(ILcms;)V

    :cond_7
    iget-boolean v0, p0, Lcmy;->h:Z

    if-eqz v0, :cond_8

    const/16 v0, 0xa

    iget-boolean v2, p0, Lcmy;->h:Z

    invoke-virtual {p1, v0, v2}, Lcmk;->a(IZ)V

    :cond_8
    iget v0, p0, Lcmy;->f:I

    if-eqz v0, :cond_9

    const/16 v0, 0xb

    iget v2, p0, Lcmy;->f:I

    invoke-virtual {p1, v0, v2}, Lcmk;->a(II)V

    :cond_9
    iget v0, p0, Lcmy;->g:I

    if-eqz v0, :cond_a

    const/16 v0, 0xc

    iget v2, p0, Lcmy;->g:I

    invoke-virtual {p1, v0, v2}, Lcmk;->a(II)V

    :cond_a
    iget-object v0, p0, Lcmy;->l:[B

    sget-object v2, Lcmu;->d:[B

    invoke-static {v0, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_b

    const/16 v0, 0xd

    iget-object v2, p0, Lcmy;->l:[B

    invoke-virtual {p1, v0, v2}, Lcmk;->a(I[B)V

    :cond_b
    iget-object v0, p0, Lcmy;->p:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const/16 v0, 0xe

    iget-object v2, p0, Lcmy;->p:Ljava/lang/String;

    invoke-virtual {p1, v0, v2}, Lcmk;->a(ILjava/lang/String;)V

    :cond_c
    iget-wide v2, p0, Lcmy;->c:J

    const-wide/32 v4, 0x2bf20

    cmp-long v0, v2, v4

    if-eqz v0, :cond_d

    iget-wide v2, p0, Lcmy;->c:J

    .line 2000
    const/16 v0, 0xf

    invoke-virtual {p1, v0, v1}, Lcmk;->c(II)V

    .line 3000
    invoke-static {v2, v3}, Lcmk;->c(J)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcmk;->a(J)V

    .line 0
    :cond_d
    iget-object v0, p0, Lcmy;->q:Lcmx;

    if-eqz v0, :cond_e

    const/16 v0, 0x10

    iget-object v1, p0, Lcmy;->q:Lcmx;

    invoke-virtual {p1, v0, v1}, Lcmk;->a(ILcms;)V

    :cond_e
    iget-wide v0, p0, Lcmy;->d:J

    cmp-long v0, v0, v6

    if-eqz v0, :cond_f

    const/16 v0, 0x11

    iget-wide v2, p0, Lcmy;->d:J

    invoke-virtual {p1, v0, v2, v3}, Lcmk;->a(IJ)V

    :cond_f
    invoke-super {p0, p1}, Lcmm;->a(Lcmk;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    if-ne p1, p0, :cond_1

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcmy;

    if-eqz v1, :cond_0

    check-cast p1, Lcmy;

    iget-wide v2, p0, Lcmy;->a:J

    iget-wide v4, p1, Lcmy;->a:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget-wide v2, p0, Lcmy;->d:J

    iget-wide v4, p1, Lcmy;->d:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget-object v1, p0, Lcmy;->e:Ljava/lang/String;

    if-nez v1, :cond_7

    iget-object v1, p1, Lcmy;->e:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_2
    iget v1, p0, Lcmy;->f:I

    iget v2, p1, Lcmy;->f:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcmy;->g:I

    iget v2, p1, Lcmy;->g:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcmy;->h:Z

    iget-boolean v2, p1, Lcmy;->h:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcmy;->i:[Lcmz;

    iget-object v2, p1, Lcmy;->i:[Lcmz;

    invoke-static {v1, v2}, Lcmq;->a([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcmy;->j:Lcmw;

    if-nez v1, :cond_8

    iget-object v1, p1, Lcmy;->j:Lcmw;

    if-nez v1, :cond_0

    :cond_3
    iget-object v1, p0, Lcmy;->b:[B

    iget-object v2, p1, Lcmy;->b:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcmy;->k:[B

    iget-object v2, p1, Lcmy;->k:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcmy;->l:[B

    iget-object v2, p1, Lcmy;->l:[B

    invoke-static {v1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcmy;->o:Lcmv;

    if-nez v1, :cond_9

    iget-object v1, p1, Lcmy;->o:Lcmv;

    if-nez v1, :cond_0

    :cond_4
    iget-object v1, p0, Lcmy;->p:Ljava/lang/String;

    if-nez v1, :cond_a

    iget-object v1, p1, Lcmy;->p:Ljava/lang/String;

    if-nez v1, :cond_0

    :cond_5
    iget-wide v2, p0, Lcmy;->c:J

    iget-wide v4, p1, Lcmy;->c:J

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    iget-object v1, p0, Lcmy;->q:Lcmx;

    if-nez v1, :cond_b

    iget-object v1, p1, Lcmy;->q:Lcmx;

    if-nez v1, :cond_0

    :cond_6
    invoke-virtual {p0, p1}, Lcmy;->a(Lcmm;)Z

    move-result v0

    goto/16 :goto_0

    :cond_7
    iget-object v1, p0, Lcmy;->e:Ljava/lang/String;

    iget-object v2, p1, Lcmy;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_0

    :cond_8
    iget-object v1, p0, Lcmy;->j:Lcmw;

    iget-object v2, p1, Lcmy;->j:Lcmw;

    invoke-virtual {v1, v2}, Lcmw;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_9
    iget-object v1, p0, Lcmy;->o:Lcmv;

    iget-object v2, p1, Lcmy;->o:Lcmv;

    invoke-virtual {v1, v2}, Lcmv;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_0

    :cond_a
    iget-object v1, p0, Lcmy;->p:Ljava/lang/String;

    iget-object v2, p1, Lcmy;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_0

    :cond_b
    iget-object v1, p0, Lcmy;->q:Lcmx;

    iget-object v2, p1, Lcmy;->q:Lcmx;

    invoke-virtual {v1, v2}, Lcmx;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_0
.end method

.method public final hashCode()I
    .locals 7

    const/16 v6, 0x20

    const/4 v1, 0x0

    iget-wide v2, p0, Lcmy;->a:J

    iget-wide v4, p0, Lcmy;->a:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcmy;->d:J

    iget-wide v4, p0, Lcmy;->d:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcmy;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcmy;->f:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcmy;->g:I

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-boolean v0, p0, Lcmy;->h:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x4cf

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcmy;->i:[Lcmz;

    invoke-static {v2}, Lcmq;->a([Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcmy;->j:Lcmw;

    if-nez v0, :cond_2

    move v0, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcmy;->b:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcmy;->k:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcmy;->l:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcmy;->o:Lcmv;

    if-nez v0, :cond_3

    move v0, v1

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v2, v0, 0x1f

    iget-object v0, p0, Lcmy;->p:Ljava/lang/String;

    if-nez v0, :cond_4

    move v0, v1

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lcmy;->c:J

    iget-wide v4, p0, Lcmy;->c:J

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcmy;->q:Lcmx;

    if-nez v2, :cond_5

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcmy;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcmy;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    const/16 v0, 0x4d5

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcmy;->j:Lcmw;

    invoke-virtual {v0}, Lcmw;->hashCode()I

    move-result v0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcmy;->o:Lcmv;

    invoke-virtual {v0}, Lcmv;->hashCode()I

    move-result v0

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcmy;->p:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_4

    :cond_5
    iget-object v1, p0, Lcmy;->q:Lcmx;

    invoke-virtual {v1}, Lcmx;->hashCode()I

    move-result v1

    goto :goto_5
.end method
