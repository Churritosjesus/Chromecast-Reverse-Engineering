.class public final Lxe;
.super Lzc;
.source "PG"


# instance fields
.field a:Ljava/util/ArrayList;

.field b:Ljava/util/ArrayList;

.field c:Ljava/util/ArrayList;

.field d:Ljava/util/ArrayList;

.field e:Ljava/util/ArrayList;

.field f:Ljava/util/ArrayList;

.field g:Ljava/util/ArrayList;

.field private n:Ljava/util/ArrayList;

.field private o:Ljava/util/ArrayList;

.field private p:Ljava/util/ArrayList;

.field private q:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Lzc;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->q:Ljava/util/ArrayList;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->b:Ljava/util/ArrayList;

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->c:Ljava/util/ArrayList;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->d:Ljava/util/ArrayList;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->e:Ljava/util/ArrayList;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->f:Ljava/util/ArrayList;

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxe;->g:Ljava/util/ArrayList;

    .line 621
    return-void
.end method

.method private static a(Ljava/util/List;)V
    .locals 2

    .prologue
    .line 616
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 617
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    invoke-static {v0}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    invoke-virtual {v0}, Lih;->a()V

    .line 616
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 619
    :cond_0
    return-void
.end method

.method private a(Ljava/util/List;Lzr;)V
    .locals 3

    .prologue
    .line 386
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 387
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxn;

    .line 388
    invoke-direct {p0, v0, p2}, Lxe;->a(Lxn;Lzr;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 389
    iget-object v2, v0, Lxn;->a:Lzr;

    if-nez v2, :cond_0

    iget-object v2, v0, Lxn;->b:Lzr;

    if-nez v2, :cond_0

    .line 390
    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 386
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 394
    :cond_1
    return-void
.end method

.method private a(Lxn;)V
    .locals 1

    .prologue
    .line 397
    iget-object v0, p1, Lxn;->a:Lzr;

    if-eqz v0, :cond_0

    .line 398
    iget-object v0, p1, Lxn;->a:Lzr;

    invoke-direct {p0, p1, v0}, Lxe;->a(Lxn;Lzr;)Z

    .line 400
    :cond_0
    iget-object v0, p1, Lxn;->b:Lzr;

    if-eqz v0, :cond_1

    .line 401
    iget-object v0, p1, Lxn;->b:Lzr;

    invoke-direct {p0, p1, v0}, Lxe;->a(Lxn;Lzr;)Z

    .line 403
    :cond_1
    return-void
.end method

.method private a(Lxn;Lzr;)Z
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 405
    .line 406
    iget-object v2, p1, Lxn;->b:Lzr;

    if-ne v2, p2, :cond_1

    .line 407
    iput-object v3, p1, Lxn;->b:Lzr;

    .line 414
    :goto_0
    iget-object v2, p2, Lzr;->a:Landroid/view/View;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Lgt;->c(Landroid/view/View;F)V

    .line 415
    iget-object v2, p2, Lzr;->a:Landroid/view/View;

    invoke-static {v2, v4}, Lgt;->a(Landroid/view/View;F)V

    .line 416
    iget-object v2, p2, Lzr;->a:Landroid/view/View;

    invoke-static {v2, v4}, Lgt;->b(Landroid/view/View;F)V

    .line 417
    invoke-virtual {p0, p2, v0}, Lxe;->a(Lzr;Z)V

    move v0, v1

    .line 418
    :cond_0
    return v0

    .line 408
    :cond_1
    iget-object v2, p1, Lxn;->a:Lzr;

    if-ne v2, p2, :cond_0

    .line 409
    iput-object v3, p1, Lxn;->a:Lzr;

    move v0, v1

    .line 410
    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 13

    .prologue
    const-wide/16 v6, 0x0

    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 97
    iget-object v1, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    move v1, v0

    .line 98
    :goto_0
    iget-object v3, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    move v3, v0

    .line 99
    :goto_1
    iget-object v4, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    move v4, v0

    .line 100
    :goto_2
    iget-object v5, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_4

    move v5, v0

    .line 101
    :goto_3
    if-nez v1, :cond_5

    if-nez v3, :cond_5

    if-nez v5, :cond_5

    if-nez v4, :cond_5

    .line 183
    :cond_0
    :goto_4
    return-void

    :cond_1
    move v1, v2

    .line 97
    goto :goto_0

    :cond_2
    move v3, v2

    .line 98
    goto :goto_1

    :cond_3
    move v4, v2

    .line 99
    goto :goto_2

    :cond_4
    move v5, v2

    .line 100
    goto :goto_3

    .line 106
    :cond_5
    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 10193
    iget-object v9, v0, Lzr;->a:Landroid/view/View;

    .line 10194
    invoke-static {v9}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v9

    .line 10195
    iget-object v10, p0, Lxe;->f:Ljava/util/ArrayList;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10417
    iget-wide v10, p0, Lzc;->j:J

    .line 10196
    invoke-virtual {v9, v10, v11}, Lih;->a(J)Lih;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lih;->a(F)Lih;

    move-result-object v10

    new-instance v11, Lxi;

    invoke-direct {v11, p0, v0, v9}, Lxi;-><init>(Lxe;Lzr;Lih;)V

    invoke-virtual {v10, v11}, Lih;->a(Liu;)Lih;

    move-result-object v0

    invoke-virtual {v0}, Lih;->b()V

    goto :goto_5

    .line 109
    :cond_6
    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 111
    if-eqz v3, :cond_7

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    iget-object v8, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 114
    iget-object v8, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    iget-object v8, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 116
    new-instance v8, Lxf;

    invoke-direct {v8, p0, v0}, Lxf;-><init>(Lxe;Ljava/util/ArrayList;)V

    .line 127
    if-eqz v1, :cond_a

    .line 128
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxo;

    iget-object v0, v0, Lxo;->a:Lzr;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    .line 11417
    iget-wide v10, p0, Lzc;->j:J

    .line 129
    invoke-static {v0, v8, v10, v11}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 135
    :cond_7
    :goto_6
    if-eqz v4, :cond_8

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 137
    iget-object v8, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 138
    iget-object v8, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    iget-object v8, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 140
    new-instance v8, Lxg;

    invoke-direct {v8, p0, v0}, Lxg;-><init>(Lxe;Ljava/util/ArrayList;)V

    .line 150
    if-eqz v1, :cond_b

    .line 151
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxn;

    iget-object v0, v0, Lxn;->a:Lzr;

    .line 152
    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    .line 12417
    iget-wide v10, p0, Lzc;->j:J

    .line 152
    invoke-static {v0, v8, v10, v11}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 158
    :cond_8
    :goto_7
    if-eqz v5, :cond_0

    .line 159
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 160
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 161
    iget-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 163
    new-instance v12, Lxh;

    invoke-direct {v12, p0, v5}, Lxh;-><init>(Lxe;Ljava/util/ArrayList;)V

    .line 172
    if-nez v1, :cond_9

    if-nez v3, :cond_9

    if-eqz v4, :cond_f

    .line 173
    :cond_9
    if-eqz v1, :cond_c

    .line 13417
    iget-wide v0, p0, Lzc;->j:J

    move-wide v10, v0

    .line 174
    :goto_8
    if-eqz v3, :cond_d

    .line 14381
    iget-wide v0, p0, Lzc;->k:J

    move-wide v8, v0

    .line 175
    :goto_9
    if-eqz v4, :cond_e

    .line 14435
    iget-wide v0, p0, Lzc;->l:J

    .line 176
    :goto_a
    invoke-static {v8, v9, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    add-long v6, v10, v0

    .line 177
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    iget-object v0, v0, Lzr;->a:Landroid/view/View;

    .line 178
    invoke-static {v0, v12, v6, v7}, Lgt;->a(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto/16 :goto_4

    .line 131
    :cond_a
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    goto :goto_6

    .line 154
    :cond_b
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    goto :goto_7

    :cond_c
    move-wide v10, v6

    .line 173
    goto :goto_8

    :cond_d
    move-wide v8, v6

    .line 174
    goto :goto_9

    :cond_e
    move-wide v0, v6

    .line 175
    goto :goto_a

    .line 180
    :cond_f
    invoke-interface {v12}, Ljava/lang/Runnable;->run()V

    goto/16 :goto_4
.end method

.method public final a(Lzr;)Z
    .locals 1

    .prologue
    .line 187
    invoke-virtual {p0, p1}, Lxe;->c(Lzr;)V

    .line 188
    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    const/4 v0, 0x1

    return v0
.end method

.method public final a(Lzr;IIII)Z
    .locals 7

    .prologue
    .line 250
    iget-object v0, p1, Lzr;->a:Landroid/view/View;

    .line 251
    int-to-float v1, p2

    iget-object v2, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v2}, Lgt;->k(Landroid/view/View;)F

    move-result v2

    add-float/2addr v1, v2

    float-to-int v2, v1

    .line 252
    int-to-float v1, p3

    iget-object v3, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v3}, Lgt;->l(Landroid/view/View;)F

    move-result v3

    add-float/2addr v1, v3

    float-to-int v3, v1

    .line 253
    invoke-virtual {p0, p1}, Lxe;->c(Lzr;)V

    .line 254
    sub-int v1, p4, v2

    .line 255
    sub-int v4, p5, v3

    .line 256
    if-nez v1, :cond_0

    if-nez v4, :cond_0

    .line 257
    invoke-virtual {p0, p1}, Lxe;->e(Lzr;)V

    .line 258
    const/4 v0, 0x0

    .line 267
    :goto_0
    return v0

    .line 260
    :cond_0
    if-eqz v1, :cond_1

    .line 261
    neg-int v1, v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lgt;->a(Landroid/view/View;F)V

    .line 263
    :cond_1
    if-eqz v4, :cond_2

    .line 264
    neg-int v1, v4

    int-to-float v1, v1

    invoke-static {v0, v1}, Lgt;->b(Landroid/view/View;F)V

    .line 266
    :cond_2
    iget-object v6, p0, Lxe;->p:Ljava/util/ArrayList;

    new-instance v0, Lxo;

    move-object v1, p1

    move v4, p4

    move v5, p5

    .line 15052
    invoke-direct/range {v0 .. v5}, Lxo;-><init>(Lzr;IIII)V

    .line 266
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final a(Lzr;Lzr;IIII)Z
    .locals 8

    .prologue
    .line 312
    iget-object v0, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v0}, Lgt;->k(Landroid/view/View;)F

    move-result v0

    .line 313
    iget-object v1, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v1}, Lgt;->l(Landroid/view/View;)F

    move-result v1

    .line 314
    iget-object v2, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v2}, Lgt;->f(Landroid/view/View;)F

    move-result v2

    .line 315
    invoke-virtual {p0, p1}, Lxe;->c(Lzr;)V

    .line 316
    sub-int v3, p5, p3

    int-to-float v3, v3

    sub-float/2addr v3, v0

    float-to-int v3, v3

    .line 317
    sub-int v4, p6, p4

    int-to-float v4, v4

    sub-float/2addr v4, v1

    float-to-int v4, v4

    .line 319
    iget-object v5, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v5, v0}, Lgt;->a(Landroid/view/View;F)V

    .line 320
    iget-object v0, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v0, v1}, Lgt;->b(Landroid/view/View;F)V

    .line 321
    iget-object v0, p1, Lzr;->a:Landroid/view/View;

    invoke-static {v0, v2}, Lgt;->c(Landroid/view/View;F)V

    .line 322
    if-eqz p2, :cond_0

    iget-object v0, p2, Lzr;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 324
    invoke-virtual {p0, p2}, Lxe;->c(Lzr;)V

    .line 325
    iget-object v0, p2, Lzr;->a:Landroid/view/View;

    neg-int v1, v3

    int-to-float v1, v1

    invoke-static {v0, v1}, Lgt;->a(Landroid/view/View;F)V

    .line 326
    iget-object v0, p2, Lzr;->a:Landroid/view/View;

    neg-int v1, v4

    int-to-float v1, v1

    invoke-static {v0, v1}, Lgt;->b(Landroid/view/View;F)V

    .line 327
    iget-object v0, p2, Lzr;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgt;->c(Landroid/view/View;F)V

    .line 329
    :cond_0
    iget-object v7, p0, Lxe;->q:Ljava/util/ArrayList;

    new-instance v0, Lxn;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    .line 15065
    invoke-direct/range {v0 .. v6}, Lxn;-><init>(Lzr;Lzr;IIII)V

    .line 329
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    const/4 v0, 0x1

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 505
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Lzr;)Z
    .locals 2

    .prologue
    .line 216
    invoke-virtual {p0, p1}, Lxe;->c(Lzr;)V

    .line 217
    iget-object v0, p1, Lzr;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgt;->c(Landroid/view/View;F)V

    .line 218
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    const/4 v0, 0x1

    return v0
.end method

.method c()V
    .locals 1

    .prologue
    .line 524
    invoke-virtual {p0}, Lxe;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 525
    invoke-virtual {p0}, Lxe;->e()V

    .line 527
    :cond_0
    return-void
.end method

.method public final c(Lzr;)V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    .line 423
    iget-object v4, p1, Lzr;->a:Landroid/view/View;

    .line 425
    invoke-static {v4}, Lgt;->o(Landroid/view/View;)Lih;

    move-result-object v0

    invoke-virtual {v0}, Lih;->a()V

    .line 427
    iget-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_1

    .line 428
    iget-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxo;

    .line 429
    iget-object v0, v0, Lxo;->a:Lzr;

    if-ne v0, p1, :cond_0

    .line 430
    invoke-static {v4, v5}, Lgt;->b(Landroid/view/View;F)V

    .line 431
    invoke-static {v4, v5}, Lgt;->a(Landroid/view/View;F)V

    .line 432
    invoke-virtual {p0, p1}, Lxe;->e(Lzr;)V

    .line 433
    iget-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 427
    :cond_0
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 436
    :cond_1
    iget-object v0, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1}, Lxe;->a(Ljava/util/List;Lzr;)V

    .line 437
    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 438
    invoke-static {v4, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 439
    invoke-virtual {p0, p1}, Lxe;->d(Lzr;)V

    .line 441
    :cond_2
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 442
    invoke-static {v4, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 443
    invoke-virtual {p0, p1}, Lxe;->f(Lzr;)V

    .line 446
    :cond_3
    iget-object v0, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_5

    .line 447
    iget-object v0, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 448
    invoke-direct {p0, v0, p1}, Lxe;->a(Ljava/util/List;Lzr;)V

    .line 449
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 450
    iget-object v0, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 446
    :cond_4
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 453
    :cond_5
    iget-object v0, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_2
    if-ltz v3, :cond_8

    .line 454
    iget-object v0, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 455
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_3
    if-ltz v2, :cond_6

    .line 456
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxo;

    .line 457
    iget-object v1, v1, Lxo;->a:Lzr;

    if-ne v1, p1, :cond_7

    .line 458
    invoke-static {v4, v5}, Lgt;->b(Landroid/view/View;F)V

    .line 459
    invoke-static {v4, v5}, Lgt;->a(Landroid/view/View;F)V

    .line 460
    invoke-virtual {p0, p1}, Lxe;->e(Lzr;)V

    .line 461
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 462
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 463
    iget-object v0, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 453
    :cond_6
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_2

    .line 455
    :cond_7
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_3

    .line 469
    :cond_8
    iget-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_4
    if-ltz v1, :cond_a

    .line 470
    iget-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 471
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 472
    invoke-static {v4, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 473
    invoke-virtual {p0, p1}, Lxe;->f(Lzr;)V

    .line 474
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 475
    iget-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 469
    :cond_9
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_4

    .line 481
    :cond_a
    iget-object v0, p0, Lxe;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 486
    iget-object v0, p0, Lxe;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 491
    iget-object v0, p0, Lxe;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 496
    iget-object v0, p0, Lxe;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 500
    invoke-virtual {p0}, Lxe;->c()V

    .line 501
    return-void
.end method

.method public final d()V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    .line 531
    iget-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 532
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 533
    iget-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxo;

    .line 534
    iget-object v2, v0, Lxo;->a:Lzr;

    iget-object v2, v2, Lzr;->a:Landroid/view/View;

    .line 535
    invoke-static {v2, v5}, Lgt;->b(Landroid/view/View;F)V

    .line 536
    invoke-static {v2, v5}, Lgt;->a(Landroid/view/View;F)V

    .line 537
    iget-object v0, v0, Lxo;->a:Lzr;

    invoke-virtual {p0, v0}, Lxe;->e(Lzr;)V

    .line 538
    iget-object v0, p0, Lxe;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 532
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 540
    :cond_0
    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 541
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_1

    .line 542
    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 543
    invoke-virtual {p0, v0}, Lxe;->d(Lzr;)V

    .line 544
    iget-object v0, p0, Lxe;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 541
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 546
    :cond_1
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 547
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_2
    if-ltz v1, :cond_2

    .line 548
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr;

    .line 549
    iget-object v2, v0, Lzr;->a:Landroid/view/View;

    .line 550
    invoke-static {v2, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 551
    invoke-virtual {p0, v0}, Lxe;->f(Lzr;)V

    .line 552
    iget-object v0, p0, Lxe;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 547
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_2

    .line 554
    :cond_2
    iget-object v0, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 555
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_3
    if-ltz v1, :cond_3

    .line 556
    iget-object v0, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxn;

    invoke-direct {p0, v0}, Lxe;->a(Lxn;)V

    .line 555
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_3

    .line 558
    :cond_3
    iget-object v0, p0, Lxe;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 559
    invoke-virtual {p0}, Lxe;->b()Z

    move-result v0

    if-nez v0, :cond_4

    .line 613
    :goto_4
    return-void

    .line 563
    :cond_4
    iget-object v0, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 564
    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_5
    if-ltz v3, :cond_7

    .line 565
    iget-object v0, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 566
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 567
    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_6
    if-ltz v2, :cond_6

    .line 568
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxo;

    .line 569
    iget-object v4, v1, Lxo;->a:Lzr;

    .line 570
    iget-object v4, v4, Lzr;->a:Landroid/view/View;

    .line 571
    invoke-static {v4, v5}, Lgt;->b(Landroid/view/View;F)V

    .line 572
    invoke-static {v4, v5}, Lgt;->a(Landroid/view/View;F)V

    .line 573
    iget-object v1, v1, Lxo;->a:Lzr;

    invoke-virtual {p0, v1}, Lxe;->e(Lzr;)V

    .line 574
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 575
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 576
    iget-object v1, p0, Lxe;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 567
    :cond_5
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_6

    .line 564
    :cond_6
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_5

    .line 580
    :cond_7
    iget-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 581
    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_7
    if-ltz v3, :cond_a

    .line 582
    iget-object v0, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 583
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 584
    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_8
    if-ltz v2, :cond_9

    .line 585
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzr;

    .line 586
    iget-object v4, v1, Lzr;->a:Landroid/view/View;

    .line 587
    invoke-static {v4, v6}, Lgt;->c(Landroid/view/View;F)V

    .line 588
    invoke-virtual {p0, v1}, Lxe;->f(Lzr;)V

    .line 589
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 590
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 591
    iget-object v1, p0, Lxe;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 584
    :cond_8
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_8

    .line 581
    :cond_9
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_7

    .line 595
    :cond_a
    iget-object v0, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 596
    add-int/lit8 v0, v0, -0x1

    move v3, v0

    :goto_9
    if-ltz v3, :cond_d

    .line 597
    iget-object v0, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 598
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 599
    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_a
    if-ltz v2, :cond_c

    .line 600
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxn;

    invoke-direct {p0, v1}, Lxe;->a(Lxn;)V

    .line 601
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 602
    iget-object v1, p0, Lxe;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 599
    :cond_b
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_a

    .line 596
    :cond_c
    add-int/lit8 v0, v3, -0x1

    move v3, v0

    goto :goto_9

    .line 607
    :cond_d
    iget-object v0, p0, Lxe;->f:Ljava/util/ArrayList;

    invoke-static {v0}, Lxe;->a(Ljava/util/List;)V

    .line 608
    iget-object v0, p0, Lxe;->e:Ljava/util/ArrayList;

    invoke-static {v0}, Lxe;->a(Ljava/util/List;)V

    .line 609
    iget-object v0, p0, Lxe;->d:Ljava/util/ArrayList;

    invoke-static {v0}, Lxe;->a(Ljava/util/List;)V

    .line 610
    iget-object v0, p0, Lxe;->g:Ljava/util/ArrayList;

    invoke-static {v0}, Lxe;->a(Ljava/util/List;)V

    .line 612
    invoke-virtual {p0}, Lxe;->e()V

    goto/16 :goto_4
.end method
