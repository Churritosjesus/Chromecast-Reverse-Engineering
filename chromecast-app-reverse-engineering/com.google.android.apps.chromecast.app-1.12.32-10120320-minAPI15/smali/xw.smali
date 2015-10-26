.class public Lxw;
.super Lzh;
.source "PG"


# instance fields
.field a:I

.field b:Lyq;

.field c:Lya;

.field private f:Lxz;

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:I

.field private m:I

.field private n:Lxx;


# direct methods
.method private constructor <init>(IZ)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 153
    invoke-direct {p0}, Lzh;-><init>()V

    .line 94
    iput-boolean v1, p0, Lxw;->h:Z

    .line 101
    iput-boolean v1, p0, Lxw;->i:Z

    .line 108
    iput-boolean v1, p0, Lxw;->j:Z

    .line 114
    iput-boolean v2, p0, Lxw;->k:Z

    .line 120
    const/4 v0, -0x1

    iput v0, p0, Lxw;->l:I

    .line 126
    const/high16 v0, -0x80000000

    iput v0, p0, Lxw;->m:I

    .line 130
    iput-object v3, p0, Lxw;->c:Lya;

    .line 136
    new-instance v0, Lxx;

    invoke-direct {v0, p0}, Lxx;-><init>(Lxw;)V

    iput-object v0, p0, Lxw;->n:Lxx;

    .line 154
    invoke-virtual {p0, v2}, Lxw;->a(I)V

    .line 9372
    invoke-virtual {p0, v3}, Lxw;->a(Ljava/lang/String;)V

    .line 9373
    iget-boolean v0, p0, Lxw;->h:Z

    if-eq v1, v0, :cond_0

    .line 9376
    iput-boolean v1, p0, Lxw;->h:Z

    .line 9377
    invoke-virtual {p0}, Lxw;->m()V

    .line 156
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 144
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lxw;-><init>(IZ)V

    .line 145
    return-void
.end method

.method private a(ILzl;Lzp;Z)I
    .locals 3

    .prologue
    .line 842
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v0

    sub-int/2addr v0, p1

    .line 844
    if-lez v0, :cond_1

    .line 845
    neg-int v0, v0

    invoke-direct {p0, v0, p2, p3}, Lxw;->d(ILzl;Lzp;)I

    move-result v0

    neg-int v0, v0

    .line 850
    add-int v1, p1, v0

    .line 851
    if-eqz p4, :cond_0

    .line 853
    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2}, Lyq;->c()I

    move-result v2

    sub-int v1, v2, v1

    .line 854
    if-lez v1, :cond_0

    .line 855
    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2, v1}, Lyq;->a(I)V

    .line 856
    add-int/2addr v0, v1

    .line 859
    :cond_0
    :goto_0
    return v0

    .line 847
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lzl;Lxz;Lzp;Z)I
    .locals 8

    .prologue
    const/high16 v7, -0x80000000

    const/4 v6, 0x0

    .line 1315
    iget v1, p2, Lxz;->c:I

    .line 1316
    iget v0, p2, Lxz;->g:I

    if-eq v0, v7, :cond_1

    .line 1318
    iget v0, p2, Lxz;->c:I

    if-gez v0, :cond_0

    .line 1319
    iget v0, p2, Lxz;->g:I

    iget v2, p2, Lxz;->c:I

    add-int/2addr v0, v2

    iput v0, p2, Lxz;->g:I

    .line 1321
    :cond_0
    invoke-direct {p0, p1, p2}, Lxw;->a(Lzl;Lxz;)V

    .line 1323
    :cond_1
    iget v0, p2, Lxz;->c:I

    iget v2, p2, Lxz;->h:I

    add-int/2addr v0, v2

    .line 1324
    new-instance v2, Lxy;

    invoke-direct {v2}, Lxy;-><init>()V

    .line 1325
    :cond_2
    if-lez v0, :cond_7

    invoke-virtual {p2, p3}, Lxz;->a(Lzp;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 31188
    iput v6, v2, Lxy;->a:I

    .line 31189
    iput-boolean v6, v2, Lxy;->b:Z

    .line 31190
    iput-boolean v6, v2, Lxy;->c:Z

    .line 31191
    iput-boolean v6, v2, Lxy;->d:Z

    .line 1327
    invoke-virtual {p0, p1, p3, p2, v2}, Lxw;->a(Lzl;Lzp;Lxz;Lxy;)V

    .line 1328
    iget-boolean v3, v2, Lxy;->b:Z

    if-nez v3, :cond_7

    .line 1331
    iget v3, p2, Lxz;->b:I

    iget v4, v2, Lxy;->a:I

    iget v5, p2, Lxz;->f:I

    mul-int/2addr v4, v5

    add-int/2addr v3, v4

    iput v3, p2, Lxz;->b:I

    .line 1338
    iget-boolean v3, v2, Lxy;->c:Z

    if-eqz v3, :cond_3

    iget-object v3, p0, Lxw;->f:Lxz;

    iget-object v3, v3, Lxz;->j:Ljava/util/List;

    if-nez v3, :cond_3

    .line 32090
    iget-boolean v3, p3, Lzp;->j:Z

    .line 1338
    if-nez v3, :cond_4

    .line 1340
    :cond_3
    iget v3, p2, Lxz;->c:I

    iget v4, v2, Lxy;->a:I

    sub-int/2addr v3, v4

    iput v3, p2, Lxz;->c:I

    .line 1342
    iget v3, v2, Lxy;->a:I

    sub-int/2addr v0, v3

    .line 1345
    :cond_4
    iget v3, p2, Lxz;->g:I

    if-eq v3, v7, :cond_6

    .line 1346
    iget v3, p2, Lxz;->g:I

    iget v4, v2, Lxy;->a:I

    add-int/2addr v3, v4

    iput v3, p2, Lxz;->g:I

    .line 1347
    iget v3, p2, Lxz;->c:I

    if-gez v3, :cond_5

    .line 1348
    iget v3, p2, Lxz;->g:I

    iget v4, p2, Lxz;->c:I

    add-int/2addr v3, v4

    iput v3, p2, Lxz;->g:I

    .line 1350
    :cond_5
    invoke-direct {p0, p1, p2}, Lxw;->a(Lzl;Lxz;)V

    .line 1352
    :cond_6
    if-eqz p4, :cond_2

    iget-boolean v3, v2, Lxy;->d:Z

    if-eqz v3, :cond_2

    .line 1359
    :cond_7
    iget v0, p2, Lxz;->c:I

    sub-int v0, v1, v0

    return v0
.end method

.method private a(IIZZ)Landroid/view/View;
    .locals 7

    .prologue
    .line 1683
    invoke-virtual {p0}, Lxw;->l()V

    .line 1684
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v3

    .line 1685
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v4

    .line 1686
    if-le p2, p1, :cond_1

    const/4 v0, 0x1

    .line 1687
    :goto_0
    const/4 v2, 0x0

    .line 1688
    :goto_1
    if-eq p1, p2, :cond_3

    .line 1689
    invoke-virtual {p0, p1}, Lxw;->f(I)Landroid/view/View;

    move-result-object v1

    .line 1690
    iget-object v5, p0, Lxw;->b:Lyq;

    invoke-virtual {v5, v1}, Lyq;->a(Landroid/view/View;)I

    move-result v5

    .line 1691
    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6, v1}, Lyq;->b(Landroid/view/View;)I

    move-result v6

    .line 1692
    if-ge v5, v4, :cond_4

    if-le v6, v3, :cond_4

    .line 1693
    if-eqz p3, :cond_0

    .line 1694
    if-lt v5, v3, :cond_2

    if-gt v6, v4, :cond_2

    .line 1704
    :cond_0
    :goto_2
    return-object v1

    .line 1686
    :cond_1
    const/4 v0, -0x1

    goto :goto_0

    .line 1696
    :cond_2
    if-eqz p4, :cond_4

    if-nez v2, :cond_4

    .line 1688
    :goto_3
    add-int/2addr p1, v0

    move-object v2, v1

    goto :goto_1

    :cond_3
    move-object v1, v2

    .line 1704
    goto :goto_2

    :cond_4
    move-object v1, v2

    goto :goto_3
.end method

.method private a(ZZ)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1502
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    .line 1503
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1, p1, v2}, Lxw;->a(IIZZ)Landroid/view/View;

    move-result-object v0

    .line 1506
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0}, Lxw;->n()I

    move-result v1

    invoke-direct {p0, v0, v1, p1, v2}, Lxw;->a(IIZZ)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private a(II)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 892
    iget-object v0, p0, Lxw;->f:Lxz;

    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2}, Lyq;->c()I

    move-result v2

    sub-int/2addr v2, p2

    iput v2, v0, Lxz;->c:I

    .line 893
    iget-object v2, p0, Lxw;->f:Lxz;

    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    iput v0, v2, Lxz;->e:I

    .line 895
    iget-object v0, p0, Lxw;->f:Lxz;

    iput p1, v0, Lxz;->d:I

    .line 896
    iget-object v0, p0, Lxw;->f:Lxz;

    iput v1, v0, Lxz;->f:I

    .line 897
    iget-object v0, p0, Lxw;->f:Lxz;

    iput p2, v0, Lxz;->b:I

    .line 898
    iget-object v0, p0, Lxw;->f:Lxz;

    const/high16 v1, -0x80000000

    iput v1, v0, Lxz;->g:I

    .line 899
    return-void

    :cond_0
    move v0, v1

    .line 893
    goto :goto_0
.end method

.method private a(IIZLzp;)V
    .locals 6

    .prologue
    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 1112
    iget-object v2, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p4}, Lxw;->g(Lzp;)I

    move-result v3

    iput v3, v2, Lxz;->h:I

    .line 1113
    iget-object v2, p0, Lxw;->f:Lxz;

    iput p1, v2, Lxz;->f:I

    .line 1115
    if-ne p1, v1, :cond_2

    .line 1116
    iget-object v2, p0, Lxw;->f:Lxz;

    iget v3, v2, Lxz;->h:I

    iget-object v4, p0, Lxw;->b:Lyq;

    invoke-virtual {v4}, Lyq;->f()I

    move-result v4

    add-int/2addr v3, v4

    iput v3, v2, Lxz;->h:I

    .line 1118
    invoke-direct {p0}, Lxw;->w()Landroid/view/View;

    move-result-object v2

    .line 1120
    iget-object v3, p0, Lxw;->f:Lxz;

    iget-boolean v4, p0, Lxw;->i:Z

    if-eqz v4, :cond_1

    :goto_0
    iput v0, v3, Lxz;->e:I

    .line 1122
    iget-object v0, p0, Lxw;->f:Lxz;

    invoke-static {v2}, Lxw;->a(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Lxw;->f:Lxz;

    iget v3, v3, Lxz;->e:I

    add-int/2addr v1, v3

    iput v1, v0, Lxz;->d:I

    .line 1123
    iget-object v0, p0, Lxw;->f:Lxz;

    iget-object v1, p0, Lxw;->b:Lyq;

    invoke-virtual {v1, v2}, Lyq;->b(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Lxz;->b:I

    .line 1125
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0, v2}, Lyq;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lxw;->b:Lyq;

    invoke-virtual {v1}, Lyq;->c()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1138
    :goto_1
    iget-object v1, p0, Lxw;->f:Lxz;

    iput p2, v1, Lxz;->c:I

    .line 1139
    if-eqz p3, :cond_0

    .line 1140
    iget-object v1, p0, Lxw;->f:Lxz;

    iget v2, v1, Lxz;->c:I

    sub-int/2addr v2, v0

    iput v2, v1, Lxz;->c:I

    .line 1142
    :cond_0
    iget-object v1, p0, Lxw;->f:Lxz;

    iput v0, v1, Lxz;->g:I

    .line 1143
    return-void

    :cond_1
    move v0, v1

    .line 1120
    goto :goto_0

    .line 1129
    :cond_2
    invoke-direct {p0}, Lxw;->v()Landroid/view/View;

    move-result-object v2

    .line 1130
    iget-object v3, p0, Lxw;->f:Lxz;

    iget v4, v3, Lxz;->h:I

    iget-object v5, p0, Lxw;->b:Lyq;

    invoke-virtual {v5}, Lyq;->b()I

    move-result v5

    add-int/2addr v4, v5

    iput v4, v3, Lxz;->h:I

    .line 1131
    iget-object v3, p0, Lxw;->f:Lxz;

    iget-boolean v4, p0, Lxw;->i:Z

    if-eqz v4, :cond_3

    :goto_2
    iput v1, v3, Lxz;->e:I

    .line 1133
    iget-object v0, p0, Lxw;->f:Lxz;

    invoke-static {v2}, Lxw;->a(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Lxw;->f:Lxz;

    iget v3, v3, Lxz;->e:I

    add-int/2addr v1, v3

    iput v1, v0, Lxz;->d:I

    .line 1134
    iget-object v0, p0, Lxw;->f:Lxz;

    iget-object v1, p0, Lxw;->b:Lyq;

    invoke-virtual {v1, v2}, Lyq;->a(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Lxz;->b:I

    .line 1135
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0, v2}, Lyq;->a(Landroid/view/View;)I

    move-result v0

    neg-int v0, v0

    iget-object v1, p0, Lxw;->b:Lyq;

    invoke-virtual {v1}, Lyq;->b()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_3
    move v1, v0

    .line 1131
    goto :goto_2
.end method

.method private a(Lxx;)V
    .locals 2

    .prologue
    .line 888
    iget v0, p1, Lxx;->a:I

    iget v1, p1, Lxx;->b:I

    invoke-direct {p0, v0, v1}, Lxw;->a(II)V

    .line 889
    return-void
.end method

.method private a(Lzl;II)V
    .locals 1

    .prologue
    .line 1185
    if-ne p2, p3, :cond_1

    .line 1200
    :cond_0
    return-void

    .line 1191
    :cond_1
    if-le p3, p2, :cond_2

    .line 1192
    add-int/lit8 v0, p3, -0x1

    :goto_0
    if-lt v0, p2, :cond_0

    .line 1193
    invoke-virtual {p0, v0, p1}, Lxw;->a(ILzl;)V

    .line 1192
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 1196
    :cond_2
    :goto_1
    if-le p2, p3, :cond_0

    .line 1197
    invoke-virtual {p0, p2, p1}, Lxw;->a(ILzl;)V

    .line 1196
    add-int/lit8 p2, p2, -0x1

    goto :goto_1
.end method

.method private a(Lzl;Lxz;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1291
    iget-boolean v0, p2, Lxz;->a:Z

    if-nez v0, :cond_1

    .line 30234
    :cond_0
    :goto_0
    return-void

    .line 1294
    :cond_1
    iget v0, p2, Lxz;->f:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_5

    .line 1295
    iget v0, p2, Lxz;->g:I

    .line 29250
    invoke-virtual {p0}, Lxw;->n()I

    move-result v2

    .line 29251
    if-ltz v0, :cond_0

    .line 29258
    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3}, Lyq;->d()I

    move-result v3

    sub-int/2addr v3, v0

    .line 29259
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_3

    move v0, v1

    .line 29260
    :goto_1
    if-ge v0, v2, :cond_0

    .line 29261
    invoke-virtual {p0, v0}, Lxw;->f(I)Landroid/view/View;

    move-result-object v4

    .line 29262
    iget-object v5, p0, Lxw;->b:Lyq;

    invoke-virtual {v5, v4}, Lyq;->a(Landroid/view/View;)I

    move-result v4

    if-ge v4, v3, :cond_2

    .line 29263
    invoke-direct {p0, p1, v1, v0}, Lxw;->a(Lzl;II)V

    goto :goto_0

    .line 29260
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 29268
    :cond_3
    add-int/lit8 v0, v2, -0x1

    :goto_2
    if-ltz v0, :cond_0

    .line 29269
    invoke-virtual {p0, v0}, Lxw;->f(I)Landroid/view/View;

    move-result-object v1

    .line 29270
    iget-object v4, p0, Lxw;->b:Lyq;

    invoke-virtual {v4, v1}, Lyq;->a(Landroid/view/View;)I

    move-result v1

    if-ge v1, v3, :cond_4

    .line 29271
    add-int/lit8 v1, v2, -0x1

    invoke-direct {p0, p1, v1, v0}, Lxw;->a(Lzl;II)V

    goto :goto_0

    .line 29268
    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 1297
    :cond_5
    iget v2, p2, Lxz;->g:I

    .line 30211
    if-ltz v2, :cond_0

    .line 30220
    invoke-virtual {p0}, Lxw;->n()I

    move-result v3

    .line 30221
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_7

    .line 30222
    add-int/lit8 v0, v3, -0x1

    :goto_3
    if-ltz v0, :cond_0

    .line 30223
    invoke-virtual {p0, v0}, Lxw;->f(I)Landroid/view/View;

    move-result-object v1

    .line 30224
    iget-object v4, p0, Lxw;->b:Lyq;

    invoke-virtual {v4, v1}, Lyq;->b(Landroid/view/View;)I

    move-result v1

    if-le v1, v2, :cond_6

    .line 30225
    add-int/lit8 v1, v3, -0x1

    invoke-direct {p0, p1, v1, v0}, Lxw;->a(Lzl;II)V

    goto :goto_0

    .line 30222
    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_7
    move v0, v1

    .line 30230
    :goto_4
    if-ge v0, v3, :cond_0

    .line 30231
    invoke-virtual {p0, v0}, Lxw;->f(I)Landroid/view/View;

    move-result-object v4

    .line 30232
    iget-object v5, p0, Lxw;->b:Lyq;

    invoke-virtual {v5, v4}, Lyq;->b(Landroid/view/View;)I

    move-result v4

    if-le v4, v2, :cond_8

    .line 30233
    invoke-direct {p0, p1, v1, v0}, Lxw;->a(Lzl;II)V

    goto :goto_0

    .line 30230
    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_4
.end method

.method private a(Lzl;Lzp;II)V
    .locals 9

    .prologue
    .line 636
    .line 22101
    iget-boolean v0, p2, Lzp;->l:Z

    .line 636
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-eqz v0, :cond_0

    .line 23090
    iget-boolean v0, p2, Lzp;->j:Z

    .line 636
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lxw;->g()Z

    move-result v0

    if-nez v0, :cond_1

    .line 683
    :cond_0
    :goto_0
    return-void

    .line 641
    :cond_1
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 23196
    iget-object v5, p1, Lzl;->d:Ljava/util/List;

    .line 643
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 644
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lxw;->f(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lxw;->a(Landroid/view/View;)I

    move-result v7

    .line 645
    const/4 v0, 0x0

    move v4, v0

    :goto_1
    if-ge v4, v6, :cond_5

    .line 646
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 647
    invoke-virtual {v0}, Lzr;->n()Z

    move-result v1

    if-nez v1, :cond_8

    .line 650
    invoke-virtual {v0}, Lzr;->d()I

    move-result v1

    .line 651
    if-ge v1, v7, :cond_2

    const/4 v1, 0x1

    :goto_2
    iget-boolean v8, p0, Lxw;->i:Z

    if-eq v1, v8, :cond_3

    const/4 v1, -0x1

    .line 653
    :goto_3
    const/4 v8, -0x1

    if-ne v1, v8, :cond_4

    .line 654
    iget-object v1, p0, Lxw;->b:Lyq;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Lyq;->c(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v3

    move v1, v0

    move v0, v2

    .line 645
    :goto_4
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move v3, v1

    move v2, v0

    goto :goto_1

    .line 651
    :cond_2
    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    const/4 v1, 0x1

    goto :goto_3

    .line 656
    :cond_4
    iget-object v1, p0, Lxw;->b:Lyq;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Lyq;->c(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v2

    move v1, v3

    goto :goto_4

    .line 664
    :cond_5
    iget-object v0, p0, Lxw;->f:Lxz;

    iput-object v5, v0, Lxz;->j:Ljava/util/List;

    .line 665
    if-lez v3, :cond_6

    .line 666
    invoke-direct {p0}, Lxw;->v()Landroid/view/View;

    move-result-object v0

    .line 667
    invoke-static {v0}, Lxw;->a(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0, v0, p3}, Lxw;->b(II)V

    .line 668
    iget-object v0, p0, Lxw;->f:Lxz;

    iput v3, v0, Lxz;->h:I

    .line 669
    iget-object v0, p0, Lxw;->f:Lxz;

    const/4 v1, 0x0

    iput v1, v0, Lxz;->c:I

    .line 670
    iget-object v0, p0, Lxw;->f:Lxz;

    .line 23983
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxz;->a(Lzr;)V

    .line 671
    iget-object v0, p0, Lxw;->f:Lxz;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 674
    :cond_6
    if-lez v2, :cond_7

    .line 675
    invoke-direct {p0}, Lxw;->w()Landroid/view/View;

    move-result-object v0

    .line 676
    invoke-static {v0}, Lxw;->a(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0, v0, p4}, Lxw;->a(II)V

    .line 677
    iget-object v0, p0, Lxw;->f:Lxz;

    iput v2, v0, Lxz;->h:I

    .line 678
    iget-object v0, p0, Lxw;->f:Lxz;

    const/4 v1, 0x0

    iput v1, v0, Lxz;->c:I

    .line 679
    iget-object v0, p0, Lxw;->f:Lxz;

    .line 24983
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxz;->a(Lzr;)V

    .line 680
    iget-object v0, p0, Lxw;->f:Lxz;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 682
    :cond_7
    iget-object v0, p0, Lxw;->f:Lxz;

    const/4 v1, 0x0

    iput-object v1, v0, Lxz;->j:Ljava/util/List;

    goto/16 :goto_0

    :cond_8
    move v0, v2

    move v1, v3

    goto :goto_4
.end method

.method private b(ILzl;Lzp;Z)I
    .locals 4

    .prologue
    .line 867
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v0

    sub-int v0, p1, v0

    .line 869
    if-lez v0, :cond_1

    .line 871
    invoke-direct {p0, v0, p2, p3}, Lxw;->d(ILzl;Lzp;)I

    move-result v0

    neg-int v0, v0

    .line 875
    add-int v1, p1, v0

    .line 876
    if-eqz p4, :cond_0

    .line 878
    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2}, Lyq;->b()I

    move-result v2

    sub-int/2addr v1, v2

    .line 879
    if-lez v1, :cond_0

    .line 880
    iget-object v2, p0, Lxw;->b:Lyq;

    neg-int v3, v1

    invoke-virtual {v2, v3}, Lyq;->a(I)V

    .line 881
    sub-int/2addr v0, v1

    .line 884
    :cond_0
    :goto_0
    return v0

    .line 873
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(ZZ)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 1520
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    .line 1521
    const/4 v0, 0x0

    invoke-virtual {p0}, Lxw;->n()I

    move-result v1

    invoke-direct {p0, v0, v1, p1, v2}, Lxw;->a(IIZZ)Landroid/view/View;

    move-result-object v0

    .line 1524
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1, p1, v2}, Lxw;->a(IIZZ)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private b(II)V
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 906
    iget-object v0, p0, Lxw;->f:Lxz;

    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2}, Lyq;->b()I

    move-result v2

    sub-int v2, p2, v2

    iput v2, v0, Lxz;->c:I

    .line 907
    iget-object v0, p0, Lxw;->f:Lxz;

    iput p1, v0, Lxz;->d:I

    .line 908
    iget-object v2, p0, Lxw;->f:Lxz;

    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput v0, v2, Lxz;->e:I

    .line 910
    iget-object v0, p0, Lxw;->f:Lxz;

    iput v1, v0, Lxz;->f:I

    .line 911
    iget-object v0, p0, Lxw;->f:Lxz;

    iput p2, v0, Lxz;->b:I

    .line 912
    iget-object v0, p0, Lxw;->f:Lxz;

    const/high16 v1, -0x80000000

    iput v1, v0, Lxz;->g:I

    .line 914
    return-void

    :cond_0
    move v0, v1

    .line 908
    goto :goto_0
.end method

.method private b(Lxx;)V
    .locals 2

    .prologue
    .line 902
    iget v0, p1, Lxx;->a:I

    iget v1, p1, Lxx;->b:I

    invoke-direct {p0, v0, v1}, Lxw;->b(II)V

    .line 903
    return-void
.end method

.method private d(ILzl;Lzp;)I
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1146
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move p1, v2

    .line 1168
    :goto_0
    return p1

    .line 1149
    :cond_1
    iget-object v0, p0, Lxw;->f:Lxz;

    iput-boolean v1, v0, Lxz;->a:Z

    .line 1150
    invoke-virtual {p0}, Lxw;->l()V

    .line 1151
    if-lez p1, :cond_2

    move v0, v1

    .line 1152
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 1153
    invoke-direct {p0, v0, v3, v1, p3}, Lxw;->a(IIZLzp;)V

    .line 1154
    iget-object v1, p0, Lxw;->f:Lxz;

    iget v1, v1, Lxz;->g:I

    .line 1155
    iget-object v4, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p2, v4, p3, v2}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    move-result v4

    add-int/2addr v1, v4

    .line 1156
    if-gez v1, :cond_3

    move p1, v2

    .line 1160
    goto :goto_0

    .line 1151
    :cond_2
    const/4 v0, -0x1

    goto :goto_1

    .line 1162
    :cond_3
    if-le v3, v1, :cond_4

    mul-int p1, v0, v1

    .line 1163
    :cond_4
    iget-object v0, p0, Lxw;->b:Lyq;

    neg-int v1, p1

    invoke-virtual {v0, v1}, Lyq;->a(I)V

    .line 1167
    iget-object v0, p0, Lxw;->f:Lxz;

    iput p1, v0, Lxz;->i:I

    goto :goto_0
.end method

.method private d(Lzl;Lzp;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1542
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lxw;->f(Lzl;Lzp;)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2}, Lxw;->g(Lzl;Lzp;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private e(Lzl;Lzp;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1559
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lxw;->g(Lzl;Lzp;)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2}, Lxw;->f(Lzl;Lzp;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private f(Lzl;Lzp;)Landroid/view/View;
    .locals 6

    .prologue
    .line 1564
    const/4 v3, 0x0

    invoke-virtual {p0}, Lxw;->n()I

    move-result v4

    invoke-virtual {p2}, Lzp;->a()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lxw;->a(Lzl;Lzp;III)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private g(Lzp;)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 414
    .line 10174
    iget v1, p1, Lzp;->a:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    const/4 v1, 0x1

    .line 414
    :goto_0
    if-eqz v1, :cond_0

    .line 415
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->e()I

    move-result v0

    .line 417
    :cond_0
    return v0

    :cond_1
    move v1, v0

    .line 10174
    goto :goto_0
.end method

.method private g(Lzl;Lzp;)Landroid/view/View;
    .locals 6

    .prologue
    .line 1568
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    const/4 v4, -0x1

    invoke-virtual {p2}, Lzp;->a()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lxw;->a(Lzl;Lzp;III)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private h(Lzp;)I
    .locals 9

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1046
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-nez v0, :cond_1

    .line 29044
    :cond_0
    :goto_0
    return v2

    .line 1049
    :cond_1
    invoke-virtual {p0}, Lxw;->l()V

    .line 1050
    iget-object v3, p0, Lxw;->b:Lyq;

    iget-boolean v0, p0, Lxw;->k:Z

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-direct {p0, v0, v1}, Lxw;->a(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v0, p0, Lxw;->k:Z

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    invoke-direct {p0, v0, v1}, Lxw;->b(ZZ)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Lxw;->k:Z

    iget-boolean v5, p0, Lxw;->i:Z

    .line 29032
    invoke-virtual {p0}, Lzh;->n()I

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p1}, Lzp;->a()I

    move-result v6

    if-eqz v6, :cond_0

    if-eqz v4, :cond_0

    if-eqz v0, :cond_0

    .line 29036
    invoke-static {v4}, Lzh;->a(Landroid/view/View;)I

    move-result v6

    invoke-static {v0}, Lzh;->a(Landroid/view/View;)I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 29038
    invoke-static {v4}, Lzh;->a(Landroid/view/View;)I

    move-result v7

    invoke-static {v0}, Lzh;->a(Landroid/view/View;)I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 29040
    if-eqz v5, :cond_4

    invoke-virtual {p1}, Lzp;->a()I

    move-result v5

    sub-int/2addr v5, v7

    add-int/lit8 v5, v5, -0x1

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 29043
    :goto_3
    if-eqz v1, :cond_0

    .line 29046
    invoke-virtual {v3, v0}, Lyq;->b(Landroid/view/View;)I

    move-result v1

    invoke-virtual {v3, v4}, Lyq;->a(Landroid/view/View;)I

    move-result v5

    sub-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    .line 29048
    invoke-static {v4}, Lzh;->a(Landroid/view/View;)I

    move-result v5

    invoke-static {v0}, Lzh;->a(Landroid/view/View;)I

    move-result v0

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 29050
    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    .line 29052
    int-to-float v1, v2

    mul-float/2addr v0, v1

    invoke-virtual {v3}, Lyq;->b()I

    move-result v1

    invoke-virtual {v3, v4}, Lyq;->a(Landroid/view/View;)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 1050
    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_2

    .line 29040
    :cond_4
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_3
.end method

.method private i(Lzp;)I
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1057
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-nez v0, :cond_1

    .line 29068
    :cond_0
    :goto_0
    return v2

    .line 1060
    :cond_1
    invoke-virtual {p0}, Lxw;->l()V

    .line 1061
    iget-object v3, p0, Lxw;->b:Lyq;

    iget-boolean v0, p0, Lxw;->k:Z

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-direct {p0, v0, v1}, Lxw;->a(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v0, p0, Lxw;->k:Z

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    invoke-direct {p0, v0, v1}, Lxw;->b(ZZ)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Lxw;->k:Z

    .line 29063
    invoke-virtual {p0}, Lzh;->n()I

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Lzp;->a()I

    move-result v5

    if-eqz v5, :cond_0

    if-eqz v4, :cond_0

    if-eqz v0, :cond_0

    .line 29067
    if-nez v1, :cond_4

    .line 29068
    invoke-static {v4}, Lzh;->a(Landroid/view/View;)I

    move-result v1

    invoke-static {v0}, Lzh;->a(Landroid/view/View;)I

    move-result v0

    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit8 v2, v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v2

    .line 1061
    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_2

    .line 29070
    :cond_4
    invoke-virtual {v3, v0}, Lyq;->b(Landroid/view/View;)I

    move-result v0

    invoke-virtual {v3, v4}, Lyq;->a(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    .line 29072
    invoke-virtual {v3}, Lyq;->e()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_0
.end method

.method private j(Lzp;)I
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1068
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-nez v0, :cond_1

    .line 29087
    :cond_0
    :goto_0
    return v2

    .line 1071
    :cond_1
    invoke-virtual {p0}, Lxw;->l()V

    .line 1072
    iget-object v3, p0, Lxw;->b:Lyq;

    iget-boolean v0, p0, Lxw;->k:Z

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-direct {p0, v0, v1}, Lxw;->a(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v0, p0, Lxw;->k:Z

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    invoke-direct {p0, v0, v1}, Lxw;->b(ZZ)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Lxw;->k:Z

    .line 29082
    invoke-virtual {p0}, Lzh;->n()I

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p1}, Lzp;->a()I

    move-result v5

    if-eqz v5, :cond_0

    if-eqz v4, :cond_0

    if-eqz v0, :cond_0

    .line 29086
    if-nez v1, :cond_4

    .line 29087
    invoke-virtual {p1}, Lzp;->a()I

    move-result v2

    goto :goto_0

    :cond_2
    move v0, v2

    .line 1072
    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_2

    .line 29090
    :cond_4
    invoke-virtual {v3, v0}, Lyq;->b(Landroid/view/View;)I

    move-result v1

    invoke-virtual {v3, v4}, Lyq;->a(Landroid/view/View;)I

    move-result v2

    sub-int/2addr v1, v2

    .line 29092
    invoke-static {v4}, Lzh;->a(Landroid/view/View;)I

    move-result v2

    invoke-static {v0}, Lzh;->a(Landroid/view/View;)I

    move-result v0

    sub-int v0, v2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 29096
    int-to-float v1, v1

    int-to-float v0, v0

    div-float v0, v1, v0

    invoke-virtual {p1}, Lzp;->a()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v2, v0

    .line 1072
    goto :goto_0
.end method

.method private u()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 340
    iget v1, p0, Lxw;->a:I

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lxw;->k()Z

    move-result v1

    if-nez v1, :cond_2

    .line 341
    :cond_0
    iget-boolean v0, p0, Lxw;->h:Z

    .line 343
    :cond_1
    :goto_0
    iput-boolean v0, p0, Lxw;->i:Z

    .line 345
    return-void

    .line 343
    :cond_2
    iget-boolean v1, p0, Lxw;->h:Z

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private v()Landroid/view/View;
    .locals 1

    .prologue
    .line 1480
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, v0}, Lxw;->f(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private w()Landroid/view/View;
    .locals 1

    .prologue
    .line 1490
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lxw;->f(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(ILzl;Lzp;)I
    .locals 2

    .prologue
    .line 997
    iget v0, p0, Lxw;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 998
    const/4 v0, 0x0

    .line 1000
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lxw;->d(ILzl;Lzp;)I

    move-result v0

    goto :goto_0
.end method

.method public final a(Lzp;)I
    .locals 1

    .prologue
    .line 1017
    invoke-direct {p0, p1}, Lxw;->h(Lzp;)I

    move-result v0

    return v0
.end method

.method a(Lzl;Lzp;III)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 1574
    invoke-virtual {p0}, Lxw;->l()V

    .line 1577
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v5

    .line 1578
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v6

    .line 1579
    if-le p4, p3, :cond_0

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    move-object v4, v2

    .line 1580
    :goto_1
    if-eq p3, p4, :cond_3

    .line 1581
    invoke-virtual {p0, p3}, Lxw;->f(I)Landroid/view/View;

    move-result-object v3

    .line 1582
    invoke-static {v3}, Lxw;->a(Landroid/view/View;)I

    move-result v0

    .line 1583
    if-ltz v0, :cond_6

    if-ge v0, p5, :cond_6

    .line 1584
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 38452
    iget-object v0, v0, Lzi;->c:Lzr;

    invoke-virtual {v0}, Lzr;->n()Z

    move-result v0

    .line 1584
    if-eqz v0, :cond_1

    .line 1585
    if-nez v4, :cond_6

    move-object v0, v2

    .line 1580
    :goto_2
    add-int/2addr p3, v1

    move-object v2, v0

    move-object v4, v3

    goto :goto_1

    .line 1579
    :cond_0
    const/4 v0, -0x1

    move v1, v0

    goto :goto_0

    .line 1588
    :cond_1
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0, v3}, Lyq;->a(Landroid/view/View;)I

    move-result v0

    if-ge v0, v6, :cond_2

    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0, v3}, Lyq;->b(Landroid/view/View;)I

    move-result v0

    if-ge v0, v5, :cond_4

    .line 1590
    :cond_2
    if-nez v2, :cond_6

    move-object v0, v3

    move-object v3, v4

    .line 1591
    goto :goto_2

    .line 1598
    :cond_3
    if-eqz v2, :cond_5

    move-object v3, v2

    :cond_4
    :goto_3
    return-object v3

    :cond_5
    move-object v3, v4

    goto :goto_3

    :cond_6
    move-object v0, v2

    move-object v3, v4

    goto :goto_2
.end method

.method public final a(I)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 321
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 322
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid orientation:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 324
    :cond_0
    invoke-virtual {p0, v1}, Lxw;->a(Ljava/lang/String;)V

    .line 325
    iget v0, p0, Lxw;->a:I

    if-ne p1, v0, :cond_1

    .line 331
    :goto_0
    return-void

    .line 328
    :cond_1
    iput p1, p0, Lxw;->a:I

    .line 329
    iput-object v1, p0, Lxw;->b:Lyq;

    .line 330
    invoke-virtual {p0}, Lxw;->m()V

    goto :goto_0
.end method

.method public final a(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 260
    instance-of v0, p1, Lya;

    if-eqz v0, :cond_0

    .line 261
    check-cast p1, Lya;

    iput-object p1, p0, Lxw;->c:Lya;

    .line 262
    invoke-virtual {p0}, Lxw;->m()V

    .line 269
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;Lzl;)V
    .locals 0

    .prologue
    .line 213
    invoke-super {p0, p1, p2}, Lzh;->a(Landroid/support/v7/widget/RecyclerView;Lzl;)V

    .line 218
    return-void
.end method

.method public final a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v1, -0x1

    .line 222
    invoke-super {p0, p1}, Lzh;->a(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 223
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-lez v0, :cond_0

    .line 224
    invoke-static {p1}, Liz;->a(Landroid/view/accessibility/AccessibilityEvent;)Ljx;

    move-result-object v2

    .line 9620
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    invoke-direct {p0, v3, v0, v3, v4}, Lxw;->a(IIZZ)Landroid/view/View;

    move-result-object v0

    .line 9621
    if-nez v0, :cond_1

    move v0, v1

    .line 226
    :goto_0
    invoke-virtual {v2, v0}, Ljx;->b(I)V

    .line 9660
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0, v1, v3, v4}, Lxw;->a(IIZZ)Landroid/view/View;

    move-result-object v0

    .line 9661
    if-nez v0, :cond_2

    .line 227
    :goto_1
    invoke-virtual {v2, v1}, Ljx;->c(I)V

    .line 229
    :cond_0
    return-void

    .line 9621
    :cond_1
    invoke-static {v0}, Lxw;->a(Landroid/view/View;)I

    move-result v0

    goto :goto_0

    .line 9661
    :cond_2
    invoke-static {v0}, Lxw;->a(Landroid/view/View;)I

    move-result v1

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1173
    iget-object v0, p0, Lxw;->c:Lya;

    if-nez v0, :cond_0

    .line 1174
    invoke-super {p0, p1}, Lzh;->a(Ljava/lang/String;)V

    .line 1176
    :cond_0
    return-void
.end method

.method a(Lzl;Lzp;Lxx;)V
    .locals 0

    .prologue
    .line 625
    return-void
.end method

.method a(Lzl;Lzp;Lxz;Lxy;)V
    .locals 11

    .prologue
    const/4 v2, 0x0

    const/4 v9, -0x1

    const/4 v5, 0x1

    .line 1364
    invoke-virtual {p3, p1}, Lxz;->a(Lzl;)Landroid/view/View;

    move-result-object v6

    .line 1365
    if-nez v6, :cond_0

    .line 1371
    iput-boolean v5, p4, Lxy;->b:Z

    .line 1434
    :goto_0
    return-void

    .line 1374
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 1375
    iget-object v1, p3, Lxz;->j:Ljava/util/List;

    if-nez v1, :cond_5

    .line 1376
    iget-boolean v3, p0, Lxw;->i:Z

    iget v1, p3, Lxz;->f:I

    if-ne v1, v9, :cond_3

    move v1, v5

    :goto_1
    if-ne v3, v1, :cond_4

    .line 33037
    invoke-super {p0, v6, v9, v2}, Lzh;->a(Landroid/view/View;IZ)V

    .line 36685
    :goto_2
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lzi;

    .line 36687
    iget-object v2, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v6}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    .line 36688
    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x0

    .line 36689
    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v4

    add-int/lit8 v2, v2, 0x0

    .line 36691
    invoke-virtual {p0}, Lzh;->o()I

    move-result v4

    invoke-virtual {p0}, Lzh;->q()I

    move-result v7

    invoke-virtual {p0}, Lzh;->s()I

    move-result v8

    add-int/2addr v7, v8

    iget v8, v1, Lzi;->leftMargin:I

    add-int/2addr v7, v8

    iget v8, v1, Lzi;->rightMargin:I

    add-int/2addr v7, v8

    add-int/2addr v3, v7

    iget v7, v1, Lzi;->width:I

    invoke-virtual {p0}, Lzh;->i()Z

    move-result v8

    invoke-static {v4, v3, v7, v8}, Lzh;->a(IIIZ)I

    move-result v3

    .line 36695
    invoke-virtual {p0}, Lzh;->p()I

    move-result v4

    invoke-virtual {p0}, Lzh;->r()I

    move-result v7

    invoke-virtual {p0}, Lzh;->t()I

    move-result v8

    add-int/2addr v7, v8

    iget v8, v1, Lzi;->topMargin:I

    add-int/2addr v7, v8

    iget v8, v1, Lzi;->bottomMargin:I

    add-int/2addr v7, v8

    add-int/2addr v2, v7

    iget v1, v1, Lzi;->height:I

    invoke-virtual {p0}, Lzh;->j()Z

    move-result v7

    invoke-static {v4, v2, v1, v7}, Lzh;->a(IIIZ)I

    move-result v1

    .line 36699
    invoke-virtual {v6, v3, v1}, Landroid/view/View;->measure(II)V

    .line 1391
    iget-object v1, p0, Lxw;->b:Lyq;

    invoke-virtual {v1, v6}, Lyq;->c(Landroid/view/View;)I

    move-result v1

    iput v1, p4, Lxy;->a:I

    .line 1393
    iget v1, p0, Lxw;->a:I

    if-ne v1, v5, :cond_a

    .line 1394
    invoke-virtual {p0}, Lxw;->k()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1395
    invoke-virtual {p0}, Lxw;->o()I

    move-result v1

    invoke-virtual {p0}, Lxw;->s()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1396
    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2, v6}, Lyq;->d(Landroid/view/View;)I

    move-result v2

    sub-int v2, v1, v2

    .line 1401
    :goto_3
    iget v3, p3, Lxz;->f:I

    if-ne v3, v9, :cond_9

    .line 1402
    iget v3, p3, Lxz;->b:I

    .line 1403
    iget v4, p3, Lxz;->b:I

    iget v7, p4, Lxy;->a:I

    sub-int/2addr v4, v7

    move v10, v3

    move v3, v4

    move v4, v2

    move v2, v1

    move v1, v10

    .line 1422
    :goto_4
    iget v7, v0, Lzi;->leftMargin:I

    add-int/2addr v4, v7

    iget v7, v0, Lzi;->topMargin:I

    add-int/2addr v3, v7

    iget v7, v0, Lzi;->rightMargin:I

    sub-int/2addr v2, v7

    iget v7, v0, Lzi;->bottomMargin:I

    sub-int/2addr v1, v7

    invoke-static {v6, v4, v3, v2, v1}, Lxw;->a(Landroid/view/View;IIII)V

    .line 37452
    iget-object v1, v0, Lzi;->c:Lzr;

    invoke-virtual {v1}, Lzr;->n()Z

    move-result v1

    .line 1430
    if-nez v1, :cond_1

    .line 37463
    iget-object v0, v0, Lzi;->c:Lzr;

    invoke-virtual {v0}, Lzr;->l()Z

    move-result v0

    .line 1430
    if-eqz v0, :cond_2

    .line 1431
    :cond_1
    iput-boolean v5, p4, Lxy;->c:Z

    .line 1433
    :cond_2
    invoke-virtual {v6}, Landroid/view/View;->isFocusable()Z

    move-result v0

    iput-boolean v0, p4, Lxy;->d:Z

    goto/16 :goto_0

    :cond_3
    move v1, v2

    .line 1376
    goto/16 :goto_1

    .line 34037
    :cond_4
    invoke-super {p0, v6, v2, v2}, Lzh;->a(Landroid/view/View;IZ)V

    goto/16 :goto_2

    .line 1383
    :cond_5
    iget-boolean v3, p0, Lxw;->i:Z

    iget v1, p3, Lxz;->f:I

    if-ne v1, v9, :cond_6

    move v1, v5

    :goto_5
    if-ne v3, v1, :cond_7

    .line 35014
    invoke-super {p0, v6, v9, v5}, Lzh;->a(Landroid/view/View;IZ)V

    goto/16 :goto_2

    :cond_6
    move v1, v2

    .line 1383
    goto :goto_5

    .line 36014
    :cond_7
    invoke-super {p0, v6, v2, v5}, Lzh;->a(Landroid/view/View;IZ)V

    goto/16 :goto_2

    .line 1398
    :cond_8
    invoke-virtual {p0}, Lxw;->q()I

    move-result v2

    .line 1399
    iget-object v1, p0, Lxw;->b:Lyq;

    invoke-virtual {v1, v6}, Lyq;->d(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v2

    goto :goto_3

    .line 1405
    :cond_9
    iget v4, p3, Lxz;->b:I

    .line 1406
    iget v3, p3, Lxz;->b:I

    iget v7, p4, Lxy;->a:I

    add-int/2addr v3, v7

    move v10, v3

    move v3, v4

    move v4, v2

    move v2, v1

    move v1, v10

    goto :goto_4

    .line 1409
    :cond_a
    invoke-virtual {p0}, Lxw;->r()I

    move-result v3

    .line 1410
    iget-object v1, p0, Lxw;->b:Lyq;

    invoke-virtual {v1, v6}, Lyq;->d(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v3

    .line 1412
    iget v2, p3, Lxz;->f:I

    if-ne v2, v9, :cond_b

    .line 1413
    iget v2, p3, Lxz;->b:I

    .line 1414
    iget v4, p3, Lxz;->b:I

    iget v7, p4, Lxy;->a:I

    sub-int/2addr v4, v7

    goto :goto_4

    .line 1416
    :cond_b
    iget v4, p3, Lxz;->b:I

    .line 1417
    iget v2, p3, Lxz;->b:I

    iget v7, p4, Lxy;->a:I

    add-int/2addr v2, v7

    goto :goto_4
.end method

.method public final b(ILzl;Lzp;)I
    .locals 1

    .prologue
    .line 1009
    iget v0, p0, Lxw;->a:I

    if-nez v0, :cond_0

    .line 1010
    const/4 v0, 0x0

    .line 1012
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lxw;->d(ILzl;Lzp;)I

    move-result v0

    goto :goto_0
.end method

.method public final b(Lzp;)I
    .locals 1

    .prologue
    .line 1022
    invoke-direct {p0, p1}, Lxw;->h(Lzp;)I

    move-result v0

    return v0
.end method

.method public final b(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 385
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    .line 386
    if-nez v0, :cond_1

    .line 387
    const/4 v0, 0x0

    .line 398
    :cond_0
    :goto_0
    return-object v0

    .line 389
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lxw;->f(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lxw;->a(Landroid/view/View;)I

    move-result v1

    .line 390
    sub-int v1, p1, v1

    .line 391
    if-ltz v1, :cond_2

    if-ge v1, v0, :cond_2

    .line 392
    invoke-virtual {p0, v1}, Lxw;->f(I)Landroid/view/View;

    move-result-object v0

    .line 393
    invoke-static {v0}, Lxw;->a(Landroid/view/View;)I

    move-result v1

    if-eq v1, p1, :cond_0

    .line 398
    :cond_2
    invoke-super {p0, p1}, Lzh;->b(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public final c(Lzp;)I
    .locals 1

    .prologue
    .line 1027
    invoke-direct {p0, p1}, Lxw;->i(Lzp;)I

    move-result v0

    return v0
.end method

.method public final c(ILzl;Lzp;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v0, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/high16 v6, -0x80000000

    .line 1710
    invoke-direct {p0}, Lxw;->u()V

    .line 1711
    invoke-virtual {p0}, Lxw;->n()I

    move-result v1

    if-nez v1, :cond_1

    .line 1748
    :cond_0
    :goto_0
    return-object v0

    .line 39447
    :cond_1
    sparse-switch p1, :sswitch_data_0

    move v3, v6

    .line 1716
    :goto_1
    if-eq v3, v6, :cond_0

    .line 1719
    invoke-virtual {p0}, Lxw;->l()V

    .line 1721
    if-ne v3, v4, :cond_6

    .line 1722
    invoke-direct {p0, p2, p3}, Lxw;->e(Lzl;Lzp;)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    .line 1726
    :goto_2
    if-eqz v2, :cond_0

    .line 1733
    invoke-virtual {p0}, Lxw;->l()V

    .line 1734
    const v1, 0x3ea8f5c3    # 0.33f

    iget-object v7, p0, Lxw;->b:Lyq;

    invoke-virtual {v7}, Lyq;->e()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v1, v7

    float-to-int v1, v1

    .line 1735
    invoke-direct {p0, v3, v1, v8, p3}, Lxw;->a(IIZLzp;)V

    .line 1736
    iget-object v1, p0, Lxw;->f:Lxz;

    iput v6, v1, Lxz;->g:I

    .line 1737
    iget-object v1, p0, Lxw;->f:Lxz;

    iput-boolean v8, v1, Lxz;->a:Z

    .line 1738
    iget-object v1, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p2, v1, p3, v5}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 1740
    if-ne v3, v4, :cond_7

    .line 1741
    invoke-direct {p0}, Lxw;->v()Landroid/view/View;

    move-result-object v1

    .line 1745
    :goto_3
    if-eq v1, v2, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->isFocusable()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 1748
    goto :goto_0

    :sswitch_0
    move v3, v4

    .line 39449
    goto :goto_1

    :sswitch_1
    move v3, v5

    .line 39451
    goto :goto_1

    .line 39453
    :sswitch_2
    iget v1, p0, Lxw;->a:I

    if-ne v1, v5, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v6

    goto :goto_1

    .line 39456
    :sswitch_3
    iget v1, p0, Lxw;->a:I

    if-ne v1, v5, :cond_3

    move v3, v5

    goto :goto_1

    :cond_3
    move v3, v6

    goto :goto_1

    .line 39459
    :sswitch_4
    iget v1, p0, Lxw;->a:I

    if-nez v1, :cond_4

    move v3, v4

    goto :goto_1

    :cond_4
    move v3, v6

    goto :goto_1

    .line 39462
    :sswitch_5
    iget v1, p0, Lxw;->a:I

    if-nez v1, :cond_5

    move v3, v5

    goto :goto_1

    :cond_5
    move v3, v6

    goto :goto_1

    .line 1724
    :cond_6
    invoke-direct {p0, p2, p3}, Lxw;->d(Lzl;Lzp;)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    goto :goto_2

    .line 1743
    :cond_7
    invoke-direct {p0}, Lxw;->w()Landroid/view/View;

    move-result-object v1

    goto :goto_3

    .line 39447
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x11 -> :sswitch_4
        0x21 -> :sswitch_2
        0x42 -> :sswitch_5
        0x82 -> :sswitch_3
    .end sparse-switch
.end method

.method public final c(I)V
    .locals 2

    .prologue
    .line 954
    iput p1, p0, Lxw;->l:I

    .line 955
    const/high16 v0, -0x80000000

    iput v0, p0, Lxw;->m:I

    .line 956
    iget-object v0, p0, Lxw;->c:Lya;

    if-eqz v0, :cond_0

    .line 957
    iget-object v0, p0, Lxw;->c:Lya;

    .line 28055
    const/4 v1, -0x1

    iput v1, v0, Lya;->a:I

    .line 959
    :cond_0
    invoke-virtual {p0}, Lxw;->m()V

    .line 960
    return-void
.end method

.method public c(Lzl;Lzp;)V
    .locals 11

    .prologue
    const/4 v5, 0x0

    const/4 v10, -0x1

    const/high16 v9, -0x80000000

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 464
    iget-object v0, p0, Lxw;->c:Lya;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxw;->c:Lya;

    invoke-virtual {v0}, Lya;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    iget-object v0, p0, Lxw;->c:Lya;

    iget v0, v0, Lya;->a:I

    iput v0, p0, Lxw;->l:I

    .line 468
    :cond_0
    invoke-virtual {p0}, Lxw;->l()V

    .line 469
    iget-object v0, p0, Lxw;->f:Lxz;

    iput-boolean v2, v0, Lxz;->a:Z

    .line 471
    invoke-direct {p0}, Lxw;->u()V

    .line 473
    iget-object v0, p0, Lxw;->n:Lxx;

    .line 11092
    iput v10, v0, Lxx;->a:I

    .line 11093
    iput v9, v0, Lxx;->b:I

    .line 11094
    iput-boolean v2, v0, Lxx;->c:Z

    .line 474
    iget-object v0, p0, Lxw;->n:Lxx;

    iget-boolean v3, p0, Lxw;->i:Z

    iput-boolean v3, v0, Lxx;->c:Z

    .line 476
    iget-object v4, p0, Lxw;->n:Lxx;

    .line 12090
    iget-boolean v0, p2, Lzp;->j:Z

    .line 11756
    if-nez v0, :cond_1

    iget v0, p0, Lxw;->l:I

    if-ne v0, v10, :cond_6

    :cond_1
    move v0, v2

    .line 11687
    :goto_0
    if-nez v0, :cond_3

    .line 12715
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-eqz v0, :cond_1c

    .line 13480
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_15

    move-object v3, v5

    .line 12719
    :goto_1
    if-eqz v3, :cond_1b

    .line 14117
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 14452
    iget-object v6, v0, Lzi;->c:Lzr;

    invoke-virtual {v6}, Lzr;->n()Z

    move-result v6

    .line 14118
    if-nez v6, :cond_18

    .line 14480
    iget-object v6, v0, Lzi;->c:Lzr;

    invoke-virtual {v6}, Lzr;->d()I

    move-result v6

    .line 14118
    if-ltz v6, :cond_18

    .line 15480
    iget-object v0, v0, Lzi;->c:Lzr;

    invoke-virtual {v0}, Lzr;->d()I

    move-result v0

    .line 14118
    invoke-virtual {p2}, Lzp;->a()I

    move-result v6

    if-ge v0, v6, :cond_18

    move v0, v1

    .line 12719
    :goto_2
    if-eqz v0, :cond_1b

    .line 16123
    iget-object v0, v4, Lxx;->d:Lxw;

    iget-object v0, v0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->a()I

    move-result v0

    .line 16124
    if-ltz v0, :cond_19

    .line 16125
    invoke-virtual {v4, v3}, Lxx;->a(Landroid/view/View;)V

    :cond_2
    :goto_3
    move v0, v1

    .line 11694
    :goto_4
    if-nez v0, :cond_3

    .line 11703
    invoke-virtual {v4}, Lxx;->a()V

    .line 11704
    iput v2, v4, Lxx;->a:I

    .line 485
    :cond_3
    invoke-direct {p0, p2}, Lxw;->g(Lzp;)I

    move-result v0

    .line 488
    iget-object v3, p0, Lxw;->f:Lxz;

    iget v3, v3, Lxz;->i:I

    if-ltz v3, :cond_23

    move v3, v2

    .line 495
    :goto_5
    iget-object v4, p0, Lxw;->b:Lyq;

    invoke-virtual {v4}, Lyq;->b()I

    move-result v4

    add-int/2addr v3, v4

    .line 496
    iget-object v4, p0, Lxw;->b:Lyq;

    invoke-virtual {v4}, Lyq;->f()I

    move-result v4

    add-int/2addr v0, v4

    .line 18090
    iget-boolean v4, p2, Lzp;->j:Z

    .line 497
    if-eqz v4, :cond_4

    iget v4, p0, Lxw;->l:I

    if-eq v4, v10, :cond_4

    iget v4, p0, Lxw;->m:I

    if-eq v4, v9, :cond_4

    .line 502
    iget v4, p0, Lxw;->l:I

    invoke-virtual {p0, v4}, Lxw;->b(I)Landroid/view/View;

    move-result-object v4

    .line 503
    if-eqz v4, :cond_4

    .line 506
    iget-boolean v6, p0, Lxw;->i:Z

    if-eqz v6, :cond_24

    .line 507
    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6}, Lyq;->c()I

    move-result v6

    iget-object v7, p0, Lxw;->b:Lyq;

    invoke-virtual {v7, v4}, Lyq;->b(Landroid/view/View;)I

    move-result v4

    sub-int v4, v6, v4

    .line 509
    iget v6, p0, Lxw;->m:I

    sub-int/2addr v4, v6

    .line 515
    :goto_6
    if-lez v4, :cond_25

    .line 516
    add-int/2addr v3, v4

    .line 524
    :cond_4
    :goto_7
    iget-object v4, p0, Lxw;->n:Lxx;

    invoke-virtual {p0, p1, p2, v4}, Lxw;->a(Lzl;Lzp;Lxx;)V

    .line 18580
    invoke-virtual {p0}, Lzh;->n()I

    move-result v4

    .line 18581
    add-int/lit8 v4, v4, -0x1

    :goto_8
    if-ltz v4, :cond_2b

    .line 18582
    invoke-virtual {p0, v4}, Lzh;->f(I)Landroid/view/View;

    move-result-object v6

    .line 18588
    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v7

    .line 18589
    invoke-virtual {v7}, Lzr;->b()Z

    move-result v8

    if-nez v8, :cond_5

    .line 18595
    invoke-virtual {v7}, Lzr;->j()Z

    move-result v8

    if-eqz v8, :cond_26

    invoke-virtual {v7}, Lzr;->n()Z

    move-result v8

    if-nez v8, :cond_26

    invoke-virtual {v7}, Lzr;->l()Z

    move-result v8

    if-nez v8, :cond_26

    iget-object v6, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    .line 18597
    invoke-virtual {p0, v4}, Lzh;->d(I)V

    .line 18598
    invoke-virtual {p1, v7}, Lzl;->a(Lzr;)V

    .line 18581
    :cond_5
    :goto_9
    add-int/lit8 v4, v4, -0x1

    goto :goto_8

    .line 11760
    :cond_6
    iget v0, p0, Lxw;->l:I

    if-ltz v0, :cond_7

    iget v0, p0, Lxw;->l:I

    invoke-virtual {p2}, Lzp;->a()I

    move-result v3

    if-lt v0, v3, :cond_8

    .line 11761
    :cond_7
    iput v10, p0, Lxw;->l:I

    .line 11762
    iput v9, p0, Lxw;->m:I

    move v0, v2

    .line 11766
    goto/16 :goto_0

    .line 11771
    :cond_8
    iget v0, p0, Lxw;->l:I

    iput v0, v4, Lxx;->a:I

    .line 11772
    iget-object v0, p0, Lxw;->c:Lya;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lxw;->c:Lya;

    invoke-virtual {v0}, Lya;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 11775
    iget-object v0, p0, Lxw;->c:Lya;

    iget-boolean v0, v0, Lya;->c:Z

    iput-boolean v0, v4, Lxx;->c:Z

    .line 11776
    iget-boolean v0, v4, Lxx;->c:Z

    if-eqz v0, :cond_9

    .line 11777
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v0

    iget-object v3, p0, Lxw;->c:Lya;

    iget v3, v3, Lya;->b:I

    sub-int/2addr v0, v3

    iput v0, v4, Lxx;->b:I

    :goto_a
    move v0, v1

    .line 11783
    goto/16 :goto_0

    .line 11780
    :cond_9
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v0

    iget-object v3, p0, Lxw;->c:Lya;

    iget v3, v3, Lya;->b:I

    add-int/2addr v0, v3

    iput v0, v4, Lxx;->b:I

    goto :goto_a

    .line 11786
    :cond_a
    iget v0, p0, Lxw;->m:I

    if-ne v0, v9, :cond_13

    .line 11787
    iget v0, p0, Lxw;->l:I

    invoke-virtual {p0, v0}, Lxw;->b(I)Landroid/view/View;

    move-result-object v0

    .line 11788
    if-eqz v0, :cond_f

    .line 11789
    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3, v0}, Lyq;->c(Landroid/view/View;)I

    move-result v3

    .line 11790
    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6}, Lyq;->e()I

    move-result v6

    if-le v3, v6, :cond_b

    .line 11792
    invoke-virtual {v4}, Lxx;->a()V

    :goto_b
    move v0, v1

    .line 11834
    goto/16 :goto_0

    .line 11795
    :cond_b
    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3, v0}, Lyq;->a(Landroid/view/View;)I

    move-result v3

    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6}, Lyq;->b()I

    move-result v6

    sub-int/2addr v3, v6

    .line 11797
    if-gez v3, :cond_c

    .line 11798
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v0

    iput v0, v4, Lxx;->b:I

    .line 11799
    iput-boolean v2, v4, Lxx;->c:Z

    goto :goto_b

    .line 11802
    :cond_c
    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3}, Lyq;->c()I

    move-result v3

    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6, v0}, Lyq;->b(Landroid/view/View;)I

    move-result v6

    sub-int/2addr v3, v6

    .line 11804
    if-gez v3, :cond_d

    .line 11805
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v0

    iput v0, v4, Lxx;->b:I

    .line 11806
    iput-boolean v1, v4, Lxx;->c:Z

    goto :goto_b

    .line 11809
    :cond_d
    iget-boolean v3, v4, Lxx;->c:Z

    if-eqz v3, :cond_e

    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3, v0}, Lyq;->b(Landroid/view/View;)I

    move-result v0

    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3}, Lyq;->a()I

    move-result v3

    add-int/2addr v0, v3

    :goto_c
    iput v0, v4, Lxx;->b:I

    :goto_d
    move v0, v1

    .line 11822
    goto/16 :goto_0

    .line 11809
    :cond_e
    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3, v0}, Lyq;->a(Landroid/view/View;)I

    move-result v0

    goto :goto_c

    .line 11814
    :cond_f
    invoke-virtual {p0}, Lxw;->n()I

    move-result v0

    if-lez v0, :cond_10

    .line 11816
    invoke-virtual {p0, v2}, Lxw;->f(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lxw;->a(Landroid/view/View;)I

    move-result v0

    .line 11817
    iget v3, p0, Lxw;->l:I

    if-ge v3, v0, :cond_11

    move v0, v1

    :goto_e
    iget-boolean v3, p0, Lxw;->i:Z

    if-ne v0, v3, :cond_12

    move v0, v1

    :goto_f
    iput-boolean v0, v4, Lxx;->c:Z

    .line 11820
    :cond_10
    invoke-virtual {v4}, Lxx;->a()V

    goto :goto_d

    :cond_11
    move v0, v2

    .line 11817
    goto :goto_e

    :cond_12
    move v0, v2

    goto :goto_f

    .line 11825
    :cond_13
    iget-boolean v0, p0, Lxw;->i:Z

    iput-boolean v0, v4, Lxx;->c:Z

    .line 11827
    iget-boolean v0, p0, Lxw;->i:Z

    if-eqz v0, :cond_14

    .line 11828
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v0

    iget v3, p0, Lxw;->m:I

    sub-int/2addr v0, v3

    iput v0, v4, Lxx;->b:I

    goto/16 :goto_b

    .line 11831
    :cond_14
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v0

    iget v3, p0, Lxw;->m:I

    add-int/2addr v0, v3

    iput v0, v4, Lxx;->b:I

    goto/16 :goto_b

    .line 13483
    :cond_15
    iget-object v0, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    .line 13484
    if-eqz v0, :cond_16

    iget-object v3, p0, Lzh;->d:Lxb;

    invoke-virtual {v3, v0}, Lxb;->a(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_17

    :cond_16
    move-object v3, v5

    .line 13485
    goto/16 :goto_1

    :cond_17
    move-object v3, v0

    .line 13487
    goto/16 :goto_1

    :cond_18
    move v0, v2

    .line 14118
    goto/16 :goto_2

    .line 16128
    :cond_19
    invoke-static {v3}, Lxw;->a(Landroid/view/View;)I

    move-result v6

    iput v6, v4, Lxx;->a:I

    .line 16129
    iget-boolean v6, v4, Lxx;->c:Z

    if-eqz v6, :cond_1a

    .line 16130
    iget-object v6, v4, Lxx;->d:Lxw;

    iget-object v6, v6, Lxw;->b:Lyq;

    invoke-virtual {v6}, Lyq;->c()I

    move-result v6

    sub-int v0, v6, v0

    .line 16131
    iget-object v6, v4, Lxx;->d:Lxw;

    iget-object v6, v6, Lxw;->b:Lyq;

    invoke-virtual {v6, v3}, Lyq;->b(Landroid/view/View;)I

    move-result v6

    .line 16132
    sub-int/2addr v0, v6

    .line 16133
    iget-object v6, v4, Lxx;->d:Lxw;

    iget-object v6, v6, Lxw;->b:Lyq;

    invoke-virtual {v6}, Lyq;->c()I

    move-result v6

    sub-int/2addr v6, v0

    iput v6, v4, Lxx;->b:I

    .line 16135
    if-lez v0, :cond_2

    .line 16136
    iget-object v6, v4, Lxx;->d:Lxw;

    iget-object v6, v6, Lxw;->b:Lyq;

    invoke-virtual {v6, v3}, Lyq;->c(Landroid/view/View;)I

    move-result v6

    .line 16137
    iget v7, v4, Lxx;->b:I

    sub-int v6, v7, v6

    .line 16138
    iget-object v7, v4, Lxx;->d:Lxw;

    iget-object v7, v7, Lxw;->b:Lyq;

    invoke-virtual {v7}, Lyq;->b()I

    move-result v7

    .line 16139
    iget-object v8, v4, Lxx;->d:Lxw;

    iget-object v8, v8, Lxw;->b:Lyq;

    invoke-virtual {v8, v3}, Lyq;->a(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v3, v7

    .line 16141
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/2addr v3, v7

    .line 16142
    sub-int v3, v6, v3

    .line 16143
    if-gez v3, :cond_2

    .line 16145
    iget v6, v4, Lxx;->b:I

    neg-int v3, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, v6

    iput v0, v4, Lxx;->b:I

    goto/16 :goto_3

    .line 16149
    :cond_1a
    iget-object v6, v4, Lxx;->d:Lxw;

    iget-object v6, v6, Lxw;->b:Lyq;

    invoke-virtual {v6, v3}, Lyq;->a(Landroid/view/View;)I

    move-result v6

    .line 16150
    iget-object v7, v4, Lxx;->d:Lxw;

    iget-object v7, v7, Lxw;->b:Lyq;

    invoke-virtual {v7}, Lyq;->b()I

    move-result v7

    sub-int v7, v6, v7

    .line 16151
    iput v6, v4, Lxx;->b:I

    .line 16152
    if-lez v7, :cond_2

    .line 16153
    iget-object v8, v4, Lxx;->d:Lxw;

    iget-object v8, v8, Lxw;->b:Lyq;

    invoke-virtual {v8, v3}, Lyq;->c(Landroid/view/View;)I

    move-result v8

    add-int/2addr v6, v8

    .line 16155
    iget-object v8, v4, Lxx;->d:Lxw;

    iget-object v8, v8, Lxw;->b:Lyq;

    invoke-virtual {v8}, Lyq;->c()I

    move-result v8

    sub-int v0, v8, v0

    .line 16157
    iget-object v8, v4, Lxx;->d:Lxw;

    iget-object v8, v8, Lxw;->b:Lyq;

    invoke-virtual {v8, v3}, Lyq;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v0, v3

    .line 16159
    iget-object v3, v4, Lxx;->d:Lxw;

    iget-object v3, v3, Lxw;->b:Lyq;

    invoke-virtual {v3}, Lyq;->c()I

    move-result v3

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v0, v3, v0

    .line 16161
    sub-int/2addr v0, v6

    .line 16162
    if-gez v0, :cond_2

    .line 16163
    iget v3, v4, Lxx;->b:I

    neg-int v0, v0

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v0, v3, v0

    iput v0, v4, Lxx;->b:I

    goto/16 :goto_3

    .line 12723
    :cond_1b
    iget-boolean v0, p0, Lxw;->g:Z

    if-eqz v0, :cond_1d

    :cond_1c
    move v0, v2

    .line 12748
    goto/16 :goto_4

    .line 12726
    :cond_1d
    iget-boolean v0, v4, Lxx;->c:Z

    if-eqz v0, :cond_20

    invoke-direct {p0, p1, p2}, Lxw;->d(Lzl;Lzp;)Landroid/view/View;

    move-result-object v0

    .line 12729
    :goto_10
    if-eqz v0, :cond_1c

    .line 12730
    invoke-virtual {v4, v0}, Lxx;->a(Landroid/view/View;)V

    .line 17090
    iget-boolean v3, p2, Lzp;->j:Z

    .line 12733
    if-nez v3, :cond_1f

    invoke-virtual {p0}, Lxw;->g()Z

    move-result v3

    if-eqz v3, :cond_1f

    .line 12735
    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3, v0}, Lyq;->a(Landroid/view/View;)I

    move-result v3

    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6}, Lyq;->c()I

    move-result v6

    if-ge v3, v6, :cond_1e

    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3, v0}, Lyq;->b(Landroid/view/View;)I

    move-result v0

    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3}, Lyq;->b()I

    move-result v3

    if-ge v0, v3, :cond_21

    :cond_1e
    move v0, v1

    .line 12740
    :goto_11
    if-eqz v0, :cond_1f

    .line 12741
    iget-boolean v0, v4, Lxx;->c:Z

    if-eqz v0, :cond_22

    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->c()I

    move-result v0

    :goto_12
    iput v0, v4, Lxx;->b:I

    :cond_1f
    move v0, v1

    .line 12746
    goto/16 :goto_4

    .line 12726
    :cond_20
    invoke-direct {p0, p1, p2}, Lxw;->e(Lzl;Lzp;)Landroid/view/View;

    move-result-object v0

    goto :goto_10

    :cond_21
    move v0, v2

    .line 12735
    goto :goto_11

    .line 12741
    :cond_22
    iget-object v0, p0, Lxw;->b:Lyq;

    invoke-virtual {v0}, Lyq;->b()I

    move-result v0

    goto :goto_12

    :cond_23
    move v3, v0

    move v0, v2

    .line 493
    goto/16 :goto_5

    .line 511
    :cond_24
    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6, v4}, Lyq;->a(Landroid/view/View;)I

    move-result v4

    iget-object v6, p0, Lxw;->b:Lyq;

    invoke-virtual {v6}, Lyq;->b()I

    move-result v6

    sub-int/2addr v4, v6

    .line 513
    iget v6, p0, Lxw;->m:I

    sub-int v4, v6, v4

    goto/16 :goto_6

    .line 518
    :cond_25
    sub-int/2addr v0, v4

    goto/16 :goto_7

    .line 18600
    :cond_26
    invoke-virtual {p0, v4}, Lzh;->e(I)V

    .line 19655
    invoke-static {v6}, Landroid/support/v7/widget/RecyclerView;->b(Landroid/view/View;)Lzr;

    move-result-object v6

    .line 20198
    iput-object p1, v6, Lzr;->j:Lzl;

    .line 19657
    invoke-virtual {v6}, Lzr;->l()Z

    move-result v7

    if-eqz v7, :cond_27

    iget-object v7, p1, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v7}, Landroid/support/v7/widget/RecyclerView;->h(Landroid/support/v7/widget/RecyclerView;)Z

    move-result v7

    if-nez v7, :cond_29

    .line 19658
    :cond_27
    invoke-virtual {v6}, Lzr;->j()Z

    move-result v7

    if-eqz v7, :cond_28

    invoke-virtual {v6}, Lzr;->n()Z

    move-result v7

    if-nez v7, :cond_28

    iget-object v0, p1, Lzl;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v0}, Landroid/support/v7/widget/RecyclerView;->f(Landroid/support/v7/widget/RecyclerView;)Lyz;

    .line 19659
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 19663
    :cond_28
    iget-object v7, p1, Lzl;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    .line 19665
    :cond_29
    iget-object v7, p1, Lzl;->b:Ljava/util/ArrayList;

    if-nez v7, :cond_2a

    .line 19666
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p1, Lzl;->b:Ljava/util/ArrayList;

    .line 19668
    :cond_2a
    iget-object v7, p1, Lzl;->b:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    .line 527
    :cond_2b
    iget-object v4, p0, Lxw;->n:Lxx;

    iget-boolean v4, v4, Lxx;->c:Z

    if-eqz v4, :cond_30

    .line 529
    iget-object v4, p0, Lxw;->n:Lxx;

    invoke-direct {p0, v4}, Lxw;->b(Lxx;)V

    .line 530
    iget-object v4, p0, Lxw;->f:Lxz;

    iput v3, v4, Lxz;->h:I

    .line 531
    iget-object v3, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p1, v3, p2, v2}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 532
    iget-object v3, p0, Lxw;->f:Lxz;

    iget v3, v3, Lxz;->b:I

    .line 533
    iget-object v4, p0, Lxw;->f:Lxz;

    iget v6, v4, Lxz;->d:I

    .line 534
    iget-object v4, p0, Lxw;->f:Lxz;

    iget v4, v4, Lxz;->c:I

    if-lez v4, :cond_2c

    .line 535
    iget-object v4, p0, Lxw;->f:Lxz;

    iget v4, v4, Lxz;->c:I

    add-int/2addr v0, v4

    .line 538
    :cond_2c
    iget-object v4, p0, Lxw;->n:Lxx;

    invoke-direct {p0, v4}, Lxw;->a(Lxx;)V

    .line 539
    iget-object v4, p0, Lxw;->f:Lxz;

    iput v0, v4, Lxz;->h:I

    .line 540
    iget-object v0, p0, Lxw;->f:Lxz;

    iget v4, v0, Lxz;->d:I

    iget-object v7, p0, Lxw;->f:Lxz;

    iget v7, v7, Lxz;->e:I

    add-int/2addr v4, v7

    iput v4, v0, Lxz;->d:I

    .line 541
    iget-object v0, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p1, v0, p2, v2}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 542
    iget-object v0, p0, Lxw;->f:Lxz;

    iget v4, v0, Lxz;->b:I

    .line 544
    iget-object v0, p0, Lxw;->f:Lxz;

    iget v0, v0, Lxz;->c:I

    if-lez v0, :cond_33

    .line 546
    iget-object v0, p0, Lxw;->f:Lxz;

    iget v0, v0, Lxz;->c:I

    .line 547
    invoke-direct {p0, v6, v3}, Lxw;->b(II)V

    .line 548
    iget-object v3, p0, Lxw;->f:Lxz;

    iput v0, v3, Lxz;->h:I

    .line 549
    iget-object v0, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p1, v0, p2, v2}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 550
    iget-object v0, p0, Lxw;->f:Lxz;

    iget v0, v0, Lxz;->b:I

    :goto_13
    move v3, v0

    move v0, v4

    .line 582
    :cond_2d
    :goto_14
    invoke-virtual {p0}, Lxw;->n()I

    move-result v4

    if-lez v4, :cond_2e

    .line 586
    iget-boolean v4, p0, Lxw;->i:Z

    if-eqz v4, :cond_32

    .line 587
    invoke-direct {p0, v0, p1, p2, v1}, Lxw;->a(ILzl;Lzp;Z)I

    move-result v1

    .line 588
    add-int/2addr v3, v1

    .line 589
    add-int/2addr v0, v1

    .line 590
    invoke-direct {p0, v3, p1, p2, v2}, Lxw;->b(ILzl;Lzp;Z)I

    move-result v1

    .line 591
    add-int/2addr v3, v1

    .line 592
    add-int/2addr v0, v1

    .line 602
    :cond_2e
    :goto_15
    invoke-direct {p0, p1, p2, v3, v0}, Lxw;->a(Lzl;Lzp;II)V

    .line 21090
    iget-boolean v0, p2, Lzp;->j:Z

    .line 603
    if-nez v0, :cond_2f

    .line 604
    iput v10, p0, Lxw;->l:I

    .line 605
    iput v9, p0, Lxw;->m:I

    .line 606
    iget-object v0, p0, Lxw;->b:Lyq;

    .line 22054
    invoke-virtual {v0}, Lyq;->e()I

    move-result v1

    iput v1, v0, Lyq;->b:I

    .line 608
    :cond_2f
    iput-boolean v2, p0, Lxw;->g:Z

    .line 609
    iput-object v5, p0, Lxw;->c:Lya;

    .line 613
    return-void

    .line 554
    :cond_30
    iget-object v4, p0, Lxw;->n:Lxx;

    invoke-direct {p0, v4}, Lxw;->a(Lxx;)V

    .line 555
    iget-object v4, p0, Lxw;->f:Lxz;

    iput v0, v4, Lxz;->h:I

    .line 556
    iget-object v0, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p1, v0, p2, v2}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 557
    iget-object v0, p0, Lxw;->f:Lxz;

    iget v0, v0, Lxz;->b:I

    .line 558
    iget-object v4, p0, Lxw;->f:Lxz;

    iget v4, v4, Lxz;->d:I

    .line 559
    iget-object v6, p0, Lxw;->f:Lxz;

    iget v6, v6, Lxz;->c:I

    if-lez v6, :cond_31

    .line 560
    iget-object v6, p0, Lxw;->f:Lxz;

    iget v6, v6, Lxz;->c:I

    add-int/2addr v3, v6

    .line 563
    :cond_31
    iget-object v6, p0, Lxw;->n:Lxx;

    invoke-direct {p0, v6}, Lxw;->b(Lxx;)V

    .line 564
    iget-object v6, p0, Lxw;->f:Lxz;

    iput v3, v6, Lxz;->h:I

    .line 565
    iget-object v3, p0, Lxw;->f:Lxz;

    iget v6, v3, Lxz;->d:I

    iget-object v7, p0, Lxw;->f:Lxz;

    iget v7, v7, Lxz;->e:I

    add-int/2addr v6, v7

    iput v6, v3, Lxz;->d:I

    .line 566
    iget-object v3, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p1, v3, p2, v2}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 567
    iget-object v3, p0, Lxw;->f:Lxz;

    iget v3, v3, Lxz;->b:I

    .line 569
    iget-object v6, p0, Lxw;->f:Lxz;

    iget v6, v6, Lxz;->c:I

    if-lez v6, :cond_2d

    .line 570
    iget-object v6, p0, Lxw;->f:Lxz;

    iget v6, v6, Lxz;->c:I

    .line 572
    invoke-direct {p0, v4, v0}, Lxw;->a(II)V

    .line 573
    iget-object v0, p0, Lxw;->f:Lxz;

    iput v6, v0, Lxz;->h:I

    .line 574
    iget-object v0, p0, Lxw;->f:Lxz;

    invoke-direct {p0, p1, v0, p2, v2}, Lxw;->a(Lzl;Lxz;Lzp;Z)I

    .line 575
    iget-object v0, p0, Lxw;->f:Lxz;

    iget v0, v0, Lxz;->b:I

    goto/16 :goto_14

    .line 594
    :cond_32
    invoke-direct {p0, v3, p1, p2, v1}, Lxw;->b(ILzl;Lzp;Z)I

    move-result v1

    .line 595
    add-int/2addr v3, v1

    .line 596
    add-int/2addr v0, v1

    .line 597
    invoke-direct {p0, v0, p1, p2, v2}, Lxw;->a(ILzl;Lzp;Z)I

    move-result v1

    .line 598
    add-int/2addr v3, v1

    .line 599
    add-int/2addr v0, v1

    goto :goto_15

    :cond_33
    move v0, v3

    goto/16 :goto_13
.end method

.method public final d(Lzp;)I
    .locals 1

    .prologue
    .line 1032
    invoke-direct {p0, p1}, Lxw;->i(Lzp;)I

    move-result v0

    return v0
.end method

.method public final e(Lzp;)I
    .locals 1

    .prologue
    .line 1037
    invoke-direct {p0, p1}, Lxw;->j(Lzp;)I

    move-result v0

    return v0
.end method

.method public final f(Lzp;)I
    .locals 1

    .prologue
    .line 1042
    invoke-direct {p0, p1}, Lxw;->j(Lzp;)I

    move-result v0

    return v0
.end method

.method public f()Lzi;
    .locals 2

    .prologue
    const/4 v1, -0x2

    .line 179
    new-instance v0, Lzi;

    invoke-direct {v0, v1, v1}, Lzi;-><init>(II)V

    return-object v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 1817
    iget-object v0, p0, Lxw;->c:Lya;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lxw;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Landroid/os/Parcelable;
    .locals 4

    .prologue
    .line 233
    iget-object v0, p0, Lxw;->c:Lya;

    if-eqz v0, :cond_0

    .line 234
    new-instance v0, Lya;

    iget-object v1, p0, Lxw;->c:Lya;

    invoke-direct {v0, v1}, Lya;-><init>(Lya;)V

    .line 255
    :goto_0
    return-object v0

    .line 236
    :cond_0
    new-instance v0, Lya;

    invoke-direct {v0}, Lya;-><init>()V

    .line 237
    invoke-virtual {p0}, Lxw;->n()I

    move-result v1

    if-lez v1, :cond_2

    .line 238
    invoke-virtual {p0}, Lxw;->l()V

    .line 239
    iget-boolean v1, p0, Lxw;->g:Z

    iget-boolean v2, p0, Lxw;->i:Z

    xor-int/2addr v1, v2

    .line 240
    iput-boolean v1, v0, Lya;->c:Z

    .line 241
    if-eqz v1, :cond_1

    .line 242
    invoke-direct {p0}, Lxw;->w()Landroid/view/View;

    move-result-object v1

    .line 243
    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2}, Lyq;->c()I

    move-result v2

    iget-object v3, p0, Lxw;->b:Lyq;

    invoke-virtual {v3, v1}, Lyq;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Lya;->b:I

    .line 245
    invoke-static {v1}, Lxw;->a(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Lya;->a:I

    goto :goto_0

    .line 247
    :cond_1
    invoke-direct {p0}, Lxw;->v()Landroid/view/View;

    move-result-object v1

    .line 248
    invoke-static {v1}, Lxw;->a(Landroid/view/View;)I

    move-result v2

    iput v2, v0, Lya;->a:I

    .line 249
    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2, v1}, Lyq;->a(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lxw;->b:Lyq;

    invoke-virtual {v2}, Lyq;->b()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Lya;->b:I

    goto :goto_0

    .line 10055
    :cond_2
    const/4 v1, -0x1

    iput v1, v0, Lya;->a:I

    goto :goto_0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 276
    iget v0, p0, Lxw;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 284
    iget v1, p0, Lxw;->a:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final k()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 917
    .line 25967
    iget-object v1, p0, Lzh;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Lgt;->g(Landroid/view/View;)I

    move-result v1

    .line 917
    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final l()V
    .locals 2

    .prologue
    .line 921
    iget-object v0, p0, Lxw;->f:Lxz;

    if-nez v0, :cond_0

    .line 26935
    new-instance v0, Lxz;

    invoke-direct {v0}, Lxz;-><init>()V

    .line 922
    iput-object v0, p0, Lxw;->f:Lxz;

    .line 924
    :cond_0
    iget-object v0, p0, Lxw;->b:Lyq;

    if-nez v0, :cond_1

    .line 925
    iget v0, p0, Lxw;->a:I

    .line 27177
    packed-switch v0, :pswitch_data_0

    .line 27183
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27194
    :pswitch_0
    new-instance v0, Lyr;

    invoke-direct {v0, p0}, Lyr;-><init>(Lzh;)V

    .line 925
    :goto_0
    iput-object v0, p0, Lxw;->b:Lyq;

    .line 927
    :cond_1
    return-void

    .line 27270
    :pswitch_1
    new-instance v0, Lys;

    invoke-direct {v0, p0}, Lys;-><init>(Lzh;)V

    goto :goto_0

    .line 27177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
